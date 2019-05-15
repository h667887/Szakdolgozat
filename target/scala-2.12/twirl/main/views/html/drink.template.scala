
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


Seq[Any](format.raw/*4.1*/("""

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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/drink.scala.html
                  HASH: 163267d02eb4593ddc0af9f83cdb1f313936432c
                  MATRIX: 651->1|997->19|1129->80|1173->96|1201->99|1224->114|1238->120|1256->130|1295->132|1326->137|1494->278|1509->284|1572->325|1730->456|1745->462|1804->500|1975->644|1990->650|2046->685|2318->930|2376->972|2416->974|2462->993|2489->1011|2529->1013|2578->1034|2635->1060|2680->1077|2916->1286|2930->1291|2956->1296|3013->1325|3175->1460|3190->1466|3246->1500|3426->1653|3440->1658|3473->1670|3729->1899|3743->1904|3770->1910|3799->1911|4099->2184|4114->2190|4178->2232|4593->2620|4650->2668|4690->2670|4735->2687|4852->2773|4897->2787|4934->2797
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|49->18|58->27|58->27|58->27|60->29|60->29|60->29|61->30|62->31|63->32|67->36|67->36|67->36|68->37|71->40|71->40|71->40|74->43|74->43|74->43|79->48|79->48|79->48|79->48|85->54|85->54|85->54|96->65|96->65|96->65|97->66|99->68|100->69|102->71
                  -- GENERATED --
              */
          