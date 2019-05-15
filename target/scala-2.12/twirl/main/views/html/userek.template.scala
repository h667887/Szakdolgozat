
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

object userek extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,util.List[User],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User)(userList: util.List[User])(sumPrice: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Userek")/*6.18*/(user)/*6.24*/(sumPrice)/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<h1 align="center">Pizza Papa</h1>

    """),_display_(/*9.6*/for(us <- userList) yield /*9.25*/{_display_(Seq[Any](format.raw/*9.26*/("""
        """),format.raw/*10.9*/("""<div class="egy-user">
            <p>"""),_display_(/*11.17*/us/*11.19*/.username),format.raw/*11.28*/("""</p>
            <p>"""),_display_(/*12.17*/us/*12.19*/.email),format.raw/*12.25*/("""</p>
            <p>"""),_display_(/*13.17*/us/*13.19*/.password),format.raw/*13.28*/("""</p>

        </div>
    """)))}),format.raw/*16.6*/("""



""")))}))
      }
    }
  }

  def render(user:User,userList:util.List[User],sumPrice:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user)(userList)(sumPrice)

  def f:((User) => (util.List[User]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (user) => (userList) => (sumPrice) => apply(user)(userList)(sumPrice)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 13:56:37 CEST 2019
                  SOURCE: C:/Users/Flash/Documents/GitHub/Szakdolgozat/app/views/userek.scala.html
                  HASH: 704bd5a75774c6e4f44a413120d7c0a717edec15
                  MATRIX: 651->1|995->19|1126->79|1170->95|1198->98|1222->114|1236->120|1254->130|1293->132|1324->137|1390->178|1424->197|1462->198|1498->207|1564->246|1575->248|1605->257|1653->278|1664->280|1691->286|1739->307|1750->309|1780->318|1836->344
                  LINES: 24->1|29->2|32->3|35->4|37->6|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|47->16
                  -- GENERATED --
              */
          