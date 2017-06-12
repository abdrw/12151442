/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualbelihp;

import java.util.Scanner;

/**
 *
 * @author Abdurrahman
 */
public class JualBeliHP {

    public static void main(String[] args) {
        // TODO code application logic here
        hanphone entityObjk =new hanphone();
        QueryHP update = new QueryHP();
        Scanner input=new Scanner(System.in);
        String a,b,c,d,e,jawab;
        long id = 0;
        
        System.out.println("|=============================|");
        System.out.println("|JUAL BELI HANPHONE BANG BEDUR|");
        System.out.println("|=============================|");
        
        System.out.println("");
        System.out.println("1.User Baru | 2. Edit User | 3.Delete User");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        
        System.out.print("Silahkan Pilih ( 1/2/3 ) : ");jawab=input.nextLine();
        if(jawab.equals("1")){
            update.Show();
            System.out.print("Nama Lengkap :"); b =input.nextLine();
            System.out.print("Alamat :"); c =input.nextLine();
            System.out.print("No Telepon :"); d = input.nextLine();
            System.out.print("Merek Hanphone :"); e =input.nextLine();
            System.out.print("ID User :"); a =input.nextLine();
            entityObjk.setIduser(a);
            entityObjk.setNama(b);
            entityObjk.setAlamat(c);
            entityObjk.setNoTelpon(d);
            entityObjk.setMerkHanphone(e);
            update.Add(entityObjk);
            update.Show();}
        if(jawab.equals("2")){
            update.Show();
                System.out.print("ID User :"); a = input.nextLine();
                System.out.print("Nama Lengkap :");b = input.nextLine();
                System.out.print("Alamat :");c = input.nextLine();
                System.out.print("No Telepon :");d =input.nextLine();
                System.out.print("Merek Hanphone :");e =input.nextLine();
                update.update(id, a, b, c, d, e);
                System.out.println("User "+a+" Dengan nama "+b+" berhasil Dirubah");
                System.out.println("");}
                update.Show(); 
        if(jawab.equals("3")){
            update.Show();
                    System.out.print("Pilih ID user untuk dihapus :"); a = input.nextLine();
                    update.Delete(a);
                    System.out.println("User "+a+" berhasil dihapus");
                    update.Show(); }
    }
}