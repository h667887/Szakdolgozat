
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


Seq[Any](format.raw/*2.108*/("""
"""),format.raw/*4.1*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/cart_old.scala.html
                  HASH: d70542dc0bdc655b7ed46eda4e45e82f1729bb54
                  MATRIX: 651->1|1026->20|1205->129|1251->126|1279->146|1309->151|1333->167|1347->173|1365->183|1404->185|1436->191|1516->246|1555->270|1594->272|1631->282|1732->356|1748->363|1774->368|1820->387|1836->394|1863->400|1909->419|1925->426|1952->432|1998->451|2014->458|2040->463|2086->482|2154->541|2194->543|2244->566|2257->570|2288->580|2338->603|2358->614|2398->616|2452->642|2576->735|2626->754|2668->768|2727->797|2760->800
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|53->21|54->22|55->23|58->26|59->27
                  -- GENERATED --
              */
          