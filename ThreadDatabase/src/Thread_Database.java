import java.util.*;
public class Thread_Database {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		String name = null;
		
		String a[] = {"김길동", "나길동", "다길동", "라길동", "마길동"};
		
		System.out.println("현재 데이터베이스에는 김길동, 나길동, 다길동, 라길동, 마길동이 삽입되어 있습니다.");
		
		System.out.println("현재 데이터베이스에 있는 이름을 하나씩 출력합니다.");
		
		
       try {
			for(int i=0; i<a.length; i++)
			{
				name = a[i];
				Thread.sleep(1000);
				System.out.println(name);
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
       
       System.out.print("여기서 엔터를 치면 출력된 결과가 1초마다 거꾸로 다시 한번 출력됩니다.");
       scanner.nextLine();
       
       try {
			for(int i=4; i >= 0; i--)
			{
				name = a[i];
				Thread.sleep(1000);
				System.out.println(name);
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
       
		

	}

}
