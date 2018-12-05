//
// AUTOMATICALLY GENERATED from template file GermanLetter.jgt
// 
// by the Jiowa Code Generation Framework (www.jiowa.de)
//

package com.model.codegen.beans;

import com.jiowa.template.variable.*;
import com.jiowa.template.bean.*;
import com.jiowa.template.bean.part.*;
import com.jiowa.template.variable.*;
import com.jiowa.template.variable.parser.*;
import com.jiowa.template.text.operator.*;
import java.util.*;

/**
 * AUTOMATICALLY GENERATED <br>
 *  
 * Template Bean: GermanLetter_jgt <br>
 * Generation Timestamp: Wed Dec 05 00:56:07 CET 2018 <br>
 * JIOWA CodeGen Version: jiowa-codegen-2.1.6 
 * 
 * <p>
 * Generated by the JIOWA Code Generation Framework (<a href="http://www.jiowa.de">www.jiowa.de</a>) <br>
 * Written by <a href="http://www.mencl.de/">Robert Mencl</a> for <br>
 * JIOWA Business Solutions GmbH, Bettinastr. 30, D-60325 Frankfurt am Main, Germany.<br>
 * Download link: <a href="http://www.jiowa.de/download.html">www.jiowa.de/download.html</a> <br>
 * License: <a href="http://www.jiowa.de/license.html">www.jiowa.de/license.html</a>
 * 
 */
@SuppressWarnings("unused")
public class GermanLetter_jgt extends TemplateBean
{   
    /*------------------------------------------------------------------------*\
     * Fields & constants:                                                    *
    \*------------------------------------------------------------------------*/
    
    /**
     * The ID for this template bean. It is used for type mapping during automatic value propagation of subtemplates.
     */
    public static final java.lang.String ID = "GermanLetter.";            
    
    /*------------------------------------------------------------------------*\
     * Constructors:                                                          *
    \*------------------------------------------------------------------------*/

    public GermanLetter_jgt()
    {
        initialize();
    }

    /** 
     * Something similar like a copy constructor.
     * Actually it is a 'parent constructor'.
     * During evaluation, each time a variable or subtemplate has not been set the 
     * evaluator if has been set in the parent bean.
     * If so, it takes the values from the parent bean.
     * @param parent parent template bean for value propagation
     */    
    public GermanLetter_jgt(TemplateBean parent)
    {
        super(parent);  // 'parent constructor' similar to copy constructor. See explanation above!
        initialize();
    }
    
    /*------------------------------------------------------------------------*\
     * Static creation methods:                                               *
     * (often used while filling data into a template bean)                   *
    \*------------------------------------------------------------------------*/

    /**
     * Returns the id of this template bean (i.e. either template file name or inline subtemplate identifier.
     * @return the ID of this template bean as string value
     */
    @Override
    public java.lang.String id()
    {
        return ID; 
    }

    /*------------------------------------------------------------------------*\
     * Methods for template variables:                                        *
    \*------------------------------------------------------------------------*/

    /**
     * Returns the value of Name.
     * @return value of Name
     */
    public java.lang.String getName()
    {
        return variableValue("Name"); 
    }
    
    /**
     * Sets the value of Name.
     * @param value the value of Name as string
     * @return the reference to the current template bean
     */
    public GermanLetter_jgt setName(java.lang.String value)
    {
        variableMap.put("Name", value);
        return this;
    }
    
    /**
     * Returns the value of ContactPerson.
     * @return value of ContactPerson
     */
    public java.lang.String getContactPerson()
    {
        return variableValue("ContactPerson"); 
    }
    
    /**
     * Sets the value of ContactPerson.
     * @param value the value of ContactPerson as string
     * @return the reference to the current template bean
     */
    public GermanLetter_jgt setContactPerson(java.lang.String value)
    {
        variableMap.put("ContactPerson", value);
        return this;
    }

    /*------------------------------------------------------------------------*\
     * Classes & Methods for sub template structures:                         *
    \*------------------------------------------------------------------------*/
    
    /** 
     * Constant Salutation which can be used for the data insertion process 
     */
    public final Salutation Salutation = new Salutation(this);
    
    /**
     * This class resembles the subtemplate structure identifier 'Salutation' from the 
     * template GermanLetter.jgt.
     */
    public static class Salutation
    {
        /*------------------------------------------------------------------------*\
         * ID to template bean class mapping :                                    *
        \*------------------------------------------------------------------------*/
        
