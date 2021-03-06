import java.math.BigDecimal;
import java.math.RoundingMode;
public class ApplicationTest{
	
	/**
	 *this is main method, in this method there are new objekten from the classes "Circle","Square",
	 * "Cylinder" and "Rectangle"
     */
	 public static void main(String[]arg){
		Circle circle=new Circle(7.5,"red",true);
		double expectedArea = BigDecimal.valueOf(176.715).setScale(3, RoundingMode.HALF_UP).doubleValue();
		double resultedArea = BigDecimal.valueOf(circle.getArea()).setScale(3, RoundingMode.HALF_UP).doubleValue();
		String areaResult = String.format("Expected area is %s, and got the value %s, and the result is %s", expectedArea, resultedArea, expectedArea == resultedArea);
		System.out.println(circle.getPerimeter());
		
		System.out.println();
		
		Circle kreis=new Circle(5.3);
		System.out.println(kreis.getArea());
		System.out.println(kreis.getPerimeter());
		System.out.println(kreis.toString());
		System.out.println();
		
		
		
		Square quadrat=new Square(null,false,6);
		System.out.println(quadrat.area());
		System.out.println(quadrat.perimeter());
		System.out.println(quadrat.toString());
		System.out.println();
		
		Cylinder cylinder=new Cylinder(10,12);
		System.out.println(cylinder.getArea());
		System.out.println(cylinder.getFaceArea());
		System.out.println(cylinder.getPerimeter());
		System.out.println(cylinder.toString());
		System.out.println();
		
		Cylinder platte=new Cylinder(20,25,"pink",true);
		System.out.println(platte.getArea());
		System.out.println(platte.getFaceArea());
		System.out.println(platte.getPerimeter());
		System.out.println(platte.toString());
		System.out.println();
		
		
		Rectangle rectangle=new Rectangle(15,25);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		System.out.println(rectangle.toString());
		System.out.println();
		
		Rectangle rechteckig=new Rectangle(10,15,"blue",false);
		System.out.println(rechteckig.getArea());
		System.out.println(rechteckig.getPerimeter());
		System.out.println(rechteckig.toString());
		System.out.println();
		
		
		
	}
}
		