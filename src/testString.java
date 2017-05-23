import java.util.LinkedList;

/**
 * Created by luoyu on 2017/4/24 0024.
 */
public class testString {
    public static void main(String[] args) throws InterruptedException {
        //字面量是相等的
        String a = "中国";
        String b = new String("中国");
        String c = b.intern();
        if(a == b) System.out.println("字面量与New在同一个地方分配 ");
        else System.out.println("字面量在常量区分配，而new的字符串在堆中分配");
        if(c == a) System.out.println("字面量在方法区的字符串常量池分配");
        String d = new String("中国");
        if(d == b) System.out.println("Java String 不可变，在堆中共享同一个地址");
        else System.out.println("java String 不可变，但是两次new同一个字符串不共享");
        LinkedList<String> list = new LinkedList<>();
//        while (true){
//            list.add(new String("中国"));
//            Thread.sleep(10);
//        }
    }
}
