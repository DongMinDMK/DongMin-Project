import java.util.*;
public class stackEx1 {

	public static void main(String[] args) {
		Stack <String> s1 = new Stack<String>();
		int top = 0;
		
		//스택에 데이터 삽입. push()
		
		s1.push("Elementary School");
		top++;
		s1.push("Middle School");
		top ++;
		s1.push("High School");
		top ++;
		s1.push("Univercity School");
		top ++;
		
		System.out.println("현재 데이터는 " + s1 + "이 들어있습니다.");
		System.out.println("현재 Top은 " + top);
		
		// 스택에 있는 데이터 삭제. pop()
		// 스택은 LIFO 구조 이기 때문에 제일 마지막에 삽입된 Univercity School이 가장 먼저 삭제된다.
		System.out.println(s1.pop() + "이 삭제되었습니다.");
		top--;
		System.out.println("현재 데이터는 " + s1 + "이 들어있습니다.");
		System.out.println("현재 Top은 " + top);
		
		// High School 삭제
		System.out.println(s1.pop() + "이 삭제되었습니다.");
		top--;
		// Middle School 삭제
		System.out.println(s1.pop() + "이 삭제되었습니다.");
		top--;
		
		System.out.println("현재 데이터는 " + s1 + "이 들어있습니다.");
		System.out.println("현재 Top은 " + top);
		
		// 현재 스택에 들어있는 데이터는 Elementary school 이다. 이 상태에서 graduate school을 삽입한다.
		s1.push("Graduate school");
		top++;
		System.out.println("현재 데이터는 " + s1 + "이 들어있습니다.");
		System.out.println("현재 Top은 " + top);
		
		// graduate school이 삽입된 상태에서 다시 pop을 진행하면 다시 graduate school이 삭제된다.
		System.out.println(s1.pop() + "이 삭제되었습니다.");
		top--;
		
		// Elementary School 삭제
		System.out.println(s1.pop() + "이 삭제되었습니다.");
		top--;
		
		System.out.println("현재 Top은 " + top);
		
		if(s1.empty())
		{
			System.out.println("현재 스택에 데이터가 없습니다.");
		}
		
	}

}
