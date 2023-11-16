/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_labmid;

/**
 *
 * @author skytech laptop store
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skytech laptop store
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "001", "Linux", 2));
        students.add(new Student("Jane", "002", "Windows", 3));

        List<LabComputer> labComputers = new ArrayList<>();
        labComputers.add(new LabComputer("gcc", "Linux", "vim"));
        labComputers.add(new LabComputer("visual studio", "Windows", "visual studio code"));

        AllocationStrategy linuxAllocationStrategy = new LinuxAllocationStrategy();
        ComputerAllocator allocator = new ComputerAllocator(linuxAllocationStrategy, students, labComputers);

        allocator.allocateComputers();
        allocator.createAllocationList();
    }
}