        /**
         * This map delivers the corresponding template bean class for a given (sub)template identifier.
         * This ensures that (sub)template filtering works even in those cases where the user might choose
         * to obfuscate his template beans (for whatever reason).
         */
        protected static ID2ClassMap ID_2_CLASS_MAP = new ID2ClassMap();
        
        /*------------------------------------------------------------------------*\
         * Parent template bean:                                                  *
        \*------------------------------------------------------------------------*/
        
        /** 
         * Parent template bean (also used for value propagation). 
         * If values or subtemplates are not set in this template, the initializations are propagated from 
         * the parent bean. 
         */
        protected GermanLetter_jgt parent = null;
    
        /*------------------------------------------------------------------------*\
         * Constructors:                                                          *
        \*------------------------------------------------------------------------*/
    
        /** 
         * Constructor for Salutation with a reference to parent bean. 
         * The parent bean is used for automatic value propagation which works for variable values as well as for subtemplates. 
         * @param parent parent bean for value propagation
         */
        protected Salutation(GermanLetter_jgt parent)
        {
            this.parent = parent;
            if (this.parent != null)
            {
                this.parent.putID2ClassMap("Salutation", ID_2_CLASS_MAP);
            }
        }    
    
        /*------------------------------------------------------------------------*\
         * Methods                                                                *
        \*------------------------------------------------------------------------*/
    
        /** 
         * Returns a reference to parent template bean. 
         * @return parent template bean
         */
        protected GermanLetter_jgt parent()
        {
            return this.parent;        
        }
        
        /*------------------------------------------------------------------------*\
         * Nested classes for inline sub templates                                *
        \*------------------------------------------------------------------------*/
    
        /**
         * Inline subtemplate bean class for identifier: Mr 
         */
        public static class Mr extends TemplateBean
        {   
            /*------------------------------------------------------------------------*\
             * Fields & constants:                                                    *
            \*------------------------------------------------------------------------*/
            
            /**
             * The ID for this template bean. It is used for type mapping during automatic value propagation of subtemplates.
             */
            public static final java.lang.String ID = "Mr";        
        
            /** Upward link from this template bean to host bean GermanLetter_jgt */
            protected GermanLetter_jgt GermanLetter_jgt;     
            
            /*------------------------------------------------------------------------*\
             * Constructors:                                                          *
            \*------------------------------------------------------------------------*/
        
            public Mr()
            {
                initialize();
            }
        
            /** 
             * Something similar like a copy constructor.
             * Actually it is a 'parent constructor'.
             * During evaluation, each time a variable or subtemplate has not been set the 
             * evaluator if has been set in the parent bean.
             * If so, it takes the values from the parent bean.
             * @param parent parent template bean for value propagation
             */    
            public Mr(TemplateBean parent)
            {
                super(parent);  // 'parent constructor' similar to copy constructor. See explanation above!
                initialize();
            }
        
            /**
             * Creates and instance of this bean with parent reference and links this bean 
             * to the host bean class which encloses this class above the substructure class.
             * 
             * @param parent Reference to the parent bean for value propagation. This can be a template bean of any type!
             * @param hostBean Reference to the template bean class instance in which this template bean is nesting in. 
             *                 This reference can be used to navigate 'upwards' during the data insertion process.
             */
            protected Mr(TemplateBean parent, GermanLetter_jgt hostBean)
            {
                 super(parent);
                 this.GermanLetter_jgt = hostBean;
                 initialize();
            }
            
            /*------------------------------------------------------------------------*\
             * Static creation methods:                                               *
             * (often used while filling data into a template bean)                   *
            \*------------------------------------------------------------------------*/
        
            /**
             * Returns the id of this template bean (i.e. either template file name or inline subtemplate identifier.
             * @return the ID of this template bean as string value
             */
            @Override
            public java.lang.String id()
            {
                return ID; 
            }
        
            /**
             * Returns the reference to the enclosing host template bean. 
             * This is used during the data insertion process for navigation across the different classes.
             * @return the reference to the host bean 'GermanLetter_jgt'
             */
            public GermanLetter_jgt GermanLetter_jgt()
            {   
                return this.GermanLetter_jgt;
            }
        
            /*------------------------------------------------------------------------*\
             * Methods for template variables:                                        *
            \*------------------------------------------------------------------------*/
        
            /*------------------------------------------------------------------------*\
             * Classes & Methods for sub template structures:                         *
            \*------------------------------------------------------------------------*/
        
            /*------------------------------------------------------------------------*\
             * Creates the bean parts of this template bean that are used by the      *
             * super class for the toString() method.                                 *
            \*------------------------------------------------------------------------*/
        
