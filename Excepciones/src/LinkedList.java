
public class LinkedList {
	private Element first;
	private Element last;
	 
	
	public LinkedList() {
		
		
		
	}
	public void insertFirst(Object obj) {
		Element e = new Element(obj);
		e.setNext(first);
		first=e;
		if (last==null) {
			last=e;
		}
	}

		
		
	
	
	public void insertLast(Object obj) {
		Element e= new Element(obj);
		e.setNext(last);
		last=e;
		if (first==null) {
			first=e;
		}
	}
	
		
		
	
	public void print() {
		Element e = first;
		while (e!=null) {
			System.out.println(e.getObject());
			e=e.getNext();
			
		}
	}
	public boolean isEmpty() {
	 if(first==null)
		 return  true;
	 else return false;
	}
	public void remove(Object obj) throws ObjectNotFoundException, EmptyListException{
		if(isEmpty()) {
			throw new EmptyListException();
		}
		Element e= first;
		Element previous = null;
		while (e.getObject()!=obj) && (e!=null) {
			previous=e;
			e=e.getNext();
			
			
		}
		if (e==null) {
			throw new ObjectNotFoundException();
		}  /// If I am here is because I have found the object
		previous.setNext(e.getNext());
		
		if(e.getNext()==null)
		last=previous;
		e.delete();
		
	    }
	public Object getFirstObject() throws EmptyListException{
		if(isEmpty()) {
			throw new EmptyListException();
		}
		return first.getObject();
	
	}
	public Object getLastObject() throws EmptyListException{
		if(isEmpty()) {
			throw new EmptyListException();
		}
		return last.getObject();
	}
	public Object getObjectAtPosition(int pos) throws EmptyListException, InvalidIndexException{
		Element e= first;
		int cont=1;
		while  (cont<pos) {
			if (e==null) {
				throw new InvalidIndexException();
				
			}
			cont++;
			e=e.getNext();   // cont == pos
		}
		return e.getObject();
		
	}
	public int getNumElements() {
		Element e = first;
		 int cont = 0;
		while (e!=null) {
			e=e.getNext();
			cont++;
			
		}
		
			
		
	}
	
	

}
