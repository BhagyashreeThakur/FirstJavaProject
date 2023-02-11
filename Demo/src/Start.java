import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;
public class Start {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Student Management App");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("PRESS 1 to ADD Student.");
			System.out.println("PRESS 2 to DELETE Student.");
			System.out.println("PRESS 3 to DISPLAY Student.");
			System.out.println("PRESS 4 to Exit App");
			int c=sc.nextInt();
			
			if(c==1) {
				
				//add student..
				System.out.println("Enter username : ");
				String name=sc.next();
				
				System.out.println("Enter User Phone Number : ");
				String phone=sc.next();
				
				System.out.println("Enter User city :");
				String city=sc.next();
				
				//create student object
				
				Student st=new Student(name, phone, city);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student Added Successfully...");
				} else
				{
					System.out.println("Something went wrong try again...");
				}
				System.out.println(st);
						
			} else if(c==2) {
			//delete students...
				
				System.out.println("Enter Student id to Delete : ");
				int userId=sc.nextInt();
				
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted...");
				} else {
					System.out.println("Something went wrong...");
				}
				
			} else if (c==3){
				//display students..
				StudentDao.showAllStudents();
				
			} else if(c==4) {
				// exit
				break;
			} else {
				
			}
		}
		System.out.println("Thankyou For Using My Application...");
	}

}
