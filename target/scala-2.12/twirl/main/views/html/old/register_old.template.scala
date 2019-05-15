
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


Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*3.1*/("""

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
                  DATE: Thu Dec 06 19:23:21 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/old/register_old.scala.html
                  HASH: b6e195e823ea70559ccadc14553170d3fa375060
                  MATRIX: 976->1|1103->58|1148->55|1176->75|1206->80|1236->102|1250->108|1268->118|1307->120|1339->126|1599->359|1639->390|1678->391|1724->409|1806->464|1822->471|1857->485|1907->507|2089->658|2131->672|2181->695|2231->736|2271->738|2317->757|2330->761|2361->771|2407->790|2565->926|2611->945|2757->1069|2803->1088|2957->1220|3005->1240|3111->1315|3150->1327
                  LINES: 28->1|31->2|34->1|35->3|37->5|37->5|37->5|37->5|37->5|38->6|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|51->19|52->20|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|57->25|57->25|58->26|58->26|60->28|61->29|63->31
                  -- GENERATED --
              */
          