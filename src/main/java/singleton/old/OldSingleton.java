package singleton.old;

class OldSingleton {
	private static OldSingleton uniqueInstance = null;

	private OldSingleton() {
	}

	static OldSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new OldSingleton();
		}
		return uniqueInstance;
	}
}
