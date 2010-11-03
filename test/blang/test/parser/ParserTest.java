/*
 * $Id$
 * Copyright (C) 2010 ARIN
 */
package blang.test.parser;

import blang.parser.SourceReader;
import blang.parser.TheParser;
import org.junit.Test;

import java.io.StringReader;

/**
 * @version $Rev$
 */
public class ParserTest
{
    @Test
    public void parseSimpleCode()
    {
        String code = "(defn hello-world [name] (println \"hello \" name))";
        SourceReader source = new SourceCodeReader( new StringReader( code ) );

        TheParser.parse( source );
    }
}
