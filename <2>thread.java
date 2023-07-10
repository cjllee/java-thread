package thread;

public class thread {

	public static void main(String[] args) {
		
		Thread th1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				print1();
			}
		});
		 
        Thread th2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				print2();
			}
		});
		
        th1.start();
		th2.start();
		

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

// 블로그 정리 링크 
// https://velog.io/@cjllee/%EC%9E%90%EB%B0%94-%EC%8A%A4%EB%A0%88%EB%93%9C%EC%9D%98-%EB%B9%84%EB%8F%99%EA%B8%B0%EC%B2%98%EB%A6%AC
