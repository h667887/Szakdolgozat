
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

object cart_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[User,util.List[Product],util.List[Orders],Boolean,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(products: util.List[Product])(orders: util.List[Orders])(isEmpty: Boolean)(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Userek")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>
    Kamasuki
    """),_display_(/*9.6*/for(product <- products) yield /*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""ASDASD
        <div class="egy-user">
            <p>
                """),_display_(/*13.18*/product/*13.25*/.name),format.raw/*13.30*/("""
                """),_display_(/*14.18*/product/*14.25*/.price),format.raw/*14.31*/("""
                """),_display_(/*15.18*/product/*15.25*/.typeP),format.raw/*15.31*/("""
                """),_display_(/*16.18*/product/*16.25*/.size),format.raw/*16.30*/("""
                """),_display_(/*17.18*/form(action = routes.CartController.deleteItem(product.id))/*17.77*/ {_display_(Seq[Any](format.raw/*17.79*/("""
                    """),_display_(/*18.22*/CSRF/*18.26*/.formField),format.raw/*18.36*/("""
                    """),_display_(/*19.22*/if(isEmpty)/*19.33*/ {_display_(Seq[Any](format.raw/*19.35*/("""
                        """),format.raw/*20.25*/("""<button type="submit" disabled class="btn btn-primary">Törlés</button>
                    """)))}),format.raw/*21.22*/("""
                """)))}),format.raw/*22.18*/("""
            """),format.raw/*23.13*/("""</p>

        </div>
    """)))}),format.raw/*26.6*/("""
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(user:User,products:util.List[Product],orders:util.List[Orders],isEmpty:Boolean,sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(products)(orders)(isEmpty)(sumPrice)

  def f:((User) => (util.List[Product]) => (util.List[Orders]) => (Boolean) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (products) => (orders) => (isEmpty) => (sumPrice) => apply(user)(products)(orders)(isEmpty)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/cart_old.scala.html
                  HASH: c9f9e4c3dde5bf9ab1241c6c4f0fad56dc7a6674
                  MATRIX: 651->1|1026->19|1205->127|1249->143|1277->146|1301->162|1315->168|1333->178|1372->180|1403->185|1481->238|1520->262|1559->264|1595->273|1693->344|1709->351|1735->356|1780->374|1796->381|1823->387|1868->405|1884->412|1911->418|1956->436|1972->443|1998->448|2043->466|2111->525|2151->527|2200->549|2213->553|2244->563|2293->585|2313->596|2353->598|2406->623|2529->715|2578->733|2619->746|2675->772|2707->774
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|52->21|53->22|54->23|57->26|58->27
                  -- GENERATED --
              */
          