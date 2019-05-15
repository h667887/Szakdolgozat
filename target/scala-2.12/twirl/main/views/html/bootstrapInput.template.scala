
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

object bootstrapInput extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<div class="control-group """),_display_(/*3.28*/if(elements.hasErrors)/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""error""")))}),format.raw/*3.58*/("""">
    """),_display_(/*4.6*/if(elements.label.toString.nonEmpty)/*4.42*/ {_display_(Seq[Any](format.raw/*4.44*/(""" """),format.raw/*4.45*/("""<label class="control-label" for=""""),_display_(/*4.80*/elements/*4.88*/.id),format.raw/*4.91*/("""">"""),_display_(/*4.94*/elements/*4.102*/.label),format.raw/*4.108*/("""</label> """)))}),format.raw/*4.118*/("""
    """),format.raw/*5.5*/("""<div class="controls">
        """),_display_(/*6.10*/elements/*6.18*/.input),format.raw/*6.24*/("""

        """),format.raw/*8.9*/("""<p class="help-inline">"""),_display_(/*8.33*/elements/*8.41*/.infos.mkString(", ")),format.raw/*8.62*/("""</p>

        """),_display_(/*10.10*/if(elements.hasErrors)/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/(""" """),format.raw/*10.35*/("""<p class="help-block">"""),_display_(/*10.58*/elements/*10.66*/.errors.mkString(", ")),format.raw/*10.88*/("""</p> """)))}),format.raw/*10.94*/("""
    """),format.raw/*11.5*/("""</div>
</div>"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/bootstrapInput.scala.html
                  HASH: a68a89d1ec63d9c5582ea679dfe4ae552ccad6be
                  MATRIX: 971->1|1098->33|1128->37|1181->64|1211->86|1250->88|1286->94|1320->103|1364->139|1403->141|1431->142|1492->177|1508->185|1531->188|1560->191|1577->199|1604->205|1645->215|1677->221|1736->254|1752->262|1778->268|1816->280|1866->304|1882->312|1923->333|1967->350|1998->372|2038->374|2067->375|2117->398|2134->406|2177->428|2214->434|2247->440
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|36->4|36->4|36->4|36->4|36->4|36->4|36->4|37->5|38->6|38->6|38->6|40->8|40->8|40->8|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11
                  -- GENERATED --
              */
          