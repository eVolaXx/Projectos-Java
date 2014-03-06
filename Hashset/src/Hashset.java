import java.util.HashSet;
public class Hashset {
	
	

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<String>();
		obj.add(new String("Hola"));
		obj.add(new String("Persona"));
		obj.add(new String("Casa"));
		obj.add(new String("Telefono"));
		
		for(Object a : obj ){
			System.out.println(a);
		}
		
		
		HashSet<Integer> increment = new HashSet<Integer>();
		
		increment.add(1);
		increment.add(3);
		increment.add(5);
		increment.add(7);
		increment.add(9);
		increment.add(11);
		
		System.out.println(increment);
		
		
		

	}
	    

}
