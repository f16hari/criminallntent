package com.h.h.criminallntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by HARI JEYACHANDRAN on 12/14/2017.
 */

public class crimeLab {
    private static List<crime> crimelab;
    private static crimeLab sc;
    public static crimeLab get(Context context) {
        if (sc == null) {
            sc =  new crimeLab(context);
        }
        return sc;
    }
    private crimeLab(Context context)
    {
        crimelab=new ArrayList<>();
        for (int i=0;i<100;i++)
        {
            crime c=new crime();
            c.setMtitle("CRIME "+i);
            c.setSolved(i%2==0);
            crimelab.add(c);

        }
    }
    public static List<crime> getCrimelab()
    {
        return crimelab;
    }
    public crime getcrime(UUID id)
    {
        for (crime c:crimelab)
        {
            if(c.getid().equals(id))
            {
                return c;
            }
        }
        return null;
    }
}
