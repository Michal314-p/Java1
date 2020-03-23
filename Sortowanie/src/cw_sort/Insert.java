package cw_sort;

import java.util.List;

/**
 * Class Insert implements insertion sort algorithm
 *
 */

public class Insert extends AbstractFloatSorter
{
    /** Constructor*/
    public Insert()
    {
        desc = "Insertion sort";
        stability = true;
        in_place = true;
    }


    /**
     * Sorts list using insertion sort algorithm
     * @param list List of elements with values and names
     * @return Sorted list
     */
    @Override
    List<IElement> solve1(List<IElement> list)
    {
        for (int i =1;i<list.size();++i)
        {
            IElement current=list.get(i);
            int step;
            for(step=i-1;step>-1 && list.get(step).getValue()>current.getValue();step--)
            {
                list.set(step+1,list.get(step));
            }
            list.set(step+1,current);
        }
        return list;
    }

    /**
     * Empty method
     * @param list List of elements with values and names
     * @return Null
     */
    @Override
    List<IntElement> solve0(List<IntElement> list) {
        return null;
    }
}
