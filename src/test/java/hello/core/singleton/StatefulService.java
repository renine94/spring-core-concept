package hello.core.singleton;

public class StatefulService {

//    private int price;  // 상태를 유지하는 필드 10,000 -> 20,000

    public int order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        return price;
    }

}
