package com.model;

import com.jiowa.codegen.JiowaCodeGeneratorEngine;
import com.jiowa.codegen.config.JiowaCodeGenConfig;
import com.model.generator.ClassGenerator;
import sun.plugin.JavaRunTime;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ExampleCodeGenerationAplication.
 */
public class ExampleCodeGenerationApplication {
    /**
     * Main.
     * @param arguments
     */
    public static void main(String[] arguments) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
//        JiowaCodeGenConfig config = new JiowaCodeGenConfig("codegen.properties");
//        ClassGenerator      classGenerator  = new ClassGenerator(config);
//        JiowaCodeGeneratorEngine engine = new JiowaCodeGeneratorEngine(classGenerator);
//        engine.start();

        compile("C:\\Users\\mcardenas\\Downloads\\generatedClassJava\\src\\main\\java\\generated\\cls\\Joselo.java");
        execute("generated.cls.Joselo");

    }

    public static void compile(String... files) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, files);
    }

    public static void execute(String file) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassLoader loadClass = ToolProvider.getSystemToolClassLoader();
        Class<?> cls = Class.forName(file, true, loadClass); // Should print "hello".

        /**
         * CON PARAMETROS EL CONSTRUCTOR
         */
        Object instance = cls.getConstructor().newInstance(); // Should print "world".
        System.out.println(instance);
        Method m = cls.getMethod("getText"); // get the method you want to call
        String args = null; // the arguments. Change this if you want to pass different args
        m.invoke(instance);

        /**
         * CON PARAMETROS EL CONSTRUCTOR
         */
        Constructor constructor = cls.getConstructor(new Class[] { Long.class, String.class });
        Object invoker = constructor.newInstance(new Object[] { 1L, "Agua" });
        Class arguments[] = new Class[] {};
        Method objMethod = cls.getMethod("getText", arguments);
        Object result = objMethod.invoke(invoker, (Object[]) arguments);
        System.out.println(result);
    }
}
