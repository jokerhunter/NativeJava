package com.mume.Module_1_JavaSE_Basic.Innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:     Mume
 * @description:  闭包测试类
 * @version:    1.0
 */

public class ClosureTest {
    List<ClosureInterface> list = new ArrayList<ClosureInterface>();

    public void input() {
        for(int i=0;i<10;i++)
        {
            // java编译器会强制要求使用final变量接收闭包中的i，所以这里final int copy = i;需要做一个内存拷贝，否则编译不过。
            // (在c#中没有强制要求会导致列有被遍历时始终会取 i 最大值，这是因为延迟执行引起的)
            final int finalI = i;
            list.add(new ClosureInterface() {
                @Override
                public void closure() {
                    System.out.println(finalI);
                }
            });
        }
    }

    public void output()
    {
        for(ClosureInterface a : list){a.closure();}
    }

    public static void main(String[] args) {
        ClosureTest closureTest = new ClosureTest();
        closureTest.input();
        closureTest.output();
    }
}
