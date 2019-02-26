package autotests.lib;

import java.util.List;

public class StringUtils {

    public String revertDataToString(List<String[]> data){
        String result ="";
        for (int i=data.size()-1; i>=0;i--){
            result = result+data.get(i)[0]+",";

        }
        return result;
    }
}
