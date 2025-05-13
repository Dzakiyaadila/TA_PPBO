package Barang;

public class Menu {
    private int id;
    private String namaBarang;
    private Kategori kategori;
    private Suplier suplier;
    private double harga;
    private int stock;
    private String imagePath;

    public Menu (int id, String namaBarang, Kategori kategori, Suplier suplier, double harga, int stock, String imagePath){
        this.id = id;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.suplier = suplier;
        this.harga = harga;
        this.stock = stock;
        this.imagePath = imagePath;
    }

    public int getId (){
        return id;
    }
    public String getNamaBarang(){
        return namaBarang;
    }
    public Kategori getKategori(){
        return kategori;
    }
    public Suplier suplier(){
        return suplier;
    }
    public double getHarga(){
        return harga;
    }
    public int getStock(){
        return stock;
    }
    public String getImagePath(){
        return imagePath;
    }


}


