abstract class Furniture{
abstract void getDesc();}
class Chair extends Furniture{
public void getDesc(){
System.out.println("Chair.getDesc() is called.");}
}

class Podium extends Furniture{
public void getDesc(){
System.out.println("Podium.getDesc() is called.");}
}

public class UseBase1{
public static void main(String[] args){
Podium p = new Podium();
Chair c = new Chair();

p.getDesc();
System.out.println("_______________");
c.getDesc();
}
}


