package com.myproject;

public class Main {

    public static void main(String CP[] ) {

        Login login=new Login();
        String user=login.authenticate();

        if (user != null) {
            Exam exam=new Exam();
            exam.startExam();
        } else {
            System.out.println("Access denied.");
        }
    }
}