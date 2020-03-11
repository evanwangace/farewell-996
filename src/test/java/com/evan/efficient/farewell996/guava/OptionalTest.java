package com.evan.efficient.farewell996.guava;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @ClassName OptionalTest
 * @Description 学习Java8中的Optional使用方法
 * @Author Evan Wang
 * @Version 1.0.0
 * @Date 2020/3/11 16:37
 */
public class OptionalTest {

    @Test
    public void test() throws Throwable {
        /**
         * 三种创建Optional对象方式
         */

        // 创建空的Optional对象
        Optional.empty();

        // 使用非null值创建Optional对象
        Optional.of("evan");

        // 使用任意值创建Optional对象
        Optional optional = Optional.ofNullable("evan");

        /**
         * 判断是否引用缺失的方法(建议不直接使用)
         */
        optional.isPresent();

        /**
         * 当optional引用存在时执行
         * 类似的方法：map filter flatMap
         */
        optional.ifPresent(System.out::println);


        /**
         * 当optional引用缺失时执行
         */
        optional.orElse("引用缺失");
        optional.orElseGet(() -> {
            // 自定义引用缺失时的返回值
            return "自定义引用缺失";
        });
        optional.orElseThrow(() -> {
            throw new RuntimeException("引用缺失异常");
        });
    }

    public static void stream(List<String> list) {
        //list.stream().forEach(System.out::println);


        Optional.ofNullable(list)
                .map(List::stream)
                //放空操作，如果list为空，则执行到orElseGet结束。
                .orElseGet(Stream::empty)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        stream(null);
    }

}
