
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


Seq[Any](format.raw/*1.62*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/layout.scala.html
                  HASH: f32ffd4593840db01ae7b3b9c7bb0f4a620eb669
                  MATRIX: 967->1|1122->61|1152->65|1312->199|1337->204|1426->267|1440->273|1503->315|1590->375|1605->381|1662->417|1747->475|1762->481|1817->515|1902->573|1917->579|1978->618|2130->743|2156->760|2195->761|2249->787|2321->832|2336->838|2381->862|2470->924|2493->938|2532->939|2586->965|2716->1068|2731->1074|2775->1097|2855->1158|2868->1162|2907->1163|2963->1191|3057->1254|3099->1277|3112->1281|3151->1282|3201->1304|3273->1349|3288->1355|3335->1381|3524->1543|3539->1549|3583->1572|3673->1631|3721->1651|3811->1714|3840->1722|3869->1723|3977->1804|3992->1810|4056->1852|4313->2082|4328->2088|4372->2111|4412->2124|4428->2130|4488->2168|4608->2261|4623->2267|4667->2290|4707->2303|4723->2309|4783->2347|4903->2440|4918->2446|4962->2469|5002->2482|5018->2488|5080->2528|5202->2623|5217->2629|5263->2654|5304->2667|5320->2673|5382->2713|5502->2806|5517->2812|5561->2835|5601->2848|5617->2854|5676->2891|5795->2983|5810->2989|5853->3011|5893->3024|5909->3030|5968->3067|6088->3160|6103->3166|6149->3191|6190->3204|6206->3210|6266->3248|6388->3343|6403->3349|6449->3374|6490->3387|6506->3393|6568->3433|6687->3525|6702->3531|6745->3553|6785->3566|6801->3572|6860->3609|7042->3764|7067->3768|7117->3790|7158->3804|7173->3810|7237->3853|7330->3919|7345->3925|7406->3965|7499->4031|7514->4037|7568->4070
                  LINES: 28->1|33->1|35->3|40->8|40->8|41->9|41->9|41->9|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|52->20|52->20|52->20|55->23|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|59->27|59->27|61->29|62->30|65->33|65->33|65->33|66->34|66->34|66->34|66->34|68->36|68->36|68->36|70->38|72->40|72->40|72->40|72->40|73->41|73->41|73->41|82->50|82->50|82->50|82->50|82->50|82->50|83->51|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|86->54|86->54|86->54|87->55|87->55|87->55|87->55|87->55|87->55|88->56|88->56|88->56|88->56|88->56|88->56|89->57|89->57|89->57|89->57|89->57|89->57|90->58|90->58|90->58|90->58|90->58|90->58|101->69|101->69|104->72|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74
                  -- GENERATED --
              */
          