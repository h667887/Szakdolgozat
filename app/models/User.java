package models;
import javax.persistence.*;

import controllers.Secured;
import io.ebean.*;
import play.data.validation.Constraints;
import play.mvc.Controller;
import play.mvc.Http;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.time.LocalTime;
import java.util.UUID;

@Entity
public class User extends Model {

  //  @Id
  //  public Integer id;

    @Id
    @Constraints.Required
    public String email;

    @Constraints.Required
    @Constraints.MinLength(5)
    @Constraints.MaxLength(50)
    public String username;

    @Constraints.Required
    public String password;

    public boolean admin;

    public String imagePath;
    public String rangPath;

    public String fullName;
    public String address;
    public String phoneNumber;

    public String token;
    public String validityDate;
    public int moneySpent;


    public static Finder<String, User> find = new Finder<>(User.class);

    public User(String email, String username, String password, boolean admin) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.token = null;
        this.validityDate = null;
        this.moneySpent = 0;
        this.imagePath = "images/ProfilePics/noavatar.jpg";
        this.rangPath = admin ? "images/Rang/AdminMember.png" : "images/Rang/BronzeMember.png";
    }


    public static boolean authenticate(String email, String password) { //Z TODO EZEN MĂ‰G JAVĂŤTUNK LEL
        User user = find.byId(email);
        if(user == null) {
            return false;
        } else if(user.password.equals(encodePassword(password))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param user - FelhasznĂˇlĂł Modell osztĂˇlya
     * @param controller - A controller amihez flash-elĂĽnk majd
     * @return True -> Ă©rvĂ©nyesek a FelhasznĂˇlĂł adatai
     */
    public static boolean validUser(User user, Controller controller){

        for (User database_user: User.find.all()){
            if (user.email.length() == 0 || user.username.length() == 0 || user.password.length() == 0){
                controller.flash("danger", "KĂ©rlek tĂ¶lts ki minden mezĹ‘t!");
                return false;
            }
            if (user.email.equals(database_user.email)){
                controller.flash("danger", "Email mĂˇr hasznĂˇlatban!");
                return false;
            }
            if (user.username.equals(database_user.username)){
                controller.flash("danger", "FelhasznĂˇlĂłnĂ©v mĂˇr hasznĂˇlatban!");
                return false;
            }
        }

        return true;
    }

    /**
     * A modell elmentĂ©se az adatbĂˇzisba
     * Ne kĂłdold le elĹ‘re a  jelszĂłt, majd ez a metĂłdus megcsinĂˇlja
     * FONTOS!!! CSak mentĂ©sre hasznĂˇlt ezt!! MĂˇsra ott az Update() pl.
     */
    @Override
    public void save() {
        this.setPassword(encodePassword(this.password));
        db().save(this);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNewPassword(String password) {
        this.password = encodePassword(password);
    }


    /**
     *
     * @param pass - jelszĂł
     * @return KĂłdolt jelszĂł StringkĂ©nt
     */
    private static String encodePassword(String pass){
        System.out.println("Meglettem kĂłdolva");
        System.out.println(pass);
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(pass.getBytes());
            byte[] bytes = md.digest();

            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static User findByUsername(String username){
        return User.find.query().where().eq("username", username).findOne();

        /* 
        for (User user: User.find.all()){
            if (user.username.equals(username)){
                return user;
            }
        }
        return null;*/
    }

    public static User findByEmail(String email){
        return User.find.query().where().eq("email", email).findOne();

        /*
        for (User user: User.find.all()){
            if (user.email.equals(email)){
                return user;
            }
        }
        return null;*/
    }

    /**
     *
     * @param username - felhasznĂˇlĂł neve
     * @return generĂˇl egy tokent a felhasznĂˇlĂł nevĂ©hez
     *
     * Ezt hasznĂˇlja az elfelejtett jelszĂł funkciĂł ideiglenes token generĂˇlĂˇshoz
     */
    public static String generateToken(String username){
        String key = Secured.key + username + LocalTime.now().toString();
        String result = UUID.nameUUIDFromBytes(key.getBytes()).toString();
        return result;
    }

    public static String generateTokenUnauthorized(){
        String key = Secured.key + LocalTime.now().toString();
        String result = UUID.nameUUIDFromBytes(key.getBytes()).toString();
        return result;
    }

    public static User findByToken(String token){
        return User.find.query().where().eq("token", token).findOne();

        /*
        for (User user: User.find.all()){
            if (user.token == null){
                continue;
            }
            if (user.token.equals(token)){
                return user;
            }
        }
        return null; */
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", admin=" + admin +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", token='" + token + '\'' +
                ", validityDate='" + validityDate + '\'' +
                '}';
    }
}
