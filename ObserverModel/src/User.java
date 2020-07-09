import java.math.BigDecimal;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-07 17:43
 **/

public class User implements  Observer {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }
//更新信息
    @Override
    public void update(String mallName, String product, BigDecimal money) {
        System.out.println(userName+"接收到一条来自"+mallName+"的消息：您关注的商品【" + product + "】降价了！比您加入购物车的时候降了" + money + "元！");
    }
}
