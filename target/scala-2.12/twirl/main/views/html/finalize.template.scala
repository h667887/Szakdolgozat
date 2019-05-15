
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
Seq[Any](format.raw/*5.1*/("""
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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/finalize.scala.html
                  HASH: a3d1917f8986f17a181ff72873732da4a2f6982f
                  MATRIX: 651->1|675->19|713->51|1149->84|1399->264|1436->281|1457->294|1546->262|1574->354|1604->358|1627->372|1642->378|1661->388|1701->390|1736->398|2115->750|2169->795|2209->797|2250->811|2263->815|2294->825|2335->838|2548->1024|2685->1139|2730->1156|3020->1419|3156->1533|3201->1550|3504->1826|3644->1944|3689->1961|3991->2236|4125->2348|4170->2365|4395->2563|4424->2571|4453->2572|4813->2901|4856->2916|4920->2953|4961->2985|5000->2986|5045->3004|5061->3011|5097->3026|5142->3040
                  LINES: 24->1|25->2|26->3|31->4|34->6|36->7|36->7|37->5|38->7|41->10|41->10|41->10|41->10|41->10|45->14|56->25|56->25|56->25|57->26|57->26|57->26|58->27|64->33|64->33|65->34|74->43|74->43|75->44|85->54|85->54|86->55|96->65|96->65|97->66|104->73|104->73|104->73|117->86|120->89|120->89|120->89|120->89|121->90|121->90|121->90|122->91
                  -- GENERATED --
              */
          