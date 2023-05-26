public class exampleArguments {
    public static void main(String[] args) {
        printTitle();
        printHeader();

        printBox(25, 30, 50, calculateBoxVolume(25,30, 50));
        //refactored line : compare with line 9 - 10//

        int volumeTinyBox = calculateBoxVolume(30,25, 2);
        printBox(30, 25, 2, volumeTinyBox);
    }

    private static int calculateBoxVolume(int length, int depth, int height){
        int base = length * depth;
        return base * height;
    }

    private static void printBox(int length, int depth, int height, int volume) {
        boolean validSize = length == 25 && depth == 30;
        if(validSize) {
            System.out.println("  " + length + "  |  " + depth + "  |  " + height + "  |  " + volume);
        } else {
            System.out.println("  " + length + "  |  " + depth + "  |  " + height + "  |  Error: Box does not have valid sizes");
        }
    }

    private static void printTitle() {
        System.out.println("Welcome to Boxes.INC");
        System.out.println("All our boxes have a 25 by 30 base, but we can go TALL");
        System.out.println("10 to 90 is no problem at all!");
        System.out.println();
    }

    private static void printHeader() {
        System.out.println("  l   |  d   |  h   |  volume");
        System.out.println("------|------|------|----------");
    }
}


