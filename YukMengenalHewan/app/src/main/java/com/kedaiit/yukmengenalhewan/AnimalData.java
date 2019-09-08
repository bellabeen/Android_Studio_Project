package com.kedaiit.yukmengenalhewan;

import java.util.ArrayList;

public class AnimalData {
    public static String[][] data = new String[][]{
            {"Alap Alap", "Hewan Udara",
                    "https://upload.wikimedia.org/wikipedia/commons/3/39/Brown-Falcon%2C-Vic%2C-3.1.2008.jpg",
                    "Alap-alap (Bahasa Inggris: Falcon, Caracara atau Kestrel) merupakan sebutan untuk Burung pemangsa anggota keluarga Falconidae",
                    "Animalia", "Chordata", "Aves", "Falconiformes", " Falconidae"},
            {"Albatross", "Hewan Udara",
                    "https://upload.wikimedia.org/wikipedia/commons/7/73/Short_tailed_Albatross1.jpg",
                    "as", "a", "b", "c", "d", "e"},
            {"Anjing", "Hewan Darat",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e3/Coat_types_3.jpg",
                    "Anjing adalah mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu,bahkan kemungkinan sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA.", "Animalia", "Chordata", "Mammalia", "Carnivora", "Canidae"},
            {"Anoa", "Hewan Darat",
                    "https://upload.wikimedia.org/wikipedia/commons/8/8b/Anoa_Bubalus_depressicornis_Surabaya_Zoo.jpg",
                    "Anoa (Bubalus sp.) adalah mamalia terbesar dan endemik yang hidup di daratan Pulau Sulawesi dan Pulau Buton.Banyak yang menyebut anoa sebagai kerbau kerdil.Anoa merupakan hewan yang tergolong fauna peralihan", "Animalia", "Chordata", "Mamalia", "Artiodactyla", " Bovidae"},
            {"Antelop", "Hewan Darat",
                    "https://upload.wikimedia.org/wikipedia/commons/4/49/Black_Buck.jpg",
                    "Antelop adalah mamalia yang bentuknya menyerupai kambing dengan tanduk tegak lurus ke atas. Binatang ini mirip kijang tetapi bukan kijang. Ia termasuk jenis sapi. Hewan ini merupakan anggota dari famili bovidae dan termasuk hewan yang terancam punah.", "Animalia", "Chordata", "Mammalia", "Artiodactyla", "Bovidae"},
            {"Arwana", "Hewan Air",
                    "https://upload.wikimedia.org/wikipedia/commons/b/bf/Osteoglossum_bicirrhosum.JPG",
                    "Arwana Asia (Scleropages formosus), atau Siluk Merah adalah salah satu spesies ikan air tawar dari Asia Tenggara. Ikan ini memiliki badan yang panjang; sirip dubur terletak jauh di belakang badan. Arwana Asia umumnya memiliki warna keperak-perakan. Arwana Asia juga disebut Ikan Naga karena sering dihubung-hubungkan dengan naga dari Mitologi Tionghoa.", "Animalia", "Chordata", " Actinopterygii", " Osteoglossiformes", " Osteoglossidae"}
    };

    public static ArrayList<Animal> getListData(){
        ArrayList<Animal> list = new ArrayList<Animal>();
        for (String[] aData : data) {
            Animal animal = new Animal();
            animal.setName(aData[0]);
            animal.setRemarks(aData[1]);
            animal.setPhoto(aData[2]);
            animal.setDetail(aData[3]);
            animal.setKingdom(aData[4]);
            animal.setFilum(aData[5]);
            animal.setKelas(aData[6]);
            animal.setOrdo(aData[7]);
            animal.setFamili(aData[8]);

            list.add(animal);
        }

        return list;
    }
}
