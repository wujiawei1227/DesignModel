/**
 * @program: DesignModel
 * @description: 香肠装饰类
 * @author: wudaren
 * @create: 2020-07-06 12:15
 **/

public class SausageDecorator extends AbstrackDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
