package com.dwh.common.Proxy.Customize;

/**
 * @author: Steven
 * @create: 2024-07-12 17:44
 * @Description:
 */
public class CalculatorService implements ICalculatorService{
    @Override
    public int add(Integer a, Integer b) {
        return a + b;
    }
}
