
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


Seq[Any](format.raw/*2.1*/("""<html>
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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/layout_old.scala.html
                  HASH: 5bf37746d71ea8f703b39fd6969b7ac07abe8f92
                  MATRIX: 975->1|1129->62|1189->96|1214->101|1302->163|1316->169|1395->227|1477->283|1491->289|1562->339|1825->575|1840->581|1884->604|2032->725|2047->731|2095->758|2250->886|2265->892|2309->915|2456->1035|2471->1041|2515->1064|2662->1184|2677->1190|2721->1213|2868->1333|2883->1339|2926->1361|3071->1479|3086->1485|3132->1510|3286->1637|3301->1643|3355->1676|3506->1800|3521->1806|3566->1830|3717->1954|3732->1960|3775->1982|3812->1992|3841->2000|4096->2227|4122->2243|4163->2245|4201->2255|4215->2259|4250->2269|4280->2270|4684->2647|4709->2663|4748->2664|4809->2697|4850->2711|4865->2717|4911->2742|5026->2830|5041->2836|5086->2860|5189->2932|5242->2957|5406->3094|5431->3098|5467->3107|5520->3133|5535->3139|5615->3198|5695->3251|5710->3257|5787->3313|5867->3366|5882->3372|5952->3421
                  LINES: 28->1|33->2|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|47->16|47->16|47->16|50->19|50->19|50->19|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|62->31|62->31|62->31|65->34|65->34|65->34|68->37|68->37|68->37|71->40|71->40|71->40|74->43|74->43|74->43|74->43|74->43|79->48|79->48|79->48|79->48|79->48|79->48|79->48|84->53|84->53|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|88->57|98->67|98->67|99->68|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72
                  -- GENERATED --
              */
          