/**
 * @program: DesignModel
 * @description: 指挥者 去指定制造流程 返回产品
 * @author: wudaren
 * @create: 2020-07-03 16:59
 **/

public class HouseDirector {
    HouseBuilder houseBuilder=null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //如何处理建造房子的流程 交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
