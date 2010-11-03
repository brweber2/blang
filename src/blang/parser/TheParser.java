/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version $Rev$
 */
public class TheParser 
{
    private static final List<AParser<? extends Object>> parsers = Arrays.asList(
            new NilParser(),
            new BooleanParser(),
            new TextParser(),
            new KeywordParser(),
            new NumberParser(),
            new ListParser(),
            new MapParser(),
            new StructParser(),
            new SymbolParser()
    );

    public static List parse( SourceReader source )
    {
        List parsed = new ArrayList();
        while ( !source.endOfFile() )
        {
            parsed.add( parseSingleItem( source ) );
        }
        return parsed;
    }

    public static Object parseSingleItem( SourceReader source )
    {
        for ( AParser<? extends Object> parser : parsers )
        {
            if ( parser.canParseNext( source ) )
            {
                return parser.parse( source );
            }
        }
        throw new RuntimeException("Unable to find appropriate parser! Line number [" + source.getLineNumber() + "]");
    }
}
