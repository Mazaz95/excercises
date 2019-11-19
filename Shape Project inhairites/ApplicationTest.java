import java.math.BigDecimal;
import java.math.RoundingMode;
public class ApplicationTest{
	 
	 /**
	  * the main method create new object from the classes(Square,Circle,Rectangle and Cylinder ) and call   the methods from  it's all
	  **/
	public static void main(String[]args){
		Square square=new Square("red",null,5);
		double expectedArea=25.0;
		String result=String.format("Expected Area is: %s ,the got Area is: %s, and the result is :%b ",expectedArea,square.getArea(),expectedArea==square.getArea());
		System.out.println(result);
		System.out.println();
		double expectedPerimeter=20.0;
		String res=String.format("Expected Perimeter is: %s , the got Perimeter is: %s ,and the result is: %b ",expectedPerimeter,square.getPerimeter(),expectedPerimeter==square.getPerimeter());
		System.out.println(res);
		System.out.println();
		System.out.println(square.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		
		Circle circle=new Circle(null,null,6);
		double expectArea=BigDecimal.valueOf(113.097).setScale(3, RoundingMode.HALF_UP).doubleValue();
		double resultArea=BigDecimal.valueOf(circle.getArea()).setScale(3, RoundingMode.HALF_UP).doubleValue();
		String resul=String.format("Expected Area is: %s ,the got Area is: %s,and the result is: %b",expectArea,resultArea,expectArea==resultArea);
		System.out.println(resul);
		System.out.println();
		double expectPerimeter=BigDecimal.valueOf(226.1946710585).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resultPerimeter=BigDecimal.valueOf(circle.getPerimeter()).setScale(3, RoundingMode.HALF_UP).doubleValue();
		String resu=String.format("Expected Perimeter is: %s ,the got Perimeter is: %s ,and the result is: %b ",expectPerimeter,resultPerimeter,expectPerimeter=resultPerimeter);
		System.out.println(resu);
		System.out.println();
		System.out.println(circle.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		
		Rectangle rectangle=new Rectangle("pink",true,10,5);
		double resultedArea=50.0;
		String s=String.format("Expected Area is : %s, the fot Area is: %s , and the result is: %b",resultedArea,rectangle.getArea(),resultedArea==rectangle.getArea());
		System.out.println(s);
		System.out.println();
		double resultedPerimeter=30.0;
		String ss=String.format("Expected Perimeter is: %s ,the got Perimeter is : %s,and the reult is: %b ",resultedPerimeter,rectangle.getPerimeter(),resultedPerimeter==rectangle.getPerimeter());
		System.out.println(ss);
		System.out.println();
		System.out.println(rectangle.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		
		Cylinder cylinder=new Cylinder("green",null,9,5);
		double resulttArea=BigDecimal.valueOf(439.822971).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resArea=BigDecimal.valueOf(cylinder.getArea()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		String f=String.format("Expected Area is : %s, the fot Area is: %s , and the result is: %b",resulttArea,resArea,resulttArea==resArea);
		System.out.println(f);
		System.out.println();
		double expectedFaceArea=BigDecimal.valueOf(78.539816).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resultedFaceArea=BigDecimal.valueOf(cylinder.getFaceArea()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		String m=String.format("Expected Face Area is: %s , the got Face Area is: %s,and the result is: %b ",expectedFaceArea,resultedFaceArea,expectedFaceArea==resultedFaceArea);
		System.out.println(m);
		System.out.println();
		double resulttPerimeter=BigDecimal.valueOf(706.858).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resPerimeter=BigDecimal.valueOf(cylinder.getPerimeter()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		String ff=String.format("Expected Perimeter is: %s ,the got Perimeter is : %s,and the reult is: %b ",resulttPerimeter,resPerimeter,resulttPerimeter==resPerimeter);
		System.out.println(ff);
		System.out.println();
		System.out.println(cylinder.toString());
		System.out.println();
		
	}
}