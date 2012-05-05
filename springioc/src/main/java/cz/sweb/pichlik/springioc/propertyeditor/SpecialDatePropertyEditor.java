/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SpecialDatePropertyEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            setValue(new SpecialDateType(sdf.parse(text)));
        } catch (ParseException e) {
            throw new IllegalArgumentException("Cannot parse date", e);
        }
    }
}
