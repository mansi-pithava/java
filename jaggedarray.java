public class jaggedarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[]{1,5,9};
        arr[1]= new int[]{6,7,8,9,0};
        arr[2]=new int[]{44,66,88};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }

}
