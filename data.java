
public class data {
	
String NamaProduk, JenisBarang, JumlahBarang, TanggalPembelian, HargaBarangTerjual;

public data(String np, String jb, String jg, String tb, String hb) {
	this.NamaProduk         = np;
	this.JenisBarang        = jb;
	this.JumlahBarang       = jg;
	this.TanggalPembelian   = tb;
	this.HargaBarangTerjual = hb;
}

@Override
public String toString() {
	return "data [NamaProduk=" + NamaProduk + ", JenisBarang=" + JenisBarang + ", JumlahBarang=" + JumlahBarang
			+ ", TanggalPembelian=" + TanggalPembelian + ", HargaBarangTerjual=" + HargaBarangTerjual + "]";
}
public String getNamaProduk() {
	return NamaProduk;
}

public String getHargaBarangTerjual() {
	return HargaBarangTerjual;
}

public void setHargaBarangTerjual(String hargaBarangTerjual) {
	HargaBarangTerjual = hargaBarangTerjual;
}

public void setNamaProduk(String namaProduk) {
	NamaProduk = namaProduk;
}

public String getJenisBarang() {
	return JenisBarang;
}

public void setJenisBarang(String jenisBarang) {
	JenisBarang = jenisBarang;
}

public String getJumlahBarang() {
	return JumlahBarang;
}

public void setJumlahBarang(String jumlahBarang) {
	JumlahBarang = jumlahBarang;
}

public String getTanggalPembelian() {
	return TanggalPembelian;
}

public void setTanggalPembelian(String tanggalpembelian) {
	TanggalPembelian = tanggalpembelian;
}
}
