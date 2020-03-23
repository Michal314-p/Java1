package cw_sort;

import java.util.ArrayList;
import java.util.List;


/**
 * Class Main shows testing results for sorting algorithms
 * @author Michał Pasierbiewicz 226001
 *
 */
public class Main {

    /** Constructor*/
    public static void main(String[] args)
    {

        insertion_sort_test();
        quick_sort_test();
        counting_sort_test();

    }

    /**
     * Tests of counting sort algorithm
     */
    private static void counting_sort_test()
    {
        Counting sorter = new Counting();

        System.out.println("Description: " + sorter.desc);
        System.out.println("Stability: "+sorter.stability);
        System.out.println("In place: " +sorter.in_place);
        System.out.println();

        List<IntElement> list = new ArrayList<>();

        list.add(new IntElement("Papryka",1));
        list.add(new IntElement("Arbuz",1));
        list.add(new IntElement("Cytryna",111));
        list.add(new IntElement("Pomidor",3));
        list.add(new IntElement("Ogorek",14));
        list.add(new IntElement("Awokado",1));
        list.add(new IntElement("Kiwi",17));
        list.add(new IntElement("Gruszka",6));
        list.add(new IntElement("Wisnia",0));

        List<IntElement> sorted = sorter.solve0(list);
        for(int i = 0; i < sorted.size(); i++)
        {
            System.out.print(sorted.get(i).getValue() + "  " +sorted.get(i).getName());
            System.out.println();
        }
        System.out.println("========================");
    }

    /**
     * Tests of insertion sort algorithm
     */
    private static void insertion_sort_test()
    {
        Insert sorter = new Insert();

        System.out.println("Description: " + sorter.desc);
        System.out.println("Stability: "+sorter.stability);
        System.out.println("In place: " +sorter.in_place);
        System.out.println();

        List<IElement> list = new ArrayList<>();

        list.add(new FloatElement("Papryka",1));
        list.add(new FloatElement("Arbuz",1));
        list.add(new FloatElement("Cytryna",111));
        list.add(new FloatElement("Pomidor",1.3f));
        list.add(new FloatElement("Ogorek",14.761f));
        list.add(new FloatElement("Awokado",1));
        list.add(new FloatElement("Kiwi",17));
        list.add(new FloatElement("Gruszka",6));
        list.add(new FloatElement("Wisnia",0));

        List<IElement> sorted = sorter.solve1(list);
        for(int i = 0; i < sorted.size(); i++)
        {
            System.out.print(sorted.get(i).getValue() + "  " +sorted.get(i).getName());
            System.out.println();
        }
        System.out.println("========================");
    }

    /**
     * Tests of quick sort algorithm
     */
    private static void quick_sort_test()
    {
        Quick sorter = new Quick();

        System.out.println("Description: " + sorter.desc);
        System.out.println("Stability: "+sorter.stability);
        System.out.println("In place: " +sorter.in_place);
        System.out.println();

        List<IElement> list = new ArrayList<>();

        list.add(new FloatElement("Papryka",1));
        list.add(new FloatElement("Arbuz",1));
        list.add(new FloatElement("Cytryna",111));
        list.add(new FloatElement("Pomidor",1.3f));
        list.add(new FloatElement("Ogorek",14.761f));
        list.add(new FloatElement("Awokado",1));
        list.add(new FloatElement("Kiwi",17));
        list.add(new FloatElement("Gruszka",6));
        list.add(new FloatElement("Wisnia",0));

        List<IElement> sorted = sorter.solve1(list);
        for(int i = 0; i < sorted.size(); i++)
        {
            System.out.print(sorted.get(i).getValue() + "  " +sorted.get(i).getName());
            System.out.println();
        }
        System.out.println("========================");
    }

}
