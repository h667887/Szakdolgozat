
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
Seq[Any](format.raw/*4.75*/("""


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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/ask_reset_password.scala.html
                  HASH: 4ecadbf9d03982564e13e8497356b7db8597d87e
                  MATRIX: 651->1|700->44|1053->61|1200->123|1221->136|1311->196|1340->200|1373->225|1387->231|1405->241|1444->243|1479->251|1579->325|1645->382|1685->384|1722->394|1735->398|1766->408|1798->413|1909->497|1949->528|1988->529|2037->550|2122->608|2138->615|2173->629|2226->654|2414->811|2455->824|2714->1056|2786->1107|2828->1121|3317->1580|3350->1586
                  LINES: 24->1|25->2|30->3|34->4|34->4|35->4|38->7|38->7|38->7|38->7|38->7|42->11|46->15|46->15|46->15|47->16|47->16|47->16|48->17|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|56->25|57->26|68->37|68->37|70->39|87->56|89->58
                  -- GENERATED --
              */
          