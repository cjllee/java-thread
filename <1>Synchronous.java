package thread;

public class Synchronous {

	public static void main(String[] args) {
		print1();
		print2();
		for(int i=0; i<100; i++) {
			System.out.printf("main:%d\n", i+1);
		}

	}
	
	
	public static void print1() {
		for(int i=0; i<100; i++) {
			System.out.printf("sub1:%d\n", i+1);
		}
		
	}
	
	
	public static void print2() {
		for(int i=0; i<100; i++) {
			System.out.printf("sub2:%d\n", i+1);
		}
		
	}
	

}


// https://velog.io/@cjllee/%EB%8F%99%EA%B8%B0%ED%98%95-%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4  (자세한 설명 링크)
