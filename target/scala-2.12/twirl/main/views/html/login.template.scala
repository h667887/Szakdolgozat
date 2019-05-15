
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
/*1.2*/import controllers.UserController.Login
/*2.2*/import helper._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Login],User,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(loginForm : Form[Login])(user: User)(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*4.75*/("""

"""),_display_(/*6.2*/layout("Login")/*6.17*/(user)/*6.23*/(sumPrice)/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""


    """),format.raw/*9.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretlog">

        """),_display_(/*15.10*/form(action=routes.UserController.authenticate())/*15.59*/ {_display_(Seq[Any](format.raw/*15.61*/("""

            """),_display_(/*17.14*/CSRF/*17.18*/.formField),format.raw/*17.28*/("""
        """),format.raw/*18.9*/("""<tr>
            <td colspan="5">
                """),_display_(/*20.18*/if(loginForm.hasGlobalErrors)/*20.47*/ {_display_(Seq[Any](format.raw/*20.49*/("""
                    """),format.raw/*21.21*/("""<p class="error">
                    """),_display_(/*22.22*/loginForm/*22.31*/.globalError.message()),format.raw/*22.53*/("""
                    """),format.raw/*23.21*/("""</p>
                """)))}),format.raw/*24.18*/("""
                """),_display_(/*25.18*/if(flash.contains("success"))/*25.47*/ {_display_(Seq[Any](format.raw/*25.49*/("""
                    """),format.raw/*26.21*/("""<p class="success">
                    """),_display_(/*27.22*/flash/*27.27*/.get("success")),format.raw/*27.42*/("""
                    """),format.raw/*28.21*/("""</p>
                """)))}),format.raw/*29.18*/("""
                """),_display_(/*30.18*/if(flash.contains("pw_reset"))/*30.48*/ {_display_(Seq[Any](format.raw/*30.50*/("""
                    """),format.raw/*31.21*/("""<p class="success">
                        <a href=""""),_display_(/*32.35*/flash/*32.40*/.get("pw_reset")),format.raw/*32.56*/("""">Ide kattintva</a> új jelszót állíthatsz be.
                    </p>
                """)))}),format.raw/*34.18*/("""
            """),format.raw/*35.13*/("""</td>
        </tr>

        <tr><td height="20"></td></tr>

        <tr>
            <td colspan="5" class="inputfontreglog">Email</td>
        </tr>
        <tr>
            <td></td>
            <td colspan="2">
                """),_display_(/*46.18*/inputText(loginForm("email"), 'class -> "uinput")),format.raw/*46.67*/("""
            """),format.raw/*47.13*/("""</td>
            <td colspan="2"></td>
        </tr>
        <tr>

            <td colspan="5" class="inputfontreglog">Password</td>
        </tr>
        <tr>
            <td></td>
            <td colspan="2">
                """),_display_(/*57.18*/inputPassword(loginForm("password"), 'class -> "uinput")),format.raw/*57.74*/("""

            """),format.raw/*59.13*/("""</td>
            <td colspan="2"></td>
        </tr>
        <tr>
            <td class="font header" align="center" colspan="5"><a href=""""),_display_(/*63.74*/routes/*63.80*/.UserController.askResetPasswordGet()),format.raw/*63.117*/("""" style="color:#dd9a39">Forgotten Password</a></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit" class="btn btn-warning bttne">Login</button></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td colspan="5"><label class="hiba"></label></td>
        </tr>

        """)))}),format.raw/*76.10*/("""
    """),format.raw/*77.5*/("""</table>


    <table height="200"></table>


""")))}))
      }
    }
  }

  def render(loginForm:Form[Login],user:User,sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(user)(sumPrice)

  def f:((Form[Login]) => (User) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (user) => (sumPrice) => apply(loginForm)(user)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/login.scala.html
                  HASH: 95adc8655825fb7a5efc1352365294f3b85f30f0
                  MATRIX: 651->1|698->42|1036->59|1179->117|1200->130|1290->190|1318->193|1341->208|1355->214|1373->224|1412->226|1445->233|1580->341|1638->390|1678->392|1720->407|1733->411|1764->421|1800->430|1878->481|1916->510|1956->512|2005->533|2071->572|2089->581|2132->603|2181->624|2234->646|2279->664|2317->693|2357->695|2406->716|2474->757|2488->762|2524->777|2573->798|2626->820|2671->838|2710->868|2750->870|2799->891|2880->945|2894->950|2931->966|3050->1054|3091->1067|3350->1299|3420->1348|3461->1361|3717->1590|3794->1646|3836->1660|4003->1800|4018->1806|4077->1843|4476->2211|4508->2216
                  LINES: 24->1|25->2|30->3|34->4|34->4|35->4|37->6|37->6|37->6|37->6|37->6|40->9|46->15|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|65->34|66->35|77->46|77->46|78->47|88->57|88->57|90->59|94->63|94->63|94->63|107->76|108->77
                  -- GENERATED --
              */
          