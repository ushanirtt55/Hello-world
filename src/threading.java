
public class threading extends Thread {
	
	public void run(){
		try{
			for(int i=1;i<10;i++){
				Thread.sleep(500);
				System.out.println("Run method");
			}
		}catch(Exception e){} 
		System.out.println(Thread.currentThread().getName());		
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		threading a = new threading();
		threading a1 = new threading();
		a.start();
		a.setName("New Thread");
		
		try{
			a.join();
		}catch(Exception e){}
		a1.start();
		a1.setName("Second thread");
		try{
			for(int i=1;i<5;i++){
				Thread.sleep(1000);
				System.out.println("Main method");
			}
		}catch(Exception e){}
		
		

	}

}
