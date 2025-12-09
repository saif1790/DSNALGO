import javax.xml.bind.annotation.XmlID;

public class MinInRotatedSortedArray {

    public static void main(String[] args) {

        int a[] = {4,5,6,7,0,1,2};
        int minNumber = getMinNumber(a);
        System.out.println("Minimum Number :"+ minNumber);
    }

    public static int getMinNumber(int a[])
    {
        int left = 0;
        int right = a.length - 1;

        while (left < right)
        {
           int mid = left + (right - left) / 2;
           if(a[mid] > a[right])
           {
               left = mid + 1;
           }
           else {
               right = mid;
           }
        }
        return a[left];
    }
}
