/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.Nil;

/**
 * @version $Rev$
 */
public class NilParser implements AParser<Object>
{
    public static final String NIL_LITERAL = "nil";

    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( NIL_LITERAL );
    }

    public Object parse( SourceReader source )
    {
        source.readLiteral( NIL_LITERAL ); // this consumes the nil literal
        return Nil.getNil();
    }
}
