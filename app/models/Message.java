package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *  Üzenet(ID, feladó, dátum, szöveg)
 */
@Entity
public class Message extends Model {


    @Id
    @Constraints.Required
    public int id;

    public User sender;

    public String date;

    public String text;

    public static Finder<String, Message> find = new Finder<>(Message.class);
}
