package com.fishc.designPatterns.templateMethod;

/**
 * @Author: panchichun
 * @Date: 2018/11/12
 * @Description: 抽象类 模板方法
 */
public abstract class AbstractClass {

    public void primitiveOperation1() {
        System.out.println("1、“大煮干丝”是哪个菜系的代表菜之一( )。\n" +
                "A四川菜系 B山东菜系 C广东菜系 D淮扬菜系");
        System.out.println("答案：" + answer1());
    }

    public void primitiveOperation2() {
        System.out.println("2、红茶属于( )茶。\n" +
                "A半发酵 B发酵 C不发酵 D微发酵");
        System.out.println("答案：" + answer2());

    }

    public String answer1() {
        return "";
    }

    public String answer2() {
        return "";
    }

  public void templateMethod() {
      primitiveOperation1();
      primitiveOperation2();
  }
}
