
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
/*2.2*/import FormClasses.CartProduct

object my_orders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[User,util.List[Orders],util.List[CartProduct],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User)(orders: util.List[Orders])(products: util.List[CartProduct])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*5.1*/("""

"""),_display_(/*7.2*/layout("My Orders")/*7.21*/(user)/*7.27*/(sumPrice)/*7.37*/ {_display_(Seq[Any](format.raw/*7.39*/("""

    """),format.raw/*9.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretkocsi">

        """),_display_(/*15.10*/for((order, product) <- orders.zip(products)) yield /*15.55*/ {_display_(Seq[Any](format.raw/*15.57*/("""



            """),format.raw/*19.13*/("""<tr><td valign="top">
                <table align="left" border="0" class="kiskeret">
                    <tr>
                        <td>

                    </td>
                        <td class="kosarfont">

                    </td>
                        <td class="kosarfont">
                        Product
                        </td>
                        <td class="kosarfont">
                        Quantity
                        </td>
                        <td class="kosarfont">
                        Price
                        </td>
                        <td>

                    </td>
                        <td class="kosarfont">
                        Date
                        </td>
                        <td>

                    </td>
                        <td class="kosarfont">
                        Address
                        </td>
                    </tr>
                    <tr>
                        <td width="50">

                    </td>
                        <td align="center" rowspan="2">
                            <div class="images">
                                <img src=""""),_display_(/*56.44*/routes/*56.50*/.Assets.versioned(product.imagePath)),format.raw/*56.86*/(""""/>
                            </div>
                        </td>
                        <td class="kosarfontseged">
                        </td>
                        <td class="kosarfontseged">
                        """),_display_(/*62.26*/product/*62.33*/.quantity),format.raw/*62.42*/(""" """),format.raw/*62.43*/("""db
                        </td>
                        <td class="kosarfontseged">
                        """),_display_(/*65.26*/product/*65.33*/.price),format.raw/*65.39*/(""" """),format.raw/*65.40*/("""Ft
                        </td>
                        <td>

                </td>
                        <td class="kosarfontseged">
                            """),_display_(/*71.30*/order/*71.35*/.date),format.raw/*71.40*/("""
                            """),format.raw/*72.29*/("""2018-10-29
                        </td>
                        <td>

                    </td>
                        <td class="kosarfontseged">
                            Szeged Szeged Szeged Szeged
                        </td>
                    </tr>
                    <tr>
                        <td>

                    </td>
                        <td class="leiraskosar">
                            
                        </td>
                        <td>

                    </td>
                        <td>

                    </td>
                        <td>

                    </td>
                        <td class="leiraskosar">
                        17:11
                        </td>
                        <td>

                    </td>
                        <td class="leiraskosar">
                        Jóska u. 24 2/A 6 cs.
                        </td>
                    </tr>
                    </tr> </td>

                    """)))}),format.raw/*109.22*/("""



        """),format.raw/*113.9*/("""<tr><td valign="bottom" align="center">
            <table border="0" align="left" >

                <tr>
                    <td width="450">

                    </td>
                    <td align="center" height="100" valign="bottom">
                        <a href=""""),_display_(/*121.35*/routes/*121.41*/.UserController.profile()),format.raw/*121.66*/("""">
                            <button type="button" class="btn btn-warning bttn">
                                Back
                            </button>
                        </a>
                    </td>
                    <td>

                    </td>
                    <td>

                    </td>
                    </td>
                    <td>

                    </td>
                </tr>
                <tr>
                    <td colspan="5" height="50"></td></tr>

            </table>
        </td></tr>

    </table>

        <table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,orders:util.List[Orders],products:util.List[CartProduct],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(orders)(products)(sumPrice)

  def f:((User) => (util.List[Orders]) => (util.List[CartProduct]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (orders) => (products) => (sumPrice) => apply(user)(orders)(products)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/my_orders.scala.html
                  HASH: be9ffc153462452102d6725aca8a9b60e2ab09d2
                  MATRIX: 651->1|675->19|1061->51|1226->145|1270->161|1298->164|1325->183|1339->189|1357->199|1396->201|1428->207|1565->317|1626->362|1666->364|1710->380|2898->1541|2913->1547|2970->1583|3225->1811|3241->1818|3271->1827|3300->1828|3437->1938|3453->1945|3480->1951|3509->1952|3702->2118|3716->2123|3742->2128|3799->2157|4819->3145|4859->3157|5161->3431|5177->3437|5224->3462
                  LINES: 24->1|25->2|30->3|33->4|36->5|38->7|38->7|38->7|38->7|38->7|40->9|46->15|46->15|46->15|50->19|87->56|87->56|87->56|93->62|93->62|93->62|93->62|96->65|96->65|96->65|96->65|102->71|102->71|102->71|103->72|140->109|144->113|152->121|152->121|152->121
                  -- GENERATED --
              */
          