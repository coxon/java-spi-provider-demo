package com.ai.kara.provider;

import com.ai.kara.spi.service.ISpiHelloWorld;

/**
 * @author coxon
 */
public class ClazzSpiProvider implements ISpiHelloWorld{
    public void sayHi() {
        System.out.println("=======================");
        System.out.println(this.getClass().getName());
    }
}
