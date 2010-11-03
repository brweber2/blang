/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.Struct;

/**
 * @version $Rev$
 */
public class StructParser implements AParser<Struct>
{
    public static final String STRUCT_LITERAL = "<";
    public static final String STRUCT_END_LITERAL = ">";

    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( STRUCT_LITERAL );
    }

    public Struct parse( SourceReader source )
    {
        Struct struct = Struct.getStruct();
        source.parseUntilMatching( struct, STRUCT_END_LITERAL );
        return struct;
    }
}
