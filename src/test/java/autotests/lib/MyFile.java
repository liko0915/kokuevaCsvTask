package autotests.lib;

import org.apache.log4j.Logger;

import java.io.File;


public class MyFile {
    private static final Logger LOG = Logger.getLogger(MyFile.class);

    public static void deliteFileIfExists(String path){
        File file = new File(path);
        if(file.isFile())
            file.delete();
    }

}
