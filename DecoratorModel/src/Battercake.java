/**
 * @program: DesignModel
 * @description: 煎饼果子实体类
 * @author: wudaren
 * @create: 2020-07-06 12:03
 **/

public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼果子";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
