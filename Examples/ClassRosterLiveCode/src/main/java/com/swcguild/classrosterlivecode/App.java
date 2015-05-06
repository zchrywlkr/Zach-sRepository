/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classrosterlivecode;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {

        try {
            ClassRoster roster = new ClassRoster();
            Student currentStudent = new Student("0001");
            currentStudent.setFirstName("Joe");
            currentStudent.setLastName("smith");
            currentStudent.setCohort("Java April2015");
            roster.addStudent(currentStudent.getStudentId(), currentStudent);

            roster.writeRoster();
            
            ClassRoster readRoster = new ClassRoster();
            Student fileStudent = readRoster.getStudent("0001");
            
            if(fileStudent == null){
                System.out.println("roster empty as expeccted");
            }else{
                System.out.println("Unexpecteed student present");
                return;
            }
            
            readRoster.loadRoster();
            fileStudent = readRoster.getStudent("0001");
            
            System.out.println(fileStudent.getFirstName());
            System.out.println(fileStudent.getLastName());
            System.out.println(fileStudent.getCohort());
            System.out.println(fileStudent.getStudentId());
        } catch (IOException ex) {
            System.out.println("ERROR: IOException occured. Message = " + ex.getMessage());
        }
    }
}
