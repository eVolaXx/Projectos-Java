import javax.lang.model.element.Element;


public class LinkedList<T> {
	private Element<T> first;
	private Element<T> last;
	 
	
	public LinkedList() {
		
		
		
	}
	public void insertFirst(T Object) {
		Element<T> element = new Element<T>(Object);
		element.setNext(first);
		first=element;
		if (last==null) {
			last=element;
		}
	}

		
		
	
	
	public void insertLast(T Object) {
		Element<T> element=  new Element<T> (Object);
		element.setNext(last);
		last=element;
		if (first==null) {
			first=element;
		}
	}
	
		
		
	
	public void print() {
		Element<T> element = first;
		while (element!=null) {
			System.out.println(element.getObject());
			element=element.getNext();
			
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
		Element<T> element= first;
		Element<T> previous = null;
		while ((element!=null) && (element.getObject()!=obj)) {
			previous=element;
			element=element.getNext();
		if (element==null) {
			throw new ObjectNotFoundException();
		}
		if (first==last) {
			first = null;
			last = null;
		} else {
			if (first==element) {
				first = element.getNext();
			}
			if(last==element) {
				last=element.getNext();
			}
		}
			
			
		}
		if (element==null) {
			throw new ObjectNotFoundException();
		}  /// If I am here is because I have found the object
		previous.setNext(element.getNext());
		
		if(element.getNext()==null)
		last=previous;
		element.delete();
		
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
		Element<T> e= first;
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
		Element<T> e = first;
		 int cont = 0;
		while (e!=null) {
			e=e.getNext();
			cont++;
			
		}
		return cont;
		
			
		
	}
	
	

}
