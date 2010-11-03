/*
 * $Id$
 * Copyright (C) 2010 brweber2
 */
package blang.ast;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @version $Rev$
 */
public class AList
{
    public static List getEmptyList()
    {
        return new ArrayList();
    }
    public static Queue getQuotedList()
    {
        return new ArrayDeque();
    }
}
