
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


Seq[Any](format.raw/*2.61*/("""
"""),format.raw/*4.1*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/extra.scala.html
                  HASH: dd87ba0dedb9f184240de217a6a37b138ca96e63
                  MATRIX: 651->1|997->20|1129->82|1174->79|1202->99|1232->104|1255->119|1269->125|1287->135|1326->137|1360->145|1563->321|1578->327|1641->368|1775->475|1790->481|1850->520|1982->625|1997->631|2054->667|2183->769|2198->775|2255->811|2384->913|2399->919|2459->958|2592->1064|2607->1070|2666->1108|2797->1212|2812->1218|2869->1254|3225->1583|3283->1625|3323->1627|3375->1651|3570->1819|3585->1825|3640->1859|3876->2068|3890->2073|3916->2078|4025->2160|4039->2165|4066->2171|4095->2172|4248->2298|4263->2304|4326->2346|4824->2817|4838->2822|4871->2834|5058->2990|5104->3008
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|40->8|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|65->33|65->33|65->33|67->35|70->38|70->38|70->38|76->44|76->44|76->44|77->45|77->45|77->45|77->45|79->47|79->47|79->47|92->60|92->60|92->60|97->65|100->68
                  -- GENERATED --
              */
          