            /** 
             * Initializer for variables and subtemplate structures
             * and for the data structures (i.e. bean parts) which prepare the bean data for the
             * toString() method.
             */
            protected void initialize()
            {
                // variables:        
                // subtemplates:        
                // bean parts for toString() method:
                partList.add(new TextPart("geehrter Herr",0));
            }
        }
        
        /**
         * Inline subtemplate bean class for identifier: Mrs 
         */
        public static class Mrs extends TemplateBean
        {   
            /*------------------------------------------------------------------------*\
             * Fields & constants:                                                    *
            \*------------------------------------------------------------------------*/
            
            /**
             * The ID for this template bean. It is used for type mapping during automatic value propagation of subtemplates.
             */
            public static final java.lang.String ID = "Mrs";        
        
            /** Upward link from this template bean to host bean GermanLetter_jgt */
            protected GermanLetter_jgt GermanLetter_jgt;     
            
            /*------------------------------------------------------------------------*\
             * Constructors:                                                          *
            \*------------------------------------------------------------------------*/
        
            public Mrs()
            {
                initialize();
            }
        
            /** 
             * Something similar like a copy constructor.
             * Actually it is a 'parent constructor'.
             * During evaluation, each time a variable or subtemplate has not been set the 
             * evaluator if has been set in the parent bean.
             * If so, it takes the values from the parent bean.
             * @param parent parent template bean for value propagation
             */    
            public Mrs(TemplateBean parent)
            {
                super(parent);  // 'parent constructor' similar to copy constructor. See explanation above!
                initialize();
            }
        
            /**
             * Creates and instance of this bean with parent reference and links this bean 
             * to the host bean class which encloses this class above the substructure class.
             * 
             * @param parent Reference to the parent bean for value propagation. This can be a template bean of any type!
             * @param hostBean Reference to the template bean class instance in which this template bean is nesting in. 
             *                 This reference can be used to navigate 'upwards' during the data insertion process.
             */
            protected Mrs(TemplateBean parent, GermanLetter_jgt hostBean)
            {
                 super(parent);
                 this.GermanLetter_jgt = hostBean;
                 initialize();
            }
            
            /*------------------------------------------------------------------------*\
             * Static creation methods:                                               *
             * (often used while filling data into a template bean)                   *
            \*------------------------------------------------------------------------*/
        
            /**
             * Returns the id of this template bean (i.e. either template file name or inline subtemplate identifier.
             * @return the ID of this template bean as string value
             */
            @Override
            public java.lang.String id()
            {
                return ID; 
            }
        
            /**
             * Returns the reference to the enclosing host template bean. 
             * This is used during the data insertion process for navigation across the different classes.
             * @return the reference to the host bean 'GermanLetter_jgt'
             */
            public GermanLetter_jgt GermanLetter_jgt()
            {   
                return this.GermanLetter_jgt;
            }
        
            /*------------------------------------------------------------------------*\
             * Methods for template variables:                                        *
            \*------------------------------------------------------------------------*/
        
            /*------------------------------------------------------------------------*\
             * Classes & Methods for sub template structures:                         *
            \*------------------------------------------------------------------------*/
        
            /*------------------------------------------------------------------------*\
             * Creates the bean parts of this template bean that are used by the      *
             * super class for the toString() method.                                 *
            \*------------------------------------------------------------------------*/
        
            /** 
             * Initializer for variables and subtemplate structures
             * and for the data structures (i.e. bean parts) which prepare the bean data for the
             * toString() method.
             */
            protected void initialize()
            {
                // variables:        
                // subtemplates:        
                // bean parts for toString() method:
                partList.add(new TextPart("geehrte Frau",0));
            }
        }
    
        /*------------------------------------------------------------------------*\
         * Public Methods for sub template structures:                            *
        \*------------------------------------------------------------------------*/
        
        /**
         * Returns all elements which have been stored for this sub template structure identifier: 'Salutation'.
         * @return list of all template beans for this sub structure identifier: 'Salutation'.
         */
        public TemplateBeanList getAll() 
        {
            return parent.subTemplateStructureMap().get("Salutation");
        }
    
        /**
         * Sets all elements of the template bean list for the subtemplate structure identifier 'Salutation'.
         * @param beanList the list of templates beans to be inserted for this substructure identifier: 'Salutation'
         * @return reference to current template bean.
         */
        public GermanLetter_jgt setAll(TemplateBeanList beanList)
        {
            parent.subTemplateStructureMap.put("Salutation", beanList);
            return parent;
        }
        
