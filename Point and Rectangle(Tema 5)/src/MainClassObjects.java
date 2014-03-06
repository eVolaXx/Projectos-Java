
public class MainClassObjects {

	public static void main(String[] args) {
		Point originOne = new Point(23,94);
		Rectangle rectOne = new Rectangle(originOne, 100, 200);
		Rectangle rectDos = new Rectangle(40, 100);
		
		//Mostramos en pantalla los datos rectOne´s width, height and Area
		
		System.out.println("Width de rectOne: "+ rectOne.width);
		System.out.println("Height de rectOne: " + rectOne.height);
		System.out.println("Area de rectOne: "+ rectOne.getArea());
		
		
		
		
		
		

	}

}
