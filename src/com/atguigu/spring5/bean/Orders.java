package com.atguigu.spring5.bean;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 13:08,
 */

public class Orders {
    public Orders() {
        System.out.println("第一步执行无参构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步调用set方法设置属性值");
    }

    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("第三步执行初始化方法");
    }

    //创建执行的销毁的方法
    public void destroyMethod(){
        System.out.println("第五步执行销毁的方法");
    }
}
