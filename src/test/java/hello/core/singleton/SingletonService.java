package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    // 만약 생성하더라도, 컴파일 에러를 유발해서 컴파일 단계에서 오류가 발생하도록 하는 것
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 호출");
    }
}
