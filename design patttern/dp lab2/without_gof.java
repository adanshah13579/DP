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
class NonSingletonDatabase {
    private static NonSingletonDatabase instance;
    
    private NonSingletonDatabase() {
        // Initialize database connection
    }
    
    public static NonSingletonDatabase getInstance() {
        if (instance == null) {
            instance = new NonSingletonDatabase();
        }
        return instance;
    }
    
    public void query(String sql) {
        // Execute SQL query
    }
}

public class without_gof {

    public static void main(String[] args) {
        NonSingletonDatabase db1 = NonSingletonDatabase.getInstance();
        NonSingletonDatabase db2 = NonSingletonDatabase.getInstance();
        
        // Both db1 and db2 point to the same database instance
    }
}

