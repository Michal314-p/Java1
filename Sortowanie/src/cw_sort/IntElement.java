package cw_sort;

/**
 * Class IntElement implements IElement
 */

public class IntElement implements IElement<Integer>
{

    /** Element name*/
    private String name;

    /** Element value*/
    private int value;


    /**
     * Constructor
     * @param name Element name
     * @param value Element value
     */
    public IntElement(String name, int value)
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
