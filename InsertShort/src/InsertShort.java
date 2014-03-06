//import java.util.*;
public class InsertShort {

	public static void main(String[] args) {
		//char [] matrix = {'d', 'e', 'x', 'w', 'j', 'r', 'u', 'p'};
		//Arrays.sort(matrix);
		//System.out.println(matrix);
		String[] s = {"Victor Alonso", "Carlos Perez", "Pedro Miguel", "Jorge Fuentes", "Cristina Perez"};
		String dancing, temp;
			for (int i=0; i<s.length; i++) {
				dancing=s[i];
				for (int j=i+1; j<s.length; j++) {
					if (s[j].compareTo(dancing)<0) {
						temp=s[j];
						s[j]=dancing;
						dancing=temp;
					}
				}
				s[i]=dancing;
			}
			for (int i=0; i<s.length; i++){
			System.out.println(s[i]);
			}
	}

}
