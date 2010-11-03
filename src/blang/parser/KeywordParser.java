/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.Keyword;

/**
 * @version $Rev$
 */
public class KeywordParser implements AParser<Keyword>
{
    public static final String KEYWORD_LITERAL = ":";

    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( KEYWORD_LITERAL );
    }

    public Keyword parse( SourceReader source )
    {
        source.readLiteral( KEYWORD_LITERAL ); // consume the colon
        return Keyword.getKeyword( source.readUntilWhitespace() );
    }
}
