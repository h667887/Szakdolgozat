
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

object orders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Orders],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(orders: util.List[Orders])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.60*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Orders")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>

    """),_display_(/*9.6*/for(order <- orders) yield /*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""
        """),format.raw/*10.9*/("""<div class="egy-user">
            <p>
                """),_display_(/*12.18*/order/*12.23*/.user),format.raw/*12.28*/("""
                """),_display_(/*13.18*/order/*13.23*/.id),format.raw/*13.26*/("""
                """),_display_(/*14.18*/order/*14.23*/.productID),format.raw/*14.33*/("""
                """),_display_(/*15.18*/order/*15.23*/.isOrdered),format.raw/*15.33*/("""
                """),_display_(/*16.18*/order/*16.23*/.isDelivered),format.raw/*16.35*/("""
                """),_display_(/*17.18*/order/*17.23*/.date),format.raw/*17.28*/("""
                """),_display_(/*18.18*/order/*18.23*/.fullName),format.raw/*18.32*/("""
                """),_display_(/*19.18*/order/*19.23*/.address),format.raw/*19.31*/("""
                """),_display_(/*20.18*/order/*20.23*/.email),format.raw/*20.29*/("""
                """),_display_(/*21.18*/order/*21.23*/.phoneNumber),format.raw/*21.35*/("""
            """),format.raw/*22.13*/("""</p>

        </div>
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(user:User,orders:util.List[Orders],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(orders)(sumPrice)

  def f:((User) => (util.List[Orders]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (orders) => (sumPrice) => apply(user)(orders)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/orders.scala.html
                  HASH: 92c19891884205d1130477643d8620c3141dec5c
                  MATRIX: 651->1|997->20|1128->81|1173->78|1201->98|1231->103|1255->119|1269->125|1287->135|1326->137|1358->143|1426->186|1461->206|1500->208|1537->218|1622->276|1636->281|1662->286|1708->305|1722->310|1746->313|1792->332|1806->337|1837->347|1883->366|1897->371|1928->381|1974->400|1988->405|2021->417|2067->436|2081->441|2107->446|2153->465|2167->470|2197->479|2243->498|2257->503|2286->511|2332->530|2346->535|2373->541|2419->560|2433->565|2466->577|2508->591|2567->620
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|54->22|57->25
                  -- GENERATED --
              */
          