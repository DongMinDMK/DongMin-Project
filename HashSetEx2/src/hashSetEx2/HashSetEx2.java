package hashSetEx2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //업캐스팅
		//HashSet 제네릭 은 List<> 제네릭 타입에 비해 순서를 신경을 쓰지 않는다. 
		
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		HashSet<String> hs3 = new HashSet<String>();
		HashSet<String> hs4 = new HashSet<String>();
		
		hs1.add("나이 : 26");
		hs1.add("이름 : DMK");
		hs1.add("키 : 174");
		
		set.addAll(hs1);
		
		System.out.println("학생 A의 인적사항 : " + set);
		
		hs2.add("나이 : 30");
		hs2.add("이름 : KMT");
		hs2.add("키 : 180");
		
		set.addAll(hs2);
		
		System.out.println("학생 A,B의 인적사항 : " + set); //결과를 확인해보면 넣은 순서대로 결과가 나오는 것이 아닌 무작위로 순서가 나오는 것을 확인할 수 있음. 이것이 HashSet
		
		set.removeAll(hs1); //처음 삽입했던 학생 A 인적사항 삭제
		
		
		System.out.println("학생 B의 인적사항 : " + set);
		
		hs3.add("나이 : 40");
		hs3.add("이름 : KMS");
		hs3.add("키 : 190");
		
		set.addAll(hs3);
		
		System.out.println("학생 B,C의 인적사항 : " + set);
		
		
		hs4.add("나이 : 50");
		hs4.add("이름 : LKE");
		hs4.add("키 : 170");
		
		set.addAll(hs4);
		
		System.out.println("학생 B,C,D의 인적사항 : " + set);
		
		set.removeAll(hs2);
		set.removeAll(hs4);
		
		System.out.println("학생 C의 인적사항 : " + set);
		
		set.remove("나이 : 40");
		set.remove("키 : 190");
		
		System.out.println("학생 C의 인적사항 : " + set);
	}

}
