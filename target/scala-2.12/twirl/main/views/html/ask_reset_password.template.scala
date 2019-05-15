
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
/*1.2*/import controllers.UserController.PwReset
/*2.2*/import helper._

object ask_reset_password extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[PwReset],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User)(pwResetForm : Form[PwReset])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*3.62*/("""
"""),format.raw/*4.75*/("""


"""),_display_(/*7.2*/layout("Forgot password")/*7.27*/(user)/*7.33*/(sumPrice)/*7.43*/ {_display_(Seq[Any](format.raw/*7.45*/("""



    """),format.raw/*11.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    """),_display_(/*15.6*/form(action=routes.UserController.askResetPasswordPost())/*15.63*/ {_display_(Seq[Any](format.raw/*15.65*/("""
        """),_display_(/*16.10*/CSRF/*16.14*/.formField),format.raw/*16.24*/("""
    """),format.raw/*17.5*/("""<table class="keretlog">
        <tr>
            <td colspan="5">
                """),_display_(/*20.18*/if(flash.containsKey("danger"))/*20.49*/{_display_(Seq[Any](format.raw/*20.50*/("""
                    """),format.raw/*21.21*/("""<div class="alert alert-danger">
                        """),_display_(/*22.26*/flash()/*22.33*/.get("danger")),format.raw/*22.47*/("""
                        """),format.raw/*23.25*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                    </div>
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</td>
        </tr>

        <tr><td height="50"></td></tr>

        <tr>
            <td colspan="5" class="inputfontreglog">Email</td>
        </tr>
        <tr>
            <td></td>
            <td colspan="2">
                """),_display_(/*37.18*/inputText(pwResetForm("email"), 'class -> "uinput")),format.raw/*37.69*/("""

            """),format.raw/*39.13*/("""</td>
            <td colspan="2"></td>
        </tr>
        <tr>
            <td class="font header" align="center" colspan="5"></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit" class="btn btn-warning bttne">Send</button></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td colspan="5"><label class="hiba"></label></td>
        </tr>
    </table>
    """)))}),format.raw/*56.6*/("""

    """),format.raw/*58.5*/("""<table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,pwResetForm:Form[PwReset],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(pwResetForm)(sumPrice)

  def f:((User) => (Form[PwReset]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (pwResetForm) => (sumPrice) => apply(user)(pwResetForm)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/ask_reset_password.scala.html
                  HASH: 06a50d4f1061bfd67c8c525ae4d47016ae7c27f4
                  MATRIX: 651->1|700->45|1053->63|1200->126|1221->139|1311->123|1340->199|1372->206|1405->231|1419->237|1437->247|1476->249|1515->261|1619->339|1685->396|1725->398|1763->409|1776->413|1807->423|1840->429|1954->516|1994->547|2033->548|2083->570|2169->629|2185->636|2220->650|2274->676|2464->835|2506->849|2776->1092|2848->1143|2892->1159|3398->1635|3433->1643
                  LINES: 24->1|25->2|30->3|34->4|34->4|35->3|36->4|39->7|39->7|39->7|39->7|39->7|43->11|47->15|47->15|47->15|48->16|48->16|48->16|49->17|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|57->25|58->26|69->37|69->37|71->39|88->56|90->58
                  -- GENERATED --
              */
          