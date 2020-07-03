/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 17:04
 **/

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasic("地基十米");
        System.out.println("高楼打地基十米");
    }

    @Override
    public void buildWalls() {
        house.setWall("砌墙20厘米");
        System.out.println("高楼砌墙20厘米");
    }

    @Override
    public void roofed() {
        house.setRoofed("透明屋顶");
        System.out.println("高楼的透明屋顶");

    }
}
