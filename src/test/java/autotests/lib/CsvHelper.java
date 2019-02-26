package autotests.lib;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.List;

public class CsvHelper {
    private static final Logger LOG = Logger.getLogger(CsvHelper.class);

    public List<String[]> readCsvFile(String path){
        CSVReader reader = null;
        List<String[]> csvData=null;
        try {
            reader = new CSVReader(new FileReader(path), ','  , '\n',0);
        } catch (FileNotFoundException e) {
            LOG.error("файл "+path+"не найден.", e);
        }
        try{
          csvData = reader.readAll();
          reader.close();
        }
        catch (IOException e){
            LOG.error("Ошибка чтения файла", e);
        }
        return csvData;
    }



    public void writeToCsv(String data, String path){
        MyFile.deliteFileIfExists(path);
        String csv = "src/test/resources/out.csv";
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csv),'\n');
            String [] record = data.split(",");
            writer.writeNext(record);
            writer.close();

        } catch (IOException e) {
            LOG.error("Ошибка записи файла", e);
        }
    }




}

