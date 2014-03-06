public class Queue<T> {

	private LinkedList<T> list;
	
	public Queue() {
		list = new LinkedList<T>();
	}
	public void push(T obj) {
		list.insertLast(obj);
	}
	public T pop() throws EmptyListException, ObjectNotFoundException{
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
