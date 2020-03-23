package cw_sort;

import java.util.List;

/**
 * Abstract class AbstractIntSorter stores sorting algorithm methods and algorithm description methods
 */

public abstract class AbstractIntSorter
{
    /** Algorithm description*/
    String desc;

    /** Algorithm stability*/
    boolean stability;

    /** Algorithm works in place/out of place*/
    boolean in_place;

    /**
     * Abstract method implements sorting of integer numbers
     * @param list List of elements with values and names
     */
    abstract List<IntElement> solve0(List<IntElement> list);

    /**
     * Return Algorithm description
     * @return Algorithm description
     */
    String description()
    {
       return desc;
    }

    /**
     * Return If algorithm is stable
     * @return If algorithm is stable
     */
    boolean isStable()
    {
        return stability;
    }

    /**
     * Return If algorithm works in place or out of place
     * @return If algorithm works in place or out of place
     */
    boolean isInSitu()
    {
        return in_place;
    }
}
