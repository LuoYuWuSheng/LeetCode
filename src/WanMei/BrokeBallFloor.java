package WanMei;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Computer user xd
 * Created by 张洋 on 2017/3/10.
 *
 *
 有一幢N（N > 0）层的楼，当从高于某一楼层往下扔玻璃球时，玻璃球会被摔坏，反之，玻璃球保持完好。
 现在用m（m > 0）颗完全一样的玻璃球，每次从某一楼层往下扔一颗球，来找到这个刚好能使玻璃球摔坏的临界楼层。
 规定扔碎的玻璃球不可用于下一次试验，求一定能确定这个临界楼层的最少试验次数。
 主函数已经完成，请完成calcThrowNumber(int,int)函数。
 #include <stdio.h>
 int calcThrowNumber(int numOfFloors, int numOfBalls)
 {
 //implement your code here
 }
     int main()
     {
     int numOfFloors, numOfBalls;
     while(scanf("%d%d", &numOfFloors, &numOfBalls) != EOF) {
     printf("%d\n", calcThrowNumber(numOfFloors, numOfBalls));
     }
 }
 *
 */
public class BrokeBallFloor {
    public static void main(String[] args) {
        int numOfFloors=10, numOfBalls=1;
        int result = calcThrowNumber(numOfFloors, numOfBalls);
    }

    int mball_nfloor(int m, int n)
    {
        if(m<=0 || n<=0)
            return 0;
        int[][] result = new int[m+1][n+1];
        int temp_min = n+1;
        int temp_max = 0;
        //for n==0 and n==1
        for(int i=0;i<=m;i++)
        {
            result[i][0] = 0;
            result[i][1] = 1;
        }
        //for m==0 and m==1
        for(int i=0;i<=n;i++)
        {
            result[1][i] = i;
            result[0][i] = 0;
        }
        if(m>1 && n>1)
        {
            //start from 2 balls
            for(int a=2;a<=m;a++)
            {
                //start from 1 floors
                for(int i=1;i<=n;i++)
                {
                    for(int k=1;k<=i;k++)
                    {
                        temp_max = max(result[a-1][k-1]+1, result[a][i-k]+1);
                        temp_min = min(temp_min, temp_max);
                    }
                    result[a][i] = temp_min;
                    temp_min = n+1;
                }
            }
        }
        return result[m][n];
    }

    private static int calcThrowNumber(int floor,int ballNum){
        return 0;
    }
}
