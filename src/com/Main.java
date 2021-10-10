package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        var Employee = new Employee();
        Employee.setAge(20);
        Employee.setName("ali");
        Employee.setPhoneNumber("0916247612");
        Employee.setSalary("12000000");
        BufferedWriter bw;
        var strBuilder = new StringBuilder();

        try {
            bw = new BufferedWriter(new FileWriter("D:\\Test\\output.txt"));
            strBuilder.append("start").append("\n\n").append(Employee.toStringTwo()).append("\n").append(Employee).append("\n\n").append("end");
            bw.write(strBuilder.toString());
            bw.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

}