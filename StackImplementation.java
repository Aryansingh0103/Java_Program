class StackException extends Exception {
    public StackException(String s) {
        super(s);
    }
}

class Stack {
    int Max = 10;
    int top = 0;
    int element[] = new int[Max];

    void push(int x) throws StackException {
        if (top > Max) {
            throw new StackException("String is full");
        }
        top++;
        element[top] = x;
    }

    void pop() throws StackException {
        if (top < 0) {
            throw new StackException("String is empty");
        }
        top--;
    }

    void display() {
        for (int i = 0; i < top; i++) {
            System.out.println(element[i]);
        }
    }
}

public class StackImplementation {
    public static void main(String args[]) throws StackException {
        Stack s = new Stack();
        s.push(10);
        s.display();
    }
}