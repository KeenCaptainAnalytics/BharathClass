class reverseSTR2 {

    void reverse(char arr[] , int start, int end){
        while(start<end){
            char temp = arr[start];
            arr[start ]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        int i =0;
        int j = i+ 2*k -1;

        while(i<ch.length){
            if(j>=ch.length){
                j=ch.length-1;
            }
            int len = j - i +1 ;
            if(len >= k){
                reverse(ch,i, i+k-1);
            }
            else if(len <k){
                reverse(ch, i, j);
            }

            i= j+1;
            j= i+2*k-1;
        }

        String str = new String(ch);
        return str;
    }
}