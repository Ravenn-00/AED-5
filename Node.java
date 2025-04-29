public class Node<T> {
    T data;
    Node<T> next;
    public Node(T _data)    {
        this.data = _data;
    }
    public Node(T _data, Node<T> _node)    {
        this.data = _data;
        this.next = _node;
    }
    public Node<T> getNode()    {
        return this.next;
    }
    public void setNode(Node<T> _node)    {
        this.next = _node;
    }
    public T getData()    {
        return this.data;
    }
    public void setNode(T _data)    {
        this.data = _data;
    }
}