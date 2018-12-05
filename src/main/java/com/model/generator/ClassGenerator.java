package com.model.generator;

import com.jiowa.codegen.config.JiowaCodeGenConfig;
import com.model.codegen.beans.Attribute_jgt;
import com.model.codegen.beans.Class_jgt;
import com.model.codegen.beans.JavaClass_jgt;
import com.jiowa.codegen.generator.AbstractGenerator;

/**
 * ClassGenerator.
 */
public class ClassGenerator extends AbstractGenerator
{
    /*------------------------------------------------------------------------*\
     * Constructor:                                                           *
    \*------------------------------------------------------------------------*/
    
    public ClassGenerator(JiowaCodeGenConfig config) 
    {
        super(config); 
    }


    /*------------------------------------------------------------------------*\
     * Public Methods:                                                        *
    \*------------------------------------------------------------------------*/

    @Override
    public void generate()
    {        
        // Class:
        Class_jgt t = new Class_jgt();
        t.setPackageName("generated.cls");
        t.setClassName("Joselo");
        t.setInterfaceName("java.io.Serializable");
        
        // Attributes:
        Attribute_jgt attr1 = t.foreachAttribute.append_Attribute_jgt().setDataType("Long").setAttributeName("number");
        Attribute_jgt attr2 = t.foreachAttribute.append_Attribute_jgt().setDataType("String").setAttributeName("text");
        
        // Constructor arguments:
        t.foreachAttribute.append_Argument_jgt(attr1); // 'parent constructor' for variable values 
        t.foreachAttribute.append_Argument_jgt(attr2); // works via automatic value propagation
        
        // Attribute initializations:
        t.foreachAttribute.append_AttributeInit_jgt(attr1); // 'parent constructor' for variable values
        t.foreachAttribute.append_AttributeInit_jgt(attr2); // works via automatic value propagation
        
        // Getter:
        t.foreachAttribute.append_Getter_jgt(attr1); // 'parent constructor' for variable values
        t.foreachAttribute.append_Getter_jgt(attr2); // works via automatic value propagation

        // genereate source files into appropriate folder:
        updateSourceFile("java/" + t.getPackageName().replace('.', '/') + "/" + t.getClassName() + ".java", t );                        
        System.out.println("------------------------------------");
        System.out.println("Test output for Class.jgt template: \n" + t);
        
        JavaClass_jgt c = new JavaClass_jgt(t);
        c.setPackageName("generated.cls.inline");
                
        // genereate source files into appropriate folder:
        updateSourceFile("java/" + c.getPackageName().replace('.', '/') + "/" + c.getClassName() + ".java", c );        
        System.out.println("------------------------------------");
        System.out.println("Test output for JavaClass.jgt template: \n" + c);
    }
}
