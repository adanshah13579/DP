/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_lb_2;

/**
 *
 * @author fa20-bse-036
 */
class SingletonDatabase {
    private static SingletonDatabase instance = new SingletonDatabase();
    
    private SingletonDatabase() {
        // Initialize database connection
    }
    
    public static SingletonDatabase getInstance() {
        return instance;
    }
    
    public void query(String sql) {
        // Execute SQL query
    }
}

public class with_gof {

    public static void main(String[] args) {
        SingletonDatabase db1 = SingletonDatabase.getInstance();
        SingletonDatabase db2 = SingletonDatabase.getInstance();
        
        // Both db1 and db2 point to the same database instance
    }
}
