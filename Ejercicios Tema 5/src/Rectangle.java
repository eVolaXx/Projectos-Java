
public class Rectangle extends Point {
	private int width,height;
	Rectangle() {
		super();
		width=0;
		height=0;
	}
	Rectangle(Point p, int newWidth, int newHeight) {
		super(p.getX(),p.getY());
		width=newWidth;
		height=newHeight;
	}
	Rectangle(Point bott, Point top) {
		super(bott.getX(), bott.getY());
		width = top.getX()-bott.getX();
		height = top.getY()-bott.getY();
	}
	Rectangle(Segment s) {
		//super();
		Point p1, p2;
		p1=s.getStartPoint();
		p2=s.getEndPoint();
		int minX, minY;
		minX=p1.getX();
		if (minX>p2.getX())
			minX=p2.getX();
		minY=p1.getY();
		if (minY>p2.getY())
			minY=p2.getY();
		moveTo(minX,minY);
		width = Math.abs(p1.getX()-p2.getX());
		height = Math.abs(p1.getY()-p2.getY());
	}
	
	public String toString() {
		return super.toString()+ " Width: "+width+ "  Height: "+height;
		//return "("+getX()+" , "+getY()+")"+" Width: "+width+ "  Height: "+height;
		//return "("+x+ " , "+y+")"
	}
	
	public int getArea() {
		return width*height;
	}
	public Point getPoint() {
		Point p = new Point(getX(),getY());
		return p;
	}
	public Point getTopLeftPoint() {
		Point p = new Point(getX(),getY()+height);
		return p;
	}
	public Point getTopRightPoint() {
		//Point p = new Point(getX()+width, getY()+height);
		Point p = new Point(getX(),getY());
		p.setOffset(width, height);
		return p;
	}
	public Point getBottomLeftPoint() {
		return getPoint();
	}
	public Point getBottomRightPoint() {
		Point p = new Point(getX()+width,getY());
		return p;
	}
}
