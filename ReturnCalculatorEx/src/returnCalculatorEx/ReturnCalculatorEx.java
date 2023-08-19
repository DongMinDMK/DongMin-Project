package returnCalculatorEx;

public class ReturnCalculatorEx {
	
	public int hap(int[] nums) {
		int result = 0;
		
		for(int i=0; i<nums.length; i++) {
			result += nums[i];
		}
		
		return result;
	}
	
	public int minus(int a, int b) {
		int result = 0;
		
		if(a > b) {
			result = a - b;
		}else if(a < b) {
			result = b - a;
		}
		
		return result;
	}
	
	public int mul(int a, int b) {
		int result = 0;
		
		result = a * b;
		
		return result;
	}
	
	public int div(int a, int b) {
		int result = 0;
		
		if(a < b) {
			result = b/a;
		}else if(a > b) {
			result = a/b;
		}
		
		return result;
	}
	
	public int remain(int a, int b) {
		int result = 0;
		
		if(a < b) {
			result = b%a;
		}else if(a > b) {
			result = a%b;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int numArr[] = {100, 200, 300};
		
		ReturnCalculatorEx rcex = new ReturnCalculatorEx();
		
		int result1 = rcex.hap(numArr);
		
		System.out.println(result1);
		
		
		int result2 = rcex.minus(13, 5);
		
		int result3 = rcex.minus(12, 22);
		
		
		System.out.println(result2);
		System.out.println(result3);
		
		
		int result4 = rcex.mul(10, 3);
		int result5 = rcex.mul(50, 3);
		
		System.out.println(result4);
		System.out.println(result5);
		
		int result6 = rcex.div(20, 5);
		int result7 = rcex.div(30, 5);
		int result8 = rcex.div(30, 4);
		
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		
		int result9 = rcex.remain(22, 5);
		int result10 = rcex.remain(55, 10);
		int result11 = rcex.remain(10, 7);
		
		System.out.println(result9);
		System.out.println(result10);
		System.out.println(result11);
		
		
	}

}
