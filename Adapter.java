package Adapter_Lab;


public class Adapter implements Stack, Queue{

	private Adaptee adaptee;
	@Override
	public void add(String str) {
		adaptee.add(str);	
	}

	@Override
	public String remove() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public void push(String str) {
		adaptee.add(str);
	}

	@Override
	public String pop(){
		return remove();
	}

	@Override
	public boolean isEmpty() {
		
		return adaptee.empty();
	}
	
}
