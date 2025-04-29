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
        return this.head == null || this.size == 0;
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
    public void insertAt(int pos, Node<T> _node)    {
        if(pos > this.size) {
            System.out.println("Out of bounds");
            return;
        }
        if(pos == 0)    {
            _node.setNext(this.head);
            this.head = _node;
        }
        for(int i = 1; i < this.size; i++){
            if(pos == i)    {

            }
            System.out.println("Elemento " + (i+1) + ":  " + this.aux.getData());
            this.aux = this.aux.getNext();
            this.size += 1; 
        }
        this.aux = this.head;
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
    public void print() {
        for(int i = 0; i < this.size; i++){
            System.out.println("Elemento " + (i+1) + ":  " + this.aux.getData());
            this.aux = this.aux.getNext();
        }
        this.aux = this.head;
    }
    public boolean search(T _data)    {
        for(int i = 0; i < this.size; i++){
            if(this.aux.getData() == _data) {
                this.aux = this.head;
                return true;
            }
            this.aux = this.aux.getNext();
        }
        this.aux = this.head;
        return false;
    }
    public void remove(T _data)   {
        if(this.head.getData() == _data) {
            this.head = this.head.getNext();
            this.aux = this.head.getNext();
            this.size -= 1;
        }
        while (this.aux.getNext() != null) {
            if (this.aux.getNext().getData() == _data) {
                this.aux.setNext(this.aux.getNext().getNext());
                this.size -= 1;
                this.aux = this.head;
                return;
            }
            this.aux = this.aux.getNext();
        }
        this.aux = this.head;
    }
    public static void main(String args[]) {
        Node<Integer> N1 = new Node<Integer>(10);
        Node<Integer> N2 = new Node<Integer>(20);
        Node<Integer> N3 = new Node<Integer>(30);
        Node<Integer> N4 = new Node<Integer>(40);
        Node<Integer> N5 = new Node<Integer>(50);

        N1.setNext(N2);
        N2.setNext(N3);
        N3.setNext(N4);
        N4.setNext(N5);

        LinkedList<Integer> Lista = new LinkedList<Integer>(N1);
        System.out.println("lenght : " + Lista.lenght());
        Lista.print();
        System.out.println("Search 50 : " + Lista.search(50));
        System.out.println("Search 25 : " + Lista.search(25));
        Lista.remove(40);
        Lista.print();
    }
}
