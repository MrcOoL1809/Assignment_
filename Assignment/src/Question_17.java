//import Prerak.NewThread;
////(Query)
public class Question_17 {

	class ChildThread implements Runnable{
		String msg;
		Thread t;
		public ChildThread(String msg) {
			this.msg=msg;
			t = new Thread(this);
			t.start();
		}
		public void run() {
			for(int i=1;i<=5;i++) {
				try {
					System.out.println(this.t+" : "+i);
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void main(String[] args) {
//		NewThread t1 = new NewThread("hello");
		Thread t = new Thread();
		t.start();

	}

}
