
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
/*1.2*/import java.util

object extra_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Product],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(extras: util.List[Product])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Userek")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>

    """),_display_(/*9.6*/for(extra <- extras) yield /*9.26*/{_display_(Seq[Any](format.raw/*9.27*/("""
        """),format.raw/*10.9*/("""<div class="egy-user">
            <p>
                """),_display_(/*12.18*/extra/*12.23*/.name),format.raw/*12.28*/("""
                """),_display_(/*13.18*/extra/*13.23*/.price),format.raw/*13.29*/("""
                """),format.raw/*14.17*/("""<img src=""""),_display_(/*14.28*/routes/*14.34*/.Assets.versioned("public/images/conke.png")),format.raw/*14.78*/("""" />
                """),_display_(/*15.18*/form(action = routes.CartController.addToCart(extra.id, false))/*15.81*/ {_display_(Seq[Any](format.raw/*15.83*/("""
                    """),_display_(/*16.22*/CSRF/*16.26*/.formField),format.raw/*16.36*/("""
                    """),format.raw/*17.21*/("""<button type="submit" class="btn btn-primary">"""),_display_(/*17.68*/extra/*17.73*/.price),format.raw/*17.79*/("""</button>
                """)))}),format.raw/*18.18*/("""
            """),format.raw/*19.13*/("""</p>

        </div>
    """)))}),format.raw/*22.6*/("""

""")))}))
      }
    }
  }

  def render(user:User,extras:util.List[Product],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(extras)(sumPrice)

  def f:((User) => (util.List[Product]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (extras) => (sumPrice) => apply(user)(extras)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/extra_old.scala.html
                  HASH: 863d7fddc3142e18737c6da7a680bf141f242ed8
                  MATRIX: 655->1|1005->19|1137->80|1181->96|1209->99|1233->115|1247->121|1265->131|1304->133|1335->138|1401->179|1436->199|1474->200|1510->209|1593->265|1607->270|1633->275|1678->293|1692->298|1719->304|1764->321|1802->332|1817->338|1882->382|1931->404|2003->467|2043->469|2092->491|2105->495|2136->505|2185->526|2259->573|2273->578|2300->584|2358->611|2399->624|2455->650
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|49->18|50->19|53->22
                  -- GENERATED --
              */
          