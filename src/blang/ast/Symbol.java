/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.ast;

/**
 * @version $Rev$
 */
public class Symbol
{
    private String symbolString;

    public Symbol( String symbolString )
    {
        this.symbolString = symbolString;
    }

    public String getSymbolString()
    {
        return symbolString;
    }

    public static Symbol getSymbol( String str )
    {
        return new Symbol( str );
    }
}
