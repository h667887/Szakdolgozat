
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

object ingredient extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Ingredient],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(ingredients: util.List[Ingredient])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.69*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Userek")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>

    """),_display_(/*9.6*/for(ingredient <- ingredients) yield /*9.36*/{_display_(Seq[Any](format.raw/*9.37*/("""
        """),format.raw/*10.9*/("""<div class="egy-user">
            <p>
                """),_display_(/*12.18*/ingredient/*12.28*/.name),format.raw/*12.33*/("""
                """),_display_(/*13.18*/ingredient/*13.28*/.price),format.raw/*13.34*/("""

            """),format.raw/*15.13*/("""<img src=""""),_display_(/*15.24*/ingredient/*15.34*/.imagePath),format.raw/*15.44*/("""">

            </p>

        </div>
    """)))}),format.raw/*20.6*/("""

""")))}))
      }
    }
  }

  def render(user:User,ingredients:util.List[Ingredient],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(ingredients)(sumPrice)

  def f:((User) => (util.List[Ingredient]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (ingredients) => (sumPrice) => apply(user)(ingredients)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/ingredient.scala.html
                  HASH: 82fc6633c1847fc531d65bb054c5f6899ea1e608
                  MATRIX: 651->1|1005->20|1145->90|1190->87|1218->107|1248->112|1272->128|1286->134|1304->144|1343->146|1375->152|1443->195|1488->225|1526->226|1563->236|1648->294|1667->304|1693->309|1739->328|1758->338|1785->344|1829->360|1867->371|1886->381|1917->391|1994->438
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|45->13|45->13|47->15|47->15|47->15|47->15|52->20
                  -- GENERATED --
              */
          