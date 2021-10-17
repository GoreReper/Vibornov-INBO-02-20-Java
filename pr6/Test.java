package pr6;

import java.util.Arrays;

public class Test {
    public static void main (String [] args)
    {
        //1
        Student [] sortById = Student.getSamples (true);
        for (int i = 0; i < sortById.length; i++)
        {
            System.out.print (sortById [i]);
            System.out.print (' ');
        }
        System.out.println ();
        Student [] sortedById = InsertionSort.insertionSort (sortById);
        for (int i=0; i<sortedById.length; i++)
        {
            System.out.print (sortedById[i]);
            System.out.print (' ');
        }
        System.out.println ();
        //2
        Student [] sortByGPA = Student.getSamples (false);

        for (int i=0; i<sortByGPA.length; i++)
        {
            System.out.print (sortByGPA[i]);
            System.out.print (' ');
        }
        System.out.println ();
        QuickSort.quickSort (sortByGPA, 0, sortByGPA.length - 1);

        for (int i=0; i<sortByGPA.length; i++)
        {
            System.out.print (sortByGPA[i]);
            System.out.print (' ');
        }
        System.out.println ();
        //3
        int [] sortByAll = new int [sortById.length + sortByGPA.length];
        int j=0;
        for (int i = 0; i < sortByAll.length; i++)
        {
            if (i < sortById.length)
            {
                sortByAll [i] = sortById [i].getId();
            }
            else
            {
                sortByAll [i] = sortByGPA [j].getGPA();
                j++;
            }
        }
        MergeSort.mergeSort (sortByAll,  sortByAll.length);
        for (int i=0; i<sortByAll.length; i++)
        {
            System.out.print (sortByAll[i]);
            System.out.print (' ');
        }
    }
}