class MThread extends Thread{
	MThread(String s){
		super(s);
		}
	public void run(){
		System.out.println("Thread Running..." + this.getName());
			}
}

public class Demo{
	public static void main(String[] args){
	Thread t1 = new MThread("T1");
	Thread t2 = new MThread("T2");
	t1.start();
	t2.start();
	}
}