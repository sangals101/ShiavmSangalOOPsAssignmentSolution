/**
 * 
 */
package Departments;

/**
 * @author Shivam Sangal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

		HrDepartment hrdept = new HrDepartment();
		System.out.println("\n\nWelcome to " + hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());

		TechDepartment techdept = new TechDepartment();
		System.out.println("\n\nWelcome to " + techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
	}

}
