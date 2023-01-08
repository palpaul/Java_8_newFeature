package streamJava8;

public class Employee2 {

private String empName;
private String empBranch;
private int empSal;
public Employee2(String empName, String empBranch, int empSal) {
	super();
	this.empName = empName;
	this.empBranch = empBranch;
	this.empSal = empSal;
}
public Employee2() {
	super();
	// TODO Auto-generated constructor stub
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpBranch() {
	return empBranch;
}
public void setEmpBranch(String empBranch) {
	this.empBranch = empBranch;
}
public int getEmpSal() {
	return empSal;
}
public void setEmpSal(int empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employee2 [empName=" + empName + ", empBranch=" + empBranch + ", empSal=" + empSal + "]";
}


}
