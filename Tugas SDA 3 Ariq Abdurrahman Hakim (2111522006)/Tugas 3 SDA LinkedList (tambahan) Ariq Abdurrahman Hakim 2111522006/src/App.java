import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------Tugas 2 SDA------");
        System.out.println("Nama : ARIQ ABDURRAHMAN HAKIM");
        System.out.println("NIM : 2111522006");
        System.out.println("----------------\n");

        //Membuat variabel linkedlist
        LinkedList <Integer> nim = new LinkedList<>();
        LinkedList <String> nama = new LinkedList<>(); 
        LinkedList <String> alamat = new LinkedList<>();

        nim.add(2111522006);
        nama.add("Ariq Abdurrahman Hakim");
        alamat.add("Pauh Kamper Indah");
        System.out.println("NO Bp (NIM) \t= "+nim);
        System.out.println("Nama Mahasiswa \t= "+nama);
        System.out.println("Alamat \t= "+alamat);

        

        //add
           System.out.println("\n---------- MENAMBAH DATA MAHASISWA ----------");
           nim.addFirst(2111522007);
           nim.addLast(2111522008);
           nim.add(2111522009);
           nim.add(2111522010);
   
           nama.addFirst("Windah");
           nama.addLast("Basudara");
           nama.add("Rahmi");
           nama.add("Yudha");
   
           alamat.addFirst("Kayangan");
           alamat.addLast("Hamka");
           alamat.add("Biaro");
           alamat.add("Simpang Tembok");
   
           System.out.println("No Bp (NIM) \t\t= "+nim+"\t Size = "+nim.size());
           System.out.println("Nama Mahasiswa \t\t= "+nama+"\t Size = "+nim.size());
           System.out.println("Alamat \t\t\t= "+alamat+"\t Size = "+nim.size());
   
           

        //set
            System.out.println("\n---------- MENYISIPKAN DATA MAHASISWA ----------");
            nama.set(2,"Ucok");
            nama.set(4,"Dinda");
            alamat.set(0,"Jalan Kematian");
            alamat.set(2,"Groove Street");
            alamat.set(4,"Kayangan");

            System.out.println("No Bp (NIM) \t\t= "+nim+"\t\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t\t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t\t= "+alamat+"\t Size = "+nim.size());



        //remove
            System.out.println("\n---------- MENGHAPUSKAN DATA MAHASISWA ----------");

            nim.remove(2);
            nama.remove(2);
            alamat.remove(2);

            System.out.println("No Bp (NIM) \t\t= "+nim+"\t\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t\t= "+nama+"\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t\t= "+alamat+"\t\t Size = "+nim.size());


        
        //pop
            System.out.println("\n---------- MENGHAPUSKAN DATA AWAL MAHASISWA (POP) ----------");
            nim.pop();
            nama.pop();
            alamat.pop();
            System.out.println("No Bp (NIM) \t\t= "+nim+"\t\t\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t\t= "+nama+"\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t\t= "+alamat+"\t\t\t Size = "+nim.size());



        //push
            System.out.println("\n---------- MENAMBAHKAN DATA AWAL MAHASISWA (PUSH) ----------");
            nim.push(2111522011);   
            nama.push("Kharisma");
            alamat.push("Gadut");

            System.out.println("No Bp (NIM) \t\t= "+nim+"\t\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t\t= "+nama+"\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t\t= "+alamat+"\t\t\t Size = "+nim.size());



        //get
            System.out.println("\n---------- MENCARI DATA MAHASISWA ----------");
            //mencari mahasiswa pemilik tugas
            System.out.println("Nama Mahasiswa Pemilik Tugas            :\t" +nama.get(1));
            System.out.println("Nomor Induk Mahasiswa Pemilik Tugas     :\t" +nim.get(1));
            System.out.println("Alamat Mahasiswa Pemilik Tugas          :\t" +alamat.get(1));
            System.out.println("");

            //mencari mahasiswa pertama
            System.out.println("Nama Mahasiswa Pertama          :\t" +nama.getFirst());
            System.out.println("Nomor Induk Mahasiswa Pertama   :\t" +nim.getFirst());
            System.out.println("Alamat Mahasiswa Pertama        :\t" +alamat.getFirst());
            System.out.println("");

            //mencari mahasiswa terakhir
            System.out.println("Nama Mahasiswa Terakhir         :\t" +nama.getLast());
            System.out.println("Nomor Induk Mahasiswa Terakhir  :\t" +nim.getLast());
            System.out.println("Alamat Mahasiswa Terakhir       :\t" +alamat.getLast());
            System.out.println("");



        //isEmpty()
            System.out.println("\n---------- PENGECEKAN DATA MAHASISWA (isEmpty)----------");

            System.out.println("Apakah data nim ada yang kosong?\t"+nim.isEmpty());
            System.out.println("Apakah data nama ada yang kosong?\t"+nama.isEmpty());
            System.out.println("Apakah data alamat ada yang kosong?\t"+alamat.isEmpty());

        //indexof
            System.out.println("\n---------- PENGECEKAN DATA MAHASISWA (indexof)----------");

            System.out.println("NIM 2111522009 index ke = \t"+nim.indexOf(2111522009));
            System.out.println("Nama Rahmi index ke     = \t"+nama.indexOf("Rahmi"));
            System.out.println("Alamat Biaro index ke   = \t"+alamat.indexOf("Biaro"));
        
    }
}
