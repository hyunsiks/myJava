
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C13_Exception {

	/*
	 	# 예외 (Exception)
	 	
	 	 - 우리가 에러라고 알고 있던 빨간 글씨들을 사실 예외라고 부른다
	 	 - 프로그래머가 발생가능한 예외를 미리 예상하고 대비해두는 것을 
	 	   예외처리라고 한다
	 	 - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 예외라고 부른다(오타 등)
	 	 - 프로그래머가 예외에 대하여 적절한 조치를 취해준다면 
	 	   프로그램을 강제종료 하지 않고 계속해서 진행할 수 있다
	 	 - 예외가 발생할 가능성이 있는 메서드는 마우스를 올려보면 어떤 예외가 어떤 상황에
	 	   발생하는지에 대한 설명이 Throws에 적혀있다
	 	   
	 	# 예외처리
	 	
	 	 - 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다
	 	 - try문 내부에 있는 코드는 예외가 발생하지 않으면 모두 정상 실행된다
	 	 - try문 내부에서 예외가 발생하는 경우 실행이 즉시 중단되고
	 	   해당 예외를 담당하는 catch문으로 이동하게 된다
	 	 - catch문에는 발생한 예외에 대한 정보를 담고 있는 인스턴스가 도착하게된다
	     - catch문은 여러개 중첩해서 사용할 수 있다
	     - 예외가 발생하든 안하든 실행하고 싶은 코드는 finally에 작성한다
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("반드시 숫자만 입력해주세요! > ");
		
		try {
			a = sc.nextInt();
			//try구문안에서 아래쪽으로 아무리 많은 구문이 있어도
			//위에서 에러가 발생하면 즉각 종료되고 catch문으로 넘어감
		}catch(InputMismatchException e) {
//			e.printStackTrace(); //여기부터의 2줄이 기본동작이다(예외처리안했을때 설정되어있는 구문) //에러에 대한 정보를출력(변수명.printStackTrace())
//			System.exit(-1);
			System.out.println("이상한것을 입력해서 강제종료함"); //하지만 여기부터 2줄로 바꿔버림으로서 예외처리하는것
			return; //강제종료할때 리턴을 돌리면 시스템을 종료하고 finally의 내용을 전송한다
		}catch(IllegalStateException e) {
			System.out.println("스캐너가 닫혀있는데 입력받음");
			a = -1;
		}catch(NoSuchElementException e) {
			System.out.println("스캐너에 읽을 내용이 없는디?");
			a = -1;
		}finally {
			System.out.println(" 메롱 ");
		}
		System.out.println("입력하신 숫자 : " + a);
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}
	
}
