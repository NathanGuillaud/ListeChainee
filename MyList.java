
import javax.print.attribute.standard.PrinterLocation;

public class MyList {
	
	private Element head;

	public MyList() {
		this.head = null;
	}

	public Element getHead() {
		return head;
	}

	public void setHead(Element head) {
		this.head = head;
	}
	
	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public String toString() {
		if(!this.isEmpty()){
			StringBuffer affichageListe = new StringBuffer();
			Element courant = head;
			while(courant != null) {
				affichageListe.append("-> " + courant.toString() + " ");
				courant = courant.getNext();
			}
			return affichageListe.toString();
		}else{
			return "Vide";
		}
	}
	
	public void addFirst(Element e) {
		e.setNext(head);
		head = e;
	}
	
	public Element removeFirst() {
		if(!this.isEmpty()){
			Element removeElement = head;
			head = head.getNext();
			removeElement.setNext(null);
			return removeElement;
		}else{
			return null;
		}
	}
	
	public void addLast(Element e) {
		if(!this.isEmpty()){
			Element courant = head;
			while(courant.getNext() != null){
				courant = courant.getNext();
			}
			courant.setNext(e);
		}else{
			head = e;
		}
	}
	
	public Element removeLast() {
		if(this.isEmpty()){
			return null;
		}else if(head.getNext() == null){
			Element removeElement = head;
			head.setKey(null);
			return removeElement;
		}else{
			Element courant = head;
			while(courant.getNext().getNext() != null){
				courant = courant.getNext();
			}
			Element removeElement = courant.getNext();
			courant.setNext(null);
			return removeElement;
		}
	}
	
	public Element findKey(int key) {
		if(!this.isEmpty()){
			Element courant = head;
			boolean trouve = false;
			while(courant.getNext() != null && !trouve){
				if(courant.getKey() == key) {
					trouve = true;
				}
				courant.getNext();
			}
			if(trouve){
				return courant;
			}else{
				return null;
			}
		}else{
			return null;
		}
	}

}
