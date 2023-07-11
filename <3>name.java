package thread;

public class name {

	public static void main(String[] args) {
		
		 Runnable subMain = new Runnable() {
				@Override
				public void run() {
					print();
				}
			};
		
		
		Thread th1 = new Thread(subMain);
		th1.setName("sub1");
		Thread th2 = new Thread(subMain);
		th2.setName("sub2");
       
		
        th1.start();
		th2.start();
		
		Thread th = Thread.currentThread(); 
		th.setName("Main");
		print();

	}
	
	public static void print() {
		
		Thread th = Thread.currentThread(); // 현재의 thread의 정보를 얻기위한 메소드
		
		
		for(int i=0; i<100; i++) {
			
			try {
				Thread.sleep(20);  // 성능이 높아서 늦추고자 사용합니다.
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
