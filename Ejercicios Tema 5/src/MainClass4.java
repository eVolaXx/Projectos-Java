
public class MainClass4 {
	public static void main(String[] argv) {
		Rectangle r = new Rectangle();
		System.out.println(r.toString());
		r.moveTo(4, 7);
		System.out.println(r.toString());
		//Rectangle r2 = new Rectangle(new Point(1,1),8,6);
		Point origin = new Point(1,1);
		Rectangle r2 = new Rectangle(origin,8,6);
		System.out.println(r2);
		Rectangle r3 = new Rectangle(new Point(2,2), new Point(5,8));
		System.out.println(r3);
		
		Rectangle r4 = new Rectangle(new Segment(new Point(1,5),new Point(7,1)));
		System.out.println(r4);
		Point p = r4.getPoint();
		System.out.println(p.toString());
		
		Rectangle r5 = new Rectangle(new Point(5,6), 10, 8);
		System.out.println(r5.toString());
		System.out.print("Top-left: "+r5.getTopLeftPoint());
		System.out.print("   Top-right: "+r5.getTopRightPoint());
		System.out.print("   Bottom-left: "+r5.getBottomLeftPoint());
		System.out.println("   Bottom-right: "+r5.getBottomRightPoint());
	}	
}
