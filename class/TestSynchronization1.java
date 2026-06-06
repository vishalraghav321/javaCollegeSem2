class Table
{  
public  void printTable(int n)
{

	String name=Thread.currentThread().getName();


 	  for(int i=1;i<=5;i++)
	{  
	System.out.println(name+" "+n*i); 
     try{  
     	 Thread.sleep(2000);  
        }catch(Exception e)
	{System.out.println(e);}   	
 	
	}
} 
} 








class MyThread1 extends Thread
{  
Table t;  
MyThread1(Table t)
{  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread
{  
Table t;  
MyThread2(Table t)
{  
this.t=t;  
}  
public void run()
{  
t.printTable(100);  
}  
}  
  
class TestSynchronization1{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
//t1.setDaemon(true);


System.out.println(t2.isDaemon()?"Yes its daemon":"not daemon");
}  
}  