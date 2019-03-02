package pl.sda.proces_jk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Process process;
//
        String homeDir = System.getProperty("user.home");
        System.out.println(homeDir);
//
//        try {
//            process = Runtime.getRuntime().exec("cmd /c dir " + homeDir);
//            System.out.println(process.getOutputStream());
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//
//            System.out.println(reader);
//
//            String line;
//            while ((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Process process1;
//
//        try {
//            process1 = Runtime.getRuntime().exec("explorer");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Process process2;

        try {
            process2 = Runtime.getRuntime().exec("cmd /c notepad " + homeDir + "\\file.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(process2.getErrorStream()));

            System.out.println(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
