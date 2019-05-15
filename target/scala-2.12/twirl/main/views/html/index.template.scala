
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Index")/*6.17*/(user)/*6.23*/(sumPrice)/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""

"""),format.raw/*8.1*/("""<table id="tablepadding">
<tr><td>  </td></tr>
</table>
    """),_display_(/*11.6*/if(flash.contains("pw_reset"))/*11.36*/ {_display_(Seq[Any](format.raw/*11.38*/("""
        """),format.raw/*12.9*/("""<p class="success">
            <a href=""""),_display_(/*13.23*/flash/*13.28*/.get("pw_reset")),format.raw/*13.44*/("""">Ide kattintva</a> új jelszót állíthatsz be.
        </p>
    """)))}),format.raw/*15.6*/("""
"""),format.raw/*16.1*/("""<table class="keretindex" ></table>


</table>

<table height="200"></table>


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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/index.scala.html
                  HASH: 01ab3c95bd7d151794e4dea2b2386869b127c6f5
                  MATRIX: 651->1|978->19|1082->52|1126->68|1154->71|1177->86|1191->92|1209->102|1248->104|1276->106|1363->167|1402->197|1442->199|1478->208|1547->250|1561->255|1598->271|1692->335|1720->336
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|39->8|42->11|42->11|42->11|43->12|44->13|44->13|44->13|46->15|47->16
                  -- GENERATED --
              */
          