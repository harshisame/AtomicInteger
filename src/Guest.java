public class Guest implements Runnable{
	public void run(){
		Gate gate = new Gate();
		try {
			gate.enter();
			gate.exit();
			gate.getCount();			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
