
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
/*1.2*/import controllers.UserController.Login
/*2.2*/import helper._

object profile_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[User],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User)(userForm : Form[User])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.56*/("""

"""),_display_(/*5.2*/layout("Pizza Papa")/*5.22*/(user)/*5.28*/(sumPrice)/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
    """),format.raw/*6.5*/("""<h1 align="center">Pizza Papa</h1>

    <div class="container">
        <div class="peti-main-div row justify-content-center">


            <div class="col-4">
                Itt van egy gyönyörű kép
            </div>
            <div class="col-8">

                <table class="table">
                    <tbody>
                        <tr>
                            <td>Név</td>
                            <td>"""),_display_(/*21.34*/user/*21.38*/.fullName),format.raw/*21.47*/("""</td>
                        </tr>
                        <tr>
                            <td>Lakcím</td>
                            <td>"""),_display_(/*25.34*/user/*25.38*/.address),format.raw/*25.46*/("""</td>
                        </tr>
                        <tr>
                            <td>Telefon</td>
                            <td>"""),_display_(/*29.34*/user/*29.38*/.phoneNumber),format.raw/*29.50*/("""</td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td>"""),_display_(/*33.34*/user/*33.38*/.email),format.raw/*33.44*/("""</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="row justify-content-center">

                <div class="peti-main-div ">
                    <div class="panel">
                        <h2>Felhasználói adatok módosítása</h2>
                        """),_display_(/*44.26*/if(flash.containsKey("danger"))/*44.57*/{_display_(Seq[Any](format.raw/*44.58*/("""
                            """),format.raw/*45.29*/("""<div class="alert alert-danger">
                                """),_display_(/*46.34*/flash()/*46.41*/.get("danger")),format.raw/*46.55*/("""
                                """),format.raw/*47.33*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                            </div>
                        """)))}),format.raw/*49.26*/("""
                    """),format.raw/*50.21*/("""</div>

                    """),_display_(/*52.22*/form(action=routes.UserController.profileEdit())/*52.70*/ {_display_(Seq[Any](format.raw/*52.72*/("""
                        """),_display_(/*53.26*/CSRF/*53.30*/.formField),format.raw/*53.40*/("""
                        """),format.raw/*54.25*/("""<table class="table">
                            <tbody>
                                <tr>
                                    <td>Név</td>
                                    <td>"""),_display_(/*58.42*/inputText(userForm("fullName"), 'class -> "form-control", '_showConstraints -> false, '_label -> null)),format.raw/*58.144*/("""</td>
                                </tr>
                                <tr>
                                    <td>Lakcím</td>
                                    <td>"""),_display_(/*62.42*/inputText(userForm("address"), 'class -> "form-control", '_showConstraints -> false, '_label -> null)),format.raw/*62.143*/("""</td>
                                </tr>
                                <tr>
                                    <td>Telefon</td>
                                    <td>"""),_display_(/*66.42*/inputText(userForm("phoneNumber"), 'class -> "form-control", '_showConstraints -> false, '_label -> null)),format.raw/*66.147*/("""</td>
                                </tr>
                                <tr>
                                    <td>Email</td>
                                    <td>"""),_display_(/*70.42*/inputText(userForm("email"), 'class -> "form-control", '_showConstraints -> false, '_label -> null)),format.raw/*70.141*/("""</td>
                                </tr>
                            </tbody>
                        </table>


                        <input type="hidden" name="username" value=""""),_display_(/*76.70*/userForm("username")/*76.90*/.value),format.raw/*76.96*/("""" />
                        <input type="hidden" name="password" value=""""),_display_(/*77.70*/userForm("password")/*77.90*/.value),format.raw/*77.96*/("""" />

                        <button type="submit" class="btn btn-primary">Módosít</button>
                    """)))}),format.raw/*80.22*/("""

                """),format.raw/*82.17*/("""</div>

        </div>
        """),_display_(/*85.10*/if(user.admin)/*85.24*/{_display_(Seq[Any](format.raw/*85.25*/("""

            """),format.raw/*87.13*/("""<div class="row">
                <div class="peti-main-div">
                    <a class="btn btn-dark" href=""""),_display_(/*89.52*/routes/*89.58*/.UserController.admin()),format.raw/*89.81*/("""" role="button">Admin</a>
                </div>
            </div>
        """)))}),format.raw/*92.10*/("""
    """),format.raw/*93.5*/("""</div>

""")))}),format.raw/*95.2*/("""
"""))
      }
    }
  }

  def render(user:User,userForm:Form[User],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(userForm)(sumPrice)

  def f:((User) => (Form[User]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (userForm) => (sumPrice) => apply(user)(userForm)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/profile_old.scala.html
                  HASH: 51ba5700a1f4ad7591d67819c93db803dfb31430
                  MATRIX: 655->1|702->43|1045->61|1194->115|1224->120|1252->140|1266->146|1284->156|1323->158|1355->164|1820->602|1833->606|1863->615|2036->761|2049->765|2078->773|2252->920|2265->924|2298->936|2470->1081|2483->1085|2510->1091|2896->1450|2936->1481|2975->1482|3033->1512|3127->1579|3143->1586|3178->1600|3240->1634|3446->1809|3496->1831|3554->1862|3611->1910|3651->1912|3705->1939|3718->1943|3749->1953|3803->1979|4019->2168|4143->2270|4348->2448|4471->2549|4677->2728|4804->2833|5008->3010|5129->3109|5347->3300|5376->3320|5403->3326|5505->3401|5534->3421|5561->3427|5709->3544|5757->3564|5819->3599|5842->3613|5881->3614|5925->3630|6067->3745|6082->3751|6126->3774|6237->3854|6270->3860|6311->3871
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|37->5|37->5|38->6|53->21|53->21|53->21|57->25|57->25|57->25|61->29|61->29|61->29|65->33|65->33|65->33|76->44|76->44|76->44|77->45|78->46|78->46|78->46|79->47|81->49|82->50|84->52|84->52|84->52|85->53|85->53|85->53|86->54|90->58|90->58|94->62|94->62|98->66|98->66|102->70|102->70|108->76|108->76|108->76|109->77|109->77|109->77|112->80|114->82|117->85|117->85|117->85|119->87|121->89|121->89|121->89|124->92|125->93|127->95
                  -- GENERATED --
              */
          