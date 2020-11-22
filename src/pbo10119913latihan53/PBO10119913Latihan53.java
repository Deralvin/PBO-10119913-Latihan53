/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan53;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class PBO10119913Latihan53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("Peter",false,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + rabbit1.getName());
        System.out.println(rabbit1.getName() + " is Vegetarian? " + rabbit1.isVegetarian());
        System.out.println(rabbit1.getName() + " eat " + rabbit1.getEats());
        System.out.println(rabbit1.getName() + " has " + rabbit1.getNoOfLegs() + " legs");
        System.out.println(rabbit1.getName() + " color is " + rabbit1.getColor());
    }
    
}
