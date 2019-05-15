
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
/*1.2*/import java.util

object pizza_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Product],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(pizzas: util.List[Product])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Pizzák")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>

    """),_display_(/*9.6*/for(pizza <- pizzas) yield /*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""
        """),format.raw/*10.9*/("""<div class="egy-user vilagos-betu">
            <p>


                """),_display_(/*14.18*/pizza/*14.23*/.id),format.raw/*14.26*/("""
                """),_display_(/*15.18*/pizza/*15.23*/.name),format.raw/*15.28*/("""
                """),_display_(/*16.18*/pizza/*16.23*/.price),format.raw/*16.29*/("""
                """),_display_(/*17.18*/pizza/*17.23*/.size),format.raw/*17.28*/("""
                """),_display_(/*18.18*/pizza/*18.23*/.imagePath),format.raw/*18.33*/("""
                """),_display_(/*19.18*/form(action = routes.CartController.addToCart(pizza.id, false))/*19.81*/ {_display_(Seq[Any](format.raw/*19.83*/("""
                    """),_display_(/*20.22*/CSRF/*20.26*/.formField),format.raw/*20.36*/("""
                    """),format.raw/*21.21*/("""<button type="submit" class="btn btn-primary">"""),_display_(/*21.68*/pizza/*21.73*/.price),format.raw/*21.79*/("""</button>
                """)))}),format.raw/*22.18*/("""
            """),format.raw/*23.13*/("""</p>

        </div>
    """)))}),format.raw/*26.6*/("""
""")))}),format.raw/*27.2*/("""


"""))
      }
    }
  }

  def render(user:User,pizzas:util.List[Product],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(pizzas)(sumPrice)

  def f:((User) => (util.List[Product]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (pizzas) => (sumPrice) => apply(user)(pizzas)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/pizza_old.scala.html
                  HASH: 386aff5dea90cf7feea435deb340b2c89b1cf26b
                  MATRIX: 655->1|1005->19|1137->80|1181->96|1209->99|1233->115|1247->121|1265->131|1304->133|1335->138|1401->179|1436->199|1475->201|1511->210|1609->281|1623->286|1647->289|1692->307|1706->312|1732->317|1777->335|1791->340|1818->346|1863->364|1877->369|1903->374|1948->392|1962->397|1993->407|2038->425|2110->488|2150->490|2199->512|2212->516|2243->526|2292->547|2366->594|2380->599|2407->605|2465->632|2506->645|2562->671|2594->673
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|52->21|53->22|54->23|57->26|58->27
                  -- GENERATED --
              */
          