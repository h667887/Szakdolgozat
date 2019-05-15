
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


Seq[Any](format.raw/*6.349*/("""


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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/admin_old.scala.html
                  HASH: 1ea8f9856a29c81f56b2a862d6051e3635e51b3d
                  MATRIX: 655->1|678->19|702->38|739->70|1254->107|1697->454|1729->461|1757->481|1771->487|1789->497|1828->499|1863->508|1901->537|1941->539|1978->549|2035->579|2049->584|2085->599|2122->609|2163->620|2196->627|2234->656|2274->658|2311->668|2368->698|2382->703|2418->718|2455->728|2496->739|2529->745|2706->895|2742->915|2782->917|2828->935|2929->1009|2943->1014|2969->1019|3023->1046|3037->1051|3061->1054|3115->1081|3129->1086|3160->1096|3214->1123|3228->1128|3259->1138|3313->1165|3327->1170|3353->1175|3405->1199|3481->1244|3523->1258|3571->1541|3615->1557|3800->1715|3888->1794|3928->1796|3980->1821|3993->1825|4024->1835|4078->1861|4147->1903|5110->2845|5164->2871|5224->2904|5355->3013|5405->3035|5464->3067|5595->3176|5645->3198|5716->3242|5847->3351|5897->3373|5968->3417|6099->3526|6149->3548|6220->3592|6351->3701|6401->3724|6534->3835|6584->3857|6694->3936|6740->3954|6955->4142|7012->4190|7052->4192|7109->4221|7123->4225|7155->4235|7214->4265|7288->4311|7579->4580|7636->4608|7759->4699|7810->4721|8059->4942|8117->4990|8158->4992|8223->5029|8237->5033|8269->5043|8336->5081|8416->5133|8739->5434|8804->5470|8933->5567|8984->5589|9229->5806|9287->5854|9328->5856|9389->5889|9403->5893|9435->5903|9498->5937|9574->5985|9881->6270|9942->6302|10069->6397|10120->6419|10369->6640|10432->6693|10473->6695|10534->6728|10548->6732|10580->6742|10643->6776|10723->6828|11045->7128|11106->7160|11233->7255|11284->7277|11384->7346
                  LINES: 24->1|25->2|26->3|27->4|32->6|37->6|40->9|40->9|40->9|40->9|40->9|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|52->21|58->27|58->27|58->27|59->28|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|67->36|70->39|71->40|72->48|74->50|77->53|77->53|77->53|79->55|79->55|79->55|82->58|83->59|102->78|105->81|106->82|106->82|107->83|108->84|108->84|109->85|110->86|110->86|111->87|112->88|112->88|113->89|114->90|114->90|115->91|115->91|116->92|117->93|118->94|122->98|122->98|122->98|124->100|124->100|124->100|127->103|128->104|132->108|134->110|139->115|140->116|145->121|145->121|145->121|147->123|147->123|147->123|150->126|151->127|155->131|157->133|161->137|162->138|167->143|167->143|167->143|169->145|169->145|169->145|172->148|173->149|177->153|179->155|184->160|185->161|190->166|190->166|190->166|192->168|192->168|192->168|195->171|196->172|200->176|202->178|207->183|208->184|216->192
                  -- GENERATED --
              */
          