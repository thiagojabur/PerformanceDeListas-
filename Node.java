package comparacaoListasEncadeadas;

public class Node {
	protected String element;
	protected Node next;

	public Node(String element, Node next) {
		this.element = element;
		this.next = next;
	}

	public Node(String element) {
		this.element = element;
		this.next = null;
	}
	
	public String getElement() {
		return this.element;
	}

	public Node getNext() {
		return next;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}