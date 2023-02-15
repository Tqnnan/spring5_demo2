package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 5:00,
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
