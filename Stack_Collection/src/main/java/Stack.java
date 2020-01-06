
import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    private Queue<Object> stack = new LinkedList<Object>();
    private BlackList blackList = new BlackList();
    private IteratorTail head = null;
    private IteratorTail tail = null;
    private static int sizeStack = 0;

    public Stack(BlackList blackList) {
        this.blackList = blackList;
    }

    public static int getSizeStack() {
        return sizeStack;
    }

    public void pushStack(Object object) {
        if (object != null) {
            if (!blackList.checkIfInBlackList(object)) {
                IteratorTail iter = new IteratorTail();
                iter.setObject(object);
                if (head == null) {
                    //for the first object in queue
                    head = iter;
                } else {
                    tail.setNextStep(iter);
                }
                //tail = reference to new element
                tail = iter;
                sizeStack++;
            } else {
                System.out.println("It's not allowed to add this Object: " + object.getClass());
            }
        }
    }

    public Object pullStack() {
        if (sizeStack == 0) {
            //no elements
            return null;
        }
        Object object = tail.getObject();
        sizeStack--;
        //if last element
        if (head == null) {
            tail = null;
        }
        return object;
    }

    public Object getElementStack(int position) {
        int index = 0;
        if (sizeStack == 0) {
            return null;
        } else {
            IteratorTail current = head;
            while (index < position) {
                current = current.getNextStep();
                index++;
            }
            Object object = current.getObject();
            return object;
        }
    }

    public void viewStack() {
        System.out.println("---------- STACK ----------");
        System.out.println("Stack size: " + sizeStack);
        int position = getSizeStack()-1;
       while (position >= 0) {
           System.out.print(position + " ");
            Object objectStack = getElementStack(position);
            System.out.println(objectStack);
            position--;
        }

    }
}
