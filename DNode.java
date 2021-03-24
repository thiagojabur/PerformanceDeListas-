package comparacaoListasEncadeadas;

public class DNode {
	protected String element;
	protected DNode next=null, prev=null;
    
    public DNode(String element, DNode prev, DNode next){
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
    
	public DNode(String element) {
		this.element = element;		
	}
    
    public String getElement(){
        return element;
    }

    public DNode getPrev(){
        return prev;
    }

    public DNode getNext(){
        return next;
    }

    public void setElement(String newElement){
        element = newElement;
    }

    public void setPrev(DNode newPrev){
        prev = null; 
        //newPrev;
    }

    public void setNext(DNode newNext){
        next = newNext;
    }
}