/**
 * Dynamic implementation of a stack
 * @author Mireia Gasco Agorreta
 * @version 1.0
 */
public class Stack<T> {

    //Nodes of the stack
    private static class Node<T>{
        T data;
        Node next;  //next node in the stack

        //Constructor
        public Node(T data, Node nextNode){
            this.data = data;
            this.next = nextNode;
        }
    }

    //Attributes of the stack
    Node top;
    int numElem;

    //Constructor
    public Stack(){
        this.top = null;
        this.numElem = 0;
    }

    //Methods

    /**
     * Push method.  Adds a new element to the stack.
     * @param newData data to be added to the stack.
     */
    public void push(T newData){
        this.top = new Node(newData, this.top);;
        this.numElem++;
    }

    /**
     * Pop method.  Removes and returns the element on the top of the stack.
     * @throws StackIsEmpty if the stack is empty
     * @return the element on the top of the stack.
     */
    public T pop() throws StackIsEmpty{
        if (empty()) throw new StackIsEmpty();
        else{
            Node popped = this.top;
            this.top = this.top.next;
            this.numElem--;
            return (T)popped.data;
        }
    }

    /**
     * Empty method.  Indicates if the stack is empty.
     * @return a boolean indicating if the stack is empty.
     */
    public boolean empty(){
        return this.top == null;
    }

    /**
     * Size method. Indicates the number of elements in the stack.
     * @return an integer (number of elements in the stack).
     */
    public int size(){
        return this.numElem;
    }

    /**
     * Peek method.  Returns the element on the top without removing it.
     * @throws StackIsEmpty if the stack is empty
     * @return the element on the top of the stack.
     */
    public T peek() throws StackIsEmpty{
        if (empty()) throw new StackIsEmpty();
        else return (T)this.top.data;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stack:\n\n");

        Node currentNode = this.top;

        while (currentNode != null){
            sb.append("\t|  " + currentNode.data + "  |\n");
            currentNode = currentNode.next;
            if (currentNode == null) sb.append("\t ͞ ͞ ͞ ");
        }
        return sb.toString();
    }
}
