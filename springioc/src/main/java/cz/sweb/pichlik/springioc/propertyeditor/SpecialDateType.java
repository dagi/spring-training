/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.propertyeditor;

import java.util.Date;

public class SpecialDateType {
    private final Date date;

    public SpecialDateType(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
