package autotests.tests;

import autotests.lib.CsvHelper;
import autotests.lib.StringUtils;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;


@DisplayName("Реверсировать csv и записать в другой файл.")
public class csvTest {

CsvHelper csvHelper =new CsvHelper();
StringUtils stringUtils = new StringUtils();

    @Test
    public void jsonTest() {
        List<String[]> data =  csvHelper.readCsvFile("src/test/resources/from.csv");
        String reversiveData = stringUtils.revertDataToString(data);
        csvHelper.writeToCsv(reversiveData,"src/test/resources/out.csv");
    }
}
