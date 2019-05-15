
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
/*1.2*/import FormClasses.MailMessage
/*2.2*/import helper._

object message extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[MailMessage],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User)(messageForm: Form[MailMessage])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*3.65*/("""
"""),format.raw/*4.75*/("""




"""),_display_(/*9.2*/layout("Üzenet")/*9.18*/(user)/*9.24*/(sumPrice)/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""

"""),format.raw/*11.1*/("""<table id="tablepadding">
    <tr><td>  </td></tr>
</table>

    <table class="keretlog">

        """),_display_(/*17.10*/form(action=routes.HomeController.send())/*17.51*/ {_display_(Seq[Any](format.raw/*17.53*/("""
            """),_display_(/*18.14*/CSRF/*18.18*/.formField),format.raw/*18.28*/("""
        """),format.raw/*19.9*/("""<tr>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td width="90"></td>
            <td class="keretuzenj" colspan="1">

                """),_display_(/*26.18*/textarea(messageForm("message"), 'id -> "textarea", 'maxlength -> 600,
                    'placeholder -> "Üzenj nekünk! (max: 600 karakter)", 'onfocus -> "this.placeholder=''",
                    'onblur -> "this.placeholder='Üzenj nekünk! (max: 600 karakter)'")),format.raw/*28.87*/("""

                """),format.raw/*30.17*/("""</td>
            <td></td>
        </tr>
        <tr><td height="50"></td></tr>

        <tr>
            <td colspan="5" class="inputfont">Email</td>
        </tr>
        <tr>
            <td></td>
            <td colspan="2">
                """),_display_(/*41.18*/inputText(messageForm("email"), '_showConstraints -> false, '_label -> null, 'class -> "uinput", 'id -> "")),format.raw/*41.125*/("""
            """),format.raw/*42.13*/("""</td>
            <td colspan="2"></td>
        </tr>
        <tr>

            <td colspan="5" class="inputfont">Name</td>
        </tr>
        <tr>
            <td></td>
            <td colspan="2">
                """),_display_(/*52.18*/inputText(messageForm("name"), 'class -> "uinput", '_showConstraints -> false, '_label -> null)),format.raw/*52.113*/("""
            """),format.raw/*53.13*/("""</td>
            <td colspan="2"></td>
        </tr>
        <tr>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit" class="btn btn-warning bttne">Send</button></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td colspan="5"><label class="hiba">"""),_display_(/*67.50*/if(flash.containsKey("warning"))/*67.82*/{_display_(Seq[Any](format.raw/*67.83*/("""
                """),format.raw/*68.17*/("""<div class="alert alert-danger">
                    """),_display_(/*69.22*/flash()/*69.29*/.get("warning")),format.raw/*69.44*/("""
                    """),format.raw/*70.21*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                </div>
            """)))}),format.raw/*72.14*/("""</label></td>
        </tr>

        """)))}),format.raw/*75.10*/("""
    """),format.raw/*76.5*/("""</table>

    <table height="200"></table>
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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/message.scala.html
                  HASH: 38aa8395dee6e6b336e6cbdf84e372f6f3237bdf
                  MATRIX: 651->1|689->34|1035->52|1185->118|1206->131|1296->115|1325->191|1361->202|1385->218|1399->224|1417->234|1456->236|1487->240|1620->346|1670->387|1710->389|1752->404|1765->408|1796->418|1833->428|2032->600|2320->867|2368->887|2653->1145|2782->1252|2824->1266|3080->1495|3197->1590|3239->1604|3659->1997|3700->2029|3739->2030|3785->2048|3867->2103|3883->2110|3919->2125|3969->2147|4151->2298|4223->2339|4256->2345
                  LINES: 24->1|25->2|30->3|34->4|34->4|35->3|36->4|41->9|41->9|41->9|41->9|41->9|43->11|49->17|49->17|49->17|50->18|50->18|50->18|51->19|58->26|60->28|62->30|73->41|73->41|74->42|84->52|84->52|85->53|99->67|99->67|99->67|100->68|101->69|101->69|101->69|102->70|104->72|107->75|108->76
                  -- GENERATED --
              */
          