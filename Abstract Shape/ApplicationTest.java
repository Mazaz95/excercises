import java.math.BigDecimal;
import java.math.RoundingMode;
public class ApplicationTest{
	
	public static void main(String[]args){
		Rectangle rectangle=new Rectangle(5,10,"rosa",false);
		double expectedArea=50;
		String s=String.format("The expectedArea is: %s ,the gotArea is: %s and the result is: %b ",expectedArea,rectangle.getArea(),expectedArea==rectangle.getArea());
		System.out.println(s);
		double expectedPerimeter=100;
		String ss=String.format("Expected Perimeter is: %s ,the got Perimeter is : %s,and the reult is: %b ",expectedPerimeter,rectangle.getPerimeter(),expectedPerimeter==rectangle.getPerimeter());
		System.out.println(ss);
		System.out.println(rectangle.toString());
		System.out.println("-------------------------------------------------------------------------");
		
		Square square=new Square(5,null,null);
		double expectArea=25;
		String f=String.format("The expectedArea is: %s , the gotArea is: %s and the result is:%b ",expectArea,square.getArea(),expectArea==square.getArea());
		System.out.println(f);
		double expectPerimeter=20;
		String ff=String.format("The expectedPerimeter is: %s, the gotPerimeter is: %s and the result is: %b",expectPerimeter,square.getPerimeter(),expectPerimeter==square.getPerimeter());
		System.out.println(ff);
		System.out.println(square.toString());
		System.out.println("-------------------------------------------------------------------------");
		
		Circle circle=new Circle(null,null,6);
		double resultedArea=BigDecimal.valueOf(113.097).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resultArea=BigDecimal.valueOf(circle.getArea()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		String d=String.format("The expectedArea is: %s,the gotArea is: %s and the result is: %b",resultedArea,resultArea,resultedArea==resultArea);
		System.out.println(d);
		double resultedPerimeter=BigDecimal.valueOf(226.1946710585).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double resultPerimeter=BigDecimal.valueOf(circle.getPerimeter()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		String dd=String.format("The expectedPerimeter is: %s,the gotPerimeter is: %s and the result is: %b",resultedPerimeter,resultPerimeter,resultedPerimeter==resultPerimeter);
		System.out.println(dd);
		System.out.println(circle.toString());
		System.out.println("-------------------------------------------------------------------------------");
		
		Cylinder cylinder=new Cylinder("blue",true,5,9);
		double resArea=BigDecimal.valueOf(439.822971).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double expecArea=BigDecimal.valueOf(cylinder.getArea()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		String j=String.format("The expectedArea is: %s, the gotArea is: %s and the result is : %b",resArea,expecArea,resArea==expecArea);
		System.out.println(j);
		double resPerimeter=BigDecimal.valueOf(706.858).setScale(3,RoundingMode.HALF_UP).doubleValue();
		double expecPerimeter=BigDecimal.valueOf(cylinder.getPerimeter()).setScale(3,RoundingMode.HALF_UP).doubleValue();
		String jj=String.format("The expectedPerimeter is: %s, the gotPerimeter is: %s and the result is: %b ",resPerimeter,expecPerimeter,resPerimeter==expecPerimeter);
		System.out.println(jj);
		System.out.println(cylinder.toString());
	}
}
		