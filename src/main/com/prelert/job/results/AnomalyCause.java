/****************************************************************************
 *                                                                          *
 * Copyright 2015 Prelert Ltd                                               *
 *                                                                          *
 * Licensed under the Apache License, Version 2.0 (the "License");          *
 * you may not use this file except in compliance with the License.         *
 * You may obtain a copy of the License at                                  *
 *                                                                          *
 *    http://www.apache.org/licenses/LICENSE-2.0                            *
 *                                                                          *
 * Unless required by applicable law or agreed to in writing, software      *
 * distributed under the License is distributed on an "AS IS" BASIS,        *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. *
 * See the License for the specific language governing permissions and      *
 * limitations under the License.                                           *
 *                                                                          *
 ***************************************************************************/

package com.prelert.job.results;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Anomaly Cause POJO.
 * Used as a nested level inside population anomaly records.
 */
@JsonInclude(Include.NON_NULL)
public class AnomalyCause
{
    /**
     * Result fields
     */
    public static final String PROBABILITY = "probability";
    public static final String OVER_FIELD_NAME = "overFieldName";
    public static final String OVER_FIELD_VALUE = "overFieldValue";
    public static final String BY_FIELD_NAME = "byFieldName";
    public static final String BY_FIELD_VALUE = "byFieldValue";
    public static final String PARTITION_FIELD_NAME = "partitionFieldName";
    public static final String PARTITION_FIELD_VALUE = "partitionFieldValue";
    public static final String FUNCTION = "function";
    public static final String TYPICAL = "typical";
    public static final String ACTUAL = "actual";

    /**
     * Metric Results
     */
    public static final String FIELD_NAME = "fieldName";

    private double m_Probability;
    private String m_ByFieldName;
    private String m_ByFieldValue;
    private String m_PartitionFieldName;
    private String m_PartitionFieldValue;
    private String m_Function;
    private double m_Typical;
    private double m_Actual;

    private String m_FieldName;

    private String m_OverFieldName;
    private String m_OverFieldValue;


    public double getProbability()
    {
        return m_Probability;
    }

    public void setProbability(double value)
    {
        m_Probability = value;
    }


    public String getByFieldName()
    {
        return m_ByFieldName;
    }

    public void setByFieldName(String value)
    {
        m_ByFieldName = value.intern();
    }

    public String getByFieldValue()
    {
        return m_ByFieldValue;
    }

    public void setByFieldValue(String value)
    {
        m_ByFieldValue = value.intern();
    }

    public String getPartitionFieldName()
    {
        return m_PartitionFieldName;
    }

    public void setPartitionFieldName(String field)
    {
        m_PartitionFieldName = field.intern();
    }

    public String getPartitionFieldValue()
    {
        return m_PartitionFieldValue;
    }

    public void setPartitionFieldValue(String value)
    {
        m_PartitionFieldValue = value.intern();
    }

    public String getFunction()
    {
        return m_Function;
    }

    public void setFunction(String name)
    {
        m_Function = name.intern();
    }

    public double getTypical()
    {
        return m_Typical;
    }

    public void setTypical(double typical)
    {
        m_Typical = typical;
    }

    public double getActual()
    {
        return m_Actual;
    }

    public void setActual(double actual)
    {
        m_Actual = actual;
    }

    public String getFieldName()
    {
        return m_FieldName;
    }

    public void setFieldName(String field)
    {
        m_FieldName = field.intern();
    }

    public String getOverFieldName()
    {
        return m_OverFieldName;
    }

    public void setOverFieldName(String name)
    {
        m_OverFieldName = name.intern();
    }

    public String getOverFieldValue()
    {
        return m_OverFieldValue;
    }

    public void setOverFieldValue(String value)
    {
        m_OverFieldValue = value.intern();
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(m_Probability);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m_Actual);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(m_Typical);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result
                + ((m_ByFieldName == null) ? 0 : m_ByFieldName.hashCode());
        result = prime * result
                + ((m_ByFieldValue == null) ? 0 : m_ByFieldValue.hashCode());
        result = prime * result
                + ((m_FieldName == null) ? 0 : m_FieldName.hashCode());
        result = prime * result
                + ((m_Function == null) ? 0 : m_Function.hashCode());
        result = prime * result
                + ((m_OverFieldName == null) ? 0 : m_OverFieldName.hashCode());
        result = prime
                * result
                + ((m_OverFieldValue == null) ? 0 : m_OverFieldValue.hashCode());
        result = prime
                * result
                + ((m_PartitionFieldName == null) ? 0 : m_PartitionFieldName
                        .hashCode());
        result = prime
                * result
                + ((m_PartitionFieldValue == null) ? 0 : m_PartitionFieldValue
                        .hashCode());

        return result;
    }


    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }

        if (other instanceof AnomalyCause == false)
        {
            return false;
        }

        AnomalyCause that = (AnomalyCause)other;

        return this.m_Probability == that.m_Probability &&
                Objects.equals(this.m_Typical, that.m_Typical) &&
                Objects.equals(this.m_Actual, that.m_Actual) &&
                Objects.equals(this.m_Function, that.m_Function) &&
                Objects.equals(this.m_FieldName, that.m_FieldName) &&
                Objects.equals(this.m_ByFieldName, that.m_ByFieldName) &&
                Objects.equals(this.m_ByFieldValue, that.m_ByFieldValue) &&
                Objects.equals(this.m_PartitionFieldName, that.m_PartitionFieldName) &&
                Objects.equals(this.m_PartitionFieldValue, that.m_PartitionFieldValue) &&
                Objects.equals(this.m_OverFieldName, that.m_OverFieldName) &&
                Objects.equals(this.m_OverFieldValue, that.m_OverFieldValue);
    }

}
