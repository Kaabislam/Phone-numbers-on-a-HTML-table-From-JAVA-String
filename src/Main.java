import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] phoneNumbers = string.split(" ");
        for(String singleString:phoneNumbers){
            System.out.println(singleString);
        }
        System.out.println(generateHTML(phoneNumbers,2));

    }

    private static String generateHTML(String[] phoneNumbers, int rowSize) {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html><head><title>Phone Numbers</title></head><body><table>");
        htmlBuilder.append("\n");

        htmlBuilder.append("<tr>");
        for(int i = 1;i <= phoneNumbers.length;i++){
            if(phoneNumbers[i-1].length() != 11 || phoneNumbers[i-1].charAt(0) != '0'){
                continue;
            }
            htmlBuilder.append("<td>").append(phoneNumbers[i-1]).append("</td>");
            if(i%rowSize == 0){
                htmlBuilder.append("</tr>");
                htmlBuilder.append("\n");
                htmlBuilder.append("<tr>");
            }

        }
        htmlBuilder.append("</tr>");

        return htmlBuilder.toString();
    }
}
