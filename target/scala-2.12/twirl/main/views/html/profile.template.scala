
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
/*1.2*/import controllers.UserController.Login
/*2.2*/import java.util
/*3.2*/import helper._
/*4.2*/import FormClasses.CouponHelper

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[User,Form[User],util.List[CouponHelper],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(user: User)(userForm: Form[User])(coupons: util.List[CouponHelper])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*6.2*/implicitField/*6.15*/ = {{ FieldConstructor(fieldConstructorTemplateTextArea.f) }};
Seq[Any](format.raw/*5.89*/("""
"""),format.raw/*6.75*/("""

"""),_display_(/*8.2*/layout("Pizza Papa")/*8.22*/(user)/*8.28*/(sumPrice)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""

    """),format.raw/*10.5*/("""<table id="tablepadding">
        <tr>
            <td></td>
        </tr>
    </table>

    <table class="keret" border="0">
        <tr>
            <td width="1" colspan="1"></td>
            <td>
                <table class="kiskeretb profkep" border="0" background=""""),_display_(/*20.74*/routes/*20.80*/.Assets.versioned(user.imagePath)),format.raw/*20.113*/("""">
                    <div class="son">

                    </div>
                    <tr>
                        <td class="rang">
                            <img src=""""),_display_(/*26.40*/routes/*26.46*/.Assets.versioned(user.rangPath)),format.raw/*26.78*/(""""/>
                        </td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
            </td>
            <td colspan="4">
                <table class="kiskeretc" border="0" align="left" height="250">
                    <tr>
                        <td width="40"></td>
                        <td class="proffont">
                            Name:
                        </td>
                        <td class="proffontseged"><label>"""),_display_(/*55.59*/user/*55.63*/.fullName),format.raw/*55.72*/("""</label></td>
                    </tr>
                    <tr>
                        <td width="10"></td>
                        <td class="proffont">Address:</td>
                        <td class="proffontseged">"""),_display_(/*60.52*/user/*60.56*/.address),format.raw/*60.64*/("""</td>
                    </tr>
                    <tr>
                        <td width="10"></td>
                        <td class="proffont">
                            Telephone:
                        </td>
                        <td class="proffontseged">"""),_display_(/*67.52*/user/*67.56*/.phoneNumber),format.raw/*67.68*/("""</td>
                    </tr>
                    <tr>
                        <td width="10"></td>
                        <td class="proffont">Email</td>
                        <td class="proffontseged">"""),_display_(/*72.52*/user/*72.56*/.email),format.raw/*72.62*/("""</td>
                    </tr>


                </table>

            </td>
        </tr>
        <tr>
            <td colspan="4">
                <table>
                    <tr>
                        <td width="160"></td>
                        <td>
                            <button type="button" class="btn btn-warning bttnful">
                                Browse
                            </button>
                        </td>
                        <td width="280"></td>
                        <td>

                            """),_display_(/*93.30*/if(user.admin)/*93.44*/{_display_(Seq[Any](format.raw/*93.45*/("""
                                """),format.raw/*94.33*/("""<a href=""""),_display_(/*94.43*/routes/*94.49*/.CartController.adminOrders()),format.raw/*94.78*/("""">
                                    <button type="button" class="btn btn-warning bttnful">
                                        Orders
                                    </button>
                                </a>
                            """)))}/*99.30*/else/*99.34*/{_display_(Seq[Any](format.raw/*99.35*/("""
                                """),format.raw/*100.33*/("""<a href=""""),_display_(/*100.43*/routes/*100.49*/.CartController.myOrders()),format.raw/*100.75*/("""">
                                    <button type="button" class="btn btn-warning bttnful">
                                        Orders
                                    </button>
                                </a>
                            """)))}),format.raw/*105.30*/("""

                        """),format.raw/*107.25*/("""</td>
                        <td></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td colspan="6" valign="top">
                <table align="right">
                    <tr>

                        <td></td>
                        """),_display_(/*119.26*/for((coupon, index) <- coupons.zipWithIndex) yield /*119.70*/ {_display_(Seq[Any](format.raw/*119.72*/("""
                            """),format.raw/*120.29*/("""<td width="160">
                                """),_display_(/*121.34*/if(coupon.quantity > 0)/*121.57*/{_display_(Seq[Any](format.raw/*121.58*/("""
                                    """),format.raw/*122.37*/("""<img src=""""),_display_(/*122.48*/routes/*122.54*/.Assets.versioned(coupon.imageGot)),format.raw/*122.88*/("""" height="86" width="153"/>
                                """)))}/*123.34*/else/*123.38*/{_display_(Seq[Any](format.raw/*123.39*/("""
                                    """),format.raw/*124.37*/("""<img src=""""),_display_(/*124.48*/routes/*124.54*/.Assets.versioned(coupon.imageNone)),format.raw/*124.89*/("""" height="86" width="153"/>
                                """)))}),format.raw/*125.34*/("""

                            """),format.raw/*127.29*/("""</td>
                        """)))}),format.raw/*128.26*/("""

                    """),format.raw/*130.21*/("""</tr>
                    <tr>
                        <td height="60"></td>


                        """),_display_(/*135.26*/for((coupon, index) <- coupons.zipWithIndex) yield /*135.70*/ {_display_(Seq[Any](format.raw/*135.72*/("""

                            """),_display_(/*137.30*/if(coupon.quantity > 0)/*137.53*/{_display_(Seq[Any](format.raw/*137.54*/("""

                                """),format.raw/*139.33*/("""<td class="pizzafont">"""),_display_(/*139.56*/coupon/*139.62*/.quantity),format.raw/*139.71*/(""" """),format.raw/*139.72*/("""db</td>
                            """)))}/*140.30*/else/*140.34*/{_display_(Seq[Any](format.raw/*140.35*/("""

                                """),format.raw/*142.33*/("""<td class="nofont">0 db</td>
                            """)))}),format.raw/*143.30*/("""

                        """)))}),format.raw/*145.26*/("""


                    """),format.raw/*148.21*/("""</tr>
                </table>
        </tr>
        </td>
        <tr>
            <td width="100"></td>
            <td colspan="6" width="0" class="profmod">
                <table align="center" border="0">


                """),_display_(/*158.18*/form(action = routes.UserController.profileEdit())/*158.68*/ {_display_(Seq[Any](format.raw/*158.70*/("""
                    """),_display_(/*159.22*/CSRF/*159.26*/.formField),format.raw/*159.36*/("""

                    """),format.raw/*161.21*/("""<tr>
                        <td height="50" colspan="6"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td class="modfont" colspan="6">Name</td>
                        <td colspan="2">
                        """),_display_(/*168.26*/inputText(userForm("fullName"), 'class -> "pinput", '_showConstraints -> false, '_label -> null)),format.raw/*168.122*/("""
                        """),format.raw/*169.25*/("""</td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td class="modfont" colspan="6">Address</td>
                        <td colspan="2">
                        """),_display_(/*178.26*/inputText(userForm("address"), 'class -> "pinput", '_showConstraints -> false, '_label -> null)),format.raw/*178.121*/("""
                        """),format.raw/*179.25*/("""</td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td class="modfont" colspan="6">Telephone</td>
                        <td colspan="2">
                        """),_display_(/*188.26*/inputText(userForm("phoneNumber"), 'class -> "pinput", '_showConstraints -> false, '_label -> null)),format.raw/*188.125*/("""
                        """),format.raw/*189.25*/("""</td>
                    </tr>
                    <tr>
                        <td height="20"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td class="modfont" colspan="6">Email</td>
                        <td colspan="2">
                        """),_display_(/*198.26*/inputText(userForm("email"), 'class -> "pinput", '_showConstraints -> false, '_label -> null)),format.raw/*198.119*/("""
                        """),format.raw/*199.25*/("""</td>
                    </tr>
                    <tr>
                        <td height="50"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left" colspan="6">
                            <button type="submit" class="btn btn-warning bttnful">
                                Modify
                            </button>
                        </td>
                        <td class="hibaprof">
                            Error: Telephone
                        </td>
                        <td align="right">

                            """),_display_(/*216.30*/if(user.admin)/*216.44*/{_display_(Seq[Any](format.raw/*216.45*/("""
                                """),format.raw/*217.33*/("""<a  href=""""),_display_(/*217.44*/routes/*217.50*/.UserController.admin()),format.raw/*217.73*/("""">
                                    <button type="button" class="btn btn-warning bttnful">
                                        Admin
                                    </button>
                                </a>
                            """)))}),format.raw/*222.30*/("""

                        """),format.raw/*224.25*/("""</td>
                    </tr>

                    <input type="hidden" name="username" value=""""),_display_(/*227.66*/userForm("username")/*227.86*/.value),format.raw/*227.92*/("""" />
                    <input type="hidden" name="password" value=""""),_display_(/*228.66*/userForm("password")/*228.86*/.value),format.raw/*228.92*/("""" />

                """)))}),format.raw/*230.18*/("""
                """),format.raw/*231.17*/("""</table>
            </td>
            <td width="100"></td>
        </tr>
        <tr>
            <td height="100" colspan="6"></td>
        </tr>
    </table>

    <table height="200"></table>
""")))}),format.raw/*241.2*/("""


"""))
      }
    }
  }

  def render(user:User,userForm:Form[User],coupons:util.List[CouponHelper],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(userForm)(coupons)(sumPrice)

  def f:((User) => (Form[User]) => (util.List[CouponHelper]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (userForm) => (coupons) => (sumPrice) => apply(user)(userForm)(coupons)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/profile.scala.html
                  HASH: 85ee35e9bbc403ad6b5e077f785a5633eb027449
                  MATRIX: 651->1|698->43|722->62|745->80|1124->114|1298->204|1319->217|1409->201|1438->277|1468->282|1496->302|1510->308|1528->318|1567->320|1602->328|1912->611|1927->617|1982->650|2190->831|2205->837|2258->869|3290->1874|3303->1878|3333->1887|3585->2112|3598->2116|3627->2124|3929->2399|3942->2403|3975->2415|4216->2629|4229->2633|4256->2639|4857->3213|4880->3227|4919->3228|4981->3262|5018->3272|5033->3278|5083->3307|5360->3565|5373->3569|5412->3570|5475->3604|5513->3614|5529->3620|5577->3646|5867->3904|5924->3932|6265->4245|6326->4289|6367->4291|6426->4321|6505->4372|6538->4395|6578->4396|6645->4434|6684->4445|6700->4451|6756->4485|6838->4547|6852->4551|6892->4552|6959->4590|6998->4601|7014->4607|7071->4642|7165->4704|7226->4736|7290->4768|7343->4792|7480->4901|7541->4945|7582->4947|7643->4980|7676->5003|7716->5004|7781->5040|7832->5063|7848->5069|7879->5078|7909->5079|7967->5117|7981->5121|8021->5122|8086->5158|8177->5217|8238->5246|8293->5272|8561->5512|8621->5562|8662->5564|8713->5587|8727->5591|8759->5601|8812->5625|9127->5912|9246->6008|9301->6034|9661->6366|9779->6461|9834->6487|10196->6821|10318->6920|10373->6946|10731->7276|10847->7369|10902->7395|11573->8038|11597->8052|11637->8053|11700->8087|11739->8098|11755->8104|11800->8127|12089->8384|12146->8412|12275->8513|12305->8533|12333->8539|12432->8610|12462->8630|12490->8636|12547->8661|12594->8679|12832->8886
                  LINES: 24->1|25->2|26->3|27->4|32->5|36->6|36->6|37->5|38->6|40->8|40->8|40->8|40->8|40->8|42->10|52->20|52->20|52->20|58->26|58->26|58->26|87->55|87->55|87->55|92->60|92->60|92->60|99->67|99->67|99->67|104->72|104->72|104->72|125->93|125->93|125->93|126->94|126->94|126->94|126->94|131->99|131->99|131->99|132->100|132->100|132->100|132->100|137->105|139->107|151->119|151->119|151->119|152->120|153->121|153->121|153->121|154->122|154->122|154->122|154->122|155->123|155->123|155->123|156->124|156->124|156->124|156->124|157->125|159->127|160->128|162->130|167->135|167->135|167->135|169->137|169->137|169->137|171->139|171->139|171->139|171->139|171->139|172->140|172->140|172->140|174->142|175->143|177->145|180->148|190->158|190->158|190->158|191->159|191->159|191->159|193->161|200->168|200->168|201->169|210->178|210->178|211->179|220->188|220->188|221->189|230->198|230->198|231->199|248->216|248->216|248->216|249->217|249->217|249->217|249->217|254->222|256->224|259->227|259->227|259->227|260->228|260->228|260->228|262->230|263->231|273->241
                  -- GENERATED --
              */
          