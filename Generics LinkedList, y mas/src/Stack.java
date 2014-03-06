public class Stack<T> {

	protected LinkedList<T> list;
	
	public Stack() {
		list = new LinkedList<T>();
	}
	public void push(T obj) {
		list.insertFirst(obj);
	}
	public Object pop() throws EmptyListException, ObjectNotFoundException{
		T objectTemp = list.getFirstObject();
		list.remove(objectTemp);
		return objectTemp;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public void empty() {
		list = new LinkedList<T>();
	}
	public void print() {
		list.print();
	}
}
