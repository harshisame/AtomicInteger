import java.util.concurrent.atomic.AtomicInteger;

public class Gate {

		AtomicInteger atomicInt = new AtomicInteger(0);
		
		
		public void enter(){
			System.out.println("Counter Enter:"+atomicInt.incrementAndGet());
		}
		
		public void exit(){
			System.out.println("Counter Exit:"+atomicInt.decrementAndGet());
		}
		
		public AtomicInteger getCount(){
			System.out.println("total counter:"+atomicInt);
			return atomicInt;
		}

	
		public static void main(String[] args) {
		
			Thread thread = new Thread(new Guest());
			thread.start();
			
		}		
}
