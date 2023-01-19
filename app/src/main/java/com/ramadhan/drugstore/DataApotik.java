package com.ramadhan.drugstore;

import java.util.ArrayList;

public class DataApotik {

    public static String [][] data = new String[][]{
            {"Apotek Kimia Farma Sudirman KM 3,5","Apotek kimia farma sudirman berada di Jl. Jend. Sudirman No.3105, 20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30121. Apotik ini buka 24 jam, untuk menghubungi apotik ini bisa telpon ke nomor  (0711) 5732901. Apotik ini menyediakan layanan Belanja di dalam toko , Pengambilan di dalam toko , Pengiriman. Berikut rating apotik Kimia Farma Sudirman KM 3,5 3.7/5","data:image/jpeg;base64,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","-2.96862359656516, 104.74955877478263"},
            {"Apotek K 24","Apotek K24  berada di Jl. MP. Mangkunegara No.10-11, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30163. Apotik ini buka 24 jam, untuk menghubungi apotik ini bisa telpon ke nomor  (0711) 825431. Apotik ini menyediakan layanan Belanja di dalam toko , Pengambilan di dalam toko , Pengiriman. Berikut rating Apotek K24 5/5","https://lh3.googleusercontent.com/gps-proxy/AGL7lfARvWnKIYOmvnrLGO48jYl09zdYeeYKHhVm9W8VaPwpXBlL8NphbCV-WosGBOXkB7rcab6f1qCM7nmy7nAz4i-k3bzMItGKwjMqA37XHUGA-zRknRFLyLcGeRY46dLgdt_F9LoxiW6DmDryomiORFsD5L_Y8l9oT9Mi1NtFhL5DheRowIBzSs9K2kcgTuHr7rZjow4=w408-h306-k-no","-2.94723179102419, 104.76783446012891"},
            {"Apotek Sehat Farma","Apotek Sehat Farma berada di Jl. Sukabangun II No.2298, Sukajaya, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961. Apotik ini buka Setiap Senin - Sabtu  pukul 09.00 – 17.00, untuk menghubungi apotik ini bisa telpon ke nomor  (0711) 4254988. Apotik ini menyediakan layanan Belanja di dalam toko . Rating Apotik ini 5/5","https://fastly.4sqi.net/img/general/600x600/46370708_vWWx1ufDCF9KrAhPclFj6fROYA2oaiENcoMJX-wUQlM.jpg","-2.9362903585176396, 104.73441015682504"},
            {"Apotek Cahaya","Apotek Cahaya berada di Jl. H. Sanusi No.2A, Ario Kemuning, Kec. Kemuning, Kota Palembang,  Sumatera Selatan 30151. Apotik ini buka Setiap hari  pukul 08.00 – 21.30, untuk menghubungi apotik ini bisa telpon ke nomor  (0711) 5610748. Apotik ini menyediakan layanan Belanja di dalam toko , Pengambilan di dalam toko , Pengiriman Rating Apotik ini 3.9/5","data:image/jpeg;base64,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","-2.9504002642108644, 104.74149265157554"},
            {"Apotek Sehat","Apotek Sehat berada di Jalan Mayor Salim Batubara No.65G, Sekip Jaya, Ilir Timur I, Sekip Jaya, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30114. Apotik ini buka Setiap hari  Senin - Sabtu  pukul 08.30 – 21.30, untuk menghubungi apotik ini bisa telpon ke nomor  (0711) 5732654. Apotik ini menyediakan layanan Belanja di dalam toko , Pengambilan di dalam toko , Pengiriman Rating Apotik ini 4,3/5","https://lh3.googleusercontent.com/gps-proxy/AGL7lfCvahIjY1NxxBUz08PVS9LDgr5eAHs3SfujtWBJYy-6EkRR5EtXTuuxEU2M5_8MgO_sJtG2mdNV4ks49XRfPiHY1hZ_9OjFo7r6xFp6YczKq1kx_euR0pzvaNa9Es5DapyoM1u8TPGHMQrh3OswXJ2-e0bvCj9BOMzkMxrA8_Pyhqjz-upWm9x4jhdVFSsq7iwe2Yg=w408-h306-k-no","-2.9682802629282232, 104.75561599740416"},
            {"Apotek Parisya","Apotek Parisya berada di Jl. Angkatan 66 No.63, Pipa Jaya, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30164. Apotik ini buka Senin - Sabtu  pukul 08.30 – 21.00, untuk menghubungi apotik ini bisa telpon ke nomor (0711) 824381 . Apotik ini menyediakan layanan Belanja di dalam toko Rating Apotik ini 4.1/5","https://lh3.googleusercontent.com/gps-proxy/AGL7lfCb2nBSaPoXv-VhkJWSjvoxZ_uD8JCaqwfAJLPeo0N7E_bbV2uBsjXC40L8QNLs9d1zOo3EzY6U1eYjYTv6vD81HzE5VhUUZBpT3XF7kDhff_6dyLg2Bqk6IoUl_Elyohp1BmbOP116r8NHRkJij4qLQ4_XLW_Fxa1pLiTLYaMhds-dz8wMWz-_sS4UmJoBK7UvaOU=w408-h306-k-no","-2.9520885750723838, 104.75432852900299"},
            {"Apotik Plus","Apotek Plus berada di Palembang Indah Mall, Jl. Letkol Iskandar No.18, 24 Ilir, Kec. Bukit Kecil, KotaPalembang, Sumatera Selatan 30134. Apotik ini buka Senin - Sabtu  pukul 10.00 – 21.30, untuk menghubungi apotik ini bisa telpon ke nomor (0711) 762309. Apotik ini menyediakan layanan Belanja di dalam toko Rating Apotik ini 5/5","https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=rIAeBQY86vz9RcGQqgW0sA&cb_client=search.gws-prod.gps&w=408&h=240&yaw=340.44797&pitch=0&thumbfov=100","-2.951190791006512, 104.76074307107784"},
            {"Apotik Dempo","Apotek Dempo berada di Jl. Lingkaran1, 15 Ilir, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30111. Apotik ini buka hari Senin - Jumat pukul 07.30 – 22.00 Sabtu pukul 07.30 – 20.00 Minggu pukul 07.30 – 18.00, untuk menghubungi apotik ini bisa telpon ke nomor (0711) 350170 . Apotik ini menyediakan layanan Belanja di dalam , Pengambilan di dalam toko , Pengiriman toko. Rating Apotik ini  5/5","https://lh3.googleusercontent.com/gps-proxy/AGL7lfBN73iE3uE56Xob6Svro_lx4KOr6T2st23iRQwONV8xyab8-61FGMb18h-6dTW0hqQO7mMGxapo7Bk_92pycGWaZNhy-5QPMcncEd-5ErBpIvbFcNLFdLo0IPgBqQedBeUEPTo0NZaNu9tYw_EQjw8ilSEjlS1veyccyBPPNAmK5oOCZedWKU3DoV8Zq1ee9b1edqk=w408-h306-k-no","-2.9811623031340053, 104.76217002329712"},
            {"Apotek Akasia","Apotek Akasia berada di Jl. Sukabangun II No.1803A, Sukajaya, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30151. Apotik ini buka hari Setiap hari pukul 08.00 – 21.00, untuk menghubungi apotik ini bisa telpon ke nomor 0822-7871-8571,Apotik ini menyediakan layanan Belanja di dalam toko. Rating Apotik ini 5/5","https://lh5.googleusercontent.com/p/AF1QipNctQIIvzTN6h8vj0bE5yJ8mv_dgJWu8GwiirYm=w408-h550-k-no","-2.9354355198997637, 104.73463882759258"},
            {"Apotik Musi","Apotek Musi berada di Jl. Ps. 16 Ilir No.97, RT.11/RW.04, 16 Ilir, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30111. Apotik ini buka Senin – Sabtu pukul 07.00 – 19.00\n" +
                    "Minggu pukul 08.00 – 14.00, untuk menghubungi apotik ini bisa telpon ke nomor (0711) 351907,Apotik ini menyediakan layanan Belanja di dalam toko. Rating Apotik ini 4.4/5\n" +
                    "\n","https://lh3.googleusercontent.com/gps-proxy/AGL7lfDV1qRja-wqvqEHiq3B7yN-bbBxue3wbAJcGJ0ki2hoeRHr8g8ojVi8piztL53BLIE5R-iGBhhMrZz3ZuFOdlVCGAcxaNX2q4GoarpIWxKywDeCmXh3qbgnMavetNX7umDmaCMVwgUv66Jvjec17l1xZFFVhVE-Y3LMAqQ6UdWrdh4dVAj5fb1CyUquf_3UwKT_I1I=w408-h306-k-no","-2.9882328460260297, 104.76416515618878"},
    };

    public static ArrayList<ModelApotik>
    ambilDataApotik(){
        ArrayList<ModelApotik> dataApotik= new ArrayList<>();
        for(String[] varData : data){
            ModelApotik model = new ModelApotik();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            model.setKordinat(varData[3]);

            dataApotik.add(model);
        }
        return dataApotik;
    }
}
