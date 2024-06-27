class Bubble {
    public void bubble(int arr[]) {
        System.out.print("tejas G.B.: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Bubblesort {
    public static void main(String arg[]) {
        int[] arr = {5, 3, 8, 1, 2, 9};

        Bubble variable = new Bubble();
        variable.bubble(arr);

        // Printing variable directly doesn't give meaningful output
        // System.out.println(variable);

        System.out.println("hello world");
    }
}
