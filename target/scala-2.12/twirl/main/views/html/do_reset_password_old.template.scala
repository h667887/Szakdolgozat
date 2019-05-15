
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


Seq[Any](format.raw/*2.70*/("""
"""),format.raw/*4.1*/("""

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
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/do_reset_password_old.scala.html
                  HASH: 0ab21198d5ca7508620911c204552b329669942d
                  MATRIX: 651->1|1041->49|1182->120|1227->117|1255->137|1285->142|1322->171|1336->177|1354->187|1393->189|1425->195|1697->440|1737->471|1776->472|1826->494|1912->553|1928->560|1963->574|2017->600|2207->759|2249->773|2299->796|2393->881|2434->883|2480->902|2493->906|2524->916|2570->935|2729->1072|2775->1091|2934->1228|2982->1248|3088->1323|3127->1335
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|52->20|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|58->26|58->26|60->28|61->29|63->31
                  -- GENERATED --
              */
          