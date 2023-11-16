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

public interface AllocationStrategy {
    void allocate(List<Student> students, List<LabComputer> labComputers);
    void printAllocation(List<LabComputer> labComputers);
}