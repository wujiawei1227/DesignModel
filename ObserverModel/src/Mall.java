import java.math.BigDecimal;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-07 17:40
 **/

public class Mall implements  Observerable {
    private final String mallName="静茹实业";
    //通知所有观察者
    @Override
    public void notifyObserver(String product, BigDecimal money) {
        for (int i = 0; i < list.size(); i++) {
            Observer observer=list.get(i);
            observer.update(mallName,product,money);
        }
    }
//注册保存观察者
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }
}
