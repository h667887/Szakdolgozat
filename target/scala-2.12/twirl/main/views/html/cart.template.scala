
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
/*3.2*/import FormClasses.CouponHelper
/*4.2*/import FormClasses.FormCoupon

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[User,util.List[String],Form[FormCoupon],util.List[CartProduct],util.List[Orders],Boolean,util.Map[Integer, util.List[Ingredient]],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(user: User)(availableCoupons: util.List[String])(couponForm: Form[FormCoupon])(products: util.List[CartProduct])(orders: util.List[Orders])(isEmpty: Boolean)(ingredients: util.Map[Integer, util.List[Ingredient]])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._

implicit def /*7.2*/implicitField/*7.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*7.75*/("""


"""),_display_(/*10.2*/layout("Cart")/*10.16*/(user)/*10.22*/(sumPrice)/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""


    """),format.raw/*13.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretkocsi">
        <tr><td valign="top">

        """),_display_(/*20.10*/for(product <- products) yield /*20.34*/ {_display_(Seq[Any](format.raw/*20.36*/("""
            """),format.raw/*21.13*/("""<table align="left"  border="0" class="kiskeret">


                    <tr>
                        <td>

                        </td>
                        <td class="kosarfont">

                        </td>
                        <td class="kosarfont">
                            Product
                        </td>
                        <td class="kosarfont">
                            Quantity
                        </td>
                        <td class="kosarfont">
                            Price
                        </td>
                    </tr>

                    <tr>
                        <td width="50">

                        </td>
                        <td align="center" rowspan="2">
                            <div class="images">
                                <img src=""""),_display_(/*48.44*/routes/*48.50*/.Assets.versioned(product.imagePath)),format.raw/*48.86*/(""""/>
                            </div>
                        </td>
                        <td class="kosarfontseged">
                            """),_display_(/*52.30*/product/*52.37*/.name),format.raw/*52.42*/(""" """),_display_(/*52.44*/if(product.typeP == "pizza")/*52.72*/ {_display_(Seq[Any](format.raw/*52.74*/("""("""),_display_(/*52.76*/product/*52.83*/.size),format.raw/*52.88*/(""" """),format.raw/*52.89*/("""cm)""")))}),format.raw/*52.93*/("""
                        """),format.raw/*53.25*/("""</td>
                        <td class="kosarfontseged">
                            """),_display_(/*55.30*/product/*55.37*/.quantity),format.raw/*55.46*/(""" """),format.raw/*55.47*/("""db
                        </td>
                        <td class="kosarfontseged" rowspan="2">"""),_display_(/*57.65*/(product.price * product.quantity)),format.raw/*57.99*/(""" """),format.raw/*57.100*/("""Ft</td>
                    </tr>

                <tr>
                    <td>

                    </td>

                    <td class="leiraskosar">
                        """),_display_(/*66.26*/if(product.typeP == "pizza")/*66.54*/ {_display_(Seq[Any](format.raw/*66.56*/("""
                            """),_display_(/*67.30*/for((key, value) <- ingredients) yield /*67.62*/ {_display_(Seq[Any](format.raw/*67.64*/("""
                                """),_display_(/*68.34*/if(key == product.id)/*68.55*/ {_display_(Seq[Any](format.raw/*68.57*/("""
                                    """),_display_(/*69.38*/for(i <- 0 until value.size) yield /*69.66*/ {_display_(Seq[Any](format.raw/*69.68*/("""
                                        """),_display_(/*70.42*/value(i)/*70.50*/.name),format.raw/*70.55*/(""" """),_display_(/*70.57*/if(i < value.size - 1)/*70.79*/ {_display_(Seq[Any](format.raw/*70.81*/(""",""")))}),format.raw/*70.83*/("""
                                    """)))}),format.raw/*71.38*/("""
                                """)))}),format.raw/*72.34*/("""
                            """)))}),format.raw/*73.30*/("""
                        """)))}/*74.27*/else/*74.32*/{_display_(Seq[Any](format.raw/*74.33*/("""
                            """),_display_(/*75.30*/product/*75.37*/.description),format.raw/*75.49*/("""
                        """)))}),format.raw/*76.26*/("""
                    """),format.raw/*77.21*/("""</td>
                    <td valign="top">

                        <a class=""  href=""""),_display_(/*80.45*/routes/*80.51*/.CartController.addToCart(product.id, true)),format.raw/*80.94*/("""">
                            <button type="submit" class="btn btn-warning bttnk" onclick="">
                                +
                            </button>
                        </a>
                        <a class=""  href=""""),_display_(/*85.45*/routes/*85.51*/.CartController.deleteItem(product.id)),format.raw/*85.89*/("""">
                            <button type="submit" class="btn btn-warning bttnk" onclick="">
                                -
                            </button>
                        </a>
                    </td>
                </tr>
                </tr></td>
            </table>

        """)))}),format.raw/*95.10*/("""
    """),format.raw/*96.5*/("""</td></tr>
        <tr><td valign="top">


        <tr><td valign="bottom" align="center">

        <table border="0" align="left" >

        """),_display_(/*104.10*/form(action=routes.CartController.makeOrder())/*104.56*/ {_display_(Seq[Any](format.raw/*104.58*/("""

            """),_display_(/*106.14*/CSRF/*106.18*/.formField),format.raw/*106.28*/("""

            """),format.raw/*108.13*/("""<tr><td width="105"></td><td height="150" valign="bottom">"""),_display_(/*108.72*/select(
                couponForm("description"),
                options(availableCoupons),
                '_default -> "-- Choose Coupon --",
                '_showConstraints -> true,
                '_label -> null,
                'class -> "btn btn-warning bttna"
            )),format.raw/*115.14*/("""</td><td></td><td class="pizzafont" valign="bottom" align="center">"""),_display_(/*115.82*/sumPrice),format.raw/*115.90*/(""" """),format.raw/*115.91*/("""Ft</td><td></td></tr>

            <tr>
                <td>

                </td>
                <td align="center" height="100" valign="bottom">
                        <button type="submit" class="btn btn-warning bttn">
                            Order
                        </button>

                </td>
                <td>

                </td>
                <td class="hiba" width="500" align="right" valign="bottom">
                    <label class="hiba">"""),_display_(/*131.42*/if(flash.containsKey("empty"))/*131.72*/ {_display_(Seq[Any](format.raw/*131.74*/("""
                        """),_display_(/*132.26*/flash()/*132.33*/.get("empty")),format.raw/*132.46*/("""
                    """)))}),format.raw/*133.22*/("""</label>
                </td>

                <td></td>
            </tr>
            <tr><td colspan="5" height="50"></td></tr>

        """)))}),format.raw/*140.10*/("""
        """),format.raw/*141.9*/("""</table>
        </td></tr>

    </table>

    <table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,availableCoupons:util.List[String],couponForm:Form[FormCoupon],products:util.List[CartProduct],orders:util.List[Orders],isEmpty:Boolean,ingredients:util.Map[Integer, util.List[Ingredient]],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(availableCoupons)(couponForm)(products)(orders)(isEmpty)(ingredients)(sumPrice)

  def f:((User) => (util.List[String]) => (Form[FormCoupon]) => (util.List[CartProduct]) => (util.List[Orders]) => (Boolean) => (util.Map[Integer, util.List[Ingredient]]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (availableCoupons) => (couponForm) => (products) => (orders) => (isEmpty) => (ingredients) => (sumPrice) => apply(user)(availableCoupons)(couponForm)(products)(orders)(isEmpty)(ingredients)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/cart.scala.html
                  HASH: 0c799fd2e06a415791e8b77e259ef1a9f862daf8
                  MATRIX: 651->1|675->19|713->51|752->84|1216->115|1521->349|1558->366|1579->379|1669->439|1699->443|1722->457|1737->463|1756->473|1796->475|1830->482|1997->622|2037->646|2077->648|2118->661|2969->1485|2984->1491|3041->1527|3218->1677|3234->1684|3260->1689|3289->1691|3326->1719|3366->1721|3395->1723|3411->1730|3437->1735|3466->1736|3501->1740|3554->1765|3668->1852|3684->1859|3714->1868|3743->1869|3867->1966|3922->2000|3952->2001|4158->2180|4195->2208|4235->2210|4292->2240|4340->2272|4380->2274|4441->2308|4471->2329|4511->2331|4576->2369|4620->2397|4660->2399|4729->2441|4746->2449|4772->2454|4801->2456|4832->2478|4872->2480|4905->2482|4974->2520|5039->2554|5100->2584|5145->2611|5158->2616|5197->2617|5254->2647|5270->2654|5303->2666|5360->2692|5409->2713|5525->2802|5540->2808|5604->2851|5871->3091|5886->3097|5945->3135|6278->3437|6310->3442|6481->3585|6537->3631|6578->3633|6621->3648|6635->3652|6667->3662|6710->3676|6797->3735|7104->4020|7200->4088|7230->4096|7260->4097|7765->4574|7805->4604|7846->4606|7900->4632|7917->4639|7952->4652|8006->4674|8179->4815|8216->4824
                  LINES: 24->1|25->2|26->3|27->4|32->5|35->6|37->7|37->7|38->7|41->10|41->10|41->10|41->10|41->10|44->13|51->20|51->20|51->20|52->21|79->48|79->48|79->48|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|86->55|86->55|86->55|86->55|88->57|88->57|88->57|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|101->70|101->70|101->70|101->70|102->71|103->72|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|108->77|111->80|111->80|111->80|116->85|116->85|116->85|126->95|127->96|135->104|135->104|135->104|137->106|137->106|137->106|139->108|139->108|146->115|146->115|146->115|146->115|162->131|162->131|162->131|163->132|163->132|163->132|164->133|171->140|172->141
                  -- GENERATED --
              */
          