
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
Seq[Any](format.raw/*7.390*/("""
"""),format.raw/*8.75*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/admin.scala.html
                  HASH: 801ea2f43d741af527eef49a87c5107d9fec59b7
                  MATRIX: 651->1|674->19|698->38|735->70|775->105|1308->143|1783->534|1804->547|1895->531|1924->607|1955->612|1984->632|1999->638|2018->648|2058->650|2093->658|2234->772|2272->801|2312->803|2362->825|2431->867|2445->872|2481->887|2531->909|2585->932|2631->951|2669->980|2709->982|2759->1004|2828->1046|2842->1051|2878->1066|2928->1088|2982->1111|3021->1123|3144->1219|3201->1267|3241->1269|3289->1290|3302->1294|3333->1304|3381->1324|3475->1391|3831->1726|3877->1744|4266->2102|4305->2114|4366->2148|4423->2196|4463->2198|4511->2219|4524->2223|4555->2233|4603->2253|4696->2319|5052->2654|5098->2672|5487->3030|5526->3042|5587->3076|5644->3124|5684->3126|5732->3147|5745->3151|5776->3161|5824->3181|5913->3243|6241->3550|6287->3568|6677->3926|6715->3936|6777->3970|6840->4023|6881->4025|6930->4046|6944->4050|6976->4060|7025->4080|7115->4142|7459->4464|7506->4482|7901->4845|7939->4855|8176->5064|8266->5143|8308->5145|8365->5174|8379->5178|8411->5188|8466->5214|8941->5661|10239->6937|10300->6969|10414->7055|10644->7263|10703->7293|11082->7644|11353->7893|11412->7923|12004->8487|12301->8762|12372->8804|12920->9324|13219->9601|13290->9643|14017->10342|14302->10605|14361->10635|14463->10709|14730->10954|14789->10984|15516->11683|15783->11928|15842->11958|16404->12492|16805->12871|16860->12897|17196->13205|17409->13396|20102->16057|20145->16071|20335->16233|20351->16239|20398->16264
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->8|37->8|38->7|39->8|41->10|41->10|41->10|41->10|41->10|43->12|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|56->25|58->27|62->31|62->31|62->31|64->33|64->33|64->33|66->35|68->37|75->44|76->45|85->54|87->56|89->58|89->58|89->58|91->60|91->60|91->60|93->62|95->64|102->71|103->72|112->81|114->83|116->85|116->85|116->85|118->87|118->87|118->87|120->89|122->91|129->98|130->99|139->108|140->109|142->111|142->111|142->111|144->113|144->113|144->113|146->115|148->117|155->124|156->125|165->134|166->135|172->141|172->141|172->141|174->143|174->143|174->143|175->144|185->154|207->176|209->178|211->180|214->183|215->184|223->192|227->196|228->197|239->208|243->212|244->213|254->223|258->227|259->228|276->245|280->249|281->250|283->252|287->256|288->257|306->275|310->279|311->280|332->301|339->308|340->309|349->318|352->321|428->397|429->398|433->402|433->402|433->402
                  -- GENERATED --
              */
          