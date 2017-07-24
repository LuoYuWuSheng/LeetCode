package Baidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 23/7/17.
 * todo 不做了，用到好多数学知识
 */
public class Angle {
    static class point{
        public int x,y,z;
        public char color;
        point(int x,int y,int z,char color){
            this.x = x;
            this.y = y;
            this.z = z;
            this.color = color;
        }
        public point sub(point in){
            return  new point(in.x-x,in.y-y,in.z-z,'W');
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<point> R = new ArrayList<>();
        ArrayList<point> G = new ArrayList<>();
        ArrayList<point> B = new ArrayList<>();
        for (int i =0;i<num;i++){
            String line = sc.nextLine();
            String[] data = line.split("\\s{1,}");
            if(data[0].equals('R'))R.add(
                    new point(Integer.parseInt(data[1]),
                            Integer.parseInt(data[2]),
                            Integer.parseInt(data[3]),'R'));
            else if(data[0].equals('G'))G.add(
                    new point(Integer.parseInt(data[1]),
                            Integer.parseInt(data[2]),
                            Integer.parseInt(data[3]),'G'));
            else B.add(
                        new point(Integer.parseInt(data[1]),
                                Integer.parseInt(data[2]),
                                Integer.parseInt(data[3]),'B'));
        }
        double small = Double.MAX_VALUE;
        if(R.size()>2){
            for (int i = 0; i < R.size(); i++) {
                for (int j = i+1; j < R.size(); j++) {
                    for (int k = j+1; k < R.size(); k++) {
                        double temp = calc(R.get(i),R.get(j),R.get(k));
                    }
                }
            }
        }

    }
    //todo 计算三角形面积 向量X积
    public static double calc(point f,point s,point t){
        point temp1 = f.sub(s);
        point temp2 = f.sub(t);

        return 0.0;
    }
}
