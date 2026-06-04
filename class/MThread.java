public class MThread extends Thread
{
public MThread(String s)
{
super(s);
}
public void run()
{
try
{
for(int i=0; i<10; i++){
System.out.println(Thread.currentThread().getName()+" "+i);
sleep(1000);
System.out.println(Thread.currentThread().getName()+" "+i);
}
}
catch(InterruptedException e)
{
}
}

public static void main(String[] args)
{
MThread t1=new MThread("T1");
t1.start();
MThread t2=new MThread("T2");
t2.start();
MThread t3=new MThread("T3");
t3.start();
}
}
