
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

object creator extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[User,util.List[Integer],util.List[Ingredient],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(sizes: util.List[Integer])(ingredients: util.List[Ingredient])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Creator")/*6.19*/(user)/*6.25*/(sumPrice)/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""

    """),format.raw/*8.5*/("""<table id="tablepadding">
        <tr><td>  </td></tr>
    </table>

    <table class="keretcreator" valign="top">
        <tr><td height="60"></td></tr><tr><td valign="top">
        <table>
                <tr>
                    <td width="50"></td><td width="90"><div class=" list__item">
                            <input type="radio" class="radio-btn" name="cm" id="a-opt"/>
                            <label for="a-opt" class="label">24 cm</label>
                </div></td><td>
                </tr>
                <tr>
                    <td width="50"><td><div class=" list__item">
                    <input checked="checked" type="radio" class="radio-btn" name="cm" id="b-opt"/>
                    <label for="b-opt" class="label">32 cm</label>
                </div></td>
                </tr>
                <tr>
                    <td width="50"><td><div class=" list__item">
                    <input type="radio" class="radio-btn" name="cm" id="c-opt"/>
                    <label for="c-opt" class="label">51 cm</label>
                </div></td>
                </tr>
        </table>
        </td>

        <td  valign="top">
        <table>
            <tr>
                <td width="10"></td><td width="150"><div class=" list__item">
            <input type="radio" class="radio-btn" name="sauce" id="f-opt"/>
            <label for="f-opt" class="label">Pizza sauce</label>
        </div></td>
            </tr>
            <tr>
                <td width="10"><td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="h-opt"/>
                <label for="h-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
            <tr>
                <td width="10"><td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="g-opt"/>
                <label for="g-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
            <tr>
                <td width="10"><td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="j-opt"/>
                <label for="j-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
            <tr>
                <td width="10"><td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="k-opt"/>
                <label for="k-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
            <tr>
                <td width="10"> <td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="l-opt"/>
                <label for="l-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
            <tr>
                <td width="10"><td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="m-opt"/>
                <label for="m-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
            <tr>
                <td width="10"><td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="n-opt"/>
                <label for="n-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
            <tr>
                <td width="10"><td width="150"><div class=" list__item">
                <input type="radio" class="radio-btn" name="sauce" id="v-opt"/>
                <label for="v-opt" class="label">Pizza sauce</label>
            </div></td>
            </tr>
        </table>
        </td>

        <td  valign="top">
            <table>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                <td></td><td valign="bottom"><div class="kosarfontseged">
                <label class="checktext" for="">
                    <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                </tr>
                <tr><td colspan="10" height="20"></td></tr>
                <tr>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>
                    <td></td><td valign="bottom"><div class="kosarfontseged">
                    <label class="checktext" for="">
                        <input type="checkbox"  id="" class="option-input checkbox"/> CHECKBOX
                    </label></div></td><td></td>

                </tr>


            </table>
        </td>


    <td valign="top" width="450">

        <table class="" valign="center">
            <tr><td><img src=""""),_display_(/*268.32*/routes/*268.38*/.Assets.versioned("images/alapanyag/BASE.png")),format.raw/*268.84*/("""" height="420" width="420"/></td></tr>

        </table>

    </td></tr>

        <tr><td></td><td></td><td colspan="2">
            <table align="left">
                <tr><td><button type="button" class="btn btn-warning bttne">Add to Cart</button></td><td></td> <td width="300"></td> <td><button type="button" class="btn btn-warning bttne">Reset</button></td><td width="100"></td></tr>
            </table>
        </td></tr>

        <tr><td height="50"></td></tr>

</table>



    <table height="200"></table>

""")))}))
      }
    }
  }

  def render(user:User,sizes:util.List[Integer],ingredients:util.List[Ingredient],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(sizes)(ingredients)(sumPrice)

  def f:((User) => (util.List[Integer]) => (util.List[Ingredient]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (sizes) => (ingredients) => (sumPrice) => apply(user)(sizes)(ingredients)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/creator.scala.html
                  HASH: 65c00c42ec2316f8a4af1cdb90873e844ccbaa64
                  MATRIX: 651->1|1021->19|1188->115|1232->131|1260->134|1285->151|1299->157|1317->167|1356->169|1388->175|15254->14013|15270->14019|15338->14065
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|39->8|299->268|299->268|299->268
                  -- GENERATED --
              */
          