import java.math.BigDecimal;

/**
 * @program: DesignModel
 * @description:
 * Observer:定义观察者收到通知时的方法
 * User：观察者实例 ，实现Observer接口
 * Observerable：定义增加 删除 通知观察者对象的方法 持有观察者对象集合
 * Mall：Observerable具体实现类
 * @author: wudaren
 * @create: 2020-07-07 17:45
 **/

public class client {
    public static void main(String[] args) {
        Observerable mall=new Mall();
        //添加3个订阅者
        Observer user1 = new User("MuggleLee");
        Observer user2 = new User("Josn");
        Observer user3 = new User("Pakho");
        //注册保存订阅者
        mall.registerObserver(user1);
        mall.registerObserver(user2);
        mall.registerObserver(user3);
        //通知所有的观察者
        mall.notifyObserver("iPhone XR",new BigDecimal(100));

        System.out.println();
        //移除一位订阅者
        mall.removeObserver(user3);
        //通知所有的观察者
        mall.notifyObserver("iPhone XS",new BigDecimal(300));
    }
}
