import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		
		/*----------Variables----------*/
		int mainMenuSelect;
		boolean mainIsWork = true;
		/*-----------------------------*/
		
		/*----------Constructor----------*/
		ToDoList ToDoList = new ToDoList();
		/*-----------------------------*/
		
		Scanner scan = new Scanner(System.in);

		while(mainIsWork) {
			System.out.println();
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("*                통합 Management 프로그램입니다.               *");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.print("\n원하는 작업을 선택하세요.\n1.Contacts, 2.To-Do List, 3.Appointments, 4.Notes, 5.Quit\n\n(숫자 1~5 중 하나 선택) > ");
			
			mainMenuSelect = scan.nextInt();
			
			switch(mainMenuSelect) {
				case 1:
					System.out.println();
					System.out.println("(수연) : 주소록 실행");
					break;
					
				case 2:
					System.out.println();
					ToDoList.ToDoList();
					break;
					
				case 3:
					System.out.println();
					System.out.println("(지수 ) : 약속 실행");
					break;
					
				case 4:
					System.out.println();
					System.out.println("(정혜) : 메모 실행");
					break;
					
				case 5:
					System.out.println();
					System.out.println("통합 Management 프로그램 종료");
					mainIsWork = false;
			}
		}
		scan.close();
	}
}
