/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author skytech laptop store
 */
class EmployeeController {
    public String generateOrganogram(IEmployee employee) {
        StringBuilder orgChart = new StringBuilder();

        orgChart.append(employee.getClass().getSimpleName()).append(" -> ");

        for (IEmployee subordinate : employee.getSubordinates()) {
            orgChart.append(subordinate.getClass().getSimpleName()).append(", ");
            orgChart.append(generateOrganogram(subordinate));
        }

        return orgChart.toString();
    }
}
