
package views.html.old

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

object layout_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,User,Integer,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(user: User)(sumPrice: Integer)(body : Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title>"""),_display_(/*4.17*/title),format.raw/*4.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*5.54*/routes/*5.60*/.Assets.versioned("../../../public/css/bootstrap.min.css")),format.raw/*5.118*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("../../../public/css/style.css")),format.raw/*6.110*/("""">

    </head>
    <body>

        <nav class="navbar navbar-expand-sm bg-light">

                <!-- Links -->
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*16.48*/routes/*16.54*/.UserController.index()),format.raw/*16.77*/("""">Főoldal</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*19.48*/routes/*19.54*/.UserController.listUsers()),format.raw/*19.81*/("""">Userek listája</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*22.48*/routes/*22.54*/.HomeController.pizza()),format.raw/*22.77*/("""">Pizzák</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*25.48*/routes/*25.54*/.HomeController.drink()),format.raw/*25.77*/("""">Üdítők</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*28.48*/routes/*28.54*/.HomeController.extra()),format.raw/*28.77*/("""">Extrák</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*31.48*/routes/*31.54*/.HomeController.info()),format.raw/*31.76*/("""">Infó</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*34.48*/routes/*34.54*/.HomeController.message()),format.raw/*34.79*/("""">Üzenj nekünk!</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*37.48*/routes/*37.54*/.HomeController.listIngredients()),format.raw/*37.87*/("""">Hozzávalók</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*40.48*/routes/*40.54*/.CartController.orders()),format.raw/*40.78*/("""">Rendelések</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*43.48*/routes/*43.54*/.CartController.cart()),format.raw/*43.76*/("""">Kosár: """),_display_(/*43.86*/sumPrice),format.raw/*43.94*/("""</a>
                </li>
            </ul>
            <div class="pull-right">
                <ul class="nav pull-right">
                    <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(/*48.102*/if(user != null)/*48.118*/ {_display_(Seq[Any](format.raw/*48.120*/("""Welcome, """),_display_(/*48.130*/user/*48.134*/.username)))}),format.raw/*48.144*/(""" """),format.raw/*48.145*/("""<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="/user/preferences"><i class="icon-cog"></i> Preferences</a></li>
                            <li><a href="/help/support"><i class="icon-envelope"></i> Contact Support</a></li>
                            <li class="divider"></li>
                            """),_display_(/*53.30*/if(user != null)/*53.46*/{_display_(Seq[Any](format.raw/*53.47*/("""
                                """),format.raw/*54.33*/("""<li><a href=""""),_display_(/*54.47*/routes/*54.53*/.UserController.profile()),format.raw/*54.78*/(""""><i class="icon-on"></i> Profil</a></li>
                                <li><a href=""""),_display_(/*55.47*/routes/*55.53*/.UserController.logout()),format.raw/*55.77*/(""""><i class="icon-off"></i> Logout</a></li>
                            """)))}),format.raw/*56.30*/("""
                        """),format.raw/*57.25*/("""</ul>
                    </li>
                </ul>
            </div>

        </nav>



        <div class="container">
            """),_display_(/*67.14*/body),format.raw/*67.18*/("""
        """),format.raw/*68.9*/("""</div>

    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("../../../public/js/jquery-3.3.1.min.js")),format.raw/*70.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("../../../public/js/bootstrap.min.js")),format.raw/*71.81*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("../../../public/js/custom.js")),format.raw/*72.74*/("""" type="text/javascript"></script>


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
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/layout_old.scala.html
                  HASH: c5f3488bf0503940e46965c7db8bfcd68298ec21
                  MATRIX: 975->1|1130->61|1158->63|1220->99|1245->104|1334->167|1348->173|1427->231|1510->288|1524->294|1595->344|1868->590|1883->596|1927->619|2078->743|2093->749|2141->776|2299->907|2314->913|2358->936|2508->1059|2523->1065|2567->1088|2717->1211|2732->1217|2776->1240|2926->1363|2941->1369|2984->1391|3132->1512|3147->1518|3193->1543|3350->1673|3365->1679|3419->1712|3573->1839|3588->1845|3633->1869|3787->1996|3802->2002|3845->2024|3882->2034|3911->2042|4171->2274|4197->2290|4238->2292|4276->2302|4290->2306|4325->2316|4355->2317|4764->2699|4789->2715|4828->2716|4890->2750|4931->2764|4946->2770|4992->2795|5108->2884|5123->2890|5168->2914|5272->2987|5326->3013|5500->3160|5525->3164|5562->3174|5617->3202|5632->3208|5712->3267|5793->3321|5808->3327|5885->3383|5966->3437|5981->3443|6051->3492
                  LINES: 28->1|33->1|34->2|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|48->16|48->16|48->16|51->19|51->19|51->19|54->22|54->22|54->22|57->25|57->25|57->25|60->28|60->28|60->28|63->31|63->31|63->31|66->34|66->34|66->34|69->37|69->37|69->37|72->40|72->40|72->40|75->43|75->43|75->43|75->43|75->43|80->48|80->48|80->48|80->48|80->48|80->48|80->48|85->53|85->53|85->53|86->54|86->54|86->54|86->54|87->55|87->55|87->55|88->56|89->57|99->67|99->67|100->68|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72
                  -- GENERATED --
              */
          