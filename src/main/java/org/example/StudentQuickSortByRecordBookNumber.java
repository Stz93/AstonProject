package org.example;


/**
 * Класс сортировки по номеру зачетной книжки
 */
public class StudentQuickSortByRecordBookNumber extends QuickSortStrategy<Student> {

    @Override
    protected int compare(Student first, Student second) {
        return first.recordBookNumber - second.recordBookNumber;
    }
}