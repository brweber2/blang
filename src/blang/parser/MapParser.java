/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.AMap;

import java.util.Map;

/**
 * @version $Rev$
 */
public class MapParser implements AParser<Map>
{
    public static final String MAP_LITERAL = "{";
    public static final String MAP_END_LITERAL = "}";

    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( MAP_LITERAL );
    }

    public Map parse( SourceReader source )
    {
        Map map = AMap.getMap();
        source.parseUntilMatching( map, MAP_END_LITERAL );
        return map;
    }
}
