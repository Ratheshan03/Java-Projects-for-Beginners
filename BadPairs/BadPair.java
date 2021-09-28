// Write a method removeBadPairs that accepts an ArrayList of integers and removes any adjacent pair
//  of integers in the list if the left element of the pair is larger than the right element of the pair.
//   Every pair's left element is an even-numbered index in the list, and every pair's right element is an
//    odd index in the list. For example, suppose a variable called list stores the following 
//    element values: [3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1] We can think of this list as a 
//    sequence of pairs: (3, 7), (9, 2), (5, 5), (8, 5), (6, 3), (4, 7), (3, 1). The pairs (9, 2), (8, 5), 
//    (6, 3), and (3, 1) are "bad" because the left element is larger than the right one, so these pairs should
//     be removed. So the call of removeBadPairs(list); would change the list to store the following
//      element values: [3, 7, 5, 5, 4, 7] If the list has an odd length, the last element is not part of a pair 
//      and is also considered "bad;" it should therefore be removed by your method. If an empty list is passed in, 
//      the list should still be empty at the end of the call. You may assume that the list passed is not null.
//       You may not use any other arrays, lists, or other data structures to help you solve this problem, though
//        you can create as many simple variables as you like.

import java.util.ArrayList;
import java.util.*;
public class BadPair{
    public static void main (String [] args){
        ArrayList <Integer> array = new ArrayList<Integer>();
        int [] nums = {3,7,9,2,5,5,8,5,6,3,4,7,3,1};
        
        for (int x = 0; x < nums.length; x++){
            array.add(nums[x]);
        }
        removeBadPairs((ArrayList<Integer>)array);
    }

    public static void removeBadPairs(ArrayList<Integer>list){
        if (list.size()%2==1){
        list.remove(list.size()-1);
        }
        for (int x=0; x+1<list.size();){
            if(list.get(x)>list.get(x+1)){
            list.remove(x);
            list.remove(x);
            continue;
            }
            x=x+2;
        }
    System.out.println(list);
    }
}