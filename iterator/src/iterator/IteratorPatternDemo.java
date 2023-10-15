/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

/**
 *
 * @author skytech laptop store
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator iter = namesRepository.getIterator();


        String startingValue = "Mr";
        printStudentsWithNameStartingFrom(iter, startingValue);


        iter.MoveToLast();
        printAllStudents(iter);
    }

    public static void printStudentsWithNameStartingFrom(Iterator iterator, String startingValue) {
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getName().startsWith(startingValue)) {
                System.out.println("Name: " + student.getName());
            }
        }
    }

    public static void printAllStudents(Iterator iterator) {
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("RegNo: " + student.getRegNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
            System.out.println("Phone Number: " + student.getPhoneNumber());
            System.out.println();
        }
    }
}
