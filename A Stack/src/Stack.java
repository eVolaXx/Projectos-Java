
public class Stack {
	private LinkedList list;
	
	public Stack() {
		list= new LinkedList();
	}

	
	public void push(Object ob) {
		list.insertFirst(ob);
		
		
		
	
	

	}
	
	public Object pop() throws ObjectNotFoundException, EmptyListException {
		Object obj = list.getFirstObject();
	    list.remove(obj);
	    return obj;
	    
		
		
	}
	public boolean isEmpty(){
		 return list.isEmpty();
		
		
	}
	
	public void empty(){
		list= new LinkedList();
		
		
	}
	public void print() {
		list.print();
		
	}
}



