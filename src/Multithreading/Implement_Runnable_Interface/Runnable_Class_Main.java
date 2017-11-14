/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudviraj
 */
public class Runnable_Class_Main {
    public static void main(String[] args) {
        Runnable_Class rc = new Runnable_Class();
        Thread t = new Thread(rc);
        t.start();
    }
}
