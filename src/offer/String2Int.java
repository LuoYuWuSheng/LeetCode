package offer;

/**
 * Created by luoyu on 2017/5/2 0002.
 */
public class String2Int {
    public int StrToInt(String str) {
        boolean positive = true;
        char[] array = str.toCharArray();
        if(array.length < 1)return 0;
        int i = 0;
        if(array[i] == '-'){
            positive = false;
            i++;
        }else if(array[i]== '+'){
            i++;
        }
        int result = 0;
        for(;i< array.length;i++){
            if('0'<= array[i] && array[i] <= '9'){
                result *=10;
                result+=(array[i]-'0');
            }else return 0;
        }
        if(!positive)result= -result;
        return result;
    }
}
