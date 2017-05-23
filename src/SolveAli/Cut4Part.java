package SolveAli;

/**
 * Computer user xd
 * Created by 张洋 on 2017/3/3.
 */
public class Cut4Part {
    private int sum1,sum2,sum3,sum4;
//    private int m1=1,m2=3,m3=5;
    private int[] index = new int[4];
    boolean result = false;
    boolean NotOutOfArray = true;
    private int[] array;

    public Cut4Part(int[] array) {
        this.array = array;
    }

    private void init(int[] array){
        index[1] = 1;
        index[2] = 3;
        index[3] = 5;
        sum1 = array[0];
        sum2 = array[2];
        sum3 = array[4];
        for (int i = 6; i < array.length; i++) {
            sum4 += array[i];
        }
    }
    public void partArray(){
        if(array.length > 6){
            init(array);
            while (NotOutOfArray){
                if(juge())break;
            }
            System.out.println(result);
            System.out.println("sum = "+sum1+" "+sum2+" "+sum3+" "+sum4);
            System.out.println("index = "+index[1]+" "+index[2]+" "+index[3]);
        }
    }

    private boolean juge(){
        if(sum1 == sum2){
            if(sum2 == sum3){
                if(sum3 == sum4){
                    result = true;
                    return true;
                }else return false;
            }else if(sum2 < sum3){
                move(2);
                return false;
            }else {
                move(3);
                return false;
            }
        }else if(sum1 < sum2){
            move(1);
            return false;
        }else {
            move(2);
            return false;
        }
    }

    private void move(int start){
        switch (start){
            case 1:
                if(index[1]+1 < array.length){
                    sum1+=array[index[1]];
                    sum2-=array[index[1]+1];
                    index[1]++;
                    if(!(index[1] < index[2]))move(2);
                }else NotOutOfArray =false;
                break;
            case 2:
                if(index[2]+1 < array.length){
                    sum2+=array[index[2]];
                    sum3-=array[index[2]+1];
                    index[2]++;
                    if(!(index[2] < index[3]))move(3);
                }else NotOutOfArray =false;
                break;
            case 3:
                if(index[3]+1 < array.length){
                    sum3+=array[index[3]];
                    sum4-=array[index[3]+1];
                    index[3]++;
                }else NotOutOfArray =false;
                break;
        }
    }

    public static void main(String[] args) {
        int[] data = {2,5,1,1,1,1,4,1,7,3,7};
        int[] data2 = {10,2,11,13,1,1,1,1,1};
        Cut4Part test = new Cut4Part(data);
        test.partArray();
    }
}
