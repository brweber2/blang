/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.Symbol;

/**
 * @version $Rev$
 */
public class SymbolParser implements AParser<Object>
{
    public boolean canParseNext( SourceReader source )
    {
        return !source.endOfFile();
    }

    public Object parse( SourceReader source )
    {
        return Symbol.getSymbol( source.readUntilWhitespace() );
    }
}
