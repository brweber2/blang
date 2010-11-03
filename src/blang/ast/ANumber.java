/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.ast;

import java.math.BigInteger;

/**
 * @version $Rev$
 */
public class ANumber
{
    public static Number getInteger(boolean negative, String value)
    {
        if (negative)
        {
            return new BigInteger("-" + value);
        }
        return new BigInteger(value);
    }
    public static Ratio getRatio(boolean negative, String top, String bottom)
    {
        if ( negative )
        {
            return new Ratio( new BigInteger("-"+top), new BigInteger(bottom));
        }
        return new Ratio( new BigInteger(top), new BigInteger(bottom)); 
    }

}
