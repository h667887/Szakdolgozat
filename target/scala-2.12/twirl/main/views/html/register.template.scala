
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
Seq[Any](format.raw/*2.56*/("""
"""),format.raw/*3.75*/("""

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
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/register.scala.html
                  HASH: 71038297ff56e510d36143e8a1bc7c2ec7fb3488
                  MATRIX: 651->1|991->19|1132->76|1153->89|1243->73|1272->149|1302->154|1328->172|1342->178|1360->188|1399->190|1433->198|1587->325|1637->366|1677->368|1719->383|1732->387|1763->397|1809->415|2149->728|2218->776|2264->794|2560->1063|2632->1114|2680->1134|2991->1418|3067->1473|3115->1493|3629->1976|3662->1982
                  LINES: 24->1|29->2|33->3|33->3|34->2|35->3|37->5|37->5|37->5|37->5|37->5|39->7|46->14|46->14|46->14|47->15|47->15|47->15|50->18|62->30|62->30|63->31|72->40|72->40|74->42|84->52|84->52|86->54|102->70|103->71
                  -- GENERATED --
              */
          