
public class Segment {
	private Point startPoint, endPoint;
	Segment() {
		startPoint=new Point();
		endPoint = new Point();
	}
	Segment(Point p1, Point p2) {
		startPoint=p1;
		endPoint=p2;
	}
	public double module() {
		int cat1=endPoint.getX()-startPoint.getX();
		int cat2=endPoint.getY()-startPoint.getY();
		double hip = Math.sqrt(cat1*cat1+cat2*cat2);
		return hip;
	}
	public String toString() {
		return startPoint.toString()+" - "+endPoint.toString();
	}
	public void setOffset(int offX, int offY) {
		startPoint.setOffset(offX, offY);
		endPoint.setOffset(offX, offY);
	}
	public void setStartPoint(Point newPoint) {
		startPoint = newPoint;
	}
	public void setEndtPoint(Point newPoint) {
		endPoint = newPoint;
	}
	public Point getStartPoint(){
		return startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
}
