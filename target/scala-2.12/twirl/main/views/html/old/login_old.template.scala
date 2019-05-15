
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


Seq[Any](format.raw/*4.1*/("""
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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/login_old.scala.html
                  HASH: 03d2d5374b469139c1bf7d267eef808656d5be16
                  MATRIX: 655->1|702->42|1044->59|1194->116|1221->118|1249->138|1263->144|1281->154|1320->156|1351->161|1678->461|1716->490|1756->492|1805->513|1871->552|1889->561|1932->583|1981->604|2034->626|2079->644|2117->673|2157->675|2206->696|2274->737|2288->742|2324->757|2373->778|2426->800|2471->818|2510->848|2550->850|2599->871|2676->921|2690->926|2727->942|2846->1030|2891->1048|2916->1064|2956->1066|3005->1088|3061->1135|3101->1137|3154->1163|3167->1167|3198->1177|3251->1203|3398->1328|3451->1354|3606->1487|3660->1513|3781->1603|3830->1624|3914->1681|3929->1687|3976->1713|4129->1839|4144->1845|4202->1882|4309->1958|4350->1971|4416->2007
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|36->5|36->5|37->6|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|56->25|56->25|57->26|58->27|58->27|58->27|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|65->34|65->34|67->36|68->37|69->38|70->39|70->39|70->39|73->42|73->42|73->42|75->44|76->45|79->48
                  -- GENERATED --
              */
          