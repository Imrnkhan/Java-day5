package com.masai;

import java.util.Scanner;


public class MainStu {
  
   
        public static void main(String[] args) {
             
            Scanner sc = new Scanner(System.in);
            
            System.out.println("How many student details want to print:");
            int number = sc.nextInt();
            
             
            int sum=0;
            int count=0;
            for(int i=1;i<=number;i++)
            {
                
                System.out.println("Enter Student Roll No:");
                int rollNo = sc.nextInt();
                
                System.out.println("Enter Student Name:");
                String nameOfStudent = sc.next();
                
                System.out.println("Enter Student Marks:");
                int marks = sc.nextInt();
                
                System.out.println("Enter Student Address:");
                String addressOfStudent = sc.next();
                
                sum += marks;
                count++;
                Student s = new Student(rollNo, nameOfStudent, addressOfStudent, marks);
                System.out.println("===================================================");
                System.out.println("Student Name:"+s.getName());
                System.out.println("Student Roll No:"+s.getRoll());
                System.out.println("Student Address:"+s.getAddress());
                System.out.println("Student Makrs:"+s.getMarks());
                System.out.println("===================================================");
                System.out.println("Student====="+i+1+"======Details");
                System.out.println("----------------------------------------------------");
                    
            }
            
            System.out.println("Average of All Student Makrs is: "+sum/count);
            
            
            
            
            
        }
    
    }
    

