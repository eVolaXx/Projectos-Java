
public class MainClass3 {
	public static void main(String[] argv) {
		Point p1 = new Point(4,5);
		Point p2 = new Point(6,8);
		Segment s = new Segment(p1,p2);
		//Segment s = new Segment(new Point(4,5), new Point(6,8));
		s.setOffset(4, 4);
		System.out.println(s.toString());
		System.out.println("module: "+s.module());
	}
}
