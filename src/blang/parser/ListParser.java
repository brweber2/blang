/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.AList;

import java.util.Collection;

/**
 * @version $Rev$
 */
public class ListParser implements AParser<Collection>
{
    public static final String LIST_LITERAL = "(";
    public static final String LIST_END_LITERAL = ")";
    public static final String QUOTED_LIST_LITERAL = "[";
    public static final String QUOTED_LIST_END_LITERAL = "]";

    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( LIST_LITERAL ) || source.nextNonWhitespaceTextIs( QUOTED_LIST_LITERAL );
    }

    public Collection parse( SourceReader source )
    {
        if ( source.nextNonWhitespaceTextIs( LIST_LITERAL ) )
        {
            Collection list = AList.getEmptyList();
            source.parseUntilMatching( list, LIST_END_LITERAL );
            return list;
        }
        else if ( source.nextNonWhitespaceTextIs( QUOTED_LIST_LITERAL ) )
        {
            Collection list = AList.getQuotedList();
            source.parseUntilMatching( list, QUOTED_LIST_END_LITERAL );
            return list;
        }
        throw new RuntimeException( "Unable to parse list on line [" + source.getLineNumber() + "]." );
    }
}
