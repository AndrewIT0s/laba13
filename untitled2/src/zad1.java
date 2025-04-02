class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("Состояние потока во время выполнения: " + this.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Task1 thread = new Task1();
        System.out.println("Состояние потока перед запуском: " + thread.getState());
        thread.start();
        try {
            Thread.sleep(500);
            System.out.println("Состояние потока после запуска: " + thread.getState());
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Состояние потока после завершения: " + thread.getState());
    }
}