/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.dataprocessing;

import com.jpa.model.student.Student;
import com.jpa.services.StudentDataService;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author irmantastoleikis
 */
public class DataProcessing {
    
    //Creating the File object
    
    public void retriveFileData(InputStream inputStream){

        Student[] studFromFile = new Student[0];
        Student[] dummyArr;
        Scanner sc = new Scanner(inputStream);
        
        while(sc.hasNext()) {
            String row = sc.nextLine();
            String[] dataInRow = row.split(",");
            
            Student student = new Student();
            student.setSName(dataInRow[0]);
            student.setSMark(Double.valueOf(dataInRow[1]));
            
            dummyArr = Arrays.copyOf(studFromFile, studFromFile.length + 1);
            dummyArr[dummyArr.length -1] = student;
            
            studFromFile = dummyArr;
      }
    }
    
    public Student[] doSorting(Student[] students){
        
        StudentDataService sDataService = new StudentDataService();
        sDataService.sDataBubbleSort(students);
        sDataService.sDataHeapSort(students);
        sDataService.sDataMergeSort(students);
        
        Student[] sorted = students;
        return sorted;
    }
    
}
