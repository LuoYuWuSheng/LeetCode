package offer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/3/24 0024.
 */
public class verifySequenceOfBST {
    boolean result = true;
    int[] sequence;
    public boolean VerifySquenceOfBST(int [] sequence) {
        this.sequence = sequence;
        juge(0,sequence.length-1);
        return result;
    }
//问题出在找middl的过程中。我假设的是找到第一个比end小的，可是会有找不到或全都比它小的情况
    public int findMiddle(int start,int end){
        int middle = -1;
        for(int i = end;i >= start;i--){
            if(sequence[end] > sequence[i]){
                middle = i;
                break;
            }
        }
        return  middle;
    }

    public void juge(int start,int end){
        if(start < end){
            int middle = findMiddle(start,end);
            if(middle != -1){
                for(int i=start;i<middle;i++){
                    if(sequence[end]<sequence[i])result = false;
                }
                juge(start,middle);
                juge(middle+1,end-1);
            }else {
                juge(start,end-1);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        int[] seq = new int[5];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = scanner.nextInt();
        }
        verifySequenceOfBST test = new verifySequenceOfBST();
        System.out.println(test.VerifySquenceOfBST(seq));
    }
}
