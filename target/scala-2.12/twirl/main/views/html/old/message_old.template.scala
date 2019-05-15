
package views.html.old

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import FormClasses.MailMessage

object message_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[MailMessage],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(messageForm: Form[MailMessage])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.65*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/layout("Üzenet")/*5.18*/(user)/*5.24*/(sumPrice)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""

    """),_display_(/*7.6*/form(action=routes.HomeController.send())/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""
        """),_display_(/*9.10*/textarea(field = messageForm("message"), args = 'rows -> 3, 'cols -> 50, '_label -> null)),format.raw/*9.99*/("""
        """),_display_(/*10.10*/inputText(messageForm("username"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Felhasználónév")),format.raw/*10.149*/("""
        """),_display_(/*11.10*/inputText(messageForm("email"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Email")),format.raw/*11.137*/("""

        """),format.raw/*13.9*/("""<button type="submit" class="btn btn-primary">dewit</button>
    """)))}),format.raw/*14.6*/("""
""")))}))
      }
    }
  }

  def render(user:User,messageForm:Form[MailMessage],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(messageForm)(sumPrice)

  def f:((User) => (Form[MailMessage]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (messageForm) => (sumPrice) => apply(user)(messageForm)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/message_old.scala.html
                  HASH: eee849f3ff1a5c9e3bca5aca068554c86922df4b
                  MATRIX: 655->1|1020->34|1156->100|1201->97|1229->117|1257->120|1281->136|1295->142|1313->152|1352->154|1386->163|1435->204|1474->206|1511->217|1523->221|1553->231|1590->242|1699->331|1737->342|1898->481|1936->492|2085->619|2124->631|2221->698
                  LINES: 24->1|29->2|32->3|35->2|36->4|37->5|37->5|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|42->10|42->10|43->11|43->11|45->13|46->14
                  -- GENERATED --
              */
          