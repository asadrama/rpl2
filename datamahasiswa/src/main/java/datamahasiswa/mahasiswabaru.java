package datamahasiswa;

public class mahasiswabaru {
    private final String namabarang;
    private final String quantity;
    private final int id_barang;
    
    public mahasiswabaru(String namabarang, String quantity, int id_barang) {
        this.namabarang = namabarang;
        this.quantity = quantity;
        this.id_barang = id_barang;
    }
    
    public String getNama(){
        return namabarang;
    }
    
    public String getNim(){
        return quantity;
    }
    
    public int getUmur(){
        return id_barang;
    }
    
    @Override
    public String toString() {
        return "Nama Barang: " + namabarang + "Quantity: " + quantity + "ID Barang: " + id_barang;
    }
}