abstract class Animals{
public abstract void foodHabits();
}

class Herbi extends Animals{
public void foodHabits(){
	System.out.println("Herbivores eat grass");
	}
}

class Carni extends Animals{
public void foodHabits(){
	System.out.println("Carnivores eat meat");
	}
}

class Omni extends Animals{
public void foodHabits(){
	System.out.println("Omnivores eat grass as well as meat");
	}
}

public class Polymorphism{

	public void call(Animals a){
		a.foodHabits();
	}

public static void main(String[] args){
	Polymorphism p = new Polymorphism();
	p.call(new Herbi());
	p.call(new Carni());
	p.call(new Omni());
}
}