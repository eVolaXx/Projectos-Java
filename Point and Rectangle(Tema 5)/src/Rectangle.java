
public class Rectangle {
	public int width = 5;
	public int height = 3;
	public Point origin;

}

// 4 contructores

   public Rectangle() {
	origin = new Point(0,0);
   }
   public Rectangle(Point p) {
	origin = p;
   }
   public Rectangle(int w, int h){
	   origin = new Point(0,0);
	   width = w;
	   height = h;
   }
   public Rectangle(Point p, int w, int h) {
	   origin = p;
	   width = w;
	   height= h;
   }
   
   // el metodo para mover el rectangulo
   public void move(int x, int y){
	   origin.x = x;
	   origin.y =y;
   }
   // metodo para calcular el area
   public void getArea(){
	   return width * heigth;
   }

