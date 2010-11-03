/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

/**
 * @version $Rev$
 */
public interface CompositeParser<T>
{
    void parseUntilMatching( SourceReader source, AParser parser, T dataStructure, String closingToken );
}
