package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CountTest {

    @Test
    void testCount() {
        CustomArrayList<Student> studentList = new CustomArrayList<>();
        Student.Builder builder = new Student.Builder();

        Student[] studentArray = new Student[6];
        studentArray[0] = builder.name("Sasha").averageGrade(0.97).recordBookNumber(100101).build();
        studentArray[1] = builder.name("Bogdan").averageGrade(0.99).recordBookNumber(888888).build();
        studentArray[2] = builder.name("Kirill").averageGrade(1.00).recordBookNumber(414144).build();
        studentArray[3] = builder.name("Tagir").averageGrade(0.98).recordBookNumber(366663).build();
        studentArray[4] = builder.name("Kirill").averageGrade(1.00).recordBookNumber(414144).build();
        studentArray[5] = builder.name("Kirill").averageGrade(1.00).recordBookNumber(414144).build();



        // Пример заполнения коллекции из стрима:
        Arrays.stream(studentArray).forEach(studentList::add);

        Assertions.assertEquals(3, Main.count(studentArray[2], studentList));
    }
}