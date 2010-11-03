/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.Struct;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;

/**
 * @version $Rev$
 */
public interface SourceReader
{
    BigInteger getLineNumber();

    boolean nextNonWhitespaceTextIs( String str );

    String readUntilMatching( String str );
    String readLiteral( String literal );
    String readUntilWhitespace();

    void parseUntilMatching( Collection dataStructure, String closingToken );
    void parseUntilMatching( Map dataStructure, String closingToken );
    void parseUntilMatching( Struct dataStructure, String closingToken );

    boolean endOfFile();
}
