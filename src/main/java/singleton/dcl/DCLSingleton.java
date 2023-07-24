package singleton.dcl;

class DCLSingleton {
	private volatile static DCLSingleton uniqueInstance;

	private DCLSingleton() {
	}

	DCLSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DCLSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DCLSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
