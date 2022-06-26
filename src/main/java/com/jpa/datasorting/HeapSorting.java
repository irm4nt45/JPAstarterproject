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
public interface HeapSorting {
    
    public static void heapify(Student[] array, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < length && array[left].getSMark() > array[largest].getSMark()) {
            largest = left;
        }
        if (right < length && array[right].getSMark() > array[largest].getSMark()) {
            largest = right;
        }
        if (largest != i) {
            Student tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;
            heapify(array, length, largest);
        }
    }
    
    public static void heapSort(Student[] array) {
        if (array.length == 0) {
            return;
        }
    
        int length = array.length;
    
    // Moving from the first element that isn't a leaf towards the root
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }
    
        for (int i = length - 1; i >= 0; i--) {
            Student tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array, i, 0);
        }
    }
}
