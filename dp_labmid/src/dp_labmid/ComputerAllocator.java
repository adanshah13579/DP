/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_labmid;

/**
 *
 * @author skytech laptop store
 */
import java.util.List;

public class ComputerAllocator {
    private final AllocationStrategy strategy;
    private final List<Student> students;
    private final List<LabComputer> labComputers;

    public ComputerAllocator(AllocationStrategy strategy, List<Student> students, List<LabComputer> labComputers) {
        this.strategy = strategy;
        this.students = students;
        this.labComputers = labComputers;
    }

    public void allocateComputers() {
        strategy.allocate(students, labComputers);
    }

    public void createAllocationList() {
        strategy.printAllocation(labComputers);
    }
}
