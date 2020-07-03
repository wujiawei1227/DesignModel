/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 16:55
 **/

public abstract  class HouseBuilder {
            protected House house=new House();
            //将建造的流程写好，抽象的方法
            public abstract void buildBasic();
            public abstract void buildWalls();
            public abstract void roofed();
            //建造好房子，将房子（产品）返回
            public House buildHouse(){
                return house;
            }

}
