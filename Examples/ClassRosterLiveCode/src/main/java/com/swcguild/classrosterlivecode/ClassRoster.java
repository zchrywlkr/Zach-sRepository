/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classrosterlivecode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ClassRoster {
    HashMap<String,Student> students = new HashMap<>();
    public static final String ROSTER_FILE="roster.txt";
    public static final String DELIMITER ="::";
    
    public Student getStudent(String studentId){
        return students.get(studentId);
    }
    public Student addStudent(String studentId,Student student){
        return students.put(studentId, student);        
    }
    public Student removeStudent(String studentId){
        return students.remove(studentId);
    }
    public void writeRoster() throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(ROSTER_FILE));
        Collection<Student> studentCollection = students.values();
        for(Student student:studentCollection){
            out.println(student.getStudentId()+ DELIMITER + student.getFirstName()+DELIMITER+student.getLastName()+DELIMITER +student.getCohort());
            out.flush();
        }
        out.close();
    }
    
    public void loadRoster() throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        String currentLine;
        String[] currentTokens ;
 
        while(sc.hasNext()){
           currentLine = sc.nextLine();
           currentTokens = currentLine.split(DELIMITER);
           Student student = new Student(currentTokens[0]);
           student.setFirstName(currentTokens[1]);
           student.setLastName(currentTokens[2]);
           student.setCohort(currentTokens[3]);
           students.put(student.getStudentId(),student);
        }
        sc.close();
    }
    
}
