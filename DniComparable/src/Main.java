
public class Main {

	public static void main(String[] args) throws NIFException{

		SortedArray<Dni> arr = new SortedArray<Dni>(5);
		arr.put(new Dni(18957690));
		arr.put(new Dni(18932039));
		arr.put(new Dni(18930391));
		arr.put(new Dni(13932039));
		System.out.println(arr);
	}

}
