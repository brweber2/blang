/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.parser;

import blang.ast.ANumber;

/**
 * @version $Rev$
 */
public class NumberParser implements AParser<Object>
{
    public static final String NEGATIVE_NUMBER_LITERAL = "-";
    public static final String NUMBER_0 = "0";
    public static final String NUMBER_1 = "1";
    public static final String NUMBER_2 = "2";
    public static final String NUMBER_3 = "3";
    public static final String NUMBER_4 = "4";
    public static final String NUMBER_5 = "5";
    public static final String NUMBER_6 = "6";
    public static final String NUMBER_7 = "7";
    public static final String NUMBER_8 = "8";
    public static final String NUMBER_9 = "9";

    public boolean canParseNext( SourceReader source )
    {
        return source.nextNonWhitespaceTextIs( NEGATIVE_NUMBER_LITERAL )
                || source.nextNonWhitespaceTextIs( NUMBER_0 )
                || source.nextNonWhitespaceTextIs( NUMBER_1 )
                || source.nextNonWhitespaceTextIs( NUMBER_2 )
                || source.nextNonWhitespaceTextIs( NUMBER_3 )
                || source.nextNonWhitespaceTextIs( NUMBER_4 )
                || source.nextNonWhitespaceTextIs( NUMBER_5 )
                || source.nextNonWhitespaceTextIs( NUMBER_6 )
                || source.nextNonWhitespaceTextIs( NUMBER_7 )
                || source.nextNonWhitespaceTextIs( NUMBER_8 )
                || source.nextNonWhitespaceTextIs( NUMBER_9 );
    }

    public Object parse( SourceReader source )
    {
        // we can have
        // negative number:     -14
        // positive integer:    15
        // fraction:            1/2
        // negative fraction:   -3/4
        // todo ummm, irrational numbers...
        boolean negative = source.nextNonWhitespaceTextIs( NEGATIVE_NUMBER_LITERAL );
        if ( negative )
        {
            source.readLiteral( NEGATIVE_NUMBER_LITERAL ); // consume it
        }
        String nbr = source.readUntilWhitespace();
        if ( nbr.contains( "/" ) )
        {
            String[] parts = nbr.split( "/" );
            if ( parts.length != 2 )
            {
                throw new RuntimeException("A ratio can only have two parts! [" + nbr + "] from line [" + source.getLineNumber() + "].");
            }
            return ANumber.getRatio( negative, parts[0], parts[1] );
        }
        else
        {
            return ANumber.getInteger( negative, nbr );
        }
    }
}
