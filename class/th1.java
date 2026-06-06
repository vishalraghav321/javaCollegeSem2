public class th1
{
public static void main(String[] args)
{
Thread t1=Thread.currentThread();
System.out.println("Thread Name  "+t1.getName());
System.out.println("Thread Priority  "+t1.getPriority());
t1.setName("Java's Ist Thread");
t1.setPriority(Thread.MAX_PRIORITY);
System.out.println("Thread Name  "+t1.getName());
System.out.println("Thread Priority  "+t1.getPriority());
}
}