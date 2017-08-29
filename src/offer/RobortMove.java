package offer;

/**
 * 不仅要比threshold小，还要连通可达才行。
 * Computer user luoyu
 * Created by 张洋 on 20/8/17.
 */
public class RobortMove {
    public int movingCount(int threshold, int rows, int cols) {
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(test(i,j,threshold))result++;
            }
        }
        return result;
    }
    private boolean test(int rows,int cols,int threshold){
        int result = 0;
        while (rows!=0){
            result+=rows%10;
            rows/=10;
        }
        while (cols!=0){
            result+=cols%10;
            cols/=10;
        }
        if(result>threshold)return false;
        else return true;
    }

    public static void main(String[] args) {
        RobortMove test = new RobortMove();
        test.movingCount(5,10,10);
    }
}
