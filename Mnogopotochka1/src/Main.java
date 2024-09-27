class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i=i+10){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Ошибка");
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        numberPrinter.start();
    }
}
