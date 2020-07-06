/**
 * @program: DesignModel
 * @description:装饰父类
 * @author: wudaren
 * @create: 2020-07-06 12:05
 **/

public class AbstrackDecorator extends ABattercake {
    private ABattercake aBattercake;

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }

    public AbstrackDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }
}
