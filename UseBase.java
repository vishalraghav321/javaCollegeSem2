class A{
int a,b;
A(int i,int j){
a=i;
b=j;}
public void print(){
System.out.println("A.a :" + a);
System.out.println("A.b :" + b);
}
}
class B extends A{
int a;
String b;
B(int i, int j, int a, String b){
super(i,j);
this.a = a;
this.b = b;
super.print();}
public void print(){
 System.out.println("B.a :" + a);
 System.out.println("B.b :" + b);
}
}
class C extends B{
String e;
String f;
C(int a, int b, int c, String d, String e, String f){
super(a,b,c,d);
this.e=e;
this.f=f;
super.print();}
public void print(){
 System.out.println("C.e :" + e);
 System.out.println("C.f :" + f);
}
}

public class UseBase{
public static void main(String[] args){
C c = new C(89,65,33,"ABC", "MCA", "DEF");
c.print();
}
}