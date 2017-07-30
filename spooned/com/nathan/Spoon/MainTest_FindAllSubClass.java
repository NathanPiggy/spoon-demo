package com.nathan.Spoon;


public class MainTest_FindAllSubClass {
    public static void main(java.lang.String[] args) {
        java.lang.Class<?> clazz = spoon.reflect.declaration.CtElement.class;
        java.net.URL url = clazz.getResource("/");
        java.lang.System.out.println(url);
        java.lang.String fileName = url.getFile();
        java.lang.System.out.println(fileName);
        java.lang.String pathName = fileName.replaceFirst("/", "");
        java.lang.System.out.println(pathName);
        java.io.File rootFile = new java.io.File(pathName);
        com.nathan.Spoon.MainTest_FindAllSubClass.setSubList(rootFile, ((rootFile.getPath()) + "\\"), clazz);
    }

    public static <T> void setSubList(java.io.File rootFile, java.lang.String parentDirectory, java.lang.Class<T> parentClass) {
        if (rootFile.isDirectory()) {
            java.io.File[] files = rootFile.listFiles();
            for (java.io.File file : files) {
                com.nathan.Spoon.MainTest_FindAllSubClass.setSubList(file, parentDirectory, parentClass);
            }
        }else {
            java.lang.String className = null;
            try {
                if ((rootFile.getPath().indexOf(".class")) != (-1)) {
                    className = rootFile.getPath().replace(parentDirectory, "").replace(".class", "").replace("\\", ".");
                    java.lang.Class<?> classObject = java.lang.Class.forName(className);
                    classObject.asSubclass(parentClass);
                    if (!(className.equals(parentClass.getCanonicalName()))) {
                        java.lang.System.out.println(((className + " extends ") + parentClass));
                    }else {
                        java.lang.System.out.println(((className + " is ") + parentClass));
                    }
                }
            } catch (java.lang.ClassNotFoundException e) {
                java.lang.System.err.println(("can not find " + className));
            } catch (java.lang.ClassCastException e) {
                java.lang.System.err.println(((className + " do not extends ") + parentClass));
            }
        }
    }
}

