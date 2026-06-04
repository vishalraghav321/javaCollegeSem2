public class RThread implements Runnable
{
String s;
public RThread(String s)
{
this.s=s;
Thread t1=new Thread(this,s);
t1.start();
}
public void run()
{
try
{
for(int i=0; i<5; i++){
System.out.println(s+" Started "+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
}
}

public static void main(String[] args)
{
RThread r=new RThread("T1");
RThread r1=new RThread("T2");
RThread r2=new RThread("T3");
}
}
