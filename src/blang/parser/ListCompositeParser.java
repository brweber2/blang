/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package blang.parser;

import java.util.Collection;

/**
 * @version $Rev$
 */
public class ListCompositeParser implements CompositeParser<Collection>
{
    public void parseUntilMatching( SourceReader source, AParser parser, Collection dataStructure, String closingToken )
    {
        while ( !source.nextNonWhitespaceTextIs( closingToken ) )
        {
            dataStructure.add( parser.parse( source ) );
        }
        source.readLiteral( closingToken );
    }
}
