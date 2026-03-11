
public class MergeTwoSortedArray {
  public static  int[] addSortedArray(int[] ar1, int ar2[]) {
    if(ar1==null)return ar2;
    if(ar2==null)return ar1;
    int n=ar1.length ,m=ar2.length  ;

    int l = n+ m, k = 0;
    int ar[] = new int[l];
    int i = 0, j = 0;
    // Compare both array and put sorted value in new Array
    while (i<n && j<m) {
      if ( ar1[i] <= ar2[j]) {
        ar[k++] = ar1[i++];
      }
      else{
        ar[k++]=ar2[j++];
      }      
    }
    while(i<n)
    {
       ar[k++]=ar1[i++];
    }
    while(j<m)
    {
      ar[k++]=ar2[j++];
    }
    return ar;
  }
}