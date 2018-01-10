package com.h.h.criminallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by HARI JEYACHANDRAN on 12/10/2017.
 */

public class crime {
    private UUID mid;
    private String mtitle;
    private Date date;
    private Boolean solved;
    public crime()
    {
        mid=UUID.randomUUID();
        date=new Date();
    }
    public UUID getid()
    {
        return mid;
    }
    public Date getDate()
    {
        return date;
    }

    public Boolean issolved()
    {
        return solved;
    }
    public void setSolved(Boolean x)
    {
        solved=x;
    }

    public String getMtitle() {
        return mtitle;
    }
    public void setMtitle(String x)
    {
        mtitle=x;
    }
}
