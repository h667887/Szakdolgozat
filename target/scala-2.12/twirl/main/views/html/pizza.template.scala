
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
/*2.2*/import controllers.HomeController.PizzaGroup

object pizza extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[User,util.List[PizzaGroup],util.HashSet[String],util.Map[Integer, util.List[Ingredient]],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User)(pizzas: util.List[PizzaGroup])(creatablePizzas: util.HashSet[String])(ingredients: util.Map[Integer, util.List[Ingredient]])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*5.1*/("""

"""),_display_(/*7.2*/layout("Pizzák")/*7.18*/(user)/*7.24*/(sumPrice)/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""

"""),format.raw/*9.1*/("""<table id="tablepadding">
    <tr><td>  </td></tr>
</table>

    <table class="keret">
        <tr><td colspan="8" height="30"></td></tr>
        """),_display_(/*15.10*/for((pizza, index) <- pizzas.zipWithIndex) yield /*15.52*/ {_display_(Seq[Any](format.raw/*15.54*/("""

            """),_display_(/*17.14*/if(index % 3 == 0)/*17.32*/ {_display_(Seq[Any](format.raw/*17.34*/("""
                """),format.raw/*18.17*/("""<tr>
            """)))}),format.raw/*19.14*/("""
            """),format.raw/*20.13*/("""<td>
                <table height="150" width="350" border="0">
                    <tr>
                        <td colspan="3" class="pizzafont" align="center">"""),_display_(/*23.75*/pizza/*23.80*/.name),format.raw/*23.85*/("""</td>
                    </tr>
                    <tr>
                        """),_display_(/*26.26*/if(creatablePizzas.contains(pizza.name))/*26.66*/ {_display_(Seq[Any](format.raw/*26.68*/("""
                            """),format.raw/*27.29*/("""<td colspan="3" align="center"><img src=""""),_display_(/*27.71*/routes/*27.77*/.Assets.versioned(pizza.imagePath)),format.raw/*27.111*/("""" height="150" width="250"/></td>
                        """)))}/*28.27*/else/*28.32*/{_display_(Seq[Any](format.raw/*28.33*/("""
                            """),format.raw/*29.29*/("""<td colspan="3" align="center"><img src=""""),_display_(/*29.71*/routes/*29.77*/.Assets.versioned(pizza.notAvailImagePath)),format.raw/*29.119*/("""" height="150" width="250"/></td>
                        """)))}),format.raw/*30.26*/("""
                    """),format.raw/*31.21*/("""</tr>
                    <tr>
                        <td colspan="3" class="leiras">
                            """),_display_(/*34.30*/for((key, value) <- ingredients) yield /*34.62*/ {_display_(Seq[Any](format.raw/*34.64*/("""
                                """),_display_(/*35.34*/if(key == pizza.id1)/*35.54*/ {_display_(Seq[Any](format.raw/*35.56*/("""
                                    """),_display_(/*36.38*/for(i <- 0 until value.size) yield /*36.66*/ {_display_(Seq[Any](format.raw/*36.68*/("""
                                        """),_display_(/*37.42*/value(i)/*37.50*/.name),_display_(/*37.56*/if(i < value.size-1)/*37.76*/ {_display_(Seq[Any](format.raw/*37.78*/(""",""")))}),format.raw/*37.80*/("""
                                    """)))}),format.raw/*38.38*/("""
                                """)))}),format.raw/*39.34*/("""
                            """)))}),format.raw/*40.30*/("""
                        """),format.raw/*41.25*/("""</td>
                    </tr>
                    <tr><td class="paddingtd"></td></tr>
                    <tr>
                        <td class="arfont" >"""),_display_(/*45.46*/pizza/*45.51*/.price1),format.raw/*45.58*/("""</td>
                        <td class="arfont" >"""),_display_(/*46.46*/pizza/*46.51*/.price2),format.raw/*46.58*/("""</td>
                        <td class="arfont" >"""),_display_(/*47.46*/pizza/*47.51*/.price3),format.raw/*47.58*/("""</td>
                    </tr>
                    """),_display_(/*49.22*/if(creatablePizzas.contains(pizza.name))/*49.62*/ {_display_(Seq[Any](format.raw/*49.64*/("""
                        """),format.raw/*50.25*/("""<td align="right"><a class="btn btn-warning bttn"  href=""""),_display_(/*50.83*/routes/*50.89*/.CartController.addToCart(pizza.id1, false)),format.raw/*50.132*/("""">24cm</a></td>
                        <td align="center"><a class="btn btn-warning bttn"  href=""""),_display_(/*51.84*/routes/*51.90*/.CartController.addToCart(pizza.id2, false)),format.raw/*51.133*/("""">32cm</a></td>
                        <td align="left"><a class="btn btn-warning bttn"  href=""""),_display_(/*52.82*/routes/*52.88*/.CartController.addToCart(pizza.id3, false)),format.raw/*52.131*/("""">51cm</a></td>
                    """)))}/*53.23*/else/*53.28*/{_display_(Seq[Any](format.raw/*53.29*/("""
                        """),format.raw/*54.25*/("""<td align="right"><a class="btn btn-warning bttn">24cm</a></td>
                        <td align="center"><a class="btn btn-warning bttn">32cm</a></td>
                        <td align="left"><a class="btn btn-warning bttn">51cm</a></td>
                    """)))}),format.raw/*57.22*/("""
                    """),format.raw/*58.21*/("""</tr>
                </table>
            </td>

            """),_display_(/*62.14*/if(index == pizzas.size-1 || {index+1} % 3 == 0)/*62.62*/ {_display_(Seq[Any](format.raw/*62.64*/("""
                """),format.raw/*63.17*/("""</tr>
                <tr><td colspan="5" height="30"></td></tr>
            """)))}),format.raw/*65.14*/("""
        """)))}),format.raw/*66.10*/("""

    """),format.raw/*68.5*/("""</table>

<table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,pizzas:util.List[PizzaGroup],creatablePizzas:util.HashSet[String],ingredients:util.Map[Integer, util.List[Ingredient]],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(pizzas)(creatablePizzas)(ingredients)(sumPrice)

  def f:((User) => (util.List[PizzaGroup]) => (util.HashSet[String]) => (util.Map[Integer, util.List[Ingredient]]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (pizzas) => (creatablePizzas) => (ingredients) => (sumPrice) => apply(user)(pizzas)(creatablePizzas)(ingredients)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/pizza.scala.html
                  HASH: b9889ae85a97e96084d204710bffd264151a3c8e
                  MATRIX: 651->1|675->19|1114->65|1343->223|1387->239|1415->242|1439->258|1453->264|1471->274|1510->276|1538->278|1712->425|1770->467|1810->469|1852->484|1879->502|1919->504|1964->521|2013->539|2054->552|2245->716|2259->721|2285->726|2394->808|2443->848|2483->850|2540->879|2609->921|2624->927|2680->961|2758->1021|2771->1026|2810->1027|2867->1056|2936->1098|2951->1104|3015->1146|3105->1205|3154->1226|3297->1342|3345->1374|3385->1376|3446->1410|3475->1430|3515->1432|3580->1470|3624->1498|3664->1500|3733->1542|3750->1550|3776->1556|3805->1576|3845->1578|3878->1580|3947->1618|4012->1652|4073->1682|4126->1707|4312->1866|4326->1871|4354->1878|4432->1929|4446->1934|4474->1941|4552->1992|4566->1997|4594->2004|4674->2057|4723->2097|4763->2099|4816->2124|4901->2182|4916->2188|4981->2231|5107->2330|5122->2336|5187->2379|5311->2476|5326->2482|5391->2525|5447->2563|5460->2568|5499->2569|5552->2594|5844->2855|5893->2876|5983->2939|6040->2987|6080->2989|6125->3006|6234->3084|6275->3094|6308->3100
                  LINES: 24->1|25->2|30->3|33->4|36->5|38->7|38->7|38->7|38->7|38->7|40->9|46->15|46->15|46->15|48->17|48->17|48->17|49->18|50->19|51->20|54->23|54->23|54->23|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|62->31|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|69->38|70->39|71->40|72->41|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|88->57|89->58|93->62|93->62|93->62|94->63|96->65|97->66|99->68
                  -- GENERATED --
              */
          