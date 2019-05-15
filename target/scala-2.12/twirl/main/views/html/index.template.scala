
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


Seq[Any](format.raw/*2.33*/("""
"""),format.raw/*4.1*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/index.scala.html
                  HASH: 2d8adf56e8891f63058eea2ffbd1f3c01f0d3524
                  MATRIX: 651->1|978->20|1082->54|1127->51|1155->71|1185->76|1208->91|1222->97|1240->107|1279->109|1309->113|1399->177|1438->207|1478->209|1515->219|1585->262|1599->267|1636->283|1732->349|1761->351
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|48->16
                  -- GENERATED --
              */
          