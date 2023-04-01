import java.util.*;
public class QueueEx1 {

	public static void main(String[] args) {
// 큐는 스택과는 다르게 FIFO, 즉 먼저 들어온 데이터가 먼저 빠져나가는 이론을 갖고 있다. 스택은 LIFO 이므로, 먼저 들어간 것이 제일 마지막에 나간다는 이론이다.
// 큐는 인터페이스이기 때문에 객체를 생성할 수가 없어 업캐스팅 작업이 필요하다.
		Queue<String> qu = new LinkedList<String>(); //업캐스팅
		
		String front;
		
		qu.add("Elementary School");
		qu.add("Middle School");
		qu.add("High School");
		qu.add("Univercity School");
		
		System.out.println("현재 큐에 들어있는 데이터들은 " + qu + "순으로 들어가있다.");
        // 여기서 element란 큐에 제일 먼저 삽입됬었던 즉, 큐에 제일 상단에 있는 데이터를 가진다. 그 element()를 front에 대입했다.
		front = qu.element();
        //따라서 제일 먼저 삽입된 front 값을 출력해보면
		System.out.println("front : " + front);
		
		//여기서 이제 remove를 출력해보면 제일 먼저 들어가있던, front값이였던 Elementary School이라는 데이터 값이 FIFO 에 의하여 삭제된다.
		System.out.println(qu.remove());
		System.out.println(qu);
		
		// 여기서 다시 큐에 데이터를 삽입해보자. 큐에 데이터를 삽입하는것은 위에 했던 방식대로 add()를 호출하여 넣으면 된다. 큐를 삽입하면 마지막에 데이터를 입력했던 Univercity School 데이터 뒤에 데이터가 들어간다.
		
		qu.add("Graduate school");
		System.out.println(qu);
		
		// 여기서 다시 front를 호출해보자 현재 front의 값은 Elementary School 이라는 데이터가 삭제됬기 때문에 Middle School 데이터가 되어있는 것을 알 수 있다.
		front = qu.element();
		System.out.println("front : " + front);
		
		//큐에 있는 데이터를 하나씩 삭제해보자.
		System.out.println(qu.remove());
		System.out.println(qu); // Middle School 삭제
		
		System.out.println(qu.remove());
		System.out.println(qu); // High School 삭제
		
		System.out.println(qu.remove());
		System.out.println(qu); // Univercity School 삭제
		
		System.out.println(qu.remove());
		System.out.println(qu); // Graduate School 삭제
		
		
		if(qu.isEmpty()) {
			System.out.println("현재 큐에 데이터가 비어있습니다. add()를 이용해 데이터를 입력해주세요.");
		}
		
		
	}

}
