package My_Projects;

import java.util.Scanner;
 class Student{
    String Student_Name;
    int Student_Id;
    int[] Marks = new int[5];
    int total = 0;
    double Percentage;
    char Grade;

    void inputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        Student_Name = sc.nextLine();
        System.out.print("Enter Student Id: ");
        Student_Id = sc.nextInt();
        System.out.println("Enter marks for 5 sujects (out of 100):");
        for(int i=0 ; i<5 ; i++){
            System.out.print("Subject " + (i+1) + " : ");
            Marks[i] = sc.nextInt();
            total += Marks[i];
        }
        calculatePercentage();
        assignGrade();
        sc.close();
    }

    void calculatePercentage(){
        Percentage = total/5.0;
    }
    void assignGrade(){
        if(Percentage >= 90)
        Grade = 'A';
        else if(Percentage >= 75)
        Grade = 'B';
        else if(Percentage >= 60)
        Grade = 'C';
        else if(Percentage >= 40)
        Grade = 'D';
        else
        Grade = 'F';
    }

    void displayDetails() {
        System.out.println("\n- - - Student Report - - -");
        System.out.println("Name     :" + Student_Name);
        System.out.println("Id       :" + Student_Id);
        System.out.println("Marks    :-");
        for(int i=0; i<5 ; i++){
            System.out.println("Subject " + (i+1) + " : " + Marks[i]);
        }
        System.out.println("Total     :" +total);
        System.out.printf("Percentage :%.2f%%\n",Percentage);
        System.out.println("Grade    :" +Grade);
    }
}
public class Project_1{
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.inputDetails();
        S1.displayDetails();
    }
}
