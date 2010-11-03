/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package blang.parser;

import java.util.Map;

/**
 * @version $Rev$
 */
public class MapCompositeParser implements CompositeParser<Map>
{
    public void parseUntilMatching( SourceReader source, AParser parser, Map dataStructure, String closingToken )
    {
        while ( !source.nextNonWhitespaceTextIs( closingToken ) )
        {
            Object key = parser.parse( source );
            Object value = parser.parse( source );

            dataStructure.put( key, value );
        }
        source.readLiteral( closingToken ); // consume it
    }
}
