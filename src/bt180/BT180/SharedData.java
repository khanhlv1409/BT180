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
public class SharedData {

    int total;

    public SharedData() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public synchronized void add(int x) {
        total= total+ x;
    }
}
