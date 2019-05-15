
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

object drink extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Product],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(drinks: util.List[Product])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.61*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Drink")/*6.17*/(user)/*6.23*/(sumPrice)/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""
    """),format.raw/*7.5*/("""<table id="tablepadding">

    </table>

    <table align="center" >

        <tr>
            <td align="left" class="kicsimenu"> <a href=""""),_display_(/*14.59*/routes/*14.65*/.HomeController.drinkByType("refreshing")),format.raw/*14.106*/(""""><button type="button" class="btn btn-warning bttnful" id="d1">
                Refreshing</button></a>
                <a href=""""),_display_(/*16.27*/routes/*16.33*/.HomeController.drinkByType("monster")),format.raw/*16.71*/(""""><button type="button" class="btn btn-warning bttnmonster" id="d2">
                    Monster Energy®</button></a>
                <a href=""""),_display_(/*18.27*/routes/*18.33*/.HomeController.drinkByType("beer")),format.raw/*18.68*/(""""><button type="button" class="btn btn-warning bttnful" id="d3">
                    Beer</button></a></td><td width="500"></td>

        </tr>


        <table class="keret">

            <tr><td colspan="5" height="30"></td></tr>
            """),_display_(/*27.14*/for((drink, index) <- drinks.zipWithIndex) yield /*27.56*/ {_display_(Seq[Any](format.raw/*27.58*/("""

                """),_display_(/*29.18*/if(index % 4 == 0)/*29.36*/ {_display_(Seq[Any](format.raw/*29.38*/("""
                    """),format.raw/*30.21*/("""<tr>
                    """)))}),format.raw/*31.22*/("""
                """),format.raw/*32.17*/("""<td>
                    <table height="150" width="250" border="0">
                        <tr>
                            <td colspan="3" class="pizzafont" align="center">
                                """),_display_(/*36.34*/drink/*36.39*/.name),format.raw/*36.44*/("""
                            """),format.raw/*37.29*/("""</td>
                        </tr>
                        <tr>
                            <td colspan="3" align="center"><img src=""""),_display_(/*40.71*/routes/*40.77*/.Assets.versioned(drink.imagePath)),format.raw/*40.111*/("""" height="140" width="120"/></td>
                        </tr>
                        <tr>
                            <td colspan="3" class="leiras">"""),_display_(/*43.61*/drink/*43.66*/.description),format.raw/*43.78*/("""</td>
                        </tr>
                        <tr><td class="paddingtd"></td></tr>
                        <tr>
                            <td class="arfont" ></td>
                            <td class="arfont" >"""),_display_(/*48.50*/drink/*48.55*/.price),format.raw/*48.61*/(""" """),format.raw/*48.62*/("""Ft</td>
                            <td class="arfont" ></td>
                        </tr>
                        <tr>
                            <td align="right"></td>
                            <td align="center">
                                <a class=""  href=""""),_display_(/*54.53*/routes/*54.59*/.CartController.addToCart(drink.id, false)),format.raw/*54.101*/("""">
                                    <button type="button" class="btn btn-warning bttn">Add</button>
                                </a>
                            </td>
                            <td align="left"></td>
                    <tr><td colspan="5" height="30"></td></tr>
                        </tr>
                    </table>
                </td>


                """),_display_(/*65.18*/if(index == drinks.size-1 || {index+1} % 4 == 0)/*65.66*/ {_display_(Seq[Any](format.raw/*65.68*/("""
                """),format.raw/*66.17*/("""</tr>
                    <tr><td colspan="5" height="30"></td></tr>
                """)))}),format.raw/*68.18*/("""
            """)))}),format.raw/*69.14*/("""

        """),format.raw/*71.9*/("""</table>

    </table>


    <table height="200"></table>
""")))}))
      }
    }
  }

  def render(user:User,drinks:util.List[Product],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(drinks)(sumPrice)

  def f:((User) => (util.List[Product]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (drinks) => (sumPrice) => apply(user)(drinks)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/drink.scala.html
                  HASH: bdf50cc5f7decf90cd75f03386a0ac308a2cca44
                  MATRIX: 651->1|997->20|1129->82|1174->79|1202->99|1232->104|1255->119|1269->125|1287->135|1326->137|1358->143|1533->291|1548->297|1611->338|1771->471|1786->477|1845->515|2018->661|2033->667|2089->702|2370->956|2428->998|2468->1000|2516->1021|2543->1039|2583->1041|2633->1063|2691->1090|2737->1108|2977->1321|2991->1326|3017->1331|3075->1361|3240->1499|3255->1505|3311->1539|3494->1695|3508->1700|3541->1712|3802->1946|3816->1951|3843->1957|3872->1958|4178->2237|4193->2243|4257->2285|4683->2684|4740->2732|4780->2734|4826->2752|4945->2840|4991->2855|5030->2867
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|46->14|46->14|46->14|48->16|48->16|48->16|50->18|50->18|50->18|59->27|59->27|59->27|61->29|61->29|61->29|62->30|63->31|64->32|68->36|68->36|68->36|69->37|72->40|72->40|72->40|75->43|75->43|75->43|80->48|80->48|80->48|80->48|86->54|86->54|86->54|97->65|97->65|97->65|98->66|100->68|101->69|103->71
                  -- GENERATED --
              */
          