package singleton.enumeration;

enum EnumSingleton {
	UNIQUE_INSTANCE;

	static EnumSingleton getUniqueInstance() {
		return UNIQUE_INSTANCE;
	}
}
