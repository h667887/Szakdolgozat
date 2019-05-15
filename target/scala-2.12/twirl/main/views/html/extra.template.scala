
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

object extra extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Product],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(extras: util.List[Product])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Extra")/*6.17*/(user)/*6.23*/(sumPrice)/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""

    """),format.raw/*8.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table align="center" >

        <tr>
            <td align="left" class="kicsimenu"> <a href=""""),_display_(/*15.59*/routes/*15.65*/.HomeController.extraByType("streetfood")),format.raw/*15.106*/(""""><button type="button" class="btn btn-warning bttnful">Streedfood</button></a>
                <a href=""""),_display_(/*16.27*/routes/*16.33*/.HomeController.extraByType("sandwich")),format.raw/*16.72*/(""""><button type="button" class="btn btn-warning bttnful">Sandwich</button></a>
                <a href=""""),_display_(/*17.27*/routes/*17.33*/.HomeController.extraByType("pasta")),format.raw/*17.69*/(""""><button type="button" class="btn btn-warning bttnful">Pasta</button></a>
                <a href=""""),_display_(/*18.27*/routes/*18.33*/.HomeController.extraByType("salad")),format.raw/*18.69*/(""""><button type="button" class="btn btn-warning bttnful">Salad</button></a>
                <a href=""""),_display_(/*19.27*/routes/*19.33*/.HomeController.extraByType("sidedish")),format.raw/*19.72*/(""""><button type="button" class="btn btn-warning bttnful">Side dish</button></a>
                <a href=""""),_display_(/*20.27*/routes/*20.33*/.HomeController.extraByType("dessert")),format.raw/*20.71*/(""""><button type="button" class="btn btn-warning bttnful">Dessert</button></a>
                <a href=""""),_display_(/*21.27*/routes/*21.33*/.HomeController.extraByType("sauce")),format.raw/*21.69*/(""""><button type="button" class="btn btn-warning bttnful">Sauce</button></a>
            </td><td width="0"></td>

        </tr>

    <table class="keretkocsi">
        <tr><td height="50"></td></tr>
        <tr><td valign="top">

            <table align="left" border="0">
                <tr></tr>

                """),_display_(/*33.18*/for((extra, index) <- extras.zipWithIndex) yield /*33.60*/ {_display_(Seq[Any](format.raw/*33.62*/("""

                    """),format.raw/*35.21*/("""<tr>
                        <td width="50"></td>
                        <td align="center" rowspan="2"><div class="images">
                            <img src=""""),_display_(/*38.40*/routes/*38.46*/.Assets.versioned(extra.imagePath)),format.raw/*38.80*/(""""/>
                        </div>
                        </td>
                        <td width="50">

                    </td>
                        <td class="kosarfont" width="100" colspan="2">"""),_display_(/*44.72*/extra/*44.77*/.name),format.raw/*44.82*/("""</td>
                        <td class="extrafont" valign="center" rowspan="2">"""),_display_(/*45.76*/extra/*45.81*/.price),format.raw/*45.87*/(""" """),format.raw/*45.88*/("""Ft</td>
                        <td width="50" valign="center" rowspan="2">
                            <a class=""  href=""""),_display_(/*47.49*/routes/*47.55*/.CartController.addToCart(extra.id, false)),format.raw/*47.97*/("""">
                                <button type="button" class="btn btn-warning bttne">Add</button>
                            </a>
                        </td>
                        <td width="50" rowspan="2">

                    </td>
                    </tr>

                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td class="leirasextra" valign="top">"""),_display_(/*60.63*/extra/*60.68*/.description),format.raw/*60.80*/("""</td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                """)))}),format.raw/*65.18*/("""


            """),format.raw/*68.13*/("""</table>

        </td></tr>

    </table>

    </table>

    <table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,extras:util.List[Product],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(extras)(sumPrice)

  def f:((User) => (util.List[Product]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (extras) => (sumPrice) => apply(user)(extras)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/extra.scala.html
                  HASH: c624b92995ff10573d7c8292ae90c27a8960095b
                  MATRIX: 651->1|997->19|1129->80|1173->96|1201->99|1224->114|1238->120|1256->130|1295->132|1327->138|1523->307|1538->313|1601->354|1734->460|1749->466|1809->505|1940->609|1955->615|2012->651|2140->752|2155->758|2212->794|2340->895|2355->901|2415->940|2547->1045|2562->1051|2621->1089|2751->1192|2766->1198|2823->1234|3167->1551|3225->1593|3265->1595|3315->1617|3507->1782|3522->1788|3577->1822|3807->2025|3821->2030|3847->2035|3955->2116|3969->2121|3996->2127|4025->2128|4176->2252|4191->2258|4254->2300|4739->2758|4753->2763|4786->2775|4968->2926|5011->2941
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|39->8|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|64->33|64->33|64->33|66->35|69->38|69->38|69->38|75->44|75->44|75->44|76->45|76->45|76->45|76->45|78->47|78->47|78->47|91->60|91->60|91->60|96->65|99->68
                  -- GENERATED --
              */
          