package com.mume.Module_5_Socket_IO.Module_5_4_NIO;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * 演示ByteBuffer
 *
 * put()完再get() 需要先执行flip()  limit = position; position = 0; mark = -1;
 * get()完再put() 需要先执行clear()  position = 0; limit = capacity; mark = -1;
 * @author mume
 */
public class NIODemo01_Buffer {
    public static void main(String[] args) {
        // 1.创建create
        // 第一种创建方式：在堆中创建缓冲区：allocate(capacity)
        // 最常用的使用方式
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        // 第二种创建方式：在系统内存创建缓冲区：allocate(int capacity)
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(10);

        // 第三种创建方式：通过普通数组创建缓冲区：wrap(byte[] arr)
        byte[] arr = {97,98,99};
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(arr);

        // 2.ByteBuffer操作
        byteBuffer.put((byte) 97);
        byteBuffer.put((byte) 98);
        byteBuffer.put((byte) 99);
        System.out.println(Arrays.toString(byteBuffer.array()));

        byte b = byteBuffer.get(1);
        System.out.println(b);

        // 3.ByteBuffer核心属性  capacity不会根据操作而变化
        System.out.println("缓存最大容量" + byteBuffer.capacity());
        System.out.println("缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");

        byteBuffer.put("Hello".getBytes());


        System.out.println("put1后---缓存最大容量" + byteBuffer.capacity());
        System.out.println("put1后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("put1后---缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");

        // 4. 读取 先执行flip方法，再读取

        // flip方法：一般称为切换成 读模式
        // 每次要从缓冲区中读取数据，就要调用flip方法切换到读模式
        byteBuffer.flip(); /* limit = position; position = 0; mark = -1; */

        System.out.println("flip后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("flip后---缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");

        // （1）创建一个limit()大小的字节数组（因为就只有limit这么多个数据可读）
        byte[] bytes = new byte[byteBuffer.limit()];

        // （2）将读取出来的数据装进字节数组中
        // 调用get方法会使position = limit; 每调用一次get()，position都会+1
        byteBuffer.get(bytes);

        // （3）输出数据
        System.out.println("取得的值：" + new String(bytes, 0, bytes.length));
        System.out.println("get1后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("get1后---缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");

        // 5. 调用clear()，清空缓存区
        byteBuffer.clear();  // position = 0; limit = capacity; mark = -1;
        System.out.println("取得的值：" + new String(bytes, 0, bytes.length));
        System.out.println("clear后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("clear后---缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");
        // 调用clear()方法只是把position，limit，mark复位，数据不会被删除
        char c = (char) byteBuffer.get(); // a   // position++;
        System.out.println(c);
        System.out.println("get2后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("get2后---缓存位置（下一次操作put的位置）：" + byteBuffer.position()); // 1
        System.out.println("------------------------------------");

        // 由于上面进行了一次get()，所以position++，所以put从1开始,并且之前的值会被清空
        byteBuffer.put("mume".getBytes()); // byteBuffer变为amume
        System.out.println("put2后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("put2后---缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");


        // 6. mark值的作用：记录上一次读写位置的值 position的值 5
        byteBuffer.mark();

        byteBuffer.put("Hello".getBytes());
        System.out.println("put3后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("put3后---缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");
        // byteBuffer.flip();
        // bytes = new byte[byteBuffer.limit()];
        // byteBuffer.get(bytes);
        // System.out.println("取得的值：" + new String(bytes, 0, bytes.length)); // amume

        // reset()方法除了把position回到mark的位置，也把字符串也返回到原始状态
        // byteBuffer字符串amume
        byteBuffer.reset();
        System.out.println("put3后---缓存限制（不能对该索引后的值进行操作）：" + byteBuffer.limit());
        System.out.println("put3后---缓存位置（下一次操作put的位置）：" + byteBuffer.position());
        System.out.println("------------------------------------");
        // byteBuffer.flip();
        // bytes = new byte[byteBuffer.limit()];
        // byteBuffer.get(bytes);
        // System.out.println("取得的值：" + new String(bytes, 0, bytes.length)); // amume


    }
}
