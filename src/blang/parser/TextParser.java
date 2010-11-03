/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.Text;

/**
 * @version $Rev$
 */
public class TextParser implements AParser<String>
{
    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( "\"" );
    }

    public String parse( SourceReader source )
    {
        return Text.getText( source.readUntilMatching( "\"" ) );
    }
}
