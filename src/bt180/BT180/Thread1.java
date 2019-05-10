/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt180.BT180;

import java.util.Random;

/**
 *
 * @author khanh-pc
 */
public class Thread1 extends Thread {

    SharedData shareDaTa;
    Random rd = new Random();

    public Thread1(SharedData shareDaTa) {
        this.shareDaTa = shareDaTa;
    }

    @Override
    public void run() {
        while (true) {
            if (shareDaTa.getTotal() < 100 && shareDaTa.getTotal() > -100) {
                int number = rd.nextInt(100);
                System.out.println("L1:"+number);
                shareDaTa.add(number);
                System.out.println("Total:" + shareDaTa.getTotal());
            } else {
                this.stop();
            }
        }
    }

}
