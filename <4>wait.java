package thread;

public class wait {

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		th.setName("Main");
		
		
		 Runnable subMain = new Runnable() {
				@Override
				public void run() {
					System.out.printf(" %s : %s\n", th.getName(), th.getState());
					print();
					System.out.printf(" %s : %s\n", th.getName(), th.getState());
				} 
			};
		
		
		
		
		Thread th1 = new Thread(subMain);
		th1.setName("sub1");
		
		System.out.printf(" %s : %s\n", th1.getName(), th1.getState()); // 시작전 상태 출력
		
        th1.start();
        
        System.out.printf(" %s : %s\n", th1.getName(), th1.getState()); // 시작후 상탱 출력

		
         System.out.printf(" %s : %s\n", th1.getName(), th1.getState());
         System.out.printf(" %s : %s\n", th1.getName(), th1.getState());
         System.out.printf(" %s : %s\n", th1.getName(), th1.getState());
		 System.out.printf(" %s : %s\n", th1.getName(), th1.getState());
		 
		 if(th1.isAlive())
			try {
				th1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		System.out.println("============ Main Exit ================="); // main 끝남
	}
	
	public static void print() {
		
		Thread th = Thread.currentThread();
		
		
		for(int i=0; i<100; i++) {
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if( th.getName().equals("Main")){
				System.out.printf("<%s[%d]:%d>\n", th.getName(), th.getId(), i+1);
			}
			else {
				System.out.printf("%s[%d]:%d\n", th.getName(), th.getId(), i+1);
			}
			
			
		}
		
	}
	

}


//추가설명 블로그 링크
// https://velog.io/@cjllee/Thread-state
