package com.mume.Module_1_JavaSE_Basic.JavaSPI;

import java.util.List;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: Search 接口定义
 * @date: 2024-03-09 13:27
 * @version: 1.0
 */
public interface Search {
    public List<String> searchDoc(String keyword);
}
