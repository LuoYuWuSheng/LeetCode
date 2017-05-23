package Tencent;

import java.util.LinkedList;
import java.util.List;

public class GrayCode {
//    递归方法实现格雷码
//    利用异或实现
    int total;
    int now;
    List<String> result = new LinkedList<>();
    public String[] getGray(int n) {
        total = n;
        // write code here
        code(n);
//        result.forEach(System.out::println);
        String[] myFinal = new  String[result.size()];
        return result.toArray(myFinal);
    }

    public static void main(String[] args) {
        GrayCode code = new GrayCode();
        code.getGray(3);
    }

    private void code(int n){
        if(n == 1){
            result.add("0");
            result.add("1");
        }else if(n > 1){
            code(n-1);
            List<String> temp = new LinkedList<>();
            for (String myCode : result) {
                temp.add("0"+myCode);
            }
            for (int i = result.size()-1;i>-1;i--) {
                temp.add("1"+result.get(i));
            }
            result = temp;
        }
    }
}