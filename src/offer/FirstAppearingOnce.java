package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Computer user luoyu
 * Created by 张洋 on 21/8/17.
 */
public class FirstAppearingOnce {
    StringBuilder sb = new StringBuilder();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            if(null==map.get(sb.charAt(i)))map.put(sb.charAt(i),1);
            else {
                int temp = map.get(sb.charAt(i));
                map.put(sb.charAt(i),++temp);
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            int temp = map.get(sb.charAt(i));
            if(temp==1)return sb.charAt(i);
        }
        return '#';
    }
}
