/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Gareth Jon Lynch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.gazbert.bxbot.core.api.trading;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/*
 * Tests a Market Order domain object behaves as expected.
 */
public class TestMarketOrder {

    private static final BigDecimal PRICE = new BigDecimal("671.91");
    private static final BigDecimal QUANTITY = new BigDecimal("0.01345453");
    private static final BigDecimal TOTAL = PRICE.multiply(QUANTITY);


    @Test
    public void testMarketOrderIsInitialisedAsExpected() {

        final MarketOrder marketOrder = new MarketOrder(OrderType.BUY, PRICE, QUANTITY, TOTAL);

        assertEquals(OrderType.BUY, marketOrder.getType());
        assertEquals(PRICE, marketOrder.getPrice());
        assertEquals(QUANTITY, marketOrder.getQuantity());
        assertEquals(TOTAL, marketOrder.getTotal());
    }

    @Test
    public void testSettersWorkAsExpected() {

        final MarketOrder marketOrder = new MarketOrder(null, null, null, null);
        assertEquals(null, marketOrder.getType());
        assertEquals(null, marketOrder.getPrice());
        assertEquals(null, marketOrder.getQuantity());
        assertEquals(null, marketOrder.getTotal());

        marketOrder.setType(OrderType.BUY);
        assertEquals(OrderType.BUY, marketOrder.getType());

        marketOrder.setPrice(PRICE);
        assertEquals(PRICE, marketOrder.getPrice());

        marketOrder.setQuantity(QUANTITY);
        assertEquals(QUANTITY, marketOrder.getQuantity());

        marketOrder.setTotal(TOTAL);
        assertEquals(TOTAL, marketOrder.getTotal());
    }
}
