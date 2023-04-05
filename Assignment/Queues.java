import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Queues{
 
 static Queue<Integer> queue;
 static void reversekelements(int k)
  {
    if (queue.isEmpty() == true
      || k > queue.size())
      return;
    if (k <= 0)
      return;

    Stack<Integer> stack = new Stack<Integer>();

    for (int i = 0; i < k; i++) {
      stack.push(queue.peek());
      queue.remove();
    }

    while (!stack.empty()) {
      queue.add(stack.peek());
      stack.pop();
    }

    for (int i = 0; i < queue.size()-   k; i++) {
      queue.add(queue.peek());
      queue.remove();
    }
  }

  static void Print()
  {
    while (!queue.isEmpty()) {
      System.out.print(queue.peek() + " ");
      queue.remove();
    }
  }

  public static void main(String args[])
  {
    queue = new LinkedList<Integer>();
    queue.offer(10);
    queue.offer(15);
    queue.offer(20);
    queue.offer(25);
    queue.offer(5);
    int k = 3;
    reversekelements(k);
    Print();
  }
}
