package cw_sort;

import java.util.List;

/**
 * Class Counting implements counting sort algorithm
 *
 */

public class Counting extends AbstractIntSorter
{
    /** Constructor*/
    public Counting()
    {
        desc = "Counting sort";
        stability = true;
        in_place = false;
    }


    /**
     * Sorts list using counting sort algorithm
     * @param list List of elements with values and names
     * @return Sorted list
     */
    @Override
    List<IntElement> solve0(List<IntElement> list)
    {
        int maximum = 0;


        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getValue()>maximum)
            {
                maximum = (int) list.get(i).getValue();
            }
        }

        int[] counter = new int[(int) (maximum+1)];
        for (int i = 0; i <= maximum; i++)
        {
            counter[i] = 0;
        }

        for(int i=0;i<list.size();i++)
        {
            counter[(int) list.get(i).getValue()] += 1;
        }


        for (int i=1; i<=maximum; i++)
        {
            counter[i] +=counter[i-1];
        }

        int[] sorted = new int[(int) (maximum+1)];
        String [] nam_sorted = new String[(int) (maximum+1)];
        for (int i = 0; i < list.size(); i++)
        {
            sorted[counter[(int) list.get(i).getValue()]-1] = (int) list.get(i).getValue();
            nam_sorted[counter[(int) list.get(i).getValue()]-1] = list.get(i).getName();
            counter[(int) list.get(i).getValue()]--;
        }

        IntElement put_element;
        for(int i=0;i<list.size();i++)
        {
            put_element = new IntElement(nam_sorted[i], sorted[i]);
            list.set(i,put_element);
        }
        return list;
    }
}
