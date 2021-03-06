package garbagecollection;

class Table1 {

    void printTable(int n) {
        System.out.println("Started PrintTable");
        //preparation
        synchronized (this){//block synchronized
            for(int j = 1; j <=5 ; j++){
                System.out.println(n*j);
                try{
                    Thread.sleep(400);
                }catch (Exception e){
                    System.out.println(e);
                }

            }
            System.out.println("Completed PrintTable");

        }


    }
}

public class TestSync1 {

    public static void main(String[] args) {
        final Table1 obj = new Table1();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                obj.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
