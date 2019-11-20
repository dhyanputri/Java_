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
public class Constructor {
    long modelnim;
    String modelname;
    String modelalamat;
    String modeljurusan;
    int modelangkatan;
    
public Constructor() {
    modelnim = 20186904002L;
    modelname = "Dhyan Putri";
    modelalamat = "Prigen";
    modeljurusan = "Teknik Informatika";
    modelangkatan = 2018;
}
public static void main(String[] args) {
    Constructor profil = new Constructor();
    System.out.println("nim         = "+profil.modelnim);
    System.out.println("name        = "+profil.modelname);
    System.out.println("alamat      = "+profil.modelalamat);
    System.out.println("jurusan     = "+profil.modeljurusan);
    System.out.println("angkatan    = "+profil.modelangkatan);

}
}
