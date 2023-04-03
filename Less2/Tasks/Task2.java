package Tasks;

//Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, etc..
//        Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.

import java.io.*;
import java.util.Arrays;


public class Task2 {

    public static void Parser(String file) throws IOException {

        String st = "";

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = "";

        while ((st = br.readLine()) != null) {
            str = st;
        }
        br.close(); 

        String str1 = str.replace(str.charAt(0), ' ');
        String[] strFinal = str1.trim().split(",");

        strFinal = collectValues(strFinal);
        String[] keys = new String[]{"Студент ", "получил ","по предмету ", "Студент ", "получил ","по предмету ", "Студент ", "получил ","по предмету "};


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keys.length; i++) {
            sb.append(keys[i]);
            sb.append(strFinal[i]);
            sb.append(" ");
            if (i % 3 == 2) {
                sb.append(".");
                sb.append("\n");
            }



        }
        System.out.println(sb);

    }


    public static String[] collectValues(String[] arr) {
        String[] arrValues = new String[arr.length];
        String temp = "";
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(":")) {
                ind = arr[i].indexOf(':');
                for (int j = ind + 2; j < arr[i].length(); j++) {
                    temp += arr[i].charAt(j);
                    if (arr[i].charAt(j + 1) == ' ') {
                        break;
                    }
                }
            }
            arrValues[i] = temp;
            temp = "";
        }

        return arrValues;
    }
    
}
