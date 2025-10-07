package classesAndObjects;

public class EmpGroups {

    String[] names;
    int[] ids;

    EmpGroups(Employees emp) {
        names = new String[3];
        ids = new int[3];

        names[0] = emp.emp1Name;
        names[1] = emp.emp2Name;
        names[2] = emp.emp3Name;

        ids[0] = emp.emp1ID;
        ids[1] = emp.emp2ID;
        ids[2] = emp.emp3ID;
    }

    void displayEmployees() {
        for(int i=0;i<3;i++) {
            System.out.println("Employee Name: " + names[i] + ", Employee ID: " + ids[i]);
        }
    }

    public static void main(String[] args) {
        Employees emp = new Employees();
        EmpGroups eg = new EmpGroups(emp);
        eg.displayEmployees();
    }
}



	
