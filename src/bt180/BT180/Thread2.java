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
public class Thread2 extends Thread{
    SharedData shareDaTa;
    Random rd = new Random();

    @Override
    public void run() {
        while (true) {
            if (shareDaTa.getTotal() < 100 && shareDaTa.getTotal() > -100) {
                int number = rd.nextInt(100)-100;
                System.out.println("Number:"+number);
                shareDaTa.add(number);
                System.out.println("Total:" + shareDaTa.getTotal());
            } else {
                this.stop();
            }
        }
    }

    public Thread2(SharedData shareDaTa) {
        this.shareDaTa = shareDaTa;
    }
}
