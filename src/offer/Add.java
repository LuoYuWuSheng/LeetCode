package offer;

/**
 * Created by luoyu on 2017/5/2 0002.
 */
public class Add {
    public int Add(int num1,int num2) {
        int mask = 0x01;
        int result = 0x0;
        boolean jw = false;
        while(mask != 0){
            int temp1 = (num1&mask);
            int temp2 = (num2&mask);
            int temp = temp1 & temp2;
            if(jw){
                if(temp !=0){
                    jw = true;
                    result |= mask;
                }else if((temp1 | temp2)!=0){
                    jw= true;
                }else {
                    result |= mask;
                    jw = false;
                }
            }else{
                if(temp != 0){
                    jw = true;
                }else if((temp1 | temp2)!=0){
                    result |= mask;
                    jw=false;
                }else{
                    jw = false;
                }

            }
            mask = mask << 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.Add(111,899));
    }
}
