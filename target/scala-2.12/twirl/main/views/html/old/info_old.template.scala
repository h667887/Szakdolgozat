
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

object info_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/layout("Userek")/*3.18*/(user)/*3.24*/(sumPrice)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

""")))}))
      }
    }
  }

  def render(user:User,sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(sumPrice)

  def f:((User) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sumPrice) => apply(user)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/info_old.scala.html
                  HASH: 4f022a9ce1c62524cca33f9c1c3ba1849ae4d326
                  MATRIX: 961->1|1087->32|1117->37|1141->53|1155->59|1173->69|1212->71
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3
                  -- GENERATED --
              */
          