/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1stqa;

/**
 *
 * @author TOP
 */
public class studentmanager {
    public String name;
    public int grade1;
    public int grade2;
    public int grade3;

    public void setData(String n, int g1, int g2, int g3) {
        name = n;
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
    }

    public double calc() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public void print() {
        System.out.println(name + ": " + calc());
        if (calc() >= 50)
            System.out.println("pass");
        sendEmail(name, calc());
        saveToDatabase(name, calc());
    }

    public void sendEmail(String studentName, double average) {
        System.out.println("Email sent to " + studentName + " with average: " + average);
    }

    public void saveToDatabase(String studentName, double average) {
        System.out.println("Saved to DB: " + studentName + " - " + average);
    }

    public void printReport() {
        System.out.println("Report for: " + name);
        System.out.println("Grade1: " + grade1);
        System.out.println("Grade2: " + grade2);
        System.out.println("Grade3: " + grade3);
        System.out.println("Average: " + calc());
        System.out.println("Status: " + (calc() >= 50 ? "Pass" : "Fail"));
        System.out.println("Report for: " + name);
        System.out.println("Grade1: " + grade1);
        System.out.println("Grade2: " + grade2);
        System.out.println("Grade3: " + grade3);
        System.out.println("Average: " + calc());
        System.out.println("Status: " + (calc() >= 50 ? "Pass" : "Fail"));
    }

    public static void main(String[] args) {
        studentmanager s = new studentmanager();
        s.setData("ahmed", 70, 80, 90);
        s.print();
        s.printReport();
        String x = null;
        if (x.equals("test")) {
        }
    }
}