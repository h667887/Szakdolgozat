
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
/*1.2*/import controllers.UserController.PwReset

object ask_reset_password_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[PwReset],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(pwResetForm : Form[PwReset])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.62*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Elfelejtett jelszó")/*6.30*/(user)/*6.36*/(sumPrice)/*6.46*/ {_display_(Seq[Any](format.raw/*6.48*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>


    <div class="login-form">
        <div class="main-div">
            <div class="panel">
                <h2>Elfelejtett jelszó</h2>
                <p>Add meg az email címed</p>
                """),_display_(/*15.18*/if(flash.containsKey("danger"))/*15.49*/{_display_(Seq[Any](format.raw/*15.50*/("""
                    """),format.raw/*16.21*/("""<div class="alert alert-danger">
                        """),_display_(/*17.26*/flash()/*17.33*/.get("danger")),format.raw/*17.47*/("""
                        """),format.raw/*18.25*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                    </div>
                """)))}),format.raw/*20.18*/("""
            """),format.raw/*21.13*/("""</div>

            """),_display_(/*23.14*/form(action=routes.UserController.askResetPasswordPost())/*23.71*/ {_display_(Seq[Any](format.raw/*23.73*/("""
                """),_display_(/*24.18*/CSRF/*24.22*/.formField),format.raw/*24.32*/("""
                """),_display_(/*25.18*/inputText(pwResetForm("email"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Email")),format.raw/*25.145*/("""

                """),format.raw/*27.17*/("""<button type="submit" class="btn btn-primary">dewit</button>
            """)))}),format.raw/*28.14*/("""

        """),format.raw/*30.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(user:User,pwResetForm:Form[PwReset],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(pwResetForm)(sumPrice)

  def f:((User) => (Form[PwReset]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (pwResetForm) => (sumPrice) => apply(user)(pwResetForm)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/ask_reset_password_old.scala.html
                  HASH: 1756aa3a19d954c006115f86a4cbc816f1c38653
                  MATRIX: 655->1|1038->45|1171->108|1216->105|1244->125|1274->130|1310->158|1324->164|1342->174|1381->176|1413->182|1684->426|1724->457|1763->458|1813->480|1899->539|1915->546|1950->560|2004->586|2194->745|2236->759|2286->782|2352->839|2392->841|2438->860|2451->864|2482->874|2528->893|2677->1020|2725->1040|2831->1115|2870->1127
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|39->7|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|52->20|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|59->27|60->28|62->30
                  -- GENERATED --
              */
          