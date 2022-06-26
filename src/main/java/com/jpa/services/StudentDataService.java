/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.services;

import com.jpa.datasorting.BubbleSorting;
import com.jpa.datasorting.HeapSorting;
import com.jpa.datasorting.MergeSorting;
import com.jpa.model.student.Student;

/**
 *
 * @author irmantastoleikis
 */
public class StudentDataService extends TransactionalService implements BubbleSorting, HeapSorting, MergeSorting{
    
    public Student[] sDataBubbleSort(Student[] students){
        
        long startTime = System.nanoTime();
        BubbleSorting.bubbleSort(students);
        long endTime = System.nanoTime();
        
        System.out.println("Bubble Sort runtime: " + (endTime - startTime));
        return students;
    }
    
    public Student[] sDataHeapSort(Student[] students){
        
        long startTime = System.nanoTime();
        HeapSorting.heapSort(students);
        long endTime = System.nanoTime();
        
        System.out.println("Heap Sort runtime: " + (endTime - startTime));
        return students;
    }
    
    public Student[] sDataMergeSort(Student[] students){
        
        long startTime = System.nanoTime();
        MergeSorting.mergeSort(students, 0, students.length -1);
        long endTime = System.nanoTime();
        
        System.out.println("Merge Sort runtime: " + (endTime - startTime));
        return students;
    }
    
}
