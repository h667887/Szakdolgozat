package FormClasses;

public class MailMessage {
    public String email;
    public String name;
    public String message;


    @Override
    public String toString() {
        return "MailMessage{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
