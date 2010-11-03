/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.ast;

import java.util.HashMap;
import java.util.Map;

/**
 * @version $Rev$
 */
public class Struct
{
    private String name;
    private Map<String,Class> properties = new HashMap<String,Class>();

    public Struct()
    {
    }

    public Struct( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Struct addProperty( String name, Class type )
    {
        properties.put( name, type );
        return this;
    }

    public Class getTypeOfProperty( String name )
    {
        if ( !properties.containsKey( name ) )
        {
            throw new RuntimeException("Struct [" + name + "] does not have a property [" + name + "].");
        }
        return properties.get( name );
    }

    public static Struct getStruct()
    {
        return new Struct();
    }
}
