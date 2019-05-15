
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

object register_old extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Form[User],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(userForm : Form[User])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/layout("Regisztráció")/*5.24*/(user)/*5.30*/(sumPrice)/*5.40*/ {_display_(Seq[Any](format.raw/*5.42*/("""
    """),format.raw/*6.5*/("""<h1 align="center">Pizza Papa</h1>


    <div class="login-form">
        <div class="main-div">
            <div class="panel">
                <h2>Regisztráció</h2>
                <p>Írd be adataid, dilóm</p>
            """),_display_(/*14.14*/if(flash.containsKey("danger"))/*14.45*/{_display_(Seq[Any](format.raw/*14.46*/("""
                """),format.raw/*15.17*/("""<div class="alert alert-danger">
                    """),_display_(/*16.22*/flash()/*16.29*/.get("danger")),format.raw/*16.43*/("""
                    """),format.raw/*17.21*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                </div>
            """)))}),format.raw/*19.14*/("""
            """),format.raw/*20.13*/("""</div>

            """),_display_(/*22.14*/form(action=routes.UserController.save())/*22.55*/ {_display_(Seq[Any](format.raw/*22.57*/("""
                """),_display_(/*23.18*/CSRF/*23.22*/.formField),format.raw/*23.32*/("""
                """),_display_(/*24.18*/inputText(userForm("username"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Felhasználónév")),format.raw/*24.154*/("""
                """),_display_(/*25.18*/inputText(userForm("email"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Email")),format.raw/*25.142*/("""
                """),_display_(/*26.18*/inputPassword(userForm("password"), 'class -> "form-control", '_showConstraints -> false, '_label -> null, 'placeholder -> "Jelszó")),format.raw/*26.150*/("""

                """),format.raw/*28.17*/("""<button type="submit" class="btn btn-primary">dewit</button>
            """)))}),format.raw/*29.14*/("""

        """),format.raw/*31.9*/("""</div>
    </div>

""")))}))
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
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/old/register_old.scala.html
                  HASH: 9068d503cb386c200df58d77f4cedb08f015b019
                  MATRIX: 976->1|1103->57|1147->73|1175->76|1205->98|1219->104|1237->114|1276->116|1307->121|1559->346|1599->377|1638->378|1683->395|1764->449|1780->456|1815->470|1864->491|2044->640|2085->653|2133->674|2183->715|2223->717|2268->735|2281->739|2312->749|2357->767|2515->903|2560->921|2706->1045|2751->1063|2905->1195|2951->1213|3056->1287|3093->1297
                  LINES: 28->1|31->2|34->3|36->5|36->5|36->5|36->5|36->5|37->6|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|50->19|51->20|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|59->28|60->29|62->31
                  -- GENERATED --
              */
          