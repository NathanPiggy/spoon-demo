package com.nathan.Spoon;


public class CatchProcessor extends spoon.processing.AbstractProcessor<spoon.reflect.code.CtCatch> {
    public CatchProcessor() {
        super();
        java.lang.System.out.println("Came");
    }

    public void process(spoon.reflect.code.CtCatch element) {
        if ((element.getBody().getStatements().size()) == 0) {
            getFactory().getEnvironment().report(this, org.apache.log4j.Level.WARN, element, "empty catch clause");
            java.lang.System.out.println("empty catch clause");
        }
    }
}

