package offer;

import java.util.ArrayList;

/**
 * Created by luoyu on 2017/2/9 0009.
 */
public class printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int rstart = 0;
        int rend = matrix.length-1;
        int cstart = 0;
        int cend = matrix[0].length-1;
        while( rend >= rstart && cend >= cstart){
            for(int i = cstart;i<=cend;i++){
                result.add(matrix[rstart][i]);
            }
            rstart++;
            for(int i = rstart;i<= rend;i++){
                result.add(matrix[i][cend]);
            }
            cend--;
            if(rstart <= rend && cstart <= cend){
                for(int i = cend;i >= cstart;i--){
                    result.add(matrix[rend][i]);
                }
                rend--;
                for(int i = rend;i >= rstart ;i--){
                    result.add(matrix[i][cstart]);
                }
                cstart++;
            }
        }
        return result;
    }
}
