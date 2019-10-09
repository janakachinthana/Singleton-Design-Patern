/**
 * 
 */
package singleton;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @author janaka
 *
 */
public class TestSingleton implements Runnable {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread(new TestSingleton()).start();
		
		for(int i=0; i<10; i++) {
			
			Singleton.getInstance();
		}

	}

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			
			Singleton.getInstance();
		}
	}

}
