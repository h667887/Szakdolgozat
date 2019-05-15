
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

object login_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Login],User,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(loginForm : Form[Login])(user: User)(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.58*/("""

"""),_display_(/*5.2*/layout("Pizza Papa")/*5.22*/(user)/*5.28*/(sumPrice)/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
    """),format.raw/*6.5*/("""<h1 align="center">Pizza Papa</h1>

    <div class="container">
        <div class="login-form">
            <div class="main-div">
                <div class="panel">
                    <h2>Bejelentkezés</h2>
                    <p>Írd be adataid, dilóm</p>
                </div>
                """),_display_(/*15.18*/if(loginForm.hasGlobalErrors)/*15.47*/ {_display_(Seq[Any](format.raw/*15.49*/("""
                    """),format.raw/*16.21*/("""<p class="error">
                    """),_display_(/*17.22*/loginForm/*17.31*/.globalError.message()),format.raw/*17.53*/("""
                    """),format.raw/*18.21*/("""</p>
                """)))}),format.raw/*19.18*/("""
                """),_display_(/*20.18*/if(flash.contains("success"))/*20.47*/ {_display_(Seq[Any](format.raw/*20.49*/("""
                    """),format.raw/*21.21*/("""<p class="success">
                    """),_display_(/*22.22*/flash/*22.27*/.get("success")),format.raw/*22.42*/("""
                    """),format.raw/*23.21*/("""</p>
                """)))}),format.raw/*24.18*/("""
                """),_display_(/*25.18*/if(flash.contains("pw_reset"))/*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
                    """),format.raw/*26.21*/("""<p class="success">
                    <a href=""""),_display_(/*27.31*/flash/*27.36*/.get("pw_reset")),format.raw/*27.52*/("""">Ide kattintva</a> új jelszót állíthatsz be.
                    </p>
                """)))}),format.raw/*29.18*/("""
                """),_display_(/*30.18*/if(user == null)/*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/("""
                    """),_display_(/*31.22*/form(action=routes.UserController.authenticate)/*31.69*/ {_display_(Seq[Any](format.raw/*31.71*/("""
                        """),_display_(/*32.26*/CSRF/*32.30*/.formField),format.raw/*32.40*/("""
                        """),_display_(/*33.26*/inputText(loginForm("email"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Email")),format.raw/*33.151*/("""
                        """),_display_(/*34.26*/inputPassword(loginForm("password"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Jelszó")),format.raw/*34.159*/("""

                        """),format.raw/*36.25*/("""<button type="submit" class="btn btn-primary">Bejelentkezés</button>
                    """)))}),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""<div class="register">
                        <a href=""""),_display_(/*39.35*/routes/*39.41*/.UserController.register()),format.raw/*39.67*/("""">Regisztráció</a>
                    </div>
                    <div class="forgot_pass">
                        <a href=""""),_display_(/*42.35*/routes/*42.41*/.UserController.askResetPasswordGet()),format.raw/*42.78*/("""">Elfelejtettem a jelszavam</a>
                    </div>
                """)))}),format.raw/*44.18*/("""
            """),format.raw/*45.13*/("""</div>
        </div></div></div>

""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[Login],user:User,sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(user)(sumPrice)

  def f:((Form[Login]) => (User) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (user) => (sumPrice) => apply(loginForm)(user)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/login_old.scala.html
                  HASH: aa108565b2e79c360b85a5ac7ac8c9e79dc3aa78
                  MATRIX: 655->1|702->43|1044->61|1195->117|1225->122|1253->142|1267->148|1285->158|1324->160|1356->166|1692->475|1730->504|1770->506|1820->528|1887->568|1905->577|1948->599|1998->621|2052->644|2098->663|2136->692|2176->694|2226->716|2295->758|2309->763|2345->778|2395->800|2449->823|2495->842|2534->872|2574->874|2624->896|2702->947|2716->952|2753->968|2874->1058|2920->1077|2945->1093|2985->1095|3035->1118|3091->1165|3131->1167|3185->1194|3198->1198|3229->1208|3283->1235|3430->1360|3484->1387|3639->1520|3695->1548|3817->1639|3867->1661|3952->1719|3967->1725|4014->1751|4170->1880|4185->1886|4243->1923|4352->2001|4394->2015|4463->2054
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|37->5|37->5|38->6|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|57->25|57->25|57->25|58->26|59->27|59->27|59->27|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|66->34|66->34|68->36|69->37|70->38|71->39|71->39|71->39|74->42|74->42|74->42|76->44|77->45|80->48
                  -- GENERATED --
              */
          