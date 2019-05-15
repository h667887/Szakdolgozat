
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


Seq[Any](format.raw/*4.1*/("""

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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/orders.scala.html
                  HASH: 69eee3f51a438689f7bcb2a4c4155bbc0285c005
                  MATRIX: 651->1|997->19|1128->79|1172->95|1200->98|1224->114|1238->120|1256->130|1295->132|1326->137|1392->178|1427->198|1466->200|1502->209|1585->265|1599->270|1625->275|1670->293|1684->298|1708->301|1753->319|1767->324|1798->334|1843->352|1857->357|1888->367|1933->385|1947->390|1980->402|2025->420|2039->425|2065->430|2110->448|2124->453|2154->462|2199->480|2213->485|2242->493|2287->511|2301->516|2328->522|2373->540|2387->545|2420->557|2461->570|2517->596
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|56->25
                  -- GENERATED --
              */
          