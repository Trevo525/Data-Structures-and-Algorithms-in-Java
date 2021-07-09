public class EmployeeNode {
    
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return this.next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    
    public String toString() {
        return employee.toString();
    }

}
