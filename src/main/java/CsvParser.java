import java.io.FileWriter;
import java.io.IOException;


public class CsvParser {

    public static void main(String[] args) throws IOException {

        String csv = "abc:abc@gmail.com,xyz:xyz@hotmail.com";

        String[] personList = csv.split(",");

        //writing to text file
        writeToFile(personList);

        //writing to excel file
//        writeToExcel(personList);
    }

    public static void writeToFile(String[] personList) {
        try {
            FileWriter myWriter = new FileWriter("person-names.txt");
            for (String person : personList) {
                myWriter.write(person);
                myWriter.write("\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

//    private static void writeToExcel(String[] personData) throws IOException {
//        FileOutputStream out = new FileOutputStream("person-names-bkup.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        XSSFSheet sheet = workbook.createSheet("Person Data");
//
//        int rownum = 0;
//        int cellnum;
//        for (String person : personData) {
//            String[] nameEmail = person.split(":");
//            XSSFRow row = sheet.createRow(rownum++);
//            cellnum = 0;
//            for (String str : nameEmail) {
//                XSSFCell cell = row.createCell(cellnum++, CellType.STRING);
//                cell.setCellValue(str);
//            }
//        }
//        workbook.write(out);
//        out.close();
//        workbook.close();
//    }

}
