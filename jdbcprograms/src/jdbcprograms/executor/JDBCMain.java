package jdbcprograms.executor;

import jdbcprograms.services.CurdOperations;

public class JDBCMain {

	 public static void main(String[] args) {
		 CurdOperations.addstudent(101, "Bat");
		 CurdOperations.addstudent(102, "Cat");
		 CurdOperations.addstudent(103, "Rat");
	 }
}
