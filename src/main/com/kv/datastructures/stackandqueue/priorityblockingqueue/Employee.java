package main.com.kv.datastructures.stackandqueue.priorityblockingqueue;
import java.time.LocalDate;

public class Employee implements Comparable<Employee> {

    private Long empId;
    private String empName;
    private LocalDate empDob;

    public Employee(Long empId, String empName, LocalDate empDob) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empDob = empDob;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDob() {
        return empDob;
    }

    public void setEmpDob(LocalDate empDob) {
        this.empDob = empDob;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.getEmpId().compareTo(emp.getEmpId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDob=" + empDob +
                '}';
    }
}
