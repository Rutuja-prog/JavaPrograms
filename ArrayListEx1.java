import java.util.*;
class ArrayListEx1{
	public static void main(String[]args){
		//int arr[] = {20,60,46,34,89,12,23};
		//Array.sort(arr);
		//System.out.println(Array.toString(arr));

		ArrayList<Integer> num = new ArrayList<>();
		num.add(20);
		num.add(60);
		num.add(46);
		num.add(34);
		num.add(89);
		num.add(12);
		num.add(23);
		System.out.println(num);

		Collections.sort(num);
		for(int i:num)
		{
		 System.out.println(i);
		}


	}
}