
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


Seq[Any](format.raw/*3.94*/("""
"""),format.raw/*5.1*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/my_orders.scala.html
                  HASH: 5285c9816c04f4dd73a0d4e4f98c127a120ef639
                  MATRIX: 651->1|675->20|1061->53|1226->148|1271->145|1299->165|1329->170|1356->189|1370->195|1388->205|1427->207|1461->215|1604->331|1665->376|1705->378|1753->398|2978->1596|2993->1602|3050->1638|3311->1872|3327->1879|3357->1888|3386->1889|3526->2002|3542->2009|3569->2015|3598->2016|3797->2188|3811->2193|3837->2198|3895->2228|4952->3253|4996->3269|5306->3551|5322->3557|5369->3582
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|39->7|39->7|39->7|39->7|39->7|41->9|47->15|47->15|47->15|51->19|88->56|88->56|88->56|94->62|94->62|94->62|94->62|97->65|97->65|97->65|97->65|103->71|103->71|103->71|104->72|141->109|145->113|153->121|153->121|153->121
                  -- GENERATED --
              */
          