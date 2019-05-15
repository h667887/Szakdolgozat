
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

object adminorders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[Orders],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(orders: util.List[Orders])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.60*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Admin Orders")/*6.24*/(user)/*6.30*/(sumPrice)/*6.40*/ {_display_(Seq[Any](format.raw/*6.42*/("""

    """),format.raw/*8.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretkocsiorder">

        <tr><td valign="top">
            <table align="left"  border="0" class="adminorder">
        <tr>
            <td class="kosarfont">Username</td><td class="kosarfont">Product</td><td class="kosarfont">Quantity</td><td></td><td class="kosarfont">Price</td><td width="20"></td><td class="kosarfont" >Address</td><td class="kosarfont">Telephone</td><td></td><td class="kosarfont">Date</td>
        </tr>
            </table>
        </td></tr>

        <tr><td valign="top">
            <table align="left"  border="0" class="kiskeret">
                <tr>
                    <td class="kosarfontseged">Zyzznyomorult</td><td class="kosarfontseged">Cheeky Cheesey</td><td class="kosarfontseged">1 db</td><td class="kosarfontseged" >12900 Ft</td><td class="kosarfontseged">Szeged</td><td></td><td class="kosarfontseged">+36306666666</td><td></td><td class="kosarfontseged">2018-10-29</td>
                </tr>
                <tr>
                    <td class="leiraskosar"></td><td class="leiraskosar">veszünk mindent kígyót és békát és persze minden mást mi mókás</td><td class="leiraskosar">32cm</td><td></td><td class="leiraskosar">Jóska u. 24 2/A 6 cs.</td><td></td><td></td><td></td><td class="leiraskosar">17:11</td>
                </tr>
                <tr>
                    <td height="50"></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                </tr>
                <td class="kosarfontseged">Cheeky Cheesey</td><td class="kosarfontseged">1 db</td><td class="kosarfontseged">1290 Ft</td><td width="100"></td><td class="kosarfontseged">2018-10-29</td><td></td><td class="kosarfontseged">Szeged</td><td></td><td class="kosarfontseged">Zyzznyomorult</td>
                </tr>
                <tr>
                    <td class="leiraskosar">veszünk mindent kígyót és békát és persze minden mást mi mókás</td><td class="leiraskosar">32cm</td><td></td><td></td><td class="leiraskosar">17:11</td><td></td><td class="leiraskosar">Jóska u. 24 2/A 6 cs.</td><td></td><td></td>
                </tr>
                <tr>
                    <td height="50"></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                </tr>

                <td class="kosarfontseged">Cheeky Cheesey</td><td class="kosarfontseged">1 db</td><td class="kosarfontseged">1290 Ft</td><td width="100"></td><td class="kosarfontseged">2018-10-29</td><td></td><td class="kosarfontseged">Szeged</td><td></td><td class="kosarfontseged">Zyzznyomorult</td>
                </tr>
                <tr>
                    <td class="leiraskosar">veszünk mindent kígyót és békát és persze minden mást mi mókás</td><td class="leiraskosar">32cm</td><td></td><td></td><td class="leiraskosar">17:11</td><td></td><td class="leiraskosar">Jóska u. 24 2/A 6 cs.</td><td></td><td></td>
                </tr>
                <tr>
                    <td height="50"></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                </tr>

                    <td></td><td></td><td></td><td align="center"><button type="button" class="btn btn-warning bttn">Delete</button></td><td>
                </tr>
                </tr></td>

            </table>
        </td></tr>

        <tr><td valign="top">
            <table align="left"  border="0" class="kiskeret">
                <td class="kosarfontseged">Cheeky Cheesey</td><td class="kosarfontseged">1 db</td><td class="kosarfontseged">1290 Ft</td><td width="100"></td><td class="kosarfontseged">2018-10-29</td><td></td><td class="kosarfontseged">Szeged</td><td></td><td class="kosarfontseged">Zyzznyomorult</td>
                </tr>
                <tr>
                    <td class="leiraskosar">veszünk mindent kígyót és békát és persze minden mást mi mókás</td><td class="leiraskosar">32cm</td><td></td><td></td><td class="leiraskosar">17:11</td><td></td><td class="leiraskosar">Jóska u. 24 2/A 6 cs.</td><td></td><td></td>
                </tr>
                <tr>
                    <td height="50"></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                </tr>
                </tr>

                <td></td><td></td><td></td><td align="center"><button type="button" class="btn btn-warning bttn">Delete</button></td><td>
                </tr>
                </tr></td>

            </table>
        </td></tr>


        <tr><td valign="bottom" align="center">
            <table border="0" align="left" >

                <tr><td colspan="5" height="50"></td></tr>

            </table>
        </td></tr>

    </table>


    <table height="200"></table>
""")))}))
      }
    }
  }

  def render(user:User,orders:util.List[Orders],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(orders)(sumPrice)

  def f:((User) => (util.List[Orders]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (orders) => (sumPrice) => apply(user)(orders)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/adminorders.scala.html
                  HASH: 161f05470a563e36b1957be7652e4744617563dd
                  MATRIX: 651->1|1002->20|1133->81|1178->78|1206->98|1236->103|1266->125|1280->131|1298->141|1337->143|1371->151
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|40->8
                  -- GENERATED --
              */
          