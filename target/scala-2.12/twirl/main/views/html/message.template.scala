
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
Seq[Any](format.raw/*4.75*/("""




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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/message.scala.html
                  HASH: e400bf3cf3ec2a0392c9c2436126c59e446b1dac
                  MATRIX: 651->1|689->33|1035->50|1185->115|1206->128|1296->188|1327->194|1351->210|1365->216|1383->226|1422->228|1451->230|1578->330|1628->371|1668->373|1709->387|1722->391|1753->401|1789->410|1981->575|2267->840|2313->858|2587->1105|2716->1212|2757->1225|3003->1444|3120->1539|3161->1552|3567->1931|3608->1963|3647->1964|3692->1981|3773->2035|3789->2042|3825->2057|3874->2078|4054->2227|4123->2265|4155->2270
                  LINES: 24->1|25->2|30->3|34->4|34->4|35->4|40->9|40->9|40->9|40->9|40->9|42->11|48->17|48->17|48->17|49->18|49->18|49->18|50->19|57->26|59->28|61->30|72->41|72->41|73->42|83->52|83->52|84->53|98->67|98->67|98->67|99->68|100->69|100->69|100->69|101->70|103->72|106->75|107->76
                  -- GENERATED --
              */
          