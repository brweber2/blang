/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

/**
 * @version $Rev$
 */
public interface AParser<T>
{
    boolean canParseNext( SourceReader source );
    T parse( SourceReader source );
}
