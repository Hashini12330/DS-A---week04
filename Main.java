public class Main{
    public static void main(String[] args){

        // create a stack
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // show pudhed item
        stack.show();

        // peek()
        System.out.println("Top item: " + stack.peek());

        // pop()
        System.out.println("Popped: " + stack.pop());

        // check if empty
        System.out.println("Is Empty: " + stack.isEmpty());

        // check is full
        System.out.println("Is full: " + stack.isFull());



    }

}

class Stack{
    private int maxSize;
    private double[] stackArray;
    private int top;


    // constructor
    public Stack(int s){
        maxSize = s;
        stackArray = new double[maxSize];
        top = -1;

    }

    // push operation
    public void push(double item){
        stackArray[++top] = item;
    }

    // show push
    public void show(){

        for(int i = top; i >= 0; i--){
            System.out.println("Stack item: "+ stackArray[i]);
        }
    }

    // pop operation
    public double pop(){
        if(isEmpty()){
            return -1;
        }
        return stackArray[top--];
    }

    // peek operation
    public double peek(){
        return stackArray[top];
    }

    // check if empty
    public boolean isEmpty(){
        return (top == -1); 
    }

    // check if full
    public boolean isFull(){
        return (top == maxSize -1); // -1 means it is fales?
    }
}