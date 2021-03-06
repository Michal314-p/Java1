package cw_sort;

/**
 * Class FloatElement implements IElement
 */

public class FloatElement implements IElement<Float>
{
    /** Element name*/
    private String name;

    /** Element value*/
    private float value;

    /**
     * Constructor
     * @param name Element name
     * @param value Element value
     */
    public FloatElement(String name, float value)
    {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float getValue()
    {
        return this.value;
    }
}
