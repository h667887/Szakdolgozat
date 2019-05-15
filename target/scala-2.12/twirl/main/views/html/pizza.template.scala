
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


Seq[Any](format.raw/*3.158*/("""
"""),format.raw/*5.1*/("""

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
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/pizza.scala.html
                  HASH: 58dd23196382cc809b880b34568ace7076f0b839
                  MATRIX: 651->1|675->20|1114->67|1343->226|1389->223|1417->243|1447->248|1471->264|1485->270|1503->280|1542->282|1572->286|1752->439|1810->481|1850->483|1894->500|1921->518|1961->520|2007->538|2057->557|2099->571|2293->738|2307->743|2333->748|2445->833|2494->873|2534->875|2592->905|2661->947|2676->953|2732->987|2811->1048|2824->1053|2863->1054|2921->1084|2990->1126|3005->1132|3069->1174|3160->1234|3210->1256|3356->1375|3404->1407|3444->1409|3506->1444|3535->1464|3575->1466|3641->1505|3685->1533|3725->1535|3795->1578|3812->1586|3838->1592|3867->1612|3907->1614|3940->1616|4010->1655|4076->1690|4138->1721|4192->1747|4382->1910|4396->1915|4424->1922|4503->1974|4517->1979|4545->1986|4624->2038|4638->2043|4666->2050|4748->2105|4797->2145|4837->2147|4891->2173|4976->2231|4991->2237|5056->2280|5183->2380|5198->2386|5263->2429|5388->2527|5403->2533|5468->2576|5525->2615|5538->2620|5577->2621|5631->2647|5926->2911|5976->2933|6070->3000|6127->3048|6167->3050|6213->3068|6324->3148|6366->3159|6401->3167
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|39->7|39->7|39->7|39->7|39->7|41->9|47->15|47->15|47->15|49->17|49->17|49->17|50->18|51->19|52->20|55->23|55->23|55->23|58->26|58->26|58->26|59->27|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|61->29|62->30|63->31|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|69->37|69->37|69->37|70->38|71->39|72->40|73->41|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|81->49|81->49|81->49|82->50|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|89->57|90->58|94->62|94->62|94->62|95->63|97->65|98->66|100->68
                  -- GENERATED --
              */
          