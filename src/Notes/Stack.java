package Notes;

public class Stack {
    //LIFO: Last In First Out

    //can implement using arragy or linkedList(nodes)

    //push pop peek isStackEmpty isStackFull etc.

    public int stackSize;
    public int[] stackArr;
    public int top;

    public Stack(int size) {
        this.stackSize = size;
        this.stackArr = new int [stackSize];
        this.top = -1;
    }

    public boolean isStackFull() {
        return (top == stackSize -1);
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public void push(int entry) throws Exception {
        if (this.isStackFull()) {
            throw new Exception("Stack is already full. Can't add element");
        }
        System.out.println("Adding: " + entry);
        this.stackArr[++top] = entry;
    }

    public void pop() throws Exception {
        if(this.isStackEmpty()) {
            throw new Exception("Stack is empty. Can't remove element");
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: " + entry);
    }

    public int peek() {
        return stackArr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        try {
            stack.push(4);
            stack.push(8);
            stack.push(3);
            stack.push(21);
            System.out.println(stack.peek());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            stack.pop();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
     }
}