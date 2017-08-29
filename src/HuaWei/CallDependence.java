package HuaWei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Computer user luoyu
 * Created by 张洋 on 16/8/17.
 */
public class CallDependence {
    Map<String,ArrayList<String>> map = new HashMap<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("input.txt"));
        CallDependence call = new CallDependence();
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if(!sc.hasNextLine())line = line+",";
            String[] module = line.split(",\\s{1,}");
            call.AddDependency(module[0].substring(1),module[1].substring(0,module[1].length()-2));
            call.AddDependency(module[1].substring(0,module[1].length()-2),null);
        }
        ArrayList<String> list = new ArrayList<>(call.map.keySet());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            boolean result = call.ModulesCycleDependency(list.get(i),list.get(i));
            System.out.print("{"+list.get(i)+", "+result+"}");
            if(i!=list.size()-1) System.out.println(",");
        }
        System.out.println();
    }
    public void AddDependency(String moduled,String dependModuled){
        if(dependModuled == null&&map.get(moduled)==null){
            map.put(moduled,new ArrayList<String>());
            return;
        }
        ArrayList<String> list = map.get(moduled);
        if(list==null){
            list = new ArrayList<>();
            list.add(dependModuled);
            map.put(moduled,list);
        }else {
            list.add(dependModuled);
        }
    }

    public boolean ModulesCycleDependency(String module,String target){
        ArrayList<String> list = map.get(module);
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if(temp.equals(target))return true;
            else {
                boolean result = ModulesCycleDependency(temp,target);
                if(result)return true;
            }
        }
        return false;
    }
    public void clear(){}
}
