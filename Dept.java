package oops1;

public class Dept {

	private int departmentid;
	private String departmentname;
	 
	
	public Dept() {
		
	}
	
	
	public Dept(int departmentid,String departmentname)
	{
	
		this.departmentid = departmentid;
	
		this.departmentname = departmentname;
	}
	
	
	

	public void getDept()
	{
		System.out.println(departmentid);
		System.out.println(departmentname);
		
		

	}

}
