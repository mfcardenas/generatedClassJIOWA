package com.model;

import com.jiowa.codegen.JiowaCodeGeneratorEngine;
import com.jiowa.codegen.config.JiowaCodeGenConfig;
import com.model.generator.ClassGenerator;

/**
 * ExampleCodeGenerationAplication.
 */
public class ExampleCodeGenerationApplication {
    /**
     * Main.
     * @param arguments
     */
    public static void main(String[] arguments) {
        JiowaCodeGenConfig config = new JiowaCodeGenConfig("codegen.properties");
        ClassGenerator      classGenerator  = new ClassGenerator(config);
        JiowaCodeGeneratorEngine engine = new JiowaCodeGeneratorEngine(classGenerator);
        engine.start();

    }
}
