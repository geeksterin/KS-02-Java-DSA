class Main {

    public static void main(String[] args) {
        
        int[] arr = new int[3];

        // how to assign values inside array
        arr[0] = 91;
        arr[1] = 53;
        arr[2] = 170;


        // how to print values from an array
        System.out.println( arr[0] );

        System.out.println( arr[1] );

        System.out.println( arr[2] );

        System.out.println("===========================");

        // how to update values in an array

        arr[1] = 54;
        arr[2] = 1700;
        arr[0] = 10;

        System.out.println( arr[0] );

        System.out.println( arr[1] );

        System.out.println( arr[2] );


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}