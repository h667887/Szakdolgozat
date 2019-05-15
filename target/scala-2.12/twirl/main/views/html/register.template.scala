
package views.html

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
/*1.2*/import helper._

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[User],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(userForm : Form[User])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*3.2*/implicitField/*3.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*3.75*/("""

"""),_display_(/*5.2*/layout("Register")/*5.20*/(user)/*5.26*/(sumPrice)/*5.36*/ {_display_(Seq[Any](format.raw/*5.38*/("""

    """),format.raw/*7.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretlog" border="0">


        """),_display_(/*14.10*/form(action=routes.UserController.save())/*14.51*/ {_display_(Seq[Any](format.raw/*14.53*/("""
            """),_display_(/*15.14*/CSRF/*15.18*/.formField),format.raw/*15.28*/("""


            """),format.raw/*18.13*/("""<tr>
                <td colspan="5"></td>
            </tr>

            <tr><td height="20"></td></tr>

            <tr>
                <td colspan="5" class="inputfontreglog">Email</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                """),_display_(/*30.18*/inputText(userForm("email"), 'class -> "uinput")),format.raw/*30.66*/("""
                """),format.raw/*31.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td colspan="5" class="inputfontreglog">Username</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                """),_display_(/*40.18*/inputText(userForm("username"), 'class -> "uinput")),format.raw/*40.69*/("""

                """),format.raw/*42.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>

                <td colspan="5" class="inputfontreglog" align="left">Password</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                """),_display_(/*52.18*/inputPassword(userForm("password"), 'class -> "uinput")),format.raw/*52.73*/("""

                """),format.raw/*54.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit" class="btn btn-warning bttne">Register</button></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td colspan="5"><label class="hiba"></label></td>
            </tr>
        """)))}),format.raw/*70.10*/("""
    """),format.raw/*71.5*/("""</table>


    <table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,userForm:Form[User],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(userForm)(sumPrice)

  def f:((User) => (Form[User]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (userForm) => (sumPrice) => apply(user)(userForm)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/register.scala.html
                  HASH: 40cbc8ec8598d8a2b45732fff3f3168a88ea13b4
                  MATRIX: 651->1|991->18|1132->74|1153->87|1243->147|1271->150|1297->168|1311->174|1329->184|1368->186|1400->192|1547->312|1597->353|1637->355|1678->369|1691->373|1722->383|1765->398|2093->699|2162->747|2207->764|2494->1024|2566->1075|2612->1093|2913->1367|2989->1422|3035->1440|3533->1907|3565->1912
                  LINES: 24->1|29->2|33->3|33->3|34->3|36->5|36->5|36->5|36->5|36->5|38->7|45->14|45->14|45->14|46->15|46->15|46->15|49->18|61->30|61->30|62->31|71->40|71->40|73->42|83->52|83->52|85->54|101->70|102->71
                  -- GENERATED --
              */
          