
import java.util.*;
import javax.swing.*;

class Employee {
    private int empno;
    private String ename;
    private int salary;

    Employee(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return empno + " " + ename + " " + salary;
    }
}

class crud {
    public static void main(String[] args) {
        Collection<Employee> c = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter your choice: ");
            System.out.println(c);
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter empno: ");
                    int eno = s.nextInt();
                    System.out.print("Enter ename: ");
                    String ename = s1.nextLine();
                    System.out.print("Enter salary: ");
                    int salary = s.nextInt();

                    c.add(new Employee(eno, ename, salary));
                    break;
                case 2:
                    System.out.println("------------------");
                    Iterator<Employee> i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("-----------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("enter empno to search: ");
                    eno = s.nextInt();
                    System.out.println("----------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == eno) {
                            System.out.println(e);
                            found = true;
                        }
                        System.out.println(e);
                    }
                    System.out.println("-----------------------");
                    break;
            }

        } while (ch != 0);
    }
}