package com.myproject;

import java.util.Scanner;

public class Exam {
    Scanner sc=new Scanner(System.in);
    int score=0;

    public void startExam() {
        
        System.out.println("\n--- Online Assessment ---");
        System.out.println("Answer the following questions: ");

        System.out.println("1. JVM stands for?");     //Q1
        System.out.println("a)Java Visual Machine");
        System.out.println("b)Java Virtual Machine");
        System.out.println("c)Java Validation Mechanism");
        System.out.println("d)Java Visual Mechanism");
        System.out.print("Your answer(a/b/c/d): ");
        char ans1= sc.next().charAt(0);
        if (ans1=='b') score++;

        System.out.println("2. Which language is platform independent?");  //Q2
        System.out.println("a)C");
        System.out.println("b)C++");
        System.out.println("c)Java");
        System.out.println("d)Python");
        System.out.print("Your answer(a/b/c/d): ");
        char ans2= sc.next().charAt(0);
        if (ans2=='c') score++;

        System.out.println("3. Which company developed Java?");    //Q3
        System.out.println("a)Sun Microsystems");
        System.out.println("b)IBM");
        System.out.println("c)Google");
        System.out.println("d)Microsoft");
        System.out.print("Your answer (1-4): ");
        char ans3= sc.next().charAt(0);
        if (ans3=='a') score++;
        showResult();
    }
       public void showResult(){
           System.out.println("\n -- Result --");
           System.out.println("Score: "+ score+ " /3");
        if (score == 3)
            System.out.println("Performance: Excellent");
        else if (score == 2)
            System.out.println("Performance: Good");
        else
            System.out.println("Performance: Needs Improvement");

        System.out.println("Thank you for attempting the test!!");
    }
}