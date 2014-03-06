
public class Element<E>  {
	
	private E object;
	private Element<E> next;
	
	public Element(E newobj) {
		object=newobj;
		next=null;
	}
	public void setNext(Element<E> element) {
		next=element;
	}
	public  Element<E> getNext(){
		return next;
	}
	public E getObject() {
		return object;
	}
	public void setObject(E newobject){
		object =newobject;
	}
	public void delete(){
		object=null;
		next=null;
	}
		
		
		
	}


