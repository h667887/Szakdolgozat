
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
Seq[Any](format.raw/*3.58*/("""
"""),format.raw/*4.75*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/login.scala.html
                  HASH: c2e03c181f015b0bb74e459c12d077675ae75755
                  MATRIX: 651->1|698->43|1036->61|1179->120|1200->133|1290->117|1319->193|1349->198|1372->213|1386->219|1404->229|1443->231|1479->241|1620->355|1678->404|1718->406|1762->423|1775->427|1806->437|1843->447|1923->500|1961->529|2001->531|2051->553|2118->593|2136->602|2179->624|2229->646|2283->669|2329->688|2367->717|2407->719|2457->741|2526->783|2540->788|2576->803|2626->825|2680->848|2726->867|2765->897|2805->899|2855->921|2937->976|2951->981|2988->997|3109->1087|3151->1101|3421->1344|3491->1393|3533->1407|3799->1646|3876->1702|3920->1718|4091->1862|4106->1868|4165->1905|4577->2286|4610->2292
                  LINES: 24->1|25->2|30->3|34->4|34->4|35->3|36->4|38->6|38->6|38->6|38->6|38->6|41->9|47->15|47->15|47->15|49->17|49->17|49->17|50->18|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|62->30|62->30|62->30|63->31|64->32|64->32|64->32|66->34|67->35|78->46|78->46|79->47|89->57|89->57|91->59|95->63|95->63|95->63|108->76|109->77
                  -- GENERATED --
              */
          