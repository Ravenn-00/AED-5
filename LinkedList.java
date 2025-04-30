public class LinkedList<T> {
    Node<T> head;
    Node<T> var;
    public LinkedList() {
        this.head = null;
        this.var = null;
    }
    public LinkedList(Node<T> _head) {
        this.head = _head;
        this.var = _head;
    }
    public boolean isEmpty()    {
        return this.head == null;
    }
    public int lenght() {
        int count = 0;
        while (this.var != null) {
            this.var = this.var.getNext();
            count += 1;
        }
        this.var = this.head;
        return count;
    }
    public void insertFirst(Node<T> _node)  {
        if(this.isEmpty())   {
            System.out.println("Empty list");
            return;
        }
        _node.setNext(this.head);
        this.head = _node;
        this.var = _node;
    }
    public void insertLast(Node<T> _node)  {
        if(this.isEmpty())   {
            System.out.println("Empty list");
            return;
        }
        while(this.var != null)   {
            this.var = this.var.getNext();
        }
        _node.setNext(null);
        this.var.getNext().setNext(_node);
        this.var = this.head;
    }
    public void destroy()   {
        this.head = null;
        this.var = null;
    }
    public void print() {
        if(this.isEmpty())   {
            System.out.println("Empty list");
            return;
        }
        int i = 0;
        while(this.var != null)   {
            i += 1;
            System.out.println("Elemento " + i + ":  " + this.var.getData());
            this.var = this.var.getNext();
        }
        this.var = this.head;
    }
    public boolean exist(T _data)    {
        if(this.isEmpty())   {
            System.out.println("Empty list");
            return false;
        }
        while(this.var != null)   {
            if(this.var.getData() == _data) {
                this.var = this.head;
                return true;
            }
            this.var = this.var.getNext();
        }
        this.var = this.head;
        return false;
    }
    public int search(T _data)    {
        if(this.isEmpty())   {
            System.out.println("Empty list");
            return -1;
        }
        int i = 0;
        while(this.var != null)   {
            i += 1;
            if(this.var.getData() == _data) {
                this.var = this.head;
                return i;
            }
            this.var = this.var.getNext();
        }
        this.var = this.head;
        return -1;
    }
    public void remove(T _data)   {
        if(this.isEmpty())   {
            System.out.println("Empty list");
            return;
        }
        if(this.head.getData() == _data) {
            this.head = this.head.getNext();
            this.var = this.head.getNext();
        }
        while (this.var.getNext() != null) {
            if (this.var.getNext().getData() == _data) {
                this.var.setNext(this.var.getNext().getNext());
                this.var = this.head;
                return;
            }
            this.var = this.var.getNext();
        }
        this.var = this.head;
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
