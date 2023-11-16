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

public class ComputerIterator {
    private final List<LabComputer> labComputers;
    private int index;

    public ComputerIterator(List<LabComputer> labComputers) {
        this.labComputers = labComputers;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < labComputers.size();
    }

    public LabComputer next() {
        if (hasNext()) {
            return labComputers.get(index++);
        } else {
            throw new IndexOutOfBoundsException("No more elements");
        }
    }
}
