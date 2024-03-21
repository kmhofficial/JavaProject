/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;

import javaproject.MainUI.checkout;
import javaproject.MainUI.createacc;
import javaproject.MainUI.itemedit;
import javaproject.MainUI.itemselect;
import javaproject.MainUI.login;
import javaproject.MainUI.ownerui;
import javaproject.MainUI.posui;
import javaproject.MainUI.userinfo;

/**
 *
 * @author L3GEND
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
//       
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new userinfo().setVisible(true);
//            }
//        });  

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ownerui().setVisible(true);
//            }
//        });
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new posui().setVisible(true);
//            }
//        });
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new itemselect().setVisible(true);
//            }
//        });
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new createacc().setVisible(true);
//            }
//        });
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new itemedit().setVisible(true);
//            }
//        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkout().setVisible(true);
            }
        });
    }
}
