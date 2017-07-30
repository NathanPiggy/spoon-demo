package com.nathan.Spoon;

import java.util.Set;

import org.apache.log4j.Level;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.ModifierKind;

/**
 * Reports warnings when empty catch blocks are found.
 */
/**
 * @author Nathan Zhu
 *
 */
public class ClassProcessor extends AbstractProcessor<CtClass> {


	/**
	 * If this class is only a utility class, you should make the class final and define a private constructor
	 */
	@Override
	public void process(CtClass paramE) {
		System.out.println(">>>>>>>>> Start to check the [" + paramE.getActualClass().getName() +"] Class definition <<<<<<<<<<<<<<");
		
		if(!paramE.hasModifier(ModifierKind.FINAL)) {
			 System.out.println("Utility Class is recommanded to be defined as FINAL!!!");
			 System.out.println();
		}else {
			 System.out.println("Utility Class is FINAL now. : )");
		}
		
		
		System.out.println(">>>>>>>>> Start to check the Class definition <<<<<<<<<<<<<<");
		Set<CtConstructor> set = paramE.getConstructors();
		int counter = 0;
		
		for(CtConstructor constructor : set) {
			if(constructor.hasModifier(ModifierKind.PUBLIC) || constructor.hasModifier(ModifierKind.PROTECTED)) {
				 getFactory().getEnvironment().report(this, Level.WARN, paramE, "Utility Class Constructor is accessible!");
				 counter ++;
				 System.out.println("------------------- " +counter+ " ---------------------");
				 System.out.println("Utility Class Constructor is accessible! It should be defined as private! Constructor is :");
		         System.out.println(constructor.toString());
		         System.out.println("------------------------------------------");
			}
			
		}
		
		
	}

	
	
   

	
}
