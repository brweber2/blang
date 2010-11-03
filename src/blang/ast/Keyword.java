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
public class Keyword
{
    private String text;

    public Keyword( String text )
    {
        if ( text == null || text.trim().equals("") )
        {
            throw new RuntimeException("Cannot have an empty keyword!");
        }
        this.text = text;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        Keyword keyword = (Keyword) o;

        if ( text != null ? !text.equals( keyword.text ) : keyword.text != null )
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return text != null ? text.hashCode() : 0;
    }

    public static final Map<String,Keyword> cache = new HashMap<String,Keyword>();

    public static Keyword getKeyword( String text )
    {
        if ( text == null || text.trim().equals("") )
        {
            throw new RuntimeException("Cannot get empty keyword.");
        }
        if ( !cache.containsKey( text ) )
        {
            cache.put( text, new Keyword( text ) );
        }
        return cache.get( text );
    }
}
