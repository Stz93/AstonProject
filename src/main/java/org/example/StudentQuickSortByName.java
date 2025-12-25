package org.example;

/**
 * Класс сортировки по имени
 */
public class StudentQuickSortByName extends QuickSortStrategy<Student> {

    @Override
    protected int compare(Student first, Student second) {
        return first.name.compareTo(second.name);
    }
}
