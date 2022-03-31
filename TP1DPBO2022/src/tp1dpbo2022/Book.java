/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1dpbo2022;

/**
 *
 * @author lenovo
 */
public class Book {
    private int id;
    private String desc;
    private String penerbit;
    private String penulis;
    private String img;
    
    public Book(int id, String desc, String penerbit, String penulis, String img){
        this.id = id;
        this.desc = desc;        
        this.penerbit = penerbit;
        this.penulis = penulis;
        this.img = img;
    }
    
    // Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public void setImg(String img) {
        this.img = img;
    }
    
    // Getter
    public int getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public String getPenulis() {
        return penulis;
    }
    public String getImg() {
        return img;
    }
}
