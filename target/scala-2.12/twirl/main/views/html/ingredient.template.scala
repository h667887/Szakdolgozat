
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


Seq[Any](format.raw/*4.1*/("""

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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/ingredient.scala.html
                  HASH: 743560e56e81b9213ac85d1397c17b9d1d6b3f8c
                  MATRIX: 651->1|1005->19|1145->88|1189->104|1217->107|1241->123|1255->129|1273->139|1312->141|1343->146|1409->187|1454->217|1492->218|1528->227|1611->283|1630->293|1656->298|1701->316|1720->326|1747->332|1789->346|1827->357|1846->367|1877->377|1949->419
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|43->12|43->12|43->12|44->13|44->13|44->13|46->15|46->15|46->15|46->15|51->20
                  -- GENERATED --
              */
          