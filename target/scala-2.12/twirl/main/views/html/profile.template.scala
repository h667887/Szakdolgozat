
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
Seq[Any](format.raw/*6.75*/("""

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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/profile.scala.html
                  HASH: e83e5ba5deea13c76cb6913aa3b72de97848e40a
                  MATRIX: 651->1|698->42|722->60|745->77|1124->110|1298->199|1319->212|1409->272|1437->275|1465->295|1479->301|1497->311|1536->313|1569->319|1869->592|1884->598|1939->631|2141->806|2156->812|2209->844|3212->1820|3225->1824|3255->1833|3502->2053|3515->2057|3544->2065|3839->2333|3852->2337|3885->2349|4121->2558|4134->2562|4161->2568|4741->3121|4764->3135|4803->3136|4864->3169|4901->3179|4916->3185|4966->3214|5238->3467|5251->3471|5290->3472|5352->3505|5390->3515|5406->3521|5454->3547|5739->3800|5794->3826|6123->4127|6184->4171|6225->4173|6283->4202|6361->4252|6394->4275|6434->4276|6500->4313|6539->4324|6555->4330|6611->4364|6692->4425|6706->4429|6746->4430|6812->4467|6851->4478|6867->4484|6924->4519|7017->4580|7076->4610|7139->4641|7190->4663|7322->4767|7383->4811|7424->4813|7483->4844|7516->4867|7556->4868|7619->4902|7670->4925|7686->4931|7717->4940|7747->4941|7804->4978|7818->4982|7858->4983|7921->5017|8011->5075|8070->5102|8122->5125|8380->5355|8440->5405|8481->5407|8531->5429|8545->5433|8577->5443|8628->5465|8936->5745|9055->5841|9109->5866|9460->6189|9578->6284|9632->6309|9985->6634|10107->6733|10161->6758|10510->7079|10626->7172|10680->7197|11334->7823|11358->7837|11398->7838|11460->7871|11499->7882|11515->7888|11560->7911|11844->8163|11899->8189|12025->8287|12055->8307|12083->8313|12181->8383|12211->8403|12239->8409|12294->8432|12340->8449|12568->8646
                  LINES: 24->1|25->2|26->3|27->4|32->5|36->6|36->6|37->6|39->8|39->8|39->8|39->8|39->8|41->10|51->20|51->20|51->20|57->26|57->26|57->26|86->55|86->55|86->55|91->60|91->60|91->60|98->67|98->67|98->67|103->72|103->72|103->72|124->93|124->93|124->93|125->94|125->94|125->94|125->94|130->99|130->99|130->99|131->100|131->100|131->100|131->100|136->105|138->107|150->119|150->119|150->119|151->120|152->121|152->121|152->121|153->122|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|155->124|156->125|158->127|159->128|161->130|166->135|166->135|166->135|168->137|168->137|168->137|170->139|170->139|170->139|170->139|170->139|171->140|171->140|171->140|173->142|174->143|176->145|179->148|189->158|189->158|189->158|190->159|190->159|190->159|192->161|199->168|199->168|200->169|209->178|209->178|210->179|219->188|219->188|220->189|229->198|229->198|230->199|247->216|247->216|247->216|248->217|248->217|248->217|248->217|253->222|255->224|258->227|258->227|258->227|259->228|259->228|259->228|261->230|262->231|272->241
                  -- GENERATED --
              */
          