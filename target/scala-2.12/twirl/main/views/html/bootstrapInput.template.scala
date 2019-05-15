
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/bootstrapInput.scala.html
                  HASH: 8d4bd9b5d78d4eb0d8cf71bee2bcc02a6ab2d2c8
                  MATRIX: 971->1|1097->34|1124->35|1177->62|1207->84|1246->86|1282->92|1315->100|1359->136|1398->138|1426->139|1487->174|1503->182|1526->185|1555->188|1572->196|1599->202|1640->212|1671->217|1729->249|1745->257|1771->263|1807->273|1857->297|1873->305|1914->326|1956->341|1987->363|2027->365|2056->366|2106->389|2123->397|2166->419|2203->425|2235->430
                  LINES: 28->1|33->2|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4|36->5|37->6|37->6|37->6|39->8|39->8|39->8|39->8|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11
                  -- GENERATED --
              */
          