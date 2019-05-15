
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
/*1.2*/import controllers.UserController.NewPassword

object do_reset_password_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[NewPassword],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(newPasswordForm : Form[NewPassword])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Új jelszó beállítás")/*6.31*/(user)/*6.37*/(sumPrice)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>


    <div class="login-form">
        <div class="main-div">
            <div class="panel">
                <h2>Elfelejtett jelszó</h2>
                <p>Add meg az új jelszavad</p>
                """),_display_(/*15.18*/if(flash.containsKey("danger"))/*15.49*/{_display_(Seq[Any](format.raw/*15.50*/("""
                    """),format.raw/*16.21*/("""<div class="alert alert-danger">
                        """),_display_(/*17.26*/flash()/*17.33*/.get("danger")),format.raw/*17.47*/("""
                        """),format.raw/*18.25*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                    </div>
                """)))}),format.raw/*20.18*/("""
            """),format.raw/*21.13*/("""</div>

            """),_display_(/*23.14*/form(action=routes.UserController.resetPasswordPost(request().uri().split("/").last))/*23.99*/ {_display_(Seq[Any](format.raw/*23.101*/("""
                """),_display_(/*24.18*/CSRF/*24.22*/.formField),format.raw/*24.32*/("""
                """),_display_(/*25.18*/inputPassword(newPasswordForm("newPW1"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Jelszó")),format.raw/*25.155*/("""
                """),_display_(/*26.18*/inputPassword(newPasswordForm("newPW2"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Jelszó")),format.raw/*26.155*/("""

                """),format.raw/*28.17*/("""<button type="submit" class="btn btn-primary">dewit</button>
            """)))}),format.raw/*29.14*/("""

        """),format.raw/*31.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(user:User,newPasswordForm:Form[NewPassword],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(newPasswordForm)(sumPrice)

  def f:((User) => (Form[NewPassword]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (newPasswordForm) => (sumPrice) => apply(user)(newPasswordForm)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/do_reset_password_old.scala.html
                  HASH: 60947623c96cebf9c25ccf180aa815e007bf28af
                  MATRIX: 651->1|1041->48|1182->118|1226->134|1254->137|1291->166|1305->172|1323->182|1362->184|1393->189|1657->426|1697->457|1736->458|1785->479|1870->537|1886->544|1921->558|1974->583|2162->740|2203->753|2251->774|2345->859|2386->861|2431->879|2444->883|2475->893|2520->911|2679->1048|2724->1066|2883->1203|2929->1221|3034->1295|3071->1305
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|51->20|52->21|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|57->26|57->26|59->28|60->29|62->31
                  -- GENERATED --
              */
          