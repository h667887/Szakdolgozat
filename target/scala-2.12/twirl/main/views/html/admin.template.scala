
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
/*1.2*/import helper._
/*2.2*/import java.util
/*3.2*/import FormClasses.NewProduct
/*4.2*/import FormClasses.ProductDelete
/*5.2*/import FormClasses.FormIngredient

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[User,util.List[Orders],Form[FormIngredient],Form[NewProduct],Form[ProductDelete],List[String],Form[ProductDelete],List[String],Form[ProductDelete],List[String],Form[ProductDelete],List[String],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(user: User)(orders: util.List[Orders])(addIngredientForm: Form[FormIngredient])(newProductForm : Form[NewProduct])(pizzaDeleteForm : Form[ProductDelete])(pizzas: List[String])(drinkDeleteForm : Form[ProductDelete])(drinks: List[String])(extraDeleteForm : Form[ProductDelete])(extras: List[String])(ingredientDeleteForm : Form[ProductDelete])(ingredients: List[String])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*8.2*/implicitField/*8.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*8.75*/("""

"""),_display_(/*10.2*/layout("Pizza Papa")/*10.22*/(user)/*10.28*/(sumPrice)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""

    """),format.raw/*12.5*/("""<table class="keretadmin">
        <tr><td colspan="10">
            <table align="center">

                """),_display_(/*16.18*/if(flash.contains("success"))/*16.47*/ {_display_(Seq[Any](format.raw/*16.49*/("""
                    """),format.raw/*17.21*/("""<p class="success">
                    """),_display_(/*18.22*/flash/*18.27*/.get("success")),format.raw/*18.42*/("""
                    """),format.raw/*19.21*/("""</p>
                """)))}),format.raw/*20.18*/("""
                """),_display_(/*21.18*/if(flash.contains("noimage"))/*21.47*/ {_display_(Seq[Any](format.raw/*21.49*/("""
                    """),format.raw/*22.21*/("""<p class="warning">
                    """),_display_(/*23.22*/flash/*23.27*/.get("noimage")),format.raw/*23.42*/("""
                    """),format.raw/*24.21*/("""</p>
                """)))}),format.raw/*25.18*/("""

        """),format.raw/*27.9*/("""<tr>
            <td colspan="10" height="30"></td>
        </tr>
        <tr>
            """),_display_(/*31.14*/form(action=routes.HomeController.deletePizza())/*31.62*/ {_display_(Seq[Any](format.raw/*31.64*/("""

                """),_display_(/*33.18*/CSRF/*33.22*/.formField),format.raw/*33.32*/("""

                """),format.raw/*35.17*/("""<td ></td>
                <td height="80">
                    """),_display_(/*37.22*/select(
                        pizzaDeleteForm("name"),
                        options(pizzas),
                        '_default -> "-- Choose Pizza --",
                        '_showConstraints -> true,
                        '_label -> null,
                        'class -> "btn btn-warning bttna"
                    )),format.raw/*44.22*/("""
                """),format.raw/*45.17*/("""</td>
                <td></td>
                <td class="pizzafont" width="180" align="center">Pizza</td>
                <td></td>
                <td><button type="submit" class="btn btn-warning bttnab">Delete</button></td>
                <td></td>
                <td class="hiba">hiba</td>
                <td colspan="2"></td>

            """)))}),format.raw/*54.14*/("""

        """),format.raw/*56.9*/("""</tr>
        <tr>
            """),_display_(/*58.14*/form(action=routes.HomeController.deleteDrink())/*58.62*/ {_display_(Seq[Any](format.raw/*58.64*/("""

                """),_display_(/*60.18*/CSRF/*60.22*/.formField),format.raw/*60.32*/("""

                """),format.raw/*62.17*/("""<td></td>
                <td height="80">
                    """),_display_(/*64.22*/select(
                        drinkDeleteForm("name"),
                        options(drinks),
                        '_default -> "-- Choose Drink --",
                        '_showConstraints -> true,
                        '_label -> null,
                        'class -> "btn btn-warning bttna"
                    )),format.raw/*71.22*/("""
                """),format.raw/*72.17*/("""</td>
                <td></td>
                <td class="pizzafont" width="180" align="center">Drink</td>
                <td></td>
                <td><button type="submit" class="btn btn-warning bttnab">Delete</button></td>
                <td></td>
                <td class="hiba">hiba</td>
                <td colspan="2"></td>

            """)))}),format.raw/*81.14*/("""

        """),format.raw/*83.9*/("""</tr>
        <tr>
            """),_display_(/*85.14*/form(action=routes.HomeController.deleteExtra())/*85.62*/ {_display_(Seq[Any](format.raw/*85.64*/("""

                """),_display_(/*87.18*/CSRF/*87.22*/.formField),format.raw/*87.32*/("""

                """),format.raw/*89.17*/("""<td></td>
                <td height="80">
                """),_display_(/*91.18*/select(
                    extraDeleteForm("name"),
                    options(extras),
                    '_default -> "-- Choose Extra --",
                    '_showConstraints -> true,
                    '_label -> null,
                    'class -> "btn btn-warning bttna"
                )),format.raw/*98.18*/("""
                """),format.raw/*99.17*/("""</td>
                <td></td>
                <td class="pizzafont" width="180" align="center">Extra</td>
                <td></td>
                <td><button type="submit" class="btn btn-warning bttnab">Delete</button></td>
                <td></td>
                <td class="hiba">hiba</td>
                <td colspan="2"></td>

            """)))}),format.raw/*108.14*/("""
        """),format.raw/*109.9*/("""</tr>
        <tr>
            """),_display_(/*111.14*/form(action=routes.HomeController.deleteIngredient())/*111.67*/ {_display_(Seq[Any](format.raw/*111.69*/("""

                """),_display_(/*113.18*/CSRF/*113.22*/.formField),format.raw/*113.32*/("""

                """),format.raw/*115.17*/("""<td></td>
                <td height="80">
                """),_display_(/*117.18*/select(
                    ingredientDeleteForm("name"),
                    options(ingredients),
                    '_default -> "-- Choose Ingredient --",
                    '_showConstraints -> true,
                    '_label -> null,
                    'class -> "btn btn-warning bttna"
                )),format.raw/*124.18*/("""
                """),format.raw/*125.17*/("""</td>
                <td></td>
                <td class="pizzafont" width="180" align="center">Ingredient</td>
                <td></td>
                <td><button type="submit" class="btn btn-warning bttnab">Delete</button></td>
                <td></td>
                <td class="hiba">hiba</td>
                <td colspan="2"></td>

            """)))}),format.raw/*134.14*/("""
        """),format.raw/*135.9*/("""</tr>
            </table></td></tr>
        <tr>
            <td></td>
            <td colspan="5" rowspan="14">
                <table class="kiskeretb" align="left" valign="top">
                    """),_display_(/*141.22*/form(action=routes.HomeController.newItem(), 'enctype -> "multipart/form-data")/*141.101*/ {_display_(Seq[Any](format.raw/*141.103*/("""

                        """),_display_(/*143.26*/CSRF/*143.30*/.formField),format.raw/*143.40*/("""
                        """),format.raw/*144.25*/("""<tr>
                            <td height="50" width="300" colspan="2" align="center" class="checkoutfont">NEW ITEM</td><td></td>
                        </tr>
                        <tr>
                            <td class="pizzafont">Item</td>

                            <td class="pizzafont">Name</td>
                        </tr>
                        <tr>
                            <td>
                                """),_display_(/*154.34*/select(
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
                                    '_default -> "-- Choose Type --",
                                    'class -> "btn btn-warning bttnak",
                                    '_showConstraints -> true,
                                    '_label -> null
                                )),format.raw/*176.34*/("""

                            """),format.raw/*178.29*/("""</td>
                            <td width="280">
                                """),_display_(/*180.34*/inputText(newProductForm("name"),
                                    'class -> "ainput",
                                    '_showConstraints -> true,
                                    '_label -> null)),format.raw/*183.53*/("""
                            """),format.raw/*184.29*/("""</td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr><td></td><td class="kosarfontseged">Description</td></tr>
                        <tr>
                            <td height="50"></td>
                            <td>
                                """),_display_(/*192.34*/inputText(newProductForm("description"),
                                    'class -> "ainput",
                                    '_showConstraints -> true,
                                    '_label -> null
                                )),format.raw/*196.34*/("""
                            """),format.raw/*197.29*/("""</td>
                        </tr>
                        <tr>
                            <td><img src="img/pizza/4Sajtos.png" height="150" width="250"/></td>
                            <td>
                                <table>
                                    <tr>
                                        <td class="kosarfontseged">Global Product Price</td>
                                    </tr>
                                    <tr>
                                        <td td width="280">
                                        """),_display_(/*208.42*/inputText(newProductForm("price"),
                                            'class -> "ainput",
                                            '_showConstraints -> true,
                                            '_label -> null
                                        )),format.raw/*212.42*/("""
                                        """),format.raw/*213.41*/("""</td>
                                    </tr>
                                    <tr>
                                        <td   height="30"></td>
                                    </tr>
                                    <tr>
                                        <td class="kosarfontseged" valign="center">24cm Pizza Price</td>
                                    </tr>
                                    <tr>
                                        <td>
                                        """),_display_(/*223.42*/inputText(newProductForm("price24"),
                                            'class -> "ainput",
                                            '_showConstraints -> true,
                                            '_label -> null
                                        )),format.raw/*227.42*/("""
                                        """),format.raw/*228.41*/("""</td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td class="kosarfontseged" valign="top">32cm Pizza Price</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                """),_display_(/*245.34*/inputFile(newProductForm("imagepath"),
                                    'class -> "btn btn-warning bttnab",
                                    '_showConstraints -> true,
                                    '_label -> null
                                )),format.raw/*249.34*/("""
                            """),format.raw/*250.29*/("""</td>
                            <td>
                                """),_display_(/*252.34*/inputText(newProductForm("price32"),
                                    'class -> "ainput",
                                    '_showConstraints -> true,
                                    '_label -> null
                                )),format.raw/*256.34*/("""
                            """),format.raw/*257.29*/("""</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td class="kosarfontseged" valign="top">51cm Pizza Price</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                """),_display_(/*275.34*/inputText(newProductForm("price51"),
                                    'class -> "ainput",
                                    '_showConstraints -> true,
                                    '_label -> null
                                )),format.raw/*279.34*/("""
                            """),format.raw/*280.29*/("""</td>
                            <td ></td>
                        </tr>
                        <tr><td height="100"></td></tr>

                </table>

            </td>
            <td></td>
            <td>
                <table border="0" valign="bottom">
                    <tr><td height="50"></td></tr>
                    <tr>
                        <td class="pizzafont">Ingredient</td>
                    </tr>


                    <tr>

                        <td>

                        """),_display_(/*301.26*/select(
                            addIngredientForm("ingName"),
                            options(ingredients),
                            '_default -> "-- Choose Ingredient --",
                            '_showConstraints -> true,
                            '_label -> null,
                            'class -> "btn btn-warning bttnak"
                        )),format.raw/*308.26*/("""
                        """),format.raw/*309.25*/("""</td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td class="kosarfontseged">Quantity</td>
                    </tr>
                    <tr>
                        <td>"""),_display_(/*318.30*/inputText(addIngredientForm("quantity"),
                            'class -> "ainput",
                            '_showConstraints -> true,
                            '_label -> null)),format.raw/*321.45*/("""</td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td><button type="submit" class="btn btn-warning bttn" name="action" value = "update">Update</button></td>
                    </tr>

                    <tr>
                        <td class="hiba">hiba</td>
                    </tr>


                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td class="pizzafont">Product</td>
                    </tr>
                    <tr>
                        <td><select class="btn btn-warning bttnak"><option>Valami</option></select></td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td class="kosarfontseged">Quantity</td>
                    </tr>
                    <tr>
                        <td><input class="ainput"></td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td><button type="button" class="btn btn-warning bttn">Update</button></td>
                    </tr>
                    <tr>
                        <td class="hiba">hiba</td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td class="pizzafont">User ID</td>
                    </tr>
                    <tr>
                        <td><input class="ainput"></td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td><button type="button" class="btn btn-warning bttn">Delete</button></td>
                    </tr>
                    <tr>
                        <td class="hiba">hiba</td>
                    </tr>
                    <tr><td></td></tr>
                </table>
            </td>
            <td></td>        </tr>


        <tr><td width="100"></td></tr><tr>



        <tr><td rowspan="14" colspan="8">
        <table border="0" align="center">
        <tr>
            <td height="100"></td>
            <td valign="bottom">
                    <button type="submit" class="btn btn-warning bttne" name="action" value="add">Add</button>
            </td>
            """)))}),format.raw/*397.14*/("""
            """),format.raw/*398.13*/("""<td></td>
            <td class="hiba" width="400" valign="bottom">hiba</td>
            <td></td>
            <td valign="bottom">
                <a href=""""),_display_(/*402.27*/routes/*402.33*/.UserController.profile()),format.raw/*402.58*/("""">
                    <button type="button" class="btn btn-warning bttne">Back</button>
                </a>
            </td>
            <td></td>
        </tr>
        <tr><td height="30"></td></tr>
        </table>
        </td></tr>

    </table>


    <table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,orders:util.List[Orders],addIngredientForm:Form[FormIngredient],newProductForm:Form[NewProduct],pizzaDeleteForm:Form[ProductDelete],pizzas:List[String],drinkDeleteForm:Form[ProductDelete],drinks:List[String],extraDeleteForm:Form[ProductDelete],extras:List[String],ingredientDeleteForm:Form[ProductDelete],ingredients:List[String],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(orders)(addIngredientForm)(newProductForm)(pizzaDeleteForm)(pizzas)(drinkDeleteForm)(drinks)(extraDeleteForm)(extras)(ingredientDeleteForm)(ingredients)(sumPrice)

  def f:((User) => (util.List[Orders]) => (Form[FormIngredient]) => (Form[NewProduct]) => (Form[ProductDelete]) => (List[String]) => (Form[ProductDelete]) => (List[String]) => (Form[ProductDelete]) => (List[String]) => (Form[ProductDelete]) => (List[String]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (orders) => (addIngredientForm) => (newProductForm) => (pizzaDeleteForm) => (pizzas) => (drinkDeleteForm) => (drinks) => (extraDeleteForm) => (extras) => (ingredientDeleteForm) => (ingredients) => (sumPrice) => apply(user)(orders)(addIngredientForm)(newProductForm)(pizzaDeleteForm)(pizzas)(drinkDeleteForm)(drinks)(extraDeleteForm)(extras)(ingredientDeleteForm)(ingredients)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/admin.scala.html
                  HASH: dee6b1412fb719beb208fa80ee281a85ba6a486d
                  MATRIX: 651->1|674->18|698->36|735->67|775->101|1308->137|1783->527|1804->540|1894->600|1923->603|1952->623|1967->629|1986->639|2026->641|2059->647|2196->757|2234->786|2274->788|2323->809|2391->850|2405->855|2441->870|2490->891|2543->913|2588->931|2626->960|2666->962|2715->983|2783->1024|2797->1029|2833->1044|2882->1065|2935->1087|2972->1097|3091->1189|3148->1237|3188->1239|3234->1258|3247->1262|3278->1272|3324->1290|3416->1355|3765->1683|3810->1700|4190->2049|4227->2059|4286->2091|4343->2139|4383->2141|4429->2160|4442->2164|4473->2174|4519->2192|4610->2256|4959->2584|5004->2601|5384->2950|5421->2960|5480->2992|5537->3040|5577->3042|5623->3061|5636->3065|5667->3075|5713->3093|5800->3153|6121->3453|6166->3470|6547->3819|6584->3828|6644->3860|6707->3913|6748->3915|6795->3934|6809->3938|6841->3948|6888->3966|6976->4026|7313->4341|7359->4358|7745->4712|7782->4721|8013->4924|8103->5003|8145->5005|8200->5032|8214->5036|8246->5046|8300->5071|8765->5508|10041->6762|10100->6792|10212->6876|10439->7081|10497->7110|10868->7453|11135->7698|11193->7727|11774->8280|12067->8551|12137->8592|12675->9102|12970->9375|13040->9416|13750->10098|14031->10357|14089->10386|14189->10458|14452->10699|14510->10728|15219->11409|15482->11650|15540->11679|16081->12192|16475->12564|16529->12589|16856->12888|17066->13076|19683->15661|19725->15674|19911->15832|19927->15838|19974->15863
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->8|37->8|38->8|40->10|40->10|40->10|40->10|40->10|42->12|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|54->24|55->25|57->27|61->31|61->31|61->31|63->33|63->33|63->33|65->35|67->37|74->44|75->45|84->54|86->56|88->58|88->58|88->58|90->60|90->60|90->60|92->62|94->64|101->71|102->72|111->81|113->83|115->85|115->85|115->85|117->87|117->87|117->87|119->89|121->91|128->98|129->99|138->108|139->109|141->111|141->111|141->111|143->113|143->113|143->113|145->115|147->117|154->124|155->125|164->134|165->135|171->141|171->141|171->141|173->143|173->143|173->143|174->144|184->154|206->176|208->178|210->180|213->183|214->184|222->192|226->196|227->197|238->208|242->212|243->213|253->223|257->227|258->228|275->245|279->249|280->250|282->252|286->256|287->257|305->275|309->279|310->280|331->301|338->308|339->309|348->318|351->321|427->397|428->398|432->402|432->402|432->402
                  -- GENERATED --
              */
          