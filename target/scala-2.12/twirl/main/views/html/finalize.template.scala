
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
/*1.2*/import java.util
/*2.2*/import FormClasses.CartProduct
/*3.2*/import FormClasses.CheckoutUser

object finalize extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[User,Form[CheckoutUser],util.List[CartProduct],Boolean,util.Map[Integer, util.List[Ingredient]],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: User)(checkoutUserForm : Form[CheckoutUser])(products: util.List[CartProduct])(isEmpty: Boolean)(ingredients: util.Map[Integer, util.List[Ingredient]])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._

implicit def /*7.2*/implicitField/*7.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*4.179*/("""

"""),format.raw/*7.75*/("""


"""),_display_(/*10.2*/layout("Cart")/*10.16*/(user)/*10.22*/(sumPrice)/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""



    """),format.raw/*14.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretfinal" border="0">
        <tr><td height="20"></td><td colspan="4"></td></tr>
        <tr>
            <td colspan="5" class="checkoutfont">CHECKOUT</td><td colspan="4"></td>
        </tr>

        <tr><td height="20"></td><td colspan="4"></td></tr>
        """),_display_(/*25.10*/form(action=routes.CartController.checkout())/*25.55*/ {_display_(Seq[Any](format.raw/*25.57*/("""
            """),_display_(/*26.14*/CSRF/*26.18*/.formField),format.raw/*26.28*/("""
            """),format.raw/*27.13*/("""<tr>
                <td colspan="5" class="inputfontreglog">Name</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                    """),_display_(/*33.22*/inputText(checkoutUserForm("fullName"), '_showConstraints -> false, '_label -> null, 'class -> "uinput", 'id -> "")),format.raw/*33.137*/("""
                """),format.raw/*34.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td colspan="5" class="inputfontreglog">Address</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                    """),_display_(/*43.22*/inputText(checkoutUserForm("address"), '_showConstraints -> false, '_label -> null, 'class -> "uinput", 'id -> "")),format.raw/*43.136*/("""
                """),format.raw/*44.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>

                <td colspan="5" class="inputfontreglog" align="left">Telephone</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                 """),_display_(/*54.19*/inputText(checkoutUserForm("phoneNumber"), '_showConstraints -> false, '_label -> null, 'class -> "uinput", 'id -> "")),format.raw/*54.137*/("""
                """),format.raw/*55.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>

                <td colspan="5" class="inputfontreglog" align="left">Email</td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2">
                    """),_display_(/*65.22*/inputText(checkoutUserForm("email"), '_showConstraints -> false, '_label -> null, 'class -> "uinput", 'id -> "")),format.raw/*65.134*/("""
                """),format.raw/*66.17*/("""</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                <td colspan="3" class="finalfont">Total: """),_display_(/*73.59*/sumPrice),format.raw/*73.67*/(""" """),format.raw/*73.68*/("""Ft</td>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td height="60"></td>
                <td>
                    <button type="submit" class="btn btn-warning bttne">Finalize</button></td>
                </td>
                <td></td>


            </tr>
            <tr>
        """)))}),format.raw/*86.10*/("""


            """),format.raw/*89.13*/("""<td colspan="5"><label class="hiba">"""),_display_(/*89.50*/if(flash.containsKey("warning"))/*89.82*/{_display_(Seq[Any](format.raw/*89.83*/("""
                """),_display_(/*90.18*/flash()/*90.25*/.get("warning")),format.raw/*90.40*/("""
            """)))}),format.raw/*91.14*/("""</label></td>
        </tr>
    </table>


    <table height="200"></table>
""")))}))
      }
    }
  }

  def render(user:User,checkoutUserForm:Form[CheckoutUser],products:util.List[CartProduct],isEmpty:Boolean,ingredients:util.Map[Integer, util.List[Ingredient]],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(checkoutUserForm)(products)(isEmpty)(ingredients)(sumPrice)

  def f:((User) => (Form[CheckoutUser]) => (util.List[CartProduct]) => (Boolean) => (util.Map[Integer, util.List[Ingredient]]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (checkoutUserForm) => (products) => (isEmpty) => (ingredients) => (sumPrice) => apply(user)(checkoutUserForm)(products)(isEmpty)(ingredients)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/finalize.scala.html
                  HASH: f13d05dcc4b4882facd05f4c4dd47d2c62c53f5d
                  MATRIX: 651->1|675->20|713->53|1149->87|1399->269|1436->287|1457->300|1548->264|1579->360|1612->367|1635->381|1650->387|1669->397|1709->399|1748->411|2138->774|2192->819|2232->821|2274->836|2287->840|2318->850|2360->864|2579->1056|2716->1171|2762->1189|3061->1461|3197->1575|3243->1593|3556->1879|3696->1997|3742->2015|4054->2300|4188->2412|4234->2430|4466->2635|4495->2643|4524->2644|4897->2986|4943->3004|5007->3041|5048->3073|5087->3074|5133->3093|5149->3100|5185->3115|5231->3130
                  LINES: 24->1|25->2|26->3|31->4|34->6|36->7|36->7|37->4|39->7|42->10|42->10|42->10|42->10|42->10|46->14|57->25|57->25|57->25|58->26|58->26|58->26|59->27|65->33|65->33|66->34|75->43|75->43|76->44|86->54|86->54|87->55|97->65|97->65|98->66|105->73|105->73|105->73|118->86|121->89|121->89|121->89|121->89|122->90|122->90|122->90|123->91
                  -- GENERATED --
              */
          