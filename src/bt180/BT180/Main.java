/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt180.BT180;

/**
 *
 * @author khanh-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SharedData shareData = new SharedData();
        Thread1 thread1 = new Thread1(shareData);
        Thread2 thread2 = new Thread2(shareData);
        thread1.start();
        thread2.start();
    }
    
}
