
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

object info extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.33*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Info")/*6.16*/(user)/*6.22*/(sumPrice)/*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""

    """),format.raw/*8.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keret">
        <tr>
            <td colspan="5" height="50"></td>
        </tr>
        <tr>
            <td class="infotd"></td>
            <td class="infokeret infoimgpadding"><img src=""""),_display_(/*18.61*/routes/*18.67*/.Assets.versioned("images/info/Delivery.png")),format.raw/*18.112*/("""" height="150" width="200"/></td>
            <td></td>
            <td class="infokeret infotextpadding infotext infokeretseged">
                A cégünk biztosítja a szállítást, adott városon belül ingyenesen, minimum 5000 Ft értékben való vásárlás esetén.
                A szállítási idő függ a már meglévő megrendeléstől. Átlagosan 50-120 perc alatt teljesítjük a rendelést.</td>
            <td class="infotd"></td>
        </tr>
        <tr>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td></td>
            <td class="infokeret infoimgpadding"><img src=""""),_display_(/*30.61*/routes/*30.67*/.Assets.versioned("images/info/Coupon.png")),format.raw/*30.110*/("""" height="100" width="200"/></td>
            <td></td>
            <td class="infokeret infotextpadding infotext infokeretseged">
                A weboldal kuponrendszert biztosít a felhasználóink számára. Az összes rendelés összegéhez viszonyítva a kupon kiosztás:
                <p>5000 Ft - 5% , 12000 Ft - 10% , 25000 Ft - 25% </p><p> 40000 Ft - 50% , 80000 Ft - 75%</p></td>
            <td></td>
        </tr>
        <tr>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td></td>
            <td align="left" class="infokeret infoimgpadding"><img src=""""),_display_(/*42.74*/routes/*42.80*/.Assets.versioned("images/info/aboutus.png")),format.raw/*42.124*/("""" height="150" width="150"/></td>
            <td></td>
            <td class="infokeret infotextpadding infotext infokeretseged">
                2018-ban indult cégünk és célunk, hogy mindenki számára megtaláljuk a megfelelő ízeket! Ezért is alkottuk meg az új Creator funkciót, amely segít
                összerakni a te saját egyedi pizzádat, amelyet mi elkészítünk neked! Továbbá egyéb finomságokat is találsz, frissítőket beleértve!</td>
            <td></td>
        </tr>
        <tr>
            <td colspan="5"></td>
        </tr>
        <tr>
            <td></td>
            <td class="infokeret infoimgpadding "><img src=""""),_display_(/*54.62*/routes/*54.68*/.Assets.versioned("images/info/Terms.png")),format.raw/*54.110*/("""" height="150" width="150"/></td>
            <td></td>
            <td class="infokeret infotextpadding infotext infokeretseged">
                A weboldalt szerzői jogok védik. Bármilyen képi anyagot, illetve információt, csak a cég beleegyezésével lehet felhasználni! <p>
                Minden jogot fenntartunk!</p><p>Licenszelve 2018 ©</p></td>
            <td></td>
        </tr>
        <tr>
            <td colspan="5"></td>
        </tr>
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
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/info.scala.html
                  HASH: a810c2df30ba3961a887653a8b9138be8870e82d
                  MATRIX: 651->1|977->20|1081->54|1126->51|1154->71|1184->76|1206->90|1220->96|1238->106|1277->108|1311->116|1626->404|1641->410|1708->455|2340->1060|2355->1066|2420->1109|3047->1709|3062->1715|3128->1759|3805->2409|3820->2415|3884->2457
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|40->8|50->18|50->18|50->18|62->30|62->30|62->30|74->42|74->42|74->42|86->54|86->54|86->54
                  -- GENERATED --
              */
          