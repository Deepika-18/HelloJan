//geeksforgeeks - school - program
//go to geeksforgeeks portal for complete problem
class DisplayLongestName {
    String longest(String names[], int n) {
        int max=0;
        String str="";
        for(int i=0;i<names.length;i++)
        {
            String temp=names[i];
            // max=Math.max(max,temp.length());
           // System.out.println("length"+temp.length());
            if(max<temp.length())
            {
                max=temp.length();
                str=temp;
            }
        }
        return str;
    }
}