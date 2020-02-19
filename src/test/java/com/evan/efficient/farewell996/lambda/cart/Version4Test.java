package com.evan.efficient.farewell996.lambda.cart;

import com.alibaba.fastjson.JSON;
import com.evan.efficient.farewell996.lamda.cart.CartService;
import com.evan.efficient.farewell996.lamda.cart.Sku;
import com.evan.efficient.farewell996.lamda.cart.SkuTotalPricePredicate;
import org.junit.Test;

import java.util.List;

public class Version4Test {

    @Test
    public void filterSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 过滤商品总价大于2000的商品
        List<Sku> result = CartService.filterSkus(
                cartSkuList, new SkuTotalPricePredicate());

        System.out.println(JSON.toJSONString(
                result, true));
    }

}
