package cw_sort;

import java.util.Collections;
import java.util.List;

/**
 * Class Quick implements quick sort algorithm
 *
 */

public class Quick extends AbstractFloatSorter
{

    /** Constructor*/
    public Quick()
    {
        desc = "Quick sort";
        stability = false;
        in_place = true;
    }

    /**
     * Partition of elements with usage of pivot (last element)
     * @param list List of elements with values and names
     * @param first First index
     * @param last Last index
     * @return Final position of pivot
     */
    float partition(List<IElement> list, int first, int last)
    {
        float pivot = list.get(last).getValue();
        int i = (first-1);
        for (int j = first; j < last; j++) {
            if (list.get(j).getValue() <= pivot) {
                i++;
                Collections.swap(list,i,j);
            }
        }
        Collections.swap(list,i+1,last);
        return i+1;
    }

    /**
     * Sorts list using insertion sort algorithm
     * @param list List of elements with values and names
     * @param first First index
     * @param last Last index
     */
    void quick_sort(List<IElement> list, int first, int last)
    {
        if (first < last)
        {
            int partitionIndex = (int) partition(list, first, last);

            quick_sort(list, first, (int) (partitionIndex-1));
            quick_sort(list, (int) (partitionIndex+1), last);
        }
    }

    /**
     * Sorts list using quick sort algorithm
     * @param list List of elements with values and names
     * @return Sorted list
     */
    @Override
    List<IElement> solve1(List<IElement> list)
    {
        quick_sort(list,0,list.size()-1);
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
