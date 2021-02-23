import java.util.*;

public class medianOfTwoSortedArrays
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter No of elements in array 1:");
		int n1 = s.nextInt();
		int nums1[] = new int[n1];
		System.out.print("enter No of elements in array 2:");
		int n2 = s.nextInt();
		int nums2[] = new int[n2];
		System.out.println("Enter elements of array 1:");
		for(int i=0; i<n1 ;i++){
		    nums1[i] = s.nextInt();
		}
		System.out.println("Enter elements of array 2:");
		for(int i=0; i<n2 ;i++){
		    nums2[i] = s.nextInt();
		}
		int [] nums3 = new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++){
            nums3[i] = nums1[i];
        }
        for(int i=nums1.length,j=0; i < nums1.length + nums2.length; i++,j++){
            nums3[i] = nums2[j];
        }
        for(int i=0;i<nums3.length - 1 ; i++){
            for(int j=i+1; j<nums3.length;j++){
                if(nums3[i] > nums3[j]){
                    int temp = nums3[i];
                    nums3[i] = nums3[j];
                    nums3[j] = temp;
                }
            }
        }
        if(nums3.length%2 == 1){
            System.out.println(nums3[nums3.length / 2]);
        }else{
            System.out.println((float)(nums3[nums3.length / 2] + nums3[nums3.length / 2 - 1])/2);
        }
	}
}