
	class MyThread extends Thread{
		public void run() {
			for(int i=1; i<=5; i++) {
				System.out.println("Thread: "+Thread.currentThread().getId()+ " - Count: " + i);
				try {
					Thread.sleep(2000);
				}
				catch (InterruptedException e) {
					System.out.println("Thread interrupted");
				}
			}
		}
	}
	public class Question_18 {
	public static void main(String[] args) {
		MyThread myThread= new MyThread();
		myThread.start();
	}

}
