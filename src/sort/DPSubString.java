package sort;

/**
 * Created by luoyu on 2017/4/1 0001.
 * l 向右，e，相等，d向下
 */
public class DPSubString {
    String a,b;
    char[] aArray;
    char[] bArray;
    char[][] toward;
    int[][] count;
    public void subString(String a,String b){
        aArray = a.toCharArray();
        bArray = b.toCharArray();
        toward = new char[a.length()][b.length()];
        count = new int[a.length()][b.length()];
        this.a = a;
        this.b = b;
        init();

    }

    public void  calc(){
        for (int i = 1; i < a.length(); i++) {
            for (int j = 1; j < b.length(); j++) {
                int max = 0;
                if (toward[i-1][j-1] == 'e')max=count[i-1][j-1];
                if (toward[i-1][j] == 'd'&& max < count[i-1][j]){
                    max = count[i-1][j];
                }
                if(aArray[i] == bArray[j])toward[i][j]='e';
            }

        }
    }

    public void init(){
        for (int i = 0; i < a.length(); i++) {
            if(aArray[0] == bArray[i]){
                count[0][i]=1;
                toward[0][i] = 'e';
            }else {
                toward[0][i] = 'd';
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(aArray[i] == bArray[0]){
                count[i][0]=1;
                toward[i][0]='e';
            }else {
                toward[i][0]='l';
            }
        }
    }
}
