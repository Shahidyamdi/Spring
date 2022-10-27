package lombok;

import com.lomboks.demo.emp;

public class test {
	public static void main(String[] args) {
		// setter and getter

//		emp e1 = new emp();
//		e1.setEid(4545);
//		e1.setEname("Dugra");
//		e1.setEsal(23424.43);
//		System.out.println(e1.getEid() + " " + e1.getEname() + " " + e1.getEsal());
		
		//constructor
		
		emp e2 = new emp(123,"shahid",50000);
		emp e3 = new emp(123, "ratan", 90000.45);
		System.out.println(e2);
		System.out.println(e3);
	}

}
