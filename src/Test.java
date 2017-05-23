/**
 * Created by luoyu on 2017/3/29 0029.
 */
public class Test {
    public static void main(String[] args) {
        A b = new B();
        b.say();
    }
}

class A{
    int f1 = 1;
    int f2 = 2;
    public void say(){
        System.out.println("I am A");
    }
}

class B extends A{
    int f2 = 3;
    public void say(){
        System.out.println("I am B");
    }
}
