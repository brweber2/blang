/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.ABoolean;

/**
 * @version $Rev$
 */
public class BooleanParser implements AParser<Boolean>
{
    public static final String TRUE_LITERAL = "true";
    public static final String FALSE_LITERAL = "false";

    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( TRUE_LITERAL ) || source.nextNonWhitespaceTextIs( FALSE_LITERAL );
    }

    public Boolean parse( SourceReader source )
    {
        if ( source.nextNonWhitespaceTextIs( TRUE_LITERAL ) )
        {
            source.readLiteral( TRUE_LITERAL );
            return ABoolean.getTrue();
        }
        else if ( source.nextNonWhitespaceTextIs( FALSE_LITERAL ) )
        {
            source.readLiteral( FALSE_LITERAL );
            return ABoolean.getFalse();
        }
        throw new RuntimeException("Expected a boolean literal, but did not find one. Line [" + source.getLineNumber() + "]");
    }
}
