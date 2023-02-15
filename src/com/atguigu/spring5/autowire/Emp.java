package com.atguigu.spring5.autowire;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 19:26,
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
