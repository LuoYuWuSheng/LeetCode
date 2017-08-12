package SolveAli;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 9/8/17.
 */
public class Multi {
    static int maxScore(int[] score) {
        int[] multi = new int[score.length];
        int[] newScore = new int[score.length+2];
        for (int i = 0; i < score.length; i++) {
            newScore[i+1]=score[i];
        }
        newScore[0]=1;
        newScore[score.length]=1;
        int MaxIndex=0;
        for(int j=0;j<score.length;j++){
            if(newScore[j]!=0 && newScore[j+2]!=0){
                multi[j]=newScore[j]*newScore[j+1]*newScore[j+2];
            }else if(newScore[j]==0){
                multi[j] = newScore[j+1]*newScore[j+2];
            }else multi[j]=newScore[j]*newScore[j+1];
            if(multi[j]>multi[MaxIndex])MaxIndex=j;
        }
        int result = 0;
        for(int i =0;i<score.length;i++){
            result+=multi[MaxIndex];
            updateLR(newScore,multi,MaxIndex);
            multi[MaxIndex]=Integer.MIN_VALUE;
            for (int j = 0; j < multi.length; j++) {
                if(multi[j]>multi[MaxIndex])MaxIndex=j;
            }
        }
        return result;
    }

    public static void updateLR(int[] in,int[] multi,int index){
        int l = index;
        int r = index;
        while (multi[l]<0)l--;
        while (multi[r]<0)r++;

    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _score_size = 0;
        _score_size = Integer.parseInt(in.nextLine().trim());
        int[] _score = new int[_score_size];
        int _score_item;
        for(int _score_i = 0; _score_i < _score_size; _score_i++) {
            _score_item = Integer.parseInt(in.nextLine().trim());
            _score[_score_i] = _score_item;
        }

        res = maxScore(_score);
        System.out.println(String.valueOf(res));

    }
}
