/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpa.datasorting;

import com.jpa.model.student.Student;

/**
 *
 * @author irmantastoleikis
 */
public interface BubbleSorting {
    
    public static void bubbleSort(Student[] array) {
        boolean sorted = false;
        Student temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getSMark() > array[i+1].getSMark()) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}