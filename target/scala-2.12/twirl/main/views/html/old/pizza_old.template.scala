
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


Seq[Any](format.raw/*2.61*/("""
"""),format.raw/*4.1*/("""

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
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/pizza_old.scala.html
                  HASH: 62bd3eff38b4e97259c9200be185bf179f3c0277
                  MATRIX: 655->1|1005->20|1137->82|1182->79|1210->99|1240->104|1264->120|1278->126|1296->136|1335->138|1367->144|1435->187|1470->207|1509->209|1546->219|1648->294|1662->299|1686->302|1732->321|1746->326|1772->331|1818->350|1832->355|1859->361|1905->380|1919->385|1945->390|1991->409|2005->414|2036->424|2082->443|2154->506|2194->508|2244->531|2257->535|2288->545|2338->567|2412->614|2426->619|2453->625|2512->653|2554->667|2613->696|2646->699
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|53->21|54->22|55->23|58->26|59->27
                  -- GENERATED --
              */
          