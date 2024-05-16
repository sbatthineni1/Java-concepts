package ext.gen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            students.add(new Student());

        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> lpastudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            lpastudents.add(new LPAStudent());

        }
        students.add(new LPAStudent());
        printList(lpastudents);

    }
    public static void printList(List students){
        for(var student : students){
            System.out.println(student);
        }
        System.out.println();
    }
}
