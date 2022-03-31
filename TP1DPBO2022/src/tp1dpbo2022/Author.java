/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1dpbo2022;

/**
 *
 * @author lenovo
 */
public class Author {
    private int id;
    private String nama;
    private int jumlah_buku;
    private String img;
    
    public Author(int id, String nama, int jumlah_buku, String img){
        this.id = id;
        this.nama = nama;        
        this.jumlah_buku = jumlah_buku;
        this.img = img;
    }
    
    // Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJumlahBuku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }
    public void setImg(String img) {
        this.img = img;
    }
    
    // Getter
     public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public int getJumlahBuku() {
        return jumlah_buku;
    }
    public String getImg() {
        return img;
    }
}
