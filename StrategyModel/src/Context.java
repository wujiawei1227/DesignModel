/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-09 10:58
 **/

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //上下文接口
    public void  contextInterface(){
        strategy.algorithmInterface();
    }
}
