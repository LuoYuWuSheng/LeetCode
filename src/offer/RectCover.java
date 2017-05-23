package offer;

/**
 * Created by luoyu on 2017/2/8 0008.
 */
public class RectCover {
    public int RectCover(int target) {
        int a1 = 1;
        int a2 = 2;
        int result =0;
        if(target ==1 )result = 1;
        if(target ==2 )result = 2;
        for (int i = 2; i < target; i++) {
            result = a1 + a2;
            a1 = a2;
            a2 = result;
        }
        return result;
    }
}
