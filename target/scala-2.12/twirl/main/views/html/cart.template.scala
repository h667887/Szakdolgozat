
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
Seq[Any](format.raw/*5.234*/("""
"""),format.raw/*7.75*/("""


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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/cart.scala.html
                  HASH: 782352bc5a87f6c2a643fd2762ac2d56441dc56e
                  MATRIX: 651->1|675->20|713->53|752->87|1216->119|1521->354|1558->372|1579->385|1670->351|1699->445|1732->452|1755->466|1770->472|1789->482|1829->484|1866->494|2040->641|2080->665|2120->667|2162->681|3040->1532|3055->1538|3112->1574|3293->1728|3309->1735|3335->1740|3364->1742|3401->1770|3441->1772|3470->1774|3486->1781|3512->1786|3541->1787|3576->1791|3630->1817|3746->1906|3762->1913|3792->1922|3821->1923|3947->2022|4002->2056|4032->2057|4247->2245|4284->2273|4324->2275|4382->2306|4430->2338|4470->2340|4532->2375|4562->2396|4602->2398|4668->2437|4712->2465|4752->2467|4822->2510|4839->2518|4865->2523|4894->2525|4925->2547|4965->2549|4998->2551|5068->2590|5134->2625|5196->2656|5242->2684|5255->2689|5294->2690|5352->2721|5368->2728|5401->2740|5459->2767|5509->2789|5628->2881|5643->2887|5707->2930|5979->3175|5994->3181|6053->3219|6396->3531|6429->3537|6608->3688|6664->3734|6705->3736|6750->3753|6764->3757|6796->3767|6841->3783|6928->3842|7242->4134|7338->4202|7368->4210|7398->4211|7919->4704|7959->4734|8000->4736|8055->4763|8072->4770|8107->4783|8162->4806|8342->4954|8380->4964
                  LINES: 24->1|25->2|26->3|27->4|32->5|35->6|37->7|37->7|38->5|39->7|42->10|42->10|42->10|42->10|42->10|45->13|52->20|52->20|52->20|53->21|80->48|80->48|80->48|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|84->52|85->53|87->55|87->55|87->55|87->55|89->57|89->57|89->57|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|102->70|102->70|102->70|102->70|103->71|104->72|105->73|106->74|106->74|106->74|107->75|107->75|107->75|108->76|109->77|112->80|112->80|112->80|117->85|117->85|117->85|127->95|128->96|136->104|136->104|136->104|138->106|138->106|138->106|140->108|140->108|147->115|147->115|147->115|147->115|163->131|163->131|163->131|164->132|164->132|164->132|165->133|172->140|173->141
                  -- GENERATED --
              */
          