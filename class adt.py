nama_bulan = ["januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember"]
tanggal = input("Masukan Tanggal : ")
bulan = input("Masukan Bulan : ")
tahun = input("Masukan Tahun : ")
kabisat = tahun % 4

if(bulan % 2 == 0):
    hari = 30
    bln = nama_bulan[bulan - 1]

    if(kabisa == 0):
        hari = 29
        bln = nama_bulan[bulan - 1]
    else:
        hari = 28
        bln = nama_bulan[bulan - 1]
else:
    hari = 31
    bln = nama_bulan[bulan - 1]

bTanggal = tanggal >=1 and tanggal <= hari
bBulan = bulan >=1 and bulan <=12
bValid = bTanggal and bBulan
if(bValid):
    hasil = "adalah tanggal yang valid."
else:
    hasil = "adalah tanggal yang tidak valid."
print " "
print tanggal,bulan,tahun,hasil