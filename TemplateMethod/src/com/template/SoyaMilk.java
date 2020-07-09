package com.template;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-09 11:41
 **/

public abstract  class SoyaMilk {
    //模板方法
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }
    //选材料
  public   void  select(){
        System.out.println("第一步，选择新鲜的好的黄豆");
    }
    //选择配料
     public abstract void addCondiments();
    public void soak(){
        System.out.println("第三步 黄豆和配料开始浸泡，需要三小时");
    }
    public void beat(){
        System.out.println("第四步 黄豆和配料放到豆浆机去打碎");
    }
}
