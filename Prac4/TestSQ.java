public class TestSQ
{
    public static void main(String[] args) {
        Stack s = new Stack();
         Queue q = new Queue();

         s.display();
         q.display();

         s.enqueue(20);
         q.enqueue(20);

         s.display();
         q.display();

         System.out.println(s.dequeue());
         System.out.println(q.dequeue());

         s.display();
         q.display();

         s.getSize();
         q.getSize();
    }
}
