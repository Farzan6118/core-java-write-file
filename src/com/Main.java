package com;

import com.model.Employee;

import java.io.*;

public class Main {

    public static String pathFile = "D:\\Test\\output.txt";
    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void main(String[] args) {
        boolean letsRead = true;
        var employee = new Employee();
        employee.setAge(40);
        employee.setName("devil");
        employee.setPhoneNumber("09516526563");
        employee.setSalary("18000000");

        var main = new Main();
        try {
            if (letsRead) {
                System.out.println(main.readFromFile());
                br.close();
            } else {
                main.writeToFile(employee);
                bw.close();
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public String readFromFile() throws IOException {

        var strBuilder = new StringBuilder();
        br = new BufferedReader(new FileReader(pathFile));
        String s;
        while ((s = br.readLine()) != null) {
            strBuilder.append(s);
        }

        return strBuilder.toString();
    }

    public void writeToFile(Employee employee) throws IOException {

        var strBuilder = new StringBuilder();
        bw = new BufferedWriter(new FileWriter(pathFile));
        strBuilder.append(employee.toStringTwo()).append("\n").append(employee);
        bw.write(strBuilder.toString());

    }

}