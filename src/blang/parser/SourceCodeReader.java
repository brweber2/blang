/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package blang.parser;

import blang.ast.Struct;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;

/**
 * @version $Rev$
 */
public class SourceCodeReader implements SourceReader
{
    

    public BigInteger getLineNumber()
    {

    }

    public boolean nextNonWhitespaceTextIs( String str )
    {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String readUntilMatching( String str )
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String readLiteral( String literal )
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String readUntilWhitespace()
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void parseUntilMatching( Collection dataStructure, String closingToken )
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void parseUntilMatching( Map dataStructure, String closingToken )
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void parseUntilMatching( Struct dataStructure, String closingToken )
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean endOfFile()
    {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
