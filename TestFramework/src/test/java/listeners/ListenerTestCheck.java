package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class ListenerTestCheck {

	@Test
	public void test1() {

		System.out.println("in test 1");
	}

	@Test
	public void test2() {

		System.out.println("in test 2");
	}

	@Test(enabled = false)
	public void test3() {

		System.out.println("in test 3");
	}
}
