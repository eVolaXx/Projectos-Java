
public class MainPolynomial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] coef = {};
		/* Polynomial p1 = new Polynomial(2.0,3.0,4.0);
		Polynomial p2 = new Polynomial(2.0,3.0,4.0,5.0);
		Polynomial p3 = p2.add2(p1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3); */
		Polynomial p1 = new Polynomial(2.0,4.0,2.0,3.0);
		Polynomial p2 = new Polynomial(1.0,2.0,3.0);
		Polynomial p3 = p1.multiply(p2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);	
	}
}
