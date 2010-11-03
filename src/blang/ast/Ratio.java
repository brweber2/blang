/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.ast;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @version $Rev$
 */
public class Ratio
{
    private BigInteger top;
    private BigInteger bottom;

    public Ratio( BigInteger top, BigInteger bottom )
    {
        this.top = top;
        this.bottom = bottom;
    }

    public BigDecimal toDecimal()
    {
        return new BigDecimal(top).divide( new BigDecimal(bottom) );
    }
}
