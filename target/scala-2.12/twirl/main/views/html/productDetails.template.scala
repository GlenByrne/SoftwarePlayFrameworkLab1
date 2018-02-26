
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

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,List[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, products: List[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.96*/("""

"""),_display_(/*3.2*/main("Product Details",user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""

  """),format.raw/*5.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*7.8*/if(flash.containsKey("success"))/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
          """),_display_(/*9.12*/flash/*9.17*/.get("success")),format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""</div>
      """)))}),format.raw/*11.8*/("""
      """),format.raw/*12.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*26.10*/for(p<-products) yield /*26.26*/ {_display_(Seq[Any](format.raw/*26.28*/("""
            """),_display_(/*27.14*/if(p.getId()==id)/*27.31*/{_display_(Seq[Any](format.raw/*27.32*/("""
          """),format.raw/*28.11*/("""<tr>
            """),_display_(/*29.14*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*29.102*/ {_display_(Seq[Any](format.raw/*29.104*/("""
              """),format.raw/*30.15*/("""<td><img src="/assets/images/productImages/largeImages/"""),_display_(/*30.71*/(p.getId)),format.raw/*30.80*/(""".jpg")></td>
            """)))}/*31.15*/else/*31.20*/{_display_(Seq[Any](format.raw/*31.21*/("""
              """),format.raw/*32.15*/("""<td><img src="/assets/images/productImages/thumbnails/house.jpg"></td>
            """)))}),format.raw/*33.14*/("""
            """),format.raw/*34.13*/("""<td class="numeric">"""),_display_(/*34.34*/p/*34.35*/.getId),format.raw/*34.41*/("""</td>
            <td>"""),_display_(/*35.18*/p/*35.19*/.getName),format.raw/*35.27*/("""</td>
            <td>"""),_display_(/*36.18*/p/*36.19*/.getCategory.getName),format.raw/*36.39*/("""</td>        
            <td>"""),_display_(/*37.18*/p/*37.19*/.getDescription),format.raw/*37.34*/("""</td>
            <td  class="numeric">"""),_display_(/*38.35*/p/*38.36*/.getStock),format.raw/*38.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*39.37*/("%.2f".format(p.getPrice))),format.raw/*39.64*/("""</td>
            <td>
              <a href=""""),_display_(/*41.25*/routes/*41.31*/.HomeController.updateProduct(p.getId)),format.raw/*41.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*45.25*/routes/*45.31*/.HomeController.deleteProduct(p.getId)),format.raw/*45.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*50.10*/("""
        """)))}),format.raw/*51.10*/("""
      """),format.raw/*52.7*/("""</tbody>
    </table>
  </div>
      
  </div>
</div>
""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(id:Long,products:List[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(id,products,user,env)

  def f:((Long,List[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (id,products,user,env) => apply(id,products,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 13:44:08 GMT 2018
                  SOURCE: /home/wdd/webapps/playapps/SoftwarePlayFrameworkLab1/app/views/productDetails.scala.html
                  HASH: 3db4674ed3b6fe60e75cac6b213f14fcfe02cc5d
                  MATRIX: 1015->1|1204->95|1232->98|1268->126|1307->128|1337->132|1462->232|1502->264|1541->266|1576->275|1647->320|1660->325|1695->340|1731->349|1775->363|1809->370|2128->662|2160->678|2200->680|2241->694|2267->711|2306->712|2345->723|2390->741|2488->829|2529->831|2572->846|2655->902|2685->911|2730->938|2743->943|2782->944|2825->959|2940->1043|2981->1056|3029->1077|3039->1078|3066->1084|3116->1107|3126->1108|3155->1116|3205->1139|3215->1140|3256->1160|3314->1191|3324->1192|3360->1207|3427->1247|3437->1248|3467->1257|3536->1299|3584->1326|3658->1373|3673->1379|3732->1417|3929->1587|3944->1593|4003->1631|4223->1820|4264->1830|4298->1837|4383->1892
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|44->12|58->26|58->26|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|73->41|73->41|73->41|77->45|77->45|77->45|82->50|83->51|84->52|90->58
                  -- GENERATED --
              */
          