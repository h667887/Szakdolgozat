
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
/*1.2*/import java.util

object creator_old_o extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.33*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Creator")/*6.19*/(user)/*6.25*/(sumPrice)/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""

    """),format.raw/*8.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretcreator" valign="top">
        <tr><td height="60"></td></tr><tr><td valign="top">
        <table>
                <tr>
                    <td width="30" height="50"></td><td width="90"><div class=" list__item">
                            <input type="radio" class="radio-btn" name="cm" id="a-opt"/>
                            <label for="a-opt" class="label">24 cm</label>
                </div></td>
                    <td width="50"></td><td width="150"><div class=" list__item">
                    <input type="radio" class="radio-btn" name="sauce" id="f-opt"/>
                    <label for="f-opt" class="label">Pizza sauce</label>
                </div></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="c">
                        <input type="checkbox"  id="c" class="option-input checkbox"/> Checkbox
                    </label></div></td>
                    <td valign="bottom">
                        <label class="kosarfontseged">
                            <input type="checkbox" class="option-input checkbox"/> Checkbox
                        </label></td>
                    <td valign="bottom">
                        <label class="kosarfontseged">
                            <input type="checkbox" class="option-input checkbox"/> Checkbox
                        </label></td>
                    <td></td><td></td>
                    <td></td><td></td>

                </tr>
                <tr>
                    <td width="30" height="50"></td></td><td><div class=" list__item">
                    <input checked="checked" type="radio" class="radio-btn" name="cm" id="b-opt"/>
                    <label for="b-opt" class="label">32 cm</label>
                </div></td>
                    <td></td><td><div class=" list__item">
                    <input type="radio" class="radio-btn" name="sauce" id="e-opt"/>
                    <label for="e-opt" class="label">Pizza sauce</label>
                </div></td>
                    <td></td><td valign="bottom">
                    <label class="kosarfontseged">
                        <input type="checkbox" class="option-input checkbox" /> Checkbox
                    </label></td>
                    <td valign="bottom">
                        <label class="kosarfontseged">
                            <input type="checkbox" class="option-input checkbox"/> Checkbox
                        </label></td>
                    <td valign="bottom">
                        <label class="kosarfontseged">
                            <input type="checkbox" class="option-input checkbox"/> Checkbox
                        </label></td>
                    <td></td><td></td>
                    <td></td><td></td>

                </tr>
                <tr>
                    <td width="30" height="50"></td></td><td><div class=" list__item">
                    <input type="radio" class="radio-btn" name="cm" id="c-opt"/>
                    <label for="c-opt" class="label">51 cm</label>
                </div></td>
                    <td></td><td><div class=" list__item">
                    <input type="radio" class="radio-btn" name="sauce" id="d-opt"/>
                    <label for="d-opt" class="label">Pizza sauce</label>
                </div></td>
                    <td></td><td valign="bottom">
                    <label class="kosarfontseged">
                        <input type="checkbox" class="option-input checkbox" /> Checkbox
                    </label></td>
                    <td valign="bottom">
                        <label class="kosarfontseged">
                            <input type="checkbox" class="option-input checkbox"/> Checkbox
                        </label></td>
                    <td valign="bottom">
                        <label class="kosarfontseged">
                            <input type="checkbox" class="option-input checkbox"/> Checkbox
                        </label></td>
                    <td></td><td></td>
                    <td></td><td></td>

                </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="h-opt"/>
            <label for="h-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="k-opt"/>
            <label for="k-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="l-opt"/>
            <label for="l-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="m-opt"/>
            <label for="m-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="n-opt"/>
            <label for="n-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="v-opt"/>
            <label for="v-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="w-opt"/>
            <label for="w-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="s-opt"/>
            <label for="s-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>
        <tr>
            <td width="30" height="50"></td></td><td></td>
            <td></td><td><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="j-opt"/>
            <label for="j-opt" class="label">Pizza sauce</label>
        </div></td>
            <td></td><td  valign="bottom">
            <label class="kosarfontseged">
                <input type="checkbox" class="option-input checkbox" /> Checkbox
            </label></td>
            <td valign="bottom">
                <label class="kosarfontseged">
                    <input type="checkbox" class="option-input checkbox"/> Checkbox
                </label></td>
            <td></td><td></td>
            <td></td><td></td>
            <td></td><td></td>

        </tr>

    </table>
        </td>

    <td valign="top">

        <table class="" valign="center">
            <tr><td><img src=""""),_display_(/*289.32*/routes/*289.38*/.Assets.versioned("images/alapanyag/BASE.png")),format.raw/*289.84*/("""" height="420" width="420"/></td></tr>

        </table>

    </td></tr>

        <tr><td align="center" colspan="2">
            <table align="center">
                <tr><td></td> <td><button type="button" class="btn btn-warning bttne">Add to Cart</button></td> <td width="400"></td> <td><button type="button" class="btn btn-warning bttne">Reset</button></td></tr>
            </table>
        </td></tr>

        <tr><td height="50"></td></tr>

</table>



    <table height="200"></table>
""")))}))
      }
    }
  }

  def render(user:User,sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(sumPrice)

  def f:((User) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sumPrice) => apply(user)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 06 19:23:20 CET 2018
                  SOURCE: C:/Users/Flash/Desktop/git/PizzaPapa/4-prototipus 2/pizza-papa/app/views/creator_old_o.scala.html
                  HASH: d9a7060c1947be355bf0582f59acc49f4c6b75ce
                  MATRIX: 651->1|986->20|1090->54|1135->51|1163->71|1193->76|1218->93|1232->99|1250->109|1289->111|1323->119|14113->12881|14129->12887|14197->12933
                  LINES: 24->1|29->2|32->3|35->2|36->4|38->6|38->6|38->6|38->6|38->6|40->8|321->289|321->289|321->289
                  -- GENERATED --
              */
          