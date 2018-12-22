package mobileInfoManagementsystem;



public abstract class TimeDirutin extends Thread {

    Thread thd = null;
    String Mindiu = "";
    String Secdiu = "";
    String bill = "";
    int sec = 0, min = 0, mony = 0;

    TimeDirutin(){
        thd = new Thread(this);
        thd.start();
        thd.setPriority(Thread.NORM_PRIORITY);
    }

    @Override
    public void run() {
        try {
              while (!Thread.interrupted()) {
                
                ++sec;
                thd.sleep(1000);

                if (sec < 60) {
                    Secdiu = String.valueOf(sec);
                } else if (sec == 60) {
                    min += 1;
                    sec = 0;

                    Mindiu = String.valueOf(min);
                }
                if (sec == 1) {
                    mony += 1;
                    bill = String.valueOf(mony);
                }
                builtDiuration();
            }

        } catch (Exception e) {
        }
    }

    public abstract void builtDiuration();
}

 