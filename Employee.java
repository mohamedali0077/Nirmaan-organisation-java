package day14;

public class Employee
{
   private String EmpName;
   private String Department;
   private int id;
   private long PhoneNo;
   
   
   public Employee() 
   {
   }
	   public Employee(String EmpName,String Department,long PhoneNo,int id) {
			this.EmpName=EmpName;
			this.Department=Department;
			this.id=id;
			this.PhoneNo=PhoneNo;
   }
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(Long PhoneNo) {
		this.PhoneNo = PhoneNo;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", Department=" + Department + ", id=" + id + ", PhoneNo=" + PhoneNo
				+ "]";
	}
	   
	   
}
