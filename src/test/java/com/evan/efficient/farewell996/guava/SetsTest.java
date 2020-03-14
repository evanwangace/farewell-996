package com.evan.efficient.farewell996.guava;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName SetsTest
 * @Description Lists / Sets 使用
 * @Author Evan Wang
 * @Version 1.0.0
 * @Date 2020/3/13 14:43
 */
public class SetsTest {

    /**
     * Sets工具类的常用方法
     * 并集 / 交集 / 差集 / 分解集合中的所有子集 / 求两个集合的笛卡尔积
     *
     * Lists工具类的常用方式
     * 反转 / 拆分
     */

    private static final Set set1 =
            Sets.newHashSet(1, 2);

    private static final Set set2 =
            Sets.newHashSet(4);

    // 并集
    @Test
    public void union() {
        Set<Integer> set = Sets.union(set1, set2);

        System.out.println(set);

        List<Integer> list=new ArrayList<>();
    }

    // 交集
    @Test
    public void intersection() {
        Set<Integer> set = Sets.intersection(set1, set2);

        System.out.println(set);
    }

    // 差集：如果元素属于A而且不属于B
    @Test
    public void difference() {
        Set<Integer> set = Sets.difference(set1, set2);

        System.out.println(set);

        // 相对差集：属于A而且不属于B 或者 属于B而且不属于A
        set = Sets.symmetricDifference(set1, set2);

        System.out.println(set);
    }

    // 拆分所有子集合
    @Test
    public void powerSet() {
        Set<Set<Integer>> powerSet = Sets.powerSet(set1);

        System.out.println(JSON.toJSONString(powerSet));
    }

    // 计算两个集合笛卡尔积
    @Test
    public void cartesianProduct() {
        Set<List<Integer>> product =
                Sets.cartesianProduct(set1, set2);

        System.out.println(JSON.toJSONString(product));
    }

    /**
     * 拆分
     */
    @Test
    public void partition() {
        List<Integer> list =
                Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);
        //例如一次接口只能一次查询带3个参数的数据，那就可以用partition来拆分
        List<List<Integer>> partition =
                Lists.partition(list, 3);

        System.out.println(JSON.toJSONString(partition));
    }

    // 反转
    @Test
    public void reverse() {
        List<Integer> list = Lists.newLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> newList = Lists.reverse(list);

        System.out.println(newList);
    }

}
