
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
Seq[Any](format.raw/*4.75*/("""


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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/do_reset_password.scala.html
                  HASH: 6ca9202e602a78dbcc29d0e564901555863f1c71
                  MATRIX: 651->1|1037->48|1178->118|1215->135|1236->148|1326->208|1355->212|1385->234|1399->240|1417->250|1456->252|1491->260|1590->333|1630->364|1669->365|1705->374|1778->420|1794->427|1829->441|1870->454|2033->587|2065->592|2127->627|2221->712|2261->714|2303->729|2316->733|2347->743|2388->756|2727->1068|2808->1128|2854->1146|3155->1420|3236->1480|3281->1497|3824->2009|3856->2014
                  LINES: 24->1|29->2|32->3|34->4|34->4|35->4|38->7|38->7|38->7|38->7|38->7|42->11|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|50->19|51->20|53->22|53->22|53->22|55->24|55->24|55->24|56->25|68->37|68->37|70->39|79->48|79->48|80->49|96->65|97->66
                  -- GENERATED --
              */
          