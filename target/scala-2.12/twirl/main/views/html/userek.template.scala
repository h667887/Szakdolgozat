
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

object userek extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[User],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(userList: util.List[User])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.60*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Userek")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>

    """),_display_(/*9.6*/for(us <- userList) yield /*9.25*/{_display_(Seq[Any](format.raw/*9.26*/("""
        """),format.raw/*10.9*/("""<div class="egy-user">
            <p>"""),_display_(/*11.17*/us/*11.19*/.username),format.raw/*11.28*/("""</p>
            <p>"""),_display_(/*12.17*/us/*12.19*/.email),format.raw/*12.25*/("""</p>
            <p>"""),_display_(/*13.17*/us/*13.19*/.password),format.raw/*13.28*/("""</p>

        </div>
    """)))}),format.raw/*16.6*/("""



""")))}))
      }
    }
  }

  def render(user:User,userList:util.List[User],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(userList)(sumPrice)

  def f:((User) => (util.List[User]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (userList) => (sumPrice) => apply(user)(userList)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/userek.scala.html
                  HASH: a7fe3abfcf662816d768c19808c2e69f2af65bac
                  MATRIX: 651->1|995->20|1126->81|1171->78|1199->98|1229->103|1253->119|1267->125|1285->135|1324->137|1356->143|1424->186|1458->205|1496->206|1533->216|1600->256|1611->258|1641->267|1690->289|1701->291|1728->297|1777->319|1788->321|1818->330|1877->359
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|48->16
                  -- GENERATED --
              */
          