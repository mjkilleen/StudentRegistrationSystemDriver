
import org.joda.time.LocalDate;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
public class Driver {
     public static void main(String []args)
    
    
    {
      Student student1 = new Student("Mark Killeen", 23, "12402538", "Username", new LocalDate(1993, 7, 20));
     
      Student student2 = new Student("Dylan Ryan", 22, "12232137" , "Username", new LocalDate(1993, 11, 1));
      
      Student student3 = new Student("Robert Bakker", 21, "1232133","Username", new LocalDate(1995,3,26));
      
      Student student4 = new Student("Adrian Healy", 22, "12323232", "Username", new LocalDate(1994,5,20));
      
      Student student5 = new Student("Donal Delaney", 20, "13425028", "Username", new LocalDate(1995,11,21));
   
      Student student6 = new Student("Sean keusch", 23, "133525028", "username", new LocalDate(1993,06,23));
 
      
      
        Module Realtimesystems = new Module("CT420","Realtimesystems", new ArrayList<Student>());
        Realtimesystems.addStudent(student1);
        Realtimesystems.addStudent(student2);
        Realtimesystems.addStudent(student3);
        
        Module Distributedsystems = new Module("CT322","Distributedsystems", new ArrayList<Student>());
        Realtimesystems.addStudent(student1);
        Realtimesystems.addStudent(student2);
        Realtimesystems.addStudent(student3);
        
        Module Advancedprofessionskills = new Module("CT423","Advance professional skills", new ArrayList<Student>());
        Advancedprofessionskills.addStudent(student1);
        Advancedprofessionskills.addStudent(student2);
        Advancedprofessionskills.addStudent(student3);
        
        Module MachineLearning = new Module("CT447","Machine Learning & Data Mining", new ArrayList<Student>());
        MachineLearning.addStudent(student1);
        MachineLearning.addStudent(student2);
        MachineLearning.addStudent(student3);
        MachineLearning.addStudent(student4);
        MachineLearning.addStudent(student5);
        MachineLearning.addStudent(student6);
        
        Module ImageProcessing = new Module("CT336","Image processing", new ArrayList<Student>());
        ImageProcessing.addStudent(student1);
        ImageProcessing.addStudent(student2);
        ImageProcessing.addStudent(student3);
       
        Module Softwareengineering = new Module("ct417", "Software Engineering", new ArrayList<Student>());
        Softwareengineering.addStudent(student1);
        Softwareengineering.addStudent(student2);
        Softwareengineering.addStudent(student3);
        Softwareengineering.addStudent(student4);
        Softwareengineering.addStudent(student5);
        Softwareengineering.addStudent(student6);
       
        
        Module Systemonchip = new Module("EE445", "System on Chip", new ArrayList<Student>());
        Systemonchip.addStudent(student4);
        Systemonchip.addStudent(student5);
        Systemonchip.addStudent(student6);
        
        Module Engineeringelectromagnetics = new Module ("EE348", "Engineering Electromagnetics", new ArrayList<Student>());
        Engineeringelectromagnetics.addStudent(student4);
        Engineeringelectromagnetics.addStudent(student5);
        Engineeringelectromagnetics.addStudent(student6);
       
        Module Telecommmunications = new Module("EE343", "telecommincations", new ArrayList<Student>());
        Telecommmunications.addStudent(student4);
        Telecommmunications.addStudent(student5);
        Telecommmunications.addStudent(student6);
        
        Module DigitalsignalProcessing = new Module("EE445", "DigitalSignalProcessing", new ArrayList<Student>());
        DigitalsignalProcessing.addStudent(student4);
        DigitalsignalProcessing.addStudent(student5);
        DigitalsignalProcessing.addStudent(student6);
        
        Coursename ECE = new Coursename("Electronic and Computer Engineering", new ArrayList<Module>(), new LocalDate(2016, 9, 2), new LocalDate(2017, 5, 1));
        ECE.addModule(Systemonchip);
        ECE.addModule(MachineLearning);
        ECE.addModule(Telecommmunications);
        ECE.addModule(DigitalsignalProcessing);
        ECE.addModule(Engineeringelectromagnetics);
        
        

        Coursename CS = new Coursename("Computer Science",new ArrayList<Module>(), new LocalDate(2015, 6, 5), new LocalDate(2016, 5, 6));
        CS.addModule(Advancedprofessionskills);
        CS.addModule(Realtimesystems);
        CS.addModule(ImageProcessing);
        
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        
          for(Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Course: " + student.getCourse().getName());
            System.out.print("Modules: ");
            for (Module module : student.getModules()) {
                System.out.print(module.getName()+ ", ");
            }
            System.out.println("\n");
        }



    }

        
        
        
    }
     
     

