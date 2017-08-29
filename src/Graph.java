import java.util.Arrays;

/**
 * Computer user xd
 * Created by 张洋 on 2017/8/29.
 */
public class Graph {
    public static void main(String[] args) {
        char[][] test = new char[5][4];
        int[] in = {2,2,5,3,3,1};
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                if((i==in[0]-1&&j==in[1]-1)
                        ||(i==in[2]-1&&j==in[3]-1)||(i==in[4]-1&&j==in[5]-1))test[i][j]='+';
                else test[i][j]='-';
                System.out.print(test[i][j]);
            }
            System.out.println();
        }
        Graph g = new Graph();
        int[] res = g.calc(test.length,test[0].length,test,in[0],in[1],in[2],in[3]);
        System.out.println(Arrays.toString(res));
    }
    int[] calc(int rows,int cols,char[][] positionsinPark,int euclidX,
               int euclidY,int monteX,int monteY){
        euclidX--;
        euclidY--;
        monteX--;
        monteY--;
        int[] result = new int[2];
        int pX = 0;
        int pY = 0;
        //找出第三点
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(positionsinPark[i][j]=='+'&&(!equal(i,j,euclidX,euclidY))&&(!equal(i,j,monteX,monteY))){
                    pX=i;
                    pY=j;
                }
            }
        }
        result[0] = monteX-(pX-euclidX)+1;
        result[1] = monteY-(pY-euclidY)+1;
        return result;
    }
    boolean equal(int x,int y,int otherX,int otherY){
        if(x!=otherX)return false;
        else return y == otherY;
    }
}
