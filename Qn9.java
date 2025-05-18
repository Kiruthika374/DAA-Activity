

    static int B; 
    static int H; 
    static boolean flag = true; 

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt(); 
        // Check if B and H are positive
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scanner.close(); 
    }


