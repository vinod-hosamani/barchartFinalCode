package com.example.mindgate.mpchart;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

/**
 * Created by client1 on 10/25/2017.
 */

public class MyXAxisFormatterTwo implements IAxisValueFormatter
{
    private String[] days;
    public MyXAxisFormatterTwo( String[] days) {

        this.days = days;
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        if (days != null && days.length > (int) value)
        {
//            return days[(int) value]+"\n"+weeks[(int) value];
            return days[(int) value];
        } else
            return "";
    }

}
