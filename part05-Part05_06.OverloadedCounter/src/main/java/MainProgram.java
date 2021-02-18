
public class MainProgram {

    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter(5);
        c1.increase();
        c1.increase(9);
        c2.increase(15);
        c2.decrease(9);
        c2.decrease();
        System.out.println("Counter 1's value is :"+c1);
        System.out.println("Counter 2's value is :"+c2);
    }
}
