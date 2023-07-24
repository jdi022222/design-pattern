package singleton.iodh;

public class IODHSingleton {
	private IODHSingleton() {
	}

	private static class IODHSingletonHolder {
		private static final IODHSingleton uniqueInstance = new IODHSingleton();
	}

	static IODHSingleton getInstance(){
		return IODHSingletonHolder.uniqueInstance;
	}
}
