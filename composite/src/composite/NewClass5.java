/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author skytech laptop store
 */

interface IEmployee extends Observer {
    void giveBonus(double bonus);
    double calculateSalary();
    Iterable<IEmployee> getSubordinates(); // Iterable for subordinates
}