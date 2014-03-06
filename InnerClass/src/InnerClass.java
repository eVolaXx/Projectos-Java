
public class InnerClass {
	class ClasA{
		class B{
			public void print(){
				System.out.println("Hello");
			}
		}
		<S> void doSomething(){
			S s = new S();
			s.print();
		}
			
		
	}
		
	class ClasC{
		void doSomething(){
			A a = new A();
			a.print();
		}
	}
	class ClasR{
		public void print(){
			System.out.println("Hola de nuevo");
			
		
	}
		
	

	
		
		
			
		
		
		


	}

}
