package com.evan.efficient.farewell996.lambda.cart;

import com.alibaba.fastjson.JSON;
import com.evan.efficient.farewell996.lamda.cart.CartService;
import com.evan.efficient.farewell996.lamda.cart.Sku;
import com.evan.efficient.farewell996.lamda.cart.SkuCategoryEnum;
import org.junit.Test;

import java.util.List;

public class Version2Test {

    @Test
    public void filterSkusByCategory() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中图书类商品集合
        List<Sku> result = CartService.filterSkusByCategory(
                cartSkuList, SkuCategoryEnum.BOOKS);

        System.out.println(JSON.toJSONString(
                result, true));
    }

}
