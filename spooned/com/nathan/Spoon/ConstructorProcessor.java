package com.nathan.Spoon;


public class ConstructorProcessor extends spoon.processing.AbstractProcessor<spoon.reflect.declaration.CtConstructor> {
    @java.lang.Override
    public void process(spoon.reflect.declaration.CtConstructor paramE) {
        java.lang.System.out.println(paramE.getBody().getLastStatement());
    }
}

