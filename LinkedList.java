public class LinkedList<T> {
    Node<T> head;
    int size;
    Node<T> aux;
    public LinkedList() {
        this.head = null;
        this.size = 0;
        this.aux = null;
    }
    public LinkedList(Node<T> _head) {
        this.head = _head;
        this.size = 1;
        this.aux = _head;
    }
    public boolean isEmpty()    {
        return this.head == null;
    }
    public int lenght() {
        while (this.aux.getNext() != null) {
            size += 1;
            this.aux = this.aux.getNext();
        }
        this.aux = this.head;
        return size;
    }
    public void insertFirst(Node<T> _node)  {
        _node.setNext(this.head);
        this.head = _node;
        this.aux = _node;
        this.size += 1; 
    }
    public void insertLast(Node<T> _node)  {
        while(this.aux.getNext() != null)   {
            this.aux = this.aux.getNext();
        }
        _node.setNext(null);
        this.aux.getNext().setNext(_node);
        this.aux = this.head;
    }
    public void destroy()   {
        this.head = null;
        this.aux = null;
        this.size = 0;
    }
    public boolean search(Node<T> _node)    {

        return true;
    }
    public void main(String args[]) {
        Node<Integer> N1 = new Node<Integer>();
        Node<Integer> N2 = new Node<Integer>();
        Node<Integer> N3 = new Node<Integer>();
        Node<Integer> N4 = new Node<Integer>();
        Node<Integer> N5 = new Node<Integer>();

        N1.setNext(N2);
        N2.setNext(N3);
        N3.setNext(N4);
        N4.setNext(N5);

        LinkedList<Integer> Lista = new LinkedList<Integer>(N1);
        System.out.println(Lista.lenght());
    }
}
