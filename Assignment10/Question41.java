
import java.util.*;

public class Question41
{


static ArrayList<Integer> get2NonRepeatingNos(int nums[], int n)
{

	Arrays.sort(nums);

	ArrayList<Integer> ans = new ArrayList<>();
	for (int i = 0; i < n - 1; i = i + 2) {
	if (nums[i] != nums[i + 1]) {
		ans.add(nums[i]);
		i = i - 1;
	}
	}

	if (ans.size() == 1)
	ans.add(nums[n - 1]);

	return ans;
}


public static void main(String[] args) {
	int arr[] = { 2, 3, 7, 9, 11, 2, 3, 11 };
	int n = arr.length;
	ArrayList<Integer> ans = get2NonRepeatingNos(arr, n);
	System.out.print("The non-repeating elements are ");
	System.out.println(ans.get(0) + " and " + ans.get(1));
}
}

