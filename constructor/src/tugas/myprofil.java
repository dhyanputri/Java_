/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Putri
 */
public class myprofil {
    long modelnim;
    String modelname;
    String modelalamat;
    String modeljurusan;
    int modelangkatan;

public myprofil (long nim, String name, String alamat, String jurusan, int angkatan) {
    modelnim = nim;
    modelname = name;
    modelalamat = alamat;
    modeljurusan = jurusan;
    modelangkatan = angkatan;
}

public static void main (String[] args){
    myprofil profil = new myprofil (201869040022L, "Dhyan Putri","Prigen","Teknik Informatika",2018);
    System.out.println(profil.modelnim);
    System.out.println(profil.modelname);
    System.out.println(profil.modelalamat);
    System.out.println(profil.modeljurusan);
    System.out.println(profil.modelangkatan);
}
}
