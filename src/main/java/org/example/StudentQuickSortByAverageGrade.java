package org.example;

public class StudentQuickSortByAverageGrade extends QuickSortStrategy<Student> {

    @Override
    protected int compare(Student first, Student second) {
        return (first.averageGrade - second.averageGrade) > -0.001
                ? 1
                : 0;
    }
}
