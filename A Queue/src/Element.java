
public class Element {
	
	private Object object;
	private Element next;
	
	public Element(Object obj) {
		object=obj;
		next=null;
	}
	public void setNext(Element element) {
		next=element;
	}
	public  Element getNext(){
		return next;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object newObject){
		object =newObject;
	}
	public void delete(){
		object=null;
		next=null;
	}
		
		
		
	}