        /** 
         * Creates and sets a subtemplate according to its identifier and returns a reference to this sub template instance.
         * @param subTemplateIdentifier the identifier for the subtemplate. Examples: Attribute.jgt, Arg, ... etc.
         * @return reference to this sub template
         */
        public TemplateBean setSubTemplate(java.lang.String subTemplateIdentifier)
        {
            return parent.setSubTemplate("Salutation", subTemplateIdentifier);
        }
        
        /** 
         * Creates and sets a subtemplate according to its identifier and returns a reference to this sub template instance.
         * @param subTemplateIdentifier the identifier for the subtemplate. Examples: Attribute.jgt, Arg, ... etc.
         * @param parentBean reference to parent bean for automatic value propagation
         * @return reference to this sub template
         */
        public TemplateBean setSubTemplate(java.lang.String subTemplateIdentifier, TemplateBean parentBean)
        {
            return parent.setSubTemplate("Salutation", subTemplateIdentifier, parentBean); 
        }
    
        /** 
         * Clears all data that has been stored for subtemplate structure identifier 'Salutation'
         */
        public void clear()   
        {
            parent.subTemplateStructureMap().put("Salutation", new TemplateBeanList()); 
        }
        
        /*------------------------------------------------------------------------*\
         * Methods for sub templates of this inline sub template:                 *
         * (inclusion of inline and external sub templates)                       *
        \*------------------------------------------------------------------------*/
    
        /**
         * Add this subtemplate to ID & class mapping.
         */
        static
        {
            ID_2_CLASS_MAP.put("Mr", Mr.class);
        }
        
        /** 
         * Prepends the bean to the list of beans for Salutation. 
         * @param bean the bean to inserted at the beginning the template bean list.
         * @return reference to current template bean.
         */
        public GermanLetter_jgt prepend(Mr bean)
        {
            parent.subTemplateStructureMap.prepend("Salutation", bean);    
            return parent;
        }
        
