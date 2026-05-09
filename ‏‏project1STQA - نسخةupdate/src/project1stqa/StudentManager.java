/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1stqa;

/**
 *
 * @author TOP
 */
public class StudentManager {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public void setStudentData(String studentName, int firstGrade, int secondGrade, int thirdGrade) {
        name = studentName;
        grade1 = firstGrade;
        grade2 = secondGrade;
        grade3 = thirdGrade;
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public boolean isPassed() {
        return calculateAverage() >= 50;
    }

    public void printStudentResult() {
        System.out.println(name + ": " + calculateAverage());
        if (isPassed()) {
            System.out.println("pass");
        }
        notifyServices();
    }

    private void notifyServices() {
        sendEmail();
        saveToDatabase();
    }

    private void sendEmail() {
        System.out.println("Email sent to " + name + " with average: " + calculateAverage());
    }

    private void saveToDatabase() {
        System.out.println("Saved to DB: " + name + " - " + calculateAverage());
    }

    public void printReport() {
        printReportHeader();
        printGrades();
        printAverageAndStatus();
    }

    private void printReportHeader() {
        System.out.println("Report for: " + name);
    }

    private void printGrades() {
        System.out.println("Grade1: " + grade1);
        System.out.println("Grade2: " + grade2);
        System.out.println("Grade3: " + grade3);
    }

    private void printAverageAndStatus() {
        System.out.println("Average: " + calculateAverage());
        System.out.println("Status: " + (isPassed() ? "Pass" : "Fail"));
    }

    public static void main(String[] args) {
        StudentManager student = new StudentManager();
        student.setStudentData("ahmed", 70, 80, 90);
        student.printStudentResult();
        student.printReport();
    }
}