
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
/*1.2*/import controllers.UserController.NewPassword

object do_reset_password extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[NewPassword],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(newPasswordForm : Form[NewPassword])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*2.70*/("""
"""),format.raw/*4.75*/("""


"""),_display_(/*7.2*/layout("New Password")/*7.24*/(user)/*7.30*/(sumPrice)/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""



    """),format.raw/*11.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>
    """),_display_(/*14.6*/if(flash.containsKey("danger"))/*14.37*/{_display_(Seq[Any](format.raw/*14.38*/("""
        """),format.raw/*15.9*/("""<div class="alert alert-danger">
            """),_display_(/*16.14*/flash()/*16.21*/.get("danger")),format.raw/*16.35*/("""
            """),format.raw/*17.13*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
        </div>
    """)))}),format.raw/*19.6*/("""
    """),format.raw/*20.5*/("""<table class="keretlog">

        """),_display_(/*22.10*/form(action=routes.UserController.resetPasswordPost(request().uri().split("/").last))/*22.95*/ {_display_(Seq[Any](format.raw/*22.97*/("""

            """),_display_(/*24.14*/CSRF/*24.18*/.formField),format.raw/*24.28*/("""
            """),format.raw/*25.13*/("""<tr>
                <td colspan="5"></td>
            </tr>

            <tr><td height="50"></td></tr>

            <tr>
                <td colspan="5" class="inputfontreglog">New password</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                    """),_display_(/*37.22*/inputPassword(newPasswordForm("newPW1"), 'class -> "uinput")),format.raw/*37.82*/("""

                """),format.raw/*39.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td colspan="5" class="inputfontreglog">New password again</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                    """),_display_(/*48.22*/inputPassword(newPasswordForm("newPW2"), 'class -> "uinput")),format.raw/*48.82*/("""
                """),format.raw/*49.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td class="font header" align="center" colspan="5"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit" class="btn btn-warning bttne">Change</button></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td colspan="5"><label class="hiba"></label></td>
            </tr>
        """)))}),format.raw/*65.10*/("""
    """),format.raw/*66.5*/("""</table>


    <table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,newPasswordForm:Form[NewPassword],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(newPasswordForm)(sumPrice)

  def f:((User) => (Form[NewPassword]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (newPasswordForm) => (sumPrice) => apply(user)(newPasswordForm)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/do_reset_password.scala.html
                  HASH: ff37e6f88c1f843825cbde9ee64fefa9194ad421
                  MATRIX: 651->1|1037->49|1178->120|1215->138|1236->151|1326->117|1355->211|1387->218|1417->240|1431->246|1449->256|1488->258|1527->270|1629->346|1669->377|1708->378|1745->388|1819->435|1835->442|1870->456|1912->470|2077->605|2110->611|2174->648|2268->733|2308->735|2352->752|2365->756|2396->766|2438->780|2789->1104|2870->1164|2918->1184|3228->1467|3309->1527|3355->1545|3914->2073|3947->2079
                  LINES: 24->1|29->2|32->3|34->4|34->4|35->2|36->4|39->7|39->7|39->7|39->7|39->7|43->11|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|51->19|52->20|54->22|54->22|54->22|56->24|56->24|56->24|57->25|69->37|69->37|71->39|80->48|80->48|81->49|97->65|98->66
                  -- GENERATED --
              */
          