        /** 
         * Creates and prepends a bean Mr to Salutation and returns a reference to this bean. 
         * @return reference to current template bean.
         */
        public Mr prepend_Mr()
        {
            TemplateBean parentBean = parent;
            Mr bean = new Mr(parentBean, parent); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Creates and prepends a bean Mr to Salutation and sets a reference to a parent bean.
         * @param parentBean the reference to parent template bean for value propagation
         * @return reference to current templat bean
         */
        public Mr prepend_Mr(TemplateBean parentBean)
        {
            Mr bean = new Mr(parentBean, parent); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Appends the bean to the list of beans for Salutation. 
         * @param bean the bean to be added to the list
         * @return reference to current template bean
         */
        public GermanLetter_jgt append(Mr bean)
        {
            parent.subTemplateStructureMap.append("Salutation", bean);    
            return parent;
        }
        
        /** 
         * Creates and appends a bean Mr to Salutation and returns a reference to this bean. 
         * @return the reference to the created bean of type Mr
         */
        public Mr append_Mr()
        {
            TemplateBean parentBean = parent;
            Mr bean = new Mr(parentBean, parent); 
            append(bean);
            return bean;
        }
        
        /** 
         * Creates and appends a bean Mr to Salutation and initializes its values with the given TemplateBean and returns a reference to this bean. 
         * @param parentBean reference to parent template bean for value propagation.
         * @return the reference to the created bean of type Mr
         */
        public Mr append_Mr(TemplateBean parentBean)
        {
            Mr bean = new Mr(parentBean, parent); 
            append(bean);
            return bean;
        }
        
        /** 
         * Sets the list of beans of Salutation to exactly one bean. 
         * @param bean the bean which is inserted into the template bean list as one and only element.
         * @return reference to current template bean 
         */
        public GermanLetter_jgt set(Mr bean)
        {
            parent.subTemplateStructureMap.put("Salutation", bean);
            return parent;
        }
        
        /** 
         * Sets a bean Mr for Salutation and returns a reference to this bean.
         * @return reference to created template bean.
         */
        public Mr set_Mr()
        {
            TemplateBean parentBean = parent;
            Mr bean = new Mr(parentBean, parent); 
            set(bean);
            return bean;
        }
        
        /** 
         * Sets a bean Mr for Salutation, sets its parent template bean and returns a reference the created bean. 
         * @param parentBean the parent template bean for value propagation.
         * @return reference to created template bean
         */
        public Mr set_Mr(TemplateBean parentBean)
        {
            Mr bean = new Mr(parentBean, parent); 
            set(bean);
            return bean;
        }
        
        /**
         * Add this subtemplate to ID & class mapping.
         */
        static
        {
            ID_2_CLASS_MAP.put("Mrs", Mrs.class);
        }
        
        /** 
         * Prepends the bean to the list of beans for Salutation. 
         * @param bean the bean to inserted at the beginning the template bean list.
         * @return reference to current template bean.
         */
        public GermanLetter_jgt prepend(Mrs bean)
        {
            parent.subTemplateStructureMap.prepend("Salutation", bean);    
            return parent;
        }
        
        /** 
         * Creates and prepends a bean Mrs to Salutation and returns a reference to this bean. 
         * @return reference to current template bean.
         */
        public Mrs prepend_Mrs()
        {
            TemplateBean parentBean = parent;
            Mrs bean = new Mrs(parentBean, parent); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Creates and prepends a bean Mrs to Salutation and sets a reference to a parent bean.
         * @param parentBean the reference to parent template bean for value propagation
         * @return reference to current templat bean
         */
        public Mrs prepend_Mrs(TemplateBean parentBean)
        {
            Mrs bean = new Mrs(parentBean, parent); 
            prepend(bean);
            return bean;
        }
        
        /** 
         * Appends the bean to the list of beans for Salutation. 
         * @param bean the bean to be added to the list
         * @return reference to current template bean
         */
        public GermanLetter_jgt append(Mrs bean)
        {
            parent.subTemplateStructureMap.append("Salutation", bean);    
            return parent;
        }
        
        /** 
         * Creates and appends a bean Mrs to Salutation and returns a reference to this bean. 
         * @return the reference to the created bean of type Mrs
         */
        public Mrs append_Mrs()
        {
            TemplateBean parentBean = parent;
            Mrs bean = new Mrs(parentBean, parent); 
            append(bean);
            return bean;
        }
        
        /** 
         * Creates and appends a bean Mrs to Salutation and initializes its values with the given TemplateBean and returns a reference to this bean. 
         * @param parentBean reference to parent template bean for value propagation.
         * @return the reference to the created bean of type Mrs
         */
        public Mrs append_Mrs(TemplateBean parentBean)
        {
            Mrs bean = new Mrs(parentBean, parent); 
            append(bean);
            return bean;
        }
        
        /** 
         * Sets the list of beans of Salutation to exactly one bean. 
         * @param bean the bean which is inserted into the template bean list as one and only element.
         * @return reference to current template bean 
         */
        public GermanLetter_jgt set(Mrs bean)
        {
            parent.subTemplateStructureMap.put("Salutation", bean);
            return parent;
        }
        
        /** 
         * Sets a bean Mrs for Salutation and returns a reference to this bean.
         * @return reference to created template bean.
         */
        public Mrs set_Mrs()
        {
            TemplateBean parentBean = parent;
            Mrs bean = new Mrs(parentBean, parent); 
            set(bean);
            return bean;
        }
        
        /** 
         * Sets a bean Mrs for Salutation, sets its parent template bean and returns a reference the created bean. 
         * @param parentBean the parent template bean for value propagation.
         * @return reference to created template bean
         */
        public Mrs set_Mrs(TemplateBean parentBean)
        {
            Mrs bean = new Mrs(parentBean, parent); 
            set(bean);
            return bean;
        }
    }

    /*------------------------------------------------------------------------*\
     * Creates the bean parts of this template bean that are used by the      *
     * super class for the toString() method.                                 *
    \*------------------------------------------------------------------------*/

    /** 
     * Initializer for variables and subtemplate structures
     * and for the data structures (i.e. bean parts) which prepare the bean data for the
     * toString() method.
     */
    protected void initialize()
    {
        // variables:
        variables.add("Name");
        variables.add("ContactPerson");        
        // subtemplates:
        subTemplateStructureIdentifiers.add("Salutation");        
        // bean parts for toString() method:
        partList.add(new TextPart("Sehr ",0));
        partList.add(new SubTemplateStructurePart("Salutation",5,"Mr","Mrs"));
        partList.add(new TextPart(" ",64));
        partList.add(new VariablePart("Name","<<Name>>",65));
        partList.add(new TextPart(",\n\nwir möchten Sie hiermit darauf hinweisen...\nbla bla bla . \n    \nMit freundlichen Grüßen\n  \n",77));
        partList.add(new VariablePart("ContactPerson","<<ContactPerson>>",0));
        partList.add(new TextPart(" \n \n",21));
    }
}


