package comparacaoListasEncadeadas;

public class ListaDuplamenteEncadeada {
	protected DNode head = null;
	protected DNode tail = null;
	protected int size=0;

	public void addFirst(DNode newHead) {
		if (size == 0) {
			tail = head = newHead;			
		} else {
			newHead.setNext(head);
			if (size == 1)
				tail = head;
			
				head.setPrev(newHead);
				head = newHead;			
		}
		size++;
	}
	
	public void addLast(DNode newTail) {		
		if (size == 0) {
			tail = head = newTail;			
		} else {
			tail.setNext(newTail);
			newTail.setPrev(tail);
			tail = newTail;
		}
		size++;
	}

	public DNode getFirst() {
		return head;
	}
	
	public DNode getLast() {
		return tail;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public String toString() {
		DNode atual = head;
		String retorno = "";
		while (atual != null) {
			retorno += atual.getElement() + " ";
			atual = atual.getNext();
		}
		return retorno;
	}

	public DNode removeFromFront() throws EmptyListException {
		DNode nodeRemovido = head;
		if (isEmpty()) {
			throw new EmptyListException("Objeto");
		}
		if (size == 1) {
			head = tail = null;			 
		} else {
			head = head.getNext();
			nodeRemovido.setNext(null);
			head.setPrev(null);
		}
		size--;
		return nodeRemovido;
	}

	public DNode removeFromBack() throws EmptyListException {
		DNode nodeRemovido = head;
		if (isEmpty()) {
			throw new EmptyListException("Objeto");
		}
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			nodeRemovido = tail;
			tail = tail.getPrev();
			tail.setNext(null);
			nodeRemovido.setPrev(null);
		}
		size--;
		return nodeRemovido;
	}
}