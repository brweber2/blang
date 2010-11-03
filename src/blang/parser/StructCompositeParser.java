/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package blang.parser;

import blang.ast.Struct;

import java.util.Map;

/**
 * @version $Rev$
 */
public class StructCompositeParser implements CompositeParser<Struct>
{
    public void parseUntilMatching( SourceReader source, AParser parser, Struct dataStructure, String closingToken )
    {
        while ( !source.nextNonWhitespaceTextIs( closingToken ) )
        {
            // if it is a string, we have the struct name
            String name = (String) parser.parse( source );
            dataStructure.setName( name );
            
            // else if it is a map, we have the properties
            Map<String,Class> map = (Map<String,Class>) parser.parse( source );
            for ( String key : map.keySet() )
            {
                dataStructure.addProperty( key, map.get( key ) );
            }
        }
        source.readLiteral( closingToken ); // consume it!
    }
}
