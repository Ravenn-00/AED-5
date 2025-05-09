public class GestordeTareas <T> {
    private LinkedList<T> taskList;

    public GestordeTareas() {
        this.taskList = new LinkedList<>();
    }

    public void addTask(T task) {
        Node<T> nodo = new Node<>(task);
        taskList.insertLast(nodo);
    }

    public void removeTask(T task) {
        taskList.remove(task);
    }

    public boolean searchTask(T task) {
        return taskList.exist(task);
    }

    public void printTasks() {
        taskList.print();
    }

    public int countTasks() {
        return taskList.lenght();
    }

    public void invertTaskList() {
        taskList.reverse();
    }
}