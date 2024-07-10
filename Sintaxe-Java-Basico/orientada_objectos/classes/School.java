package orientada_objectos.classes;

import java.awt.*;
// Criando objetos a partir da classe Student

public class School {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.name= "John";
        student1.age= 12;
        student1.color= Color.red;
        //student1.sex= Sex.MALE;

        Student student2 = new Student();
        student2.name= "Sophia";
        student2.age= 10;
        student2.color= Color.red;
        //student2.sex= Sex.FEMALE;

        Student student3 = new Student();
        student3.name= "Lily";
        student3.age= 11;
        student3.color= Color.darkGray;
        //student3.sex= Sex.FEMALE;
    }
}
