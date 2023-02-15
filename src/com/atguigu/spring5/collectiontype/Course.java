package com.atguigu.spring5.collectiontype;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 4:45,
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
