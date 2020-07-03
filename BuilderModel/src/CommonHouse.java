/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 17:02
 **/

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasic("地基5米");
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("砌墙10厘米");
        System.out.println("普通房子砌墙10厘米");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通屋顶");

        System.out.println("普通房子屋顶");
    }
}
