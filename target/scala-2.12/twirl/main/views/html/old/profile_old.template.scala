
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


Seq[Any](format.raw/*4.1*/("""
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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/profile_old.scala.html
                  HASH: 33405f829d7c1e3f20c9764eae18d58e62b998d5
                  MATRIX: 655->1|702->42|1045->59|1193->114|1220->116|1248->136|1262->142|1280->152|1319->154|1350->159|1800->582|1813->586|1843->595|2012->737|2025->741|2054->749|2224->892|2237->896|2270->908|2438->1049|2451->1053|2478->1059|2853->1407|2893->1438|2932->1439|2989->1468|3082->1534|3098->1541|3133->1555|3194->1588|3398->1761|3447->1782|3503->1811|3560->1859|3600->1861|3653->1887|3666->1891|3697->1901|3750->1926|3962->2111|4086->2213|4287->2387|4410->2488|4612->2663|4739->2768|4939->2941|5060->3040|5272->3225|5301->3245|5328->3251|5429->3325|5458->3345|5485->3351|5630->3465|5676->3483|5735->3515|5758->3529|5797->3530|5839->3544|5979->3657|5994->3663|6038->3686|6146->3763|6178->3768|6217->3777
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|36->5|36->5|37->6|52->21|52->21|52->21|56->25|56->25|56->25|60->29|60->29|60->29|64->33|64->33|64->33|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|80->49|81->50|83->52|83->52|83->52|84->53|84->53|84->53|85->54|89->58|89->58|93->62|93->62|97->66|97->66|101->70|101->70|107->76|107->76|107->76|108->77|108->77|108->77|111->80|113->82|116->85|116->85|116->85|118->87|120->89|120->89|120->89|123->92|124->93|126->95
                  -- GENERATED --
              */
          