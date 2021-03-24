package comparacaoListasEncadeadas;

public class ListaSimplesmenteEncadeada {
	protected Node head = null;
	protected Node tail = null;
	protected int size = 0;

	public void addFirst(Node newHead) {
		if (size == 0) {
			tail = head = newHead;
		} else {
			newHead.setNext(head);
			if (size == 1)
				tail = head;

			head = newHead;
		}
		size++;
	}

	public void addLast(Node newTail) {

		if (size == 0) {
			tail = head = newTail; 
		} 
		else {
			tail.setNext(newTail);
			tail = newTail;
		}
		size += 1;
	}

	public Node getFirst() {
		return head;
	}

	public Node getLast() {
		return tail;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public String toString() {
		Node atual = head;
		String retorno = "";
		while (atual != null) {
			retorno += atual.getElement() + " ";
			atual = atual.getNext();
		}
		return retorno;
	}

	public Node removeFromFront() throws EmptyListException {
		Node nodeRemovido = head;
		if (isEmpty()) {
			throw new EmptyListException("Objeto");
		}
		if (size == 1) {
			head = tail = null;
		} else {
			head = head.getNext();
			nodeRemovido.setNext(null);
		}
		size--;
		return nodeRemovido;
	}

	public Node removeFromBack() throws EmptyListException {
		Node nodeRemovido = head;
		if (isEmpty()) {
			throw new EmptyListException("Objeto");
		}
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			// tem que percorrer a lista
			Node atual = getFirst();

			while (atual.getNext() != tail)
				atual = atual.getNext();

			nodeRemovido = tail;

			tail = atual;
			atual.setNext(null);

		}
		size--;
		return nodeRemovido;
	}
}