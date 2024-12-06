package day11;

public class Employee {
	private String Empname;
	private int Empid;
	private int Empage;
	private String EmpDep;
	
	
	public Employee() {
		
		}
	public Employee(String Empname,int Empid,int Empage,String EmpDep) {
		this.Empname=Empname;
		this.Empid=Empid;
		this.Empage=Empage;
		this.EmpDep=EmpDep;
		
		}
	public void setEmpname(String Empname) {
		this.Empname=Empname;
	}
		public void setEmpid(int Empid) {
			this.Empid=Empid;
		}
		public void setEmpage(int Empage) {
			this.Empage=Empage;
		}
		public void setEmpDep(String EmpDep) {
			this.EmpDep=EmpDep;
		}
		
		public String getEmpname() {
			return Empname;
		}
		public int getEmpid() {
			return Empid;
		}
		public int getEmpage() {
			return Empage;
		}
		public String getEmpDep() {
			return EmpDep;
	}
		public String toString() {
			return"your Name:"+Empname+"\n your Empage:"+Empage+"\n your Empid:"+Empid+"\n your EmpDep:"+EmpDep;
		
					
		}}



