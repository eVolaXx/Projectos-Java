import java.util.HashSet;


public class MainMetods {
	
	public static  HashSet<Integer> increment(HashSet<Integer> conjunto) {
		HashSet<Integer> f = new HashSet<Integer>(conjunto);
		for(Integer one : conjunto){
			one = one + 1;
		}
		return conjunto;
		
	}

}
