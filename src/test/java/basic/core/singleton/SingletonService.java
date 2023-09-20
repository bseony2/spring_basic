package basic.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    private SingletonService() {

    }

    public static SingletonService getSingletonService() {
        return instance;
    }
}
