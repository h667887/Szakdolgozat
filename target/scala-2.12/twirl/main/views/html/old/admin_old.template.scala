
package views.html.old

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
/*1.2*/import helper._
/*2.2*/import java.util
/*3.2*/import FormClasses.NewProduct
/*4.2*/import FormClasses.ProductDelete

object admin_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[User,util.List[Orders],Form[NewProduct],Form[ProductDelete],List[String],Form[ProductDelete],List[String],Form[ProductDelete],List[String],Form[ProductDelete],List[String],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(user: User)(orders: util.List[Orders])(newProductForm : Form[NewProduct])(pizzaDeleteForm : Form[ProductDelete])(pizzas: List[String])(drinkDeleteForm : Form[ProductDelete])(drinks: List[String])(extraDeleteForm : Form[ProductDelete])(extras: List[String])(ingredientDeleteForm : Form[ProductDelete])(ingredients: List[String])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""

"""),_display_(/*9.2*/layout("Pizza Papa")/*9.22*/(user)/*9.28*/(sumPrice)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""

    """),_display_(/*11.6*/if(flash.contains("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
        """),format.raw/*12.9*/("""<p class="success">
        """),_display_(/*13.10*/flash/*13.15*/.get("success")),format.raw/*13.30*/("""
        """),format.raw/*14.9*/("""</p>
    """)))}),format.raw/*15.6*/("""
    """),_display_(/*16.6*/if(flash.contains("noimage"))/*16.35*/ {_display_(Seq[Any](format.raw/*16.37*/("""
        """),format.raw/*17.9*/("""<p class="warning">
        """),_display_(/*18.10*/flash/*18.15*/.get("noimage")),format.raw/*18.30*/("""
        """),format.raw/*19.9*/("""</p>
    """)))}),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""<h1 align="center">Pizza Papa</h1>

    <div class="container">

        <div class="peti-main-div">
            <div class="row">
            """),_display_(/*27.14*/for(order <- orders) yield /*27.34*/ {_display_(Seq[Any](format.raw/*27.36*/("""
                """),format.raw/*28.17*/("""<div class="egy-user">
                    <p>
                        """),_display_(/*30.26*/order/*30.31*/.user),format.raw/*30.36*/("""
                        """),_display_(/*31.26*/order/*31.31*/.id),format.raw/*31.34*/("""
                        """),_display_(/*32.26*/order/*32.31*/.productID),format.raw/*32.41*/("""
                        """),_display_(/*33.26*/order/*33.31*/.isOrdered),format.raw/*33.41*/("""
                        """),_display_(/*34.26*/order/*34.31*/.date),format.raw/*34.36*/("""

                    """),format.raw/*36.21*/("""</p>

                </div>
            """)))}),format.raw/*39.14*/("""
            """),format.raw/*40.13*/("""</div>
            """),format.raw/*48.16*/("""

            """),format.raw/*50.13*/("""<div class="row">
                <div class="peti-main-div peti-border peti-background">
                    <h2>Új tétel felvétele</h2>
                """),_display_(/*53.18*/form(action=routes.HomeController.newItem(), 'enctype -> "multipart/form-data")/*53.97*/ {_display_(Seq[Any](format.raw/*53.99*/("""

                    """),_display_(/*55.22*/CSRF/*55.26*/.formField),format.raw/*55.36*/("""


                    """),format.raw/*58.21*/("""<p>Tétel típusa</p>
                    """),_display_(/*59.22*/select(
                        newProductForm("typeP"),

                        options(
                            "pizza"->"Pizza",
                            "refreshing"->"Refreshing",
                            "monster"->"Monster Energy",
                            "beer"->"Beer",
                            "extra"->"Extra",
                            "ingredient"->"Ingredient",
                            "dessert"->"Dessert",
                            "sidedish"->"Side Dish",
                            "salad"->"Salad",
                            "pasta"->"Pasta",
                            "streetfood"->"Street Food",
                            "sandwich"->"Sandwich",
                            "sauce"->"Sauce"
                        ),
                        '_default -> "-- Válassz típust --", 'class -> "form-control", '_showConstraints -> true, '_label -> null
                    )),format.raw/*78.22*/("""


                    """),format.raw/*81.21*/("""<p>Név</p>
                    """),_display_(/*82.22*/inputText(newProductForm("name"), 'class -> "form-control", '_showConstraints ->       true, '_label -> null)),format.raw/*82.131*/("""
                    """),format.raw/*83.21*/("""<p>Ár</p>
                    """),_display_(/*84.22*/inputText(newProductForm("price"), 'class -> "form-control", '_showConstraints ->      true, '_label -> null)),format.raw/*84.131*/("""
                    """),format.raw/*85.21*/("""<p>24cm ár(pizza)</p>
                    """),_display_(/*86.22*/inputText(newProductForm("price24"), 'class -> "form-control", '_showConstraints ->    true, '_label -> null)),format.raw/*86.131*/("""
                    """),format.raw/*87.21*/("""<p>32cm ár(pizza)</p>
                    """),_display_(/*88.22*/inputText(newProductForm("price32"), 'class -> "form-control", '_showConstraints ->    true, '_label -> null)),format.raw/*88.131*/("""
                    """),format.raw/*89.21*/("""<p>51cm ár(pizza)</p>
                    """),_display_(/*90.22*/inputText(newProductForm("price51"), 'class -> "form-control", '_showConstraints ->    true, '_label -> null)),format.raw/*90.131*/("""
                    """),_display_(/*91.22*/inputFile(newProductForm("imagepath"), 'class -> "form-control", '_showConstraints ->    true, '_label -> null)),format.raw/*91.133*/("""
                    """),format.raw/*92.21*/("""<button type="submit" class="btn btn-primary">Mehet</button>
                """)))}),format.raw/*93.18*/("""
                """),format.raw/*94.17*/("""</div>
                <div class="row">
                    <div class="peti-main-div peti-border peti-background">
                        <h2>Pizza törlés</h2>
                    """),_display_(/*98.22*/form(action=routes.HomeController.deletePizza())/*98.70*/ {_display_(Seq[Any](format.raw/*98.72*/("""

                        """),_display_(/*100.26*/CSRF/*100.30*/.formField),format.raw/*100.40*/("""


                        """),format.raw/*103.25*/("""<p>Tétel típusa</p>
                        """),_display_(/*104.26*/select(
                            pizzaDeleteForm("name"),
                            options(pizzas),
                            '_default -> "-- Válassz pizzát --", 'class -> "form-control", '_showConstraints -> true, '_label -> null
                        )),format.raw/*108.26*/("""

                        """),format.raw/*110.25*/("""<button type="submit" class="btn btn-primary">Mehet</button>




                    """)))}),format.raw/*115.22*/("""
                    """),format.raw/*116.21*/("""</div>
                </div>
                <div class="row">
                    <div class="peti-main-div peti-border peti-background">
                        <h2>Üdítő törlés </h2>
                            """),_display_(/*121.30*/form(action=routes.HomeController.deleteDrink())/*121.78*/ {_display_(Seq[Any](format.raw/*121.80*/("""

                                """),_display_(/*123.34*/CSRF/*123.38*/.formField),format.raw/*123.48*/("""


                                """),format.raw/*126.33*/("""<p>Üdítő neve</p>
                                """),_display_(/*127.34*/select(
                                    drinkDeleteForm("name"),
                                    options(drinks),
                                    '_default -> "-- Válassz Üdítőt --", 'class -> "form-control", '_showConstraints -> true, '_label -> null
                                )),format.raw/*131.34*/("""

                                """),format.raw/*133.33*/("""<button type="submit" class="btn btn-primary">Mehet</button>



                            """)))}),format.raw/*137.30*/("""
                    """),format.raw/*138.21*/("""</div>
                </div>
                <div class="row">
                    <div class="peti-main-div peti-border peti-background">
                        <h2>Extra törlés </h2>
                        """),_display_(/*143.26*/form(action=routes.HomeController.deleteExtra())/*143.74*/ {_display_(Seq[Any](format.raw/*143.76*/("""

                            """),_display_(/*145.30*/CSRF/*145.34*/.formField),format.raw/*145.44*/("""


                            """),format.raw/*148.29*/("""<p>Extra neve</p>
                            """),_display_(/*149.30*/select(
                                extraDeleteForm("name"),
                                options(extras),
                                '_default -> "-- Válassz extrát --", 'class -> "form-control", '_showConstraints -> true, '_label -> null
                            )),format.raw/*153.30*/("""

                            """),format.raw/*155.29*/("""<button type="submit" class="btn btn-primary">Mehet</button>




                        """)))}),format.raw/*160.26*/("""
                    """),format.raw/*161.21*/("""</div>
                </div>
                <div class="row">
                    <div class="peti-main-div peti-border peti-background">
                        <h2>Alapanyag törlés </h2>
                        """),_display_(/*166.26*/form(action=routes.HomeController.deleteIngredient())/*166.79*/ {_display_(Seq[Any](format.raw/*166.81*/("""

                            """),_display_(/*168.30*/CSRF/*168.34*/.formField),format.raw/*168.44*/("""


                            """),format.raw/*171.29*/("""<p>Alapanyag neve</p>
                            """),_display_(/*172.30*/select(
                                ingredientDeleteForm("name"),
                                options(ingredients),
                                '_default -> "-- Válassz alapanyagot --", 'class -> "form-control", '_showConstraints -> true, '_label -> null
                            )),format.raw/*176.30*/("""

                            """),format.raw/*178.29*/("""<button type="submit" class="btn btn-primary">Mehet</button>




                        """)))}),format.raw/*183.26*/("""
                    """),format.raw/*184.21*/("""</div>
                </div>

        </div>


    </div>

""")))}),format.raw/*192.2*/("""
"""))
      }
    }
  }

  def render(user:User,orders:util.List[Orders],newProductForm:Form[NewProduct],pizzaDeleteForm:Form[ProductDelete],pizzas:List[String],drinkDeleteForm:Form[ProductDelete],drinks:List[String],extraDeleteForm:Form[ProductDelete],extras:List[String],ingredientDeleteForm:Form[ProductDelete],ingredients:List[String],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(orders)(newProductForm)(pizzaDeleteForm)(pizzas)(drinkDeleteForm)(drinks)(extraDeleteForm)(extras)(ingredientDeleteForm)(ingredients)(sumPrice)

  def f:((User) => (util.List[Orders]) => (Form[NewProduct]) => (Form[ProductDelete]) => (List[String]) => (Form[ProductDelete]) => (List[String]) => (Form[ProductDelete]) => (List[String]) => (Form[ProductDelete]) => (List[String]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (orders) => (newProductForm) => (pizzaDeleteForm) => (pizzas) => (drinkDeleteForm) => (drinks) => (extraDeleteForm) => (extras) => (ingredientDeleteForm) => (ingredients) => (sumPrice) => apply(user)(orders)(newProductForm)(pizzaDeleteForm)(pizzas)(drinkDeleteForm)(drinks)(extraDeleteForm)(extras)(ingredientDeleteForm)(ingredients)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/admin_old.scala.html
                  HASH: 12ca723fc953e1db75fe1d7c24508d0189cdeafd
                  MATRIX: 655->1|678->18|702->36|739->67|1254->102|1695->450|1723->453|1751->473|1765->479|1783->489|1822->491|1855->498|1893->527|1933->529|1969->538|2025->567|2039->572|2075->587|2111->596|2151->606|2183->612|2221->641|2261->643|2297->652|2353->681|2367->686|2403->701|2439->710|2479->720|2511->725|2682->869|2718->889|2758->891|2803->908|2902->980|2916->985|2942->990|2995->1016|3009->1021|3033->1024|3086->1050|3100->1055|3131->1065|3184->1091|3198->1096|3229->1106|3282->1132|3296->1137|3322->1142|3372->1164|3445->1206|3486->1219|3533->1494|3575->1508|3757->1663|3845->1742|3885->1744|3935->1767|3948->1771|3979->1781|4030->1804|4098->1845|5042->2768|5093->2791|5152->2823|5283->2932|5332->2953|5390->2984|5521->3093|5570->3114|5640->3157|5771->3266|5820->3287|5890->3330|6021->3439|6070->3460|6140->3503|6271->3612|6320->3634|6453->3745|6502->3766|6611->3844|6656->3861|6867->4045|6924->4093|6964->4095|7019->4122|7033->4126|7065->4136|7121->4163|7194->4208|7481->4473|7536->4499|7654->4585|7704->4606|7948->4822|8006->4870|8047->4872|8110->4907|8124->4911|8156->4921|8220->4956|8299->5007|8618->5304|8681->5338|8806->5431|8856->5452|9096->5664|9154->5712|9195->5714|9254->5745|9268->5749|9300->5759|9360->5790|9435->5837|9738->6118|9797->6148|9919->6238|9969->6259|10213->6475|10276->6528|10317->6530|10376->6561|10390->6565|10422->6575|10482->6606|10561->6657|10879->6953|10938->6983|11060->7073|11110->7094|11202->7155
                  LINES: 24->1|25->2|26->3|27->4|32->6|37->7|39->9|39->9|39->9|39->9|39->9|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|50->20|51->21|57->27|57->27|57->27|58->28|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|66->36|69->39|70->40|71->48|73->50|76->53|76->53|76->53|78->55|78->55|78->55|81->58|82->59|101->78|104->81|105->82|105->82|106->83|107->84|107->84|108->85|109->86|109->86|110->87|111->88|111->88|112->89|113->90|113->90|114->91|114->91|115->92|116->93|117->94|121->98|121->98|121->98|123->100|123->100|123->100|126->103|127->104|131->108|133->110|138->115|139->116|144->121|144->121|144->121|146->123|146->123|146->123|149->126|150->127|154->131|156->133|160->137|161->138|166->143|166->143|166->143|168->145|168->145|168->145|171->148|172->149|176->153|178->155|183->160|184->161|189->166|189->166|189->166|191->168|191->168|191->168|194->171|195->172|199->176|201->178|206->183|207->184|215->192
                  -- GENERATED --
              */
          