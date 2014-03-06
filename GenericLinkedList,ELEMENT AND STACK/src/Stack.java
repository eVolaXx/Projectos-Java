
public class Stack<T> {
	private LinkedList<T> list;
	
	public Stack() {
		list = new LinkedList<T>();
	}

	
	public void push(T object) {
		list.insertFirst(object);
		
		
		
	
	

	}
	
	public T Object() throws ObjectNotFoundException, EmptyListException{
		    Object obj = list.getFirstObject();
	        list.remove(obj);
	        return obj;
		 
			
		}
	    
	    
		
		
	
	public boolean isEmpty(){
		 return list.isEmpty();
		
		
	}
	
	public void empty(){
		LinkedList<T>= new LinkedList<T>();
		
		
	}
	public void print() {
		list.print();
		
	}
}



