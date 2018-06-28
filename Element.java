public class Element {

	private Integer key;
	private Element next;

	public Element(Integer key) {
		this.key = key;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
	
	public boolean isEmpty() {
		return key == null;
	}

	@Override
	public String toString() {
		return "(" + getKey() + ")";
	}

}
