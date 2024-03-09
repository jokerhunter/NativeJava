package com.mume.Module_1_JavaSE_Basic.JavaSPI;

import java.util.List;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: TODO
 * @date: 2024-03-09 13:53
 * @version: 1.0
 */
public class DatabaseSearch implements Search {

    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据搜索 "+keyword);
        return null;
    }
}
