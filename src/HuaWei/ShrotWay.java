package HuaWei;

import java.util.Scanner;
import java.util.Stack;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/23.
 */
public class ShrotWay {
    public static class path{
        public int x,y;
        public path(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public static boolean exist = false;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] data = new int[n][m];
        for(int i = 0;i< n;i++){
            for(int j = 0;j<m;j++){
                data[i][j] = sc.nextInt();
            }
        }
        Stack<path> ans = new Stack();
        if(calc(data,0,0,ans)){
            for(path p : ans){
                System.out.format("(%d,%d)",p.x,p.y).println();
            }
        }else {
            System.out.println("error");
        }
    }

    public static boolean calc(int[][] data,int nx,int ny,Stack<path> way){
        if(nx < data.length && ny < data[0].length  && data[nx][ny] != 1){
            data[nx][ny] = 1;
            way.push(new path(nx,ny));
            if(nx == data.length-1 && ny == data[0].length-1){
                return true;
            }
            else{
                if(calc(data,nx+1,ny,way))return true;
                if(calc(data,nx,ny+1,way))return true;
                if(calc(data,nx-1,ny,way))return true;
                if(calc(data,nx,ny-1,way))return true;
            }
            way.pop();
            data[nx][ny] = 0;
        }
        return false;
    }
}
