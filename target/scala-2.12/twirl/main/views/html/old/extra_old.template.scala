
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

object extra_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Product],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(extras: util.List[Product])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.61*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Userek")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>

    """),_display_(/*9.6*/for(extra <- extras) yield /*9.26*/{_display_(Seq[Any](format.raw/*9.27*/("""
        """),format.raw/*10.9*/("""<div class="egy-user">
            <p>
                """),_display_(/*12.18*/extra/*12.23*/.name),format.raw/*12.28*/("""
                """),_display_(/*13.18*/extra/*13.23*/.price),format.raw/*13.29*/("""
                """),format.raw/*14.17*/("""<img src=""""),_display_(/*14.28*/routes/*14.34*/.Assets.versioned("public/images/conke.png")),format.raw/*14.78*/("""" />
                """),_display_(/*15.18*/form(action = routes.CartController.addToCart(extra.id, false))/*15.81*/ {_display_(Seq[Any](format.raw/*15.83*/("""
                    """),_display_(/*16.22*/CSRF/*16.26*/.formField),format.raw/*16.36*/("""
                    """),format.raw/*17.21*/("""<button type="submit" class="btn btn-primary">"""),_display_(/*17.68*/extra/*17.73*/.price),format.raw/*17.79*/("""</button>
                """)))}),format.raw/*18.18*/("""
            """),format.raw/*19.13*/("""</p>

        </div>
    """)))}),format.raw/*22.6*/("""

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
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/extra_old.scala.html
                  HASH: 5541710e179937dd0b0082a51a7459867d1e99de
                  MATRIX: 655->1|1005->20|1137->82|1182->79|1210->99|1240->104|1264->120|1278->126|1296->136|1335->138|1367->144|1435->187|1470->207|1508->208|1545->218|1630->276|1644->281|1670->286|1716->305|1730->310|1757->316|1803->334|1841->345|1856->351|1921->395|1971->418|2043->481|2083->483|2133->506|2146->510|2177->520|2227->542|2301->589|2315->594|2342->600|2401->628|2443->642|2502->671
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|50->18|51->19|54->22
                  -- GENERATED --
              */
          