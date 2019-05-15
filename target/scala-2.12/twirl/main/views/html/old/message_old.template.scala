
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


Seq[Any](format.raw/*4.1*/("""
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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/message_old.scala.html
                  HASH: 9055d758c5c7ee05c7bd8ad0d430edcae5c66874
                  MATRIX: 655->1|1020->33|1156->98|1200->114|1227->116|1251->132|1265->138|1283->148|1322->150|1354->157|1403->198|1442->200|1478->210|1490->214|1520->224|1556->234|1665->323|1702->333|1863->472|1900->482|2049->609|2086->619|2182->685
                  LINES: 24->1|29->2|32->3|35->4|36->5|36->5|36->5|36->5|36->5|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|41->10|41->10|42->11|42->11|44->13|45->14
                  -- GENERATED --
              */
          