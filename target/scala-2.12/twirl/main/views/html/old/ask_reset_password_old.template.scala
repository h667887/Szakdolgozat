
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


Seq[Any](format.raw/*4.1*/("""

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
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/ask_reset_password_old.scala.html
                  HASH: 0a7f5adce2e4f094483dfe59239f64cf237208ae
                  MATRIX: 655->1|1038->44|1171->106|1215->122|1243->125|1279->153|1293->159|1311->169|1350->171|1381->176|1644->412|1684->443|1723->444|1772->465|1857->523|1873->530|1908->544|1961->569|2149->726|2190->739|2238->760|2304->817|2344->819|2389->837|2402->841|2433->851|2478->869|2627->996|2673->1014|2778->1088|2815->1098
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|51->20|52->21|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|58->27|59->28|61->30
                  -- GENERATED --
              */
          