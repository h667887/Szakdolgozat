
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,User,Integer,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(user: User)(sumPrice: Integer)(body : Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*9.102*/("""">

        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.versioned("css/preload.css")),format.raw/*11.97*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.versioned("css/style.css")),format.raw/*12.95*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.versioned("css/masterpage.css")),format.raw/*13.100*/("""">

    </head>
    <header>

        <table align="center" border="0" id="reglog">
            <tr>
                """),_display_(/*20.18*/if(user != null )/*20.35*/{_display_(Seq[Any](format.raw/*20.36*/("""


                    """),format.raw/*23.21*/("""<td width="60" class="font header"><a href=""""),_display_(/*23.66*/routes/*23.72*/.UserController.logout()),format.raw/*23.96*/("""" style="color:#dd9a39">Logout</a></td>
                    """),_display_(/*24.22*/if(user.admin)/*24.36*/{_display_(Seq[Any](format.raw/*24.37*/("""
                        """),format.raw/*25.25*/("""<td width="15" class="font header"> | </td>
                        <td class="font header"><a href=""""),_display_(/*26.59*/routes/*26.65*/.UserController.admin()),format.raw/*26.88*/("""" style="color:#dd9a39">Admin</a></td>
                    """)))}/*27.22*/else/*27.26*/{_display_(Seq[Any](format.raw/*27.27*/("""

                        """),format.raw/*29.25*/("""<td width="55" class="font header"></td>
                    """)))}),format.raw/*30.22*/("""


                """)))}/*33.18*/else/*33.22*/{_display_(Seq[Any](format.raw/*33.23*/("""
                    """),format.raw/*34.21*/("""<td width="60" class="font header"><a href=""""),_display_(/*34.66*/routes/*34.72*/.UserController.register()),format.raw/*34.98*/("""" style="color:#dd9a39">Register</a></td>
                    <td width="15" class="font header"> | </td>
                    <td class="font header"><a href=""""),_display_(/*36.55*/routes/*36.61*/.UserController.login()),format.raw/*36.84*/("""" style="color:#dd9a39">Login</a></td>

                """)))}),format.raw/*38.18*/("""

                """),format.raw/*40.17*/("""<td width="700" height="50" class="font header" align="right">"""),_display_(/*40.80*/sumPrice),format.raw/*40.88*/(""" """),format.raw/*40.89*/("""Ft</td>
                <td width="100" class="header" align="right"><img src=""""),_display_(/*41.73*/routes/*41.79*/.Assets.versioned("images/Untitled-1.png")),format.raw/*41.121*/("""" height="41" width="65"/></td>
                <td></td>

            </tr>
        </table>
        <table align="center" border="0" id="menu">

            <tr>

                <td align="center"><a id="pizza" href=""""),_display_(/*50.57*/routes/*50.63*/.HomeController.pizza()),format.raw/*50.86*/(""""><img src=""""),_display_(/*50.99*/routes/*50.105*/.Assets.versioned("images/Pizza0.png")),format.raw/*50.143*/("""" height="68" width="45"/></a></td>
                <td align="center"><a id="drink" href=""""),_display_(/*51.57*/routes/*51.63*/.HomeController.drink()),format.raw/*51.86*/(""""><img src=""""),_display_(/*51.99*/routes/*51.105*/.Assets.versioned("images/Drink0.png")),format.raw/*51.143*/("""" height="68" width="45"/></a></td>
                <td align="center"><a id="extra" href=""""),_display_(/*52.57*/routes/*52.63*/.HomeController.extra()),format.raw/*52.86*/(""""><img src=""""),_display_(/*52.99*/routes/*52.105*/.Assets.versioned("images/Extra0.png  ")),format.raw/*52.145*/("""" height="68" width="45"/></a></td>
                <td align="center"><a id="creator" href=""""),_display_(/*53.59*/routes/*53.65*/.HomeController.creator()),format.raw/*53.90*/(""""><img src=""""),_display_(/*53.103*/routes/*53.109*/.Assets.versioned("images/creator0.png")),format.raw/*53.149*/("""" height="68" width="45"/></a></td>
                <td align="center"><a id="blank" href=""""),_display_(/*54.57*/routes/*54.63*/.UserController.index()),format.raw/*54.86*/(""""><img src=""""),_display_(/*54.99*/routes/*54.105*/.Assets.versioned("images/blank.png")),format.raw/*54.142*/("""" height="68" width="90"/></a></td>
                <td align="center"><a id="info" href=""""),_display_(/*55.56*/routes/*55.62*/.HomeController.info()),format.raw/*55.84*/(""""><img src=""""),_display_(/*55.97*/routes/*55.103*/.Assets.versioned("images/Info0.png")),format.raw/*55.140*/("""" height="68" width="45"/></a></td>
                <td align="center"><a id="msgus" href=""""),_display_(/*56.57*/routes/*56.63*/.HomeController.message()),format.raw/*56.88*/(""""><img src=""""),_display_(/*56.101*/routes/*56.107*/.Assets.versioned("images/msgus0.png")),format.raw/*56.145*/("""" height="68" width="45"/></a></td>
                <td align="center"><a id="account" href=""""),_display_(/*57.59*/routes/*57.65*/.UserController.profile()),format.raw/*57.90*/(""""><img src=""""),_display_(/*57.103*/routes/*57.109*/.Assets.versioned("images/Account0.png")),format.raw/*57.149*/("""" height="68" width="45"/></a></td>
                <td align="center"><a id="cart" href=""""),_display_(/*58.56*/routes/*58.62*/.CartController.cart()),format.raw/*58.84*/(""""><img src=""""),_display_(/*58.97*/routes/*58.103*/.Assets.versioned("images/Cart0.png")),format.raw/*58.140*/("""" height="68" width="45"/></a></td>

            </tr>
        </table>
    </header>

        <body>

            <section>


                """),_display_(/*69.18*/body),format.raw/*69.22*/("""


                """),format.raw/*72.17*/("""<script src=""""),_display_(/*72.31*/routes/*72.37*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*72.80*/("""" type="text/javascript"></script>
                <script src=""""),_display_(/*73.31*/routes/*73.37*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*73.77*/("""" type="text/javascript"></script>
                <script src=""""),_display_(/*74.31*/routes/*74.37*/.Assets.versioned("js/custom.js")),format.raw/*74.70*/("""" type="text/javascript"></script>

            </section>




            <footer id="foot" >

            </footer>
        </body>

</html>"""))
      }
    }
  }

  def render(title:String,user:User,sumPrice:Integer,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(user)(sumPrice)(body)

  def f:((String) => (User) => (Integer) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (user) => (sumPrice) => (body) => apply(title)(user)(sumPrice)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/layout.scala.html
                  HASH: 6e54a9802c18bc8b4eabd6cb130a377be4789cce
                  MATRIX: 967->1|1121->62|1148->63|1303->192|1328->197|1416->259|1430->265|1493->307|1578->365|1593->371|1650->407|1734->464|1749->470|1804->504|1888->561|1903->567|1964->606|2109->724|2135->741|2174->742|2225->765|2297->810|2312->816|2357->840|2445->901|2468->915|2507->916|2560->941|2689->1043|2704->1049|2748->1072|2827->1132|2840->1136|2879->1137|2933->1163|3026->1225|3065->1245|3078->1249|3117->1250|3166->1271|3238->1316|3253->1322|3300->1348|3487->1508|3502->1514|3546->1537|3634->1594|3680->1612|3770->1675|3799->1683|3828->1684|3935->1764|3950->1770|4014->1812|4262->2033|4277->2039|4321->2062|4361->2075|4377->2081|4437->2119|4556->2211|4571->2217|4615->2240|4655->2253|4671->2259|4731->2297|4850->2389|4865->2395|4909->2418|4949->2431|4965->2437|5027->2477|5148->2571|5163->2577|5209->2602|5250->2615|5266->2621|5328->2661|5447->2753|5462->2759|5506->2782|5546->2795|5562->2801|5621->2838|5739->2929|5754->2935|5797->2957|5837->2970|5853->2976|5912->3013|6031->3105|6046->3111|6092->3136|6133->3149|6149->3155|6209->3193|6330->3287|6345->3293|6391->3318|6432->3331|6448->3337|6510->3377|6628->3468|6643->3474|6686->3496|6726->3509|6742->3515|6801->3552|6972->3696|6997->3700|7044->3719|7085->3733|7100->3739|7164->3782|7256->3847|7271->3853|7332->3893|7424->3958|7439->3964|7493->3997
                  LINES: 28->1|33->2|34->3|39->8|39->8|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|51->20|51->20|51->20|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|58->27|58->27|60->29|61->30|64->33|64->33|64->33|65->34|65->34|65->34|65->34|67->36|67->36|67->36|69->38|71->40|71->40|71->40|71->40|72->41|72->41|72->41|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|100->69|100->69|103->72|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74
                  -- GENERATED --
              */
          