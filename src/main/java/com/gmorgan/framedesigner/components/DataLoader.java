package com.gmorgan.framedesigner.components;

import com.gmorgan.framedesigner.Models.Section;
import com.gmorgan.framedesigner.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    SectionRepository sectionRepository;

    public DataLoader() {
    }

    public void run (ApplicationArguments args) throws Exception {

//        Section section1 = new Section("RHS 50x30x2.5", 3.72, 12, 5.3, 3.53, 4.81, 2.5, 50, 30, 2.92);
//        sectionRepository.save(section1);
//        Section section2 = new Section("RHS 50x30x3.0", 4.4, 13.9, 6.04, 4.03, 5.54, 3, 50, 30, 3.45);
//        sectionRepository.save(section2);
//        Section section3 = new Section("RHS 50x30x3.2", 4.66, 14.5, 6.31, 4.21, 5.82, 3.2, 50, 30, 3.66);
//        sectionRepository.save(section3);
        Section section4 = new Section("RHS 50x30x4.0", 5.68, 17, 7.25, 4.83, 6.8, 4, 50, 30, 4.46);
        sectionRepository.save(section4);
        Section section5 = new Section("RHS 50x30x5.0", 6.88, 19.5, 8.13, 5.42, 7.79, 5, 50, 30, 5.4);
        sectionRepository.save(section5);
//        Section section6 = new Section("RHS 60x40x2.5", 4.72, 23.1, 12.2, 6.1, 7.71, 2.5, 60, 40, 3.71);
//        sectionRepository.save(section6);
//        Section section7 = new Section("RHS 60x40x3.0", 5.6, 26.9, 14.1, 7.04, 8.96, 3, 60, 40, 4.39);
//        sectionRepository.save(section7);
//        Section section8 = new Section("RHS 60x40x3.2", 5.94, 28.3, 14.8, 7.39, 9.44, 3.2, 60, 40, 4.66);
//        sectionRepository.save(section8);
        Section section9 = new Section("RHS 60x40x4.0", 7.28, 33.6, 17.3, 8.67, 11.2, 4, 60, 40, 5.72);
        sectionRepository.save(section9);
        Section section10 = new Section("RHS 60x40x5.0", 8.88, 39.2, 20, 10, 13.1, 5, 60, 40, 6.97);
        sectionRepository.save(section10);
        Section section11 = new Section("RHS 60x40x6.3", 10.8, 45.1, 22.6, 11.3, 15, 6.3, 60, 40, 8.49);
        sectionRepository.save(section11);
//        Section section12 = new Section("RHS 80x40x3.0", 6.8, 55, 18.2, 9.1, 13.8, 3, 80, 40, 5.34);
//        sectionRepository.save(section12);
//        Section section13 = new Section("RHS 80x40x3.2", 7.22, 58.1, 19.1, 9.56, 14.5, 3.2, 80, 40, 5.67);
//        sectionRepository.save(section13);
        Section section14 = new Section("RHS 80x40x4.0", 8.88, 69.6, 22.6, 11.3, 17.4, 4, 80, 40, 6.97);
        sectionRepository.save(section14);
        Section section15 = new Section("RHS 80x40x5.0", 10.9, 82.4, 26.2, 13.1, 20.6, 5, 80, 40, 8.54);
        sectionRepository.save(section15);
        Section section16 = new Section("RHS 80x40x6.3", 13.3, 96.5, 29.8, 14.9, 24.1, 6.3, 80, 40, 10.5);
        sectionRepository.save(section16);
        Section section17 = new Section("RHS 80x40x8.0", 16.3, 111, 33.1, 16.6, 27.7, 8, 80, 40, 12.8);
        sectionRepository.save(section17);
//        Section section18 = new Section("RHS 90x50x3.0", 8, 85.4, 33.8, 13.5, 19, 3, 90, 50, 6.28);
//        sectionRepository.save(section18);
//        Section section19 = new Section("RHS 90x50x3.6", 9.5, 99.8, 39.1, 15.6, 22.2, 3.6, 90, 50, 7.46);
//        sectionRepository.save(section19);
        Section section20 = new Section("RHS 90x50x5.0", 12.9, 130, 50, 20, 28.9, 5, 90, 50, 10.1);
        sectionRepository.save(section20);
        Section section21 = new Section("RHS 90x50x6.3", 15.9, 154, 58.1, 23.3, 34.2, 6.3, 90, 50, 12.5);
        sectionRepository.save(section21);
        Section section22 = new Section("RHS 90x50x8.0", 19.5, 180, 66.3, 26.5, 40, 8, 90, 50, 15.3);
        sectionRepository.save(section22);
//        Section section23 = new Section("RHS 100x50x3.0", 8.6, 111, 37.1, 14.8, 22.2, 3, 100, 50, 6.75);
//        sectionRepository.save(section23);
//        Section section24 = new Section("RHS 100x50x3.2", 9.14, 117, 39.1, 15.6, 23.5, 3.2, 100, 50, 7.18);
//        sectionRepository.save(section24);
        Section section25 = new Section("RHS 100x50x4.0", 11.3, 142, 46.7, 18.7, 28.4, 4, 100, 50, 8.86);
        sectionRepository.save(section25);
        Section section26 = new Section("RHS 100x50x5.0", 13.9, 170, 55.1, 22, 34, 5, 100, 50, 10.9);
        sectionRepository.save(section26);
        Section section27 = new Section("RHS 100x50x6.3", 17.1, 202, 64.2, 25.7, 40.5, 6.3, 100, 50, 13.4);
        sectionRepository.save(section27);
        Section section28 = new Section("RHS 100x50x8.0", 21.1, 238, 73.5, 29.4, 47.6, 8, 100, 50, 16.6);
        sectionRepository.save(section28);
//        Section section29 = new Section("RHS 100x60x3.0", 9.2, 125, 56.2, 18.7, 25, 3, 100, 60, 7.22);
//        sectionRepository.save(section29);
//        Section section30 = new Section("RHS 100x60x3.6", 10.9, 147, 65.4, 21.8, 29.3, 3.6, 100, 60, 8.59);
//        sectionRepository.save(section30);
        Section section31 = new Section("RHS 100x60x5.0", 14.9, 192, 84.7, 28.2, 38.5, 5, 100, 60, 11.7);
        sectionRepository.save(section31);
        Section section32 = new Section("RHS 100x60x6.3", 18.4, 230, 99.9, 33.3, 46, 6.3, 100, 60, 14.4);
        sectionRepository.save(section32);
        Section section33 = new Section("RHS 100x60x8.0", 22.7, 272, 116, 38.7, 54.4, 8, 100, 60, 17.8);
        sectionRepository.save(section33);
//        Section section34 = new Section("RHS 120x60x3.6", 12.4, 230, 76.9, 25.6, 38.3, 3.6, 120, 60, 9.72);
//        sectionRepository.save(section34);
        Section section35 = new Section("RHS 120x60x5.0", 16.9, 304, 99.9, 33.3, 50.7, 5, 120, 60, 13.3);
        sectionRepository.save(section35);
        Section section36 = new Section("RHS 120x60x6.3", 20.9, 366, 118, 39.4, 61, 6.3, 120, 60, 16.4);
        sectionRepository.save(section36);
        Section section37 = new Section("RHS 120x60x8.0", 25.9, 437, 138, 45.9, 72.8, 8, 120, 60, 20.4);
        sectionRepository.save(section37);
        Section section38 = new Section("RHS 120x80x5.0", 18.9, 370, 195, 48.8, 61.7, 5, 120, 80, 14.8);
        sectionRepository.save(section38);
        Section section39 = new Section("RHS 120x80x6.3", 23.4, 447, 234, 58.4, 74.6, 6.3, 120, 80, 18.4);
        sectionRepository.save(section39);
        Section section40 = new Section("RHS 120x80x8.0", 29.1, 537, 278, 69.4, 89.5, 8, 120, 80, 22.9);
        sectionRepository.save(section40);
        Section section41 = new Section("RHS 120x80x10.0", 35.5, 628, 320, 80, 105, 10, 120, 80, 27.9);
        sectionRepository.save(section41);
        Section section42 = new Section("RHS 150x100x4.0", 19.3, 612, 326, 65.2, 81.7, 4, 150, 100, 15);
        sectionRepository.save(section42);
        Section section43 = new Section("RHS 150x100x5.0", 23.9, 747, 396, 79.1, 99.5, 5, 150, 100, 18.7);
        sectionRepository.save(section43);
        Section section44 = new Section("RHS 150x100x6.3", 29.8, 910, 479, 95.9, 121, 6.3, 150, 100, 23.3);
        sectionRepository.save(section44);
        Section section45 = new Section("RHS 150x100x8.0", 37.1, 1106, 577, 115, 147, 8, 150, 100, 29.1);
        sectionRepository.save(section45);
        Section section46 = new Section("RHS 150x100x10.0", 45.5, 1312, 678, 136, 175, 10, 150, 100, 35.7);
        sectionRepository.save(section46);
//        Section section47 = new Section("RHS 150x100x12.5", 55.5, 1532, 781, 156, 204, 12.5, 150, 100, 43.6);
//        sectionRepository.save(section47);
        Section section48 = new Section("RHS 160x80x4.0", 18.5, 617, 208, 52.1, 77.3, 4, 160, 80, 14.5);
        sectionRepository.save(section48);
        Section section49 = new Section("RHS 160x80x5.0", 22.9, 753, 251, 62.8, 94.1, 5, 160, 80, 18);
        sectionRepository.save(section49);
        Section section50 = new Section("RHS 160x80x6.3", 28.5, 917, 302, 75.6, 115, 6.3, 160, 80, 22.3);
        sectionRepository.save(section50);
        Section section51 = new Section("RHS 160x80x8.0", 35.5, 1113, 361, 90.2, 139, 8, 160, 80, 27.9);
        sectionRepository.save(section51);
        Section section52 = new Section("RHS 160x80x10.0", 43.5, 1318, 419, 105, 165, 10, 160, 80, 34.2);
        sectionRepository.save(section52);
//        Section section53 = new Section("RHS 160x80x12.5", 53, 1536, 476, 119, 192, 12.5, 160, 80, 41.6);
//        sectionRepository.save(section53);
        Section section54 = new Section("RHS 200x100x5.0", 28.9, 1509, 509, 102, 151, 5, 200, 100, 22.7);
        sectionRepository.save(section54);
        Section section55 = new Section("RHS 200x100x6.3", 36, 1851, 618, 124, 185, 6.3, 200, 100, 28.3);
        sectionRepository.save(section55);
        Section section56 = new Section("RHS 200x100x8.0", 45.1, 2269, 747, 149, 227, 8, 200, 100, 35.4);
        sectionRepository.save(section56);
        Section section57 = new Section("RHS 200x100x10.0", 55.5, 2718, 881, 176, 272, 10, 200, 100, 43.6);
        sectionRepository.save(section57);
//        Section section58 = new Section("RHS 200x100x12.5", 68, 3218, 1022, 204, 322, 12.5, 200, 100, 53.4);
//        sectionRepository.save(section58);
//        Section section59 = new Section("RHS 200x100x16.0", 84.5, 3808, 1175, 235, 381, 16, 200, 100, 66.4);
//        sectionRepository.save(section59);
        Section section60 = new Section("RHS 200x120x5.0", 30.9, 1699, 767, 128, 170, 5, 200, 120, 24.2);
        sectionRepository.save(section60);
        Section section61 = new Section("RHS 200x120x6.3", 38.5, 2087, 937, 156, 209, 6.3, 200, 120, 30.3);
        sectionRepository.save(section61);
        Section section62 = new Section("RHS 200x120x8.0", 48.3, 2564, 1140, 190, 256, 8, 200, 120, 37.9);
        sectionRepository.save(section62);
        Section section63 = new Section("RHS 200x120x10.0", 59.5, 3079, 1356, 226, 308, 10, 200, 120, 46.7);
        sectionRepository.save(section63);
        Section section64 = new Section("RHS 200x120x12.5", 73, 3658, 1590, 265, 366, 12.5, 200, 120, 57.3);
        sectionRepository.save(section64);
//        Section section65 = new Section("RHS 200x120x16.0", 90.9, 4351, 1856, 309, 435, 16, 200, 120, 71.4);
//        sectionRepository.save(section65);
        Section section66 = new Section("RHS 200x150x5.0", 33.9, 1984, 1272, 170, 198, 5, 200, 150, 26.6);
        sectionRepository.save(section66);
        Section section67 = new Section("RHS 200x150x6.3", 42.3, 2442, 1561, 208, 244, 6.3, 200, 150, 33.2);
        sectionRepository.save(section67);
        Section section68 = new Section("RHS 200x150x8.0", 53.1, 3006, 1914, 255, 301, 8, 200, 150, 41.7);
        sectionRepository.save(section68);
        Section section69 = new Section("RHS 200x150x10.0", 65.5, 3621, 2293, 306, 362, 10, 200, 150, 51.4);
        sectionRepository.save(section69);
        Section section70 = new Section("RHS 200x150x12.5", 80.5, 4318, 2717, 362, 432, 12.5, 200, 150, 63.2);
        sectionRepository.save(section70);
//        Section section71 = new Section("RHS 200x150x16.0", 101, 5166, 3221, 429, 517, 16, 200, 150, 78.9);
//        sectionRepository.save(section71);
        Section section72 = new Section("RHS 250x150x5.0", 38.9, 3382, 1535, 205, 271, 5, 250, 150, 30.5);
        sectionRepository.save(section72);
        Section section73 = new Section("RHS 250x150x6.3", 48.6, 4178, 1886, 252, 334, 6.3, 250, 150, 38.2);
        sectionRepository.save(section73);
        Section section74 = new Section("RHS 250x150x8.0", 61.1, 5167, 2317, 309, 413, 8, 250, 150, 48);
        sectionRepository.save(section74);
        Section section75 = new Section("RHS 250x150x10.0", 75.5, 6259, 2784, 371, 501, 10, 250, 150, 59.3);
        sectionRepository.save(section75);
        Section section76 = new Section("RHS 250x150x12.5", 93, 7518, 3310, 441, 601, 12.5, 250, 150, 73);
        sectionRepository.save(section76);
//        Section section77 = new Section("RHS 250x150x16.0", 117, 9089, 3943, 526, 727, 16, 250, 150, 91.5);
//        sectionRepository.save(section77);
        Section section78 = new Section("RHS 260x140x6.3", 48.6, 4392, 1671, 239, 338, 6.3, 260, 140, 38.2);
        sectionRepository.save(section78);
        Section section79 = new Section("RHS 260x140x8.0", 61.1, 5434, 2049, 293, 418, 8, 260, 140, 48);
        sectionRepository.save(section79);
        Section section80 = new Section("RHS 260x140x10.0", 75.5, 6583, 2457, 351, 506, 10, 260, 140, 59.3);
        sectionRepository.save(section80);
        Section section81 = new Section("RHS 260x140x12.5", 93, 7909, 2914, 416, 608, 12.5, 260, 140, 73);
        sectionRepository.save(section81);
//        Section section82 = new Section("RHS 260x140x16.0", 117, 9565, 3460, 494, 736, 16, 260, 140, 91.5);
//        sectionRepository.save(section82);
        Section section83 = new Section("RHS 300x100x6.3", 48.6, 5162, 895, 179, 344, 6.3, 300, 100, 38.2);
        sectionRepository.save(section83);
        Section section84 = new Section("RHS 300x100x8.0", 61.1, 6386, 1087, 217, 426, 8, 300, 100, 48);
        sectionRepository.save(section84);
        Section section85 = new Section("RHS 300x100x10.0", 75.5, 7738, 1288, 258, 516, 10, 300, 100, 59.3);
        sectionRepository.save(section85);
        Section section86 = new Section("RHS 300x100x12.5", 93, 9295, 1504, 301, 620, 12.5, 300, 100, 73);
        sectionRepository.save(section86);
//        Section section87 = new Section("RHS 300x100x16.0", 117, 11240, 1747, 349, 749, 16, 300, 100, 91.5);
//        sectionRepository.save(section87);
        Section section88 = new Section("RHS 300x200x6.3", 61.2, 7880, 4216, 422, 525, 6.3, 300, 200, 48.1);
        sectionRepository.save(section88);
        Section section89 = new Section("RHS 300x200x8.0", 77.1, 9798, 5219, 522, 653, 8, 300, 200, 60.5);
        sectionRepository.save(section89);
        Section section90 = new Section("RHS 300x200x10.0", 95.5, 11940, 6331, 633, 796, 10, 300, 200, 75);
        sectionRepository.save(section90);
        Section section91 = new Section("RHS 300x200x12.5", 118, 14460, 7619, 762, 964, 12.5, 300, 200, 92.6);
        sectionRepository.save(section91);
//        Section section92 = new Section("RHS 300x200x16.0", 149, 17700, 9239, 924, 1180, 16, 300, 200, 117);
//        sectionRepository.save(section92);
        Section section93 = new Section("RHS 300x250x6.3", 67.5, 9239, 6984, 559, 616, 6.3, 300, 250, 53);
        sectionRepository.save(section93);
        Section section94 = new Section("RHS 300x250x8.0", 85.1, 11500, 8682, 695, 767, 8, 300, 250, 66.8);
        sectionRepository.save(section94);
        Section section95 = new Section("RHS 300x250x10.0", 106, 14050, 10580, 847, 937, 10, 300, 250, 82.8);
        sectionRepository.save(section95);
        Section section96 = new Section("RHS 300x250x12.5", 130, 17050, 12810, 1025, 1137, 12.5, 300, 250, 102);
        sectionRepository.save(section96);
//        Section section97 = new Section("RHS 300x250x16.0", 165, 20930, 15670, 1254, 1395, 16, 300, 250, 129);
//        sectionRepository.save(section97);
        Section section98 = new Section("RHS 350x150x6.3", 61.2, 9551, 2537, 338, 546, 6.3, 350, 150, 48.1);
        sectionRepository.save(section98);
        Section section99 = new Section("RHS 350x150x8.0", 77.1, 11880, 3125, 417, 679, 8, 350, 150, 60.5);
        sectionRepository.save(section99);
        Section section100 = new Section("RHS 350x150x10.0", 95.5, 14490, 3766, 502, 828, 10, 350, 150, 75);
        sectionRepository.save(section100);
        Section section101 = new Section("RHS 350x150x12.5", 118, 17560, 4495, 599, 1003, 12.5, 350, 150, 92.6);
        sectionRepository.save(section101);
//        Section section102 = new Section("RHS 350x150x16.0", 149, 21500, 5386, 718, 1229, 16, 350, 150, 117);
//        sectionRepository.save(section102);
        Section section103 = new Section("RHS 350x250x8.0", 93.1, 16560, 9854, 788, 946, 8, 350, 250, 73.1);
        sectionRepository.save(section103);
        Section section104 = new Section("RHS 350x250x10.0", 116, 20270, 12020, 962, 1158, 10, 350, 250, 90.7);
        sectionRepository.save(section104);
        Section section105 = new Section("RHS 350x250x12.5", 143, 24680, 14580, 1166, 1410, 12.5, 350, 250, 112);
        sectionRepository.save(section105);
//        Section section106 = new Section("RHS 350x250x16.0", 181, 30440, 17860, 1429, 1739, 16, 350, 250, 142);
//        sectionRepository.save(section106);
        Section section107 = new Section("RHS 400x150x6.3", 67.5, 13350, 2863, 382, 667, 6.3, 400, 150, 53);
        sectionRepository.save(section107);
        Section section108 = new Section("RHS 400x150x8.0", 85.1, 16630, 3528, 470, 832, 8, 400, 150, 66.8);
        sectionRepository.save(section108);
        Section section109 = new Section("RHS 400x150x10.0", 106, 20340, 4257, 568, 1017, 10, 400, 150, 82.8);
        sectionRepository.save(section109);
        Section section110 = new Section("RHS 400x150x12.5", 130, 24720, 5087, 678, 1236, 12.5, 400, 150, 102);
        sectionRepository.save(section110);
//        Section section111 = new Section("RHS 400x150x16.0", 165, 30400, 6108, 814, 1520, 16, 400, 150, 129);
//        sectionRepository.save(section111);
        Section section112 = new Section("RHS 400x200x6.3", 73.8, 15790, 5398, 540, 789, 6.3, 400, 200, 57.9);
        sectionRepository.save(section112);
        Section section113 = new Section("RHS 400x200x8.0", 93.1, 19710, 6695, 669, 985, 8, 400, 200, 73.1);
        sectionRepository.save(section113);
        Section section114 = new Section("RHS 400x200x10.0", 116, 24140, 8138, 814, 1207, 10, 400, 200, 90.7);
        sectionRepository.save(section114);
        Section section115 = new Section("RHS 400x200x12.5", 143, 29410, 9820, 982, 1471, 12.5, 400, 200, 112);
        sectionRepository.save(section115);
//        Section section116 = new Section("RHS 400x200x16.0", 181, 36300, 11950, 1195, 1815, 16, 400, 200, 142);
//        sectionRepository.save(section116);
        Section section117 = new Section("RHS 400x300x10.0", 136, 31750, 20360, 1357, 1587, 10, 400, 300, 106);
        sectionRepository.save(section117);
        Section section118 = new Section("RHS 400x300x12.5", 168, 38800, 24800, 1654, 1940, 12.5, 400, 300, 132);
        sectionRepository.save(section118);
//        Section section119 = new Section("RHS 400x300x16.0", 213, 48100, 30620, 2041, 2405, 16, 400, 300, 167);
//        sectionRepository.save(section119);
        Section section120 = new Section("RHS 450x250x8.0", 109, 30270, 12200, 976, 1345, 8, 450, 250, 85.7);
        sectionRepository.save(section120);
        Section section121 = new Section("RHS 450x250x10.0", 136, 37180, 14900, 1192, 1653, 10, 450, 250, 106);
        sectionRepository.save(section121);
        Section section122 = new Section("RHS 450x250x12.5", 168, 45470, 18100, 1448, 2021, 12.5, 450, 250, 132);
        sectionRepository.save(section122);
//        Section section123 = new Section("RHS 450x250x16.0", 213, 56420, 22250, 1780, 2508, 16, 450, 250, 167);
//        sectionRepository.save(section123);
        Section section124 = new Section("RHS 500x200x8.0", 109, 34270, 8170, 817, 1370, 8, 500, 200, 85.7);
        sectionRepository.save(section124);
        Section section125 = new Section("RHS 500x200x10.0", 136, 42110, 9945, 994, 1684, 10, 500, 200, 106);
        sectionRepository.save(section125);
        Section section126 = new Section("RHS 500x200x12.5", 168, 51510, 12020, 1202, 2060, 12.5, 500, 200, 132);
        sectionRepository.save(section126);
//        Section section127 = new Section("RHS 500x200x16.0", 213, 63930, 14970, 1467, 2557, 16, 500, 200, 167);
//        sectionRepository.save(section127);
        Section section128 = new Section("RHS 500x300x10.0", 156, 54120, 24560, 1638, 2165, 10, 500, 300, 122);
        sectionRepository.save(section128);
        Section section129 = new Section("RHS 500x300x12.5", 193, 66360, 29970, 1998, 2655, 12.5, 500, 300, 152);
        sectionRepository.save(section129);
//        Section section130 = new Section("RHS 500x300x16.0", 245, 82670, 37080, 2472, 3307, 16, 500, 300, 192);
//        sectionRepository.save(section130);
//        Section section131 = new Section("RHS 500x300x20.0", 302, 100100, 44550, 2970, 4006, 20, 500, 300, 237);
//        sectionRepository.save(section131);
//        Section section132 = new Section("SHS 40x40x2.5", 3.72, 8.67, 8.67, 4.33, 4.33, 2.5, 40, 40, 2.92);
//        sectionRepository.save(section132);
//        Section section133 = new Section("SHS 40x40x3.0", 4.4, 9.96, 9.96, 4.98, 4.98, 3, 40, 40, 3.45);
//        sectionRepository.save(section133);
//        Section section134 = new Section("SHS 40x40x3.2", 4.66, 10.4, 10.4, 5.22, 5.22, 3.2, 40, 40, 3.66);
//        sectionRepository.save(section134);
        Section section135 = new Section("SHS 40x40x4.0", 5.68, 12.1, 12.1, 6.07, 6.07, 4, 40, 40, 4.46);
        sectionRepository.save(section135);
        Section section136 = new Section("SHS 40x40x5.0", 6.88, 13.8, 13.8, 6.92, 6.92, 5, 40, 40, 5.4);
        sectionRepository.save(section136);
//        Section section137 = new Section("SHS 50x50x2.5", 4.72, 17.7, 17.7, 7.07, 7.07, 2.5, 50, 50, 3.71);
//        sectionRepository.save(section137);
//        Section section138 = new Section("SHS 50x50x3.0", 5.6, 20.5, 20.5, 8.2, 8.2, 3, 50, 50, 4.39);
//        sectionRepository.save(section138);
//        Section section139 = new Section("SHS 50x50x3.2", 5.94, 21.6, 21.6, 8.62, 8.62, 3.2, 50, 50, 4.66);
//        sectionRepository.save(section139);
        Section section140 = new Section("SHS 50x50x4.0", 7.28, 25.5, 25.5, 10.2, 10.2, 4, 50, 50, 5.72);
        sectionRepository.save(section140);
        Section section141 = new Section("SHS 50x50x5.0", 8.88, 29.6, 29.6, 11.9, 11.9, 5, 50, 50, 6.97);
        sectionRepository.save(section141);
        Section section142 = new Section("SHS 50x50x6.3", 10.8, 33.9, 33.9, 13.6, 13.6, 6.3, 50, 50, 8.49);
        sectionRepository.save(section142);
//        Section section143 = new Section("SHS 60x60x3.0", 6.8, 36.6, 36.6, 12.2, 12.2, 3, 60, 60, 5.34);
//        sectionRepository.save(section143);
//        Section section144 = new Section("SHS 60x60x3.2", 7.22, 38.7, 38.7, 12.9, 12.9, 3.2, 60, 60, 5.67);
//        sectionRepository.save(section144);
        Section section145 = new Section("SHS 60x60x4.0", 8.88, 46.1, 46.1, 15.4, 15.4, 4, 60, 60, 6.97);
        sectionRepository.save(section145);
        Section section146 = new Section("SHS 60x60x5.0", 10.9, 54.4, 54.4, 18.1, 18.1, 5, 60, 60, 8.54);
        sectionRepository.save(section146);
        Section section147 = new Section("SHS 60x60x6.3", 13.3, 63.4, 63.4, 21.1, 21.1, 6.3, 60, 60, 10.5);
        sectionRepository.save(section147);
        Section section148 = new Section("SHS 60x60x8.0", 16.3, 72.4, 72.4, 24.1, 24.1, 8, 60, 60, 12.8);
        sectionRepository.save(section148);
//        Section section149 = new Section("SHS 70x70x3.0", 8, 59.6, 59.6, 17, 17, 3, 70, 70, 6.28);
//        sectionRepository.save(section149);
//        Section section150 = new Section("SHS 70x70x3.6", 9.5, 69.5, 69.5, 19.9, 19.9, 3.6, 70, 70, 7.46);
//        sectionRepository.save(section150);
        Section section151 = new Section("SHS 70x70x5.0", 12.9, 90.1, 90.1, 25.7, 25.7, 5, 70, 70, 10.1);
        sectionRepository.save(section151);
        Section section152 = new Section("SHS 70x70x6.3", 15.9, 106, 106, 30.4, 30.4, 6.3, 70, 70, 12.5);
        sectionRepository.save(section152);
        Section section153 = new Section("SHS 70x70x8.0", 19.5, 123, 123, 35.3, 35.3, 8, 70, 70, 15.3);
        sectionRepository.save(section153);
//        Section section154 = new Section("SHS 80x80x3.0", 9.2, 90.6, 90.6, 22.7, 22.7, 3, 80, 80, 7.22);
//        sectionRepository.save(section154);
//        Section section155 = new Section("SHS 80x80x3.6", 10.9, 106, 106, 26.5, 26.5, 3.6, 80, 80, 8.59);
//        sectionRepository.save(section155);
        Section section156 = new Section("SHS 80x80x5.0", 14.9, 139, 139, 34.7, 34.7, 5, 80, 80, 11.7);
        sectionRepository.save(section156);
        Section section157 = new Section("SHS 80x80x6.3", 18.4, 165, 165, 41.3, 41.3, 6.3, 80, 80, 14.4);
        sectionRepository.save(section157);
        Section section158 = new Section("SHS 80x80x8.0", 22.7, 194, 194, 48.6, 48.6, 8, 80, 80, 17.8);
        sectionRepository.save(section158);
//        Section section159 = new Section("SHS 90x90x3.6", 12.4, 154, 154, 34.1, 34.1, 3.6, 90, 90, 9.72);
//        sectionRepository.save(section159);
        Section section160 = new Section("SHS 90x90x5.0", 16.9, 202, 202, 45, 45, 5, 90, 90, 13.3);
        sectionRepository.save(section160);
        Section section161 = new Section("SHS 90x90x6.3", 20.9, 242, 242, 53.9, 53.9, 6.3, 90, 90, 16.4);
        sectionRepository.save(section161);
        Section section162 = new Section("SHS 90x90x8.0", 25.9, 288, 288, 64, 64, 8, 90, 90, 20.4);
        sectionRepository.save(section162);
        Section section163 = new Section("SHS 100x100x4.0", 15.3, 234, 234, 46.8, 46.8, 4, 100, 100, 12);
        sectionRepository.save(section163);
        Section section164 = new Section("SHS 100x100x5.0", 18.9, 283, 283, 56.6, 56.6, 5, 100, 100, 14.8);
        sectionRepository.save(section164);
        Section section165 = new Section("SHS 100x100x6.3", 23.4, 341, 341, 68.2, 68.2, 6.3, 100, 100, 18.4);
        sectionRepository.save(section165);
        Section section166 = new Section("SHS 100x100x8.0", 29.1, 408, 408, 81.5, 81.5, 8, 100, 100, 22.9);
        sectionRepository.save(section166);
        Section section167 = new Section("SHS 100x100x10.0", 35.5, 474, 474, 94.9, 94.9, 10, 100, 100, 27.9);
        sectionRepository.save(section167);
        Section section168 = new Section("SHS 120x120x4.0", 18.5, 413, 413, 68.9, 68.9, 4, 120, 120, 14.5);
        sectionRepository.save(section168);
        Section section169 = new Section("SHS 120x120x5.0", 22.9, 503, 503, 83.8, 83.8, 5, 120, 120, 18);
        sectionRepository.save(section169);
        Section section170 = new Section("SHS 120x120x6.3", 28.5, 610, 610, 102, 102, 6.3, 120, 120, 22.3);
        sectionRepository.save(section170);
        Section section171 = new Section("SHS 120x120x8.0", 35.5, 738, 738, 123, 123, 8, 120, 120, 27.9);
        sectionRepository.save(section171);
        Section section172 = new Section("SHS 120x120x10.0", 43.5, 870, 870, 145, 145, 10, 120, 120, 34.2);
        sectionRepository.save(section172);
        Section section173 = new Section("SHS 120x120x12.5", 53, 1009, 1009, 168, 168, 12.5, 120, 120, 41.6);
        sectionRepository.save(section173);
        Section section174 = new Section("SHS 140x140x5.0", 26.9, 814, 814, 116, 116, 5, 140, 140, 21.1);
        sectionRepository.save(section174);
        Section section175 = new Section("SHS 140x140x6.3", 33.5, 994, 994, 142, 142, 6.3, 140, 140, 26.3);
        sectionRepository.save(section175);
        Section section176 = new Section("SHS 140x140x8.0", 41.9, 1212, 1212, 173, 173, 8, 140, 140, 32.9);
        sectionRepository.save(section176);
        Section section177 = new Section("SHS 140x140x10.0", 51.5, 1441, 1441, 206, 206, 10, 140, 140, 40.4);
        sectionRepository.save(section177);
        Section section178 = new Section("SHS 140x140x12.5", 63, 1691, 1691, 242, 242, 12.5, 140, 140, 49.5);
        sectionRepository.save(section178);
        Section section179 = new Section("SHS 150x150x5.0", 28.9, 1009, 1009, 135, 135, 5, 150, 150, 22.7);
        sectionRepository.save(section179);
        Section section180 = new Section("SHS 150x150x6.3", 36, 1236, 1236, 165, 165, 6.3, 150, 150, 28.3);
        sectionRepository.save(section180);
        Section section181 = new Section("SHS 150x150x8.0", 45.1, 1510, 1510, 201, 201, 8, 150, 150, 35.4);
        sectionRepository.save(section181);
        Section section182 = new Section("SHS 150x150x10.0", 55.5, 1803, 1803, 240, 240, 10, 150, 150, 43.6);
        sectionRepository.save(section182);
        Section section183 = new Section("SHS 150x150x12.5", 68, 2125, 2125, 283, 283, 12.5, 150, 150, 53.4);
        sectionRepository.save(section183);
//        Section section184 = new Section("SHS 150x150x16.0", 84.5, 2500, 2500, 333, 333, 16, 150, 150, 66.4);
//        sectionRepository.save(section184);
        Section section185 = new Section("SHS 160x160x5.0", 30.9, 1234, 1234, 154, 154, 5, 160, 160, 24.2);
        sectionRepository.save(section185);
        Section section186 = new Section("SHS 160x160x6.3", 38.5, 1513, 1513, 189, 189, 6.3, 160, 160, 30.3);
        sectionRepository.save(section186);
        Section section187 = new Section("SHS 160x160x8.0", 48.3, 1853, 1853, 232, 232, 8, 160, 160, 37.9);
        sectionRepository.save(section187);
        Section section188 = new Section("SHS 160x160x10.0", 59.5, 2219, 2219, 277, 277, 10, 160, 160, 46.7);
        sectionRepository.save(section188);
        Section section189 = new Section("SHS 160x160x12.5", 73, 2627, 2627, 328, 328, 12.5, 160, 160, 57.3);
        sectionRepository.save(section189);
//        Section section190 = new Section("SHS 160x160x16.0", 90.9, 3108, 3108, 388, 388, 16, 160, 160, 71.4);
//        sectionRepository.save(section190);
        Section section191 = new Section("SHS 180x180x5.0", 34.9, 1777, 1777, 197, 197, 5, 180, 180, 27.4);
        sectionRepository.save(section191);
        Section section192 = new Section("SHS 180x180x6.3", 43.6, 2186, 2186, 243, 243, 6.3, 180, 180, 34.2);
        sectionRepository.save(section192);
        Section section193 = new Section("SHS 180x180x8.0", 54.7, 2689, 2689, 299, 299, 8, 180, 180, 43);
        sectionRepository.save(section193);
        Section section194 = new Section("SHS 180x180x10.0", 67.5, 3237, 3237, 360, 360, 10, 180, 180, 53);
        sectionRepository.save(section194);
        Section section195 = new Section("SHS 180x180x12.5", 83, 3856, 3856, 428, 428, 12.5, 180, 180, 65.2);
        sectionRepository.save(section195);
        Section section196 = new Section("SHS 180x180x16.0", 104, 4607, 4607, 512, 512, 16, 180, 180, 81.4);
        sectionRepository.save(section196);
        Section section197 = new Section("SHS 200x200x5.0", 38.9, 2460, 2460, 246, 246, 5, 200, 200, 30.5);
        sectionRepository.save(section197);
        Section section198 = new Section("SHS 200x200x6.3", 48.6, 3033, 3033, 303, 303, 6.3, 200, 200, 38.2);
        sectionRepository.save(section198);
        Section section199 = new Section("SHS 200x200x8.0", 61.1, 3744, 3744, 374, 374, 8, 200, 200, 48);
        sectionRepository.save(section199);
        Section section200 = new Section("SHS 200x200x10.0", 75.5, 4525, 4525, 452, 452, 10, 200, 200, 59.3);
        sectionRepository.save(section200);
        Section section201 = new Section("SHS 200x200x12.5", 93, 5419, 5419, 542, 542, 12.5, 200, 200, 73);
        sectionRepository.save(section201);
//        Section section202 = new Section("SHS 200x200x16.0", 117, 6524, 6524, 652, 652, 16, 200, 200, 91.5);
//        sectionRepository.save(section202);
        Section section203 = new Section("SHS 250x250x6.3", 61.2, 6049, 6049, 484, 484, 6.3, 250, 250, 48.1);
        sectionRepository.save(section203);
        Section section204 = new Section("SHS 250x250x8.0", 77.1, 7510, 7510, 601, 601, 8, 250, 250, 60.5);
        sectionRepository.save(section204);
        Section section205 = new Section("SHS 250x250x10", 95.5, 9141, 9141, 731, 731, 10, 250, 250, 75);
        sectionRepository.save(section205);
        Section section206 = new Section("SHS 250x250x12.5", 118, 11050, 11050, 884, 884, 12.5, 250, 250, 92.6);
        sectionRepository.save(section206);
//        Section section207 = new Section("SHS 250x250x16", 149, 13480, 13480, 1078, 1078, 16, 250, 250, 117);
//        sectionRepository.save(section207);
        Section section208 = new Section("SHS 300x300x6.3", 73.8, 10600, 10600, 706, 706, 6.3, 300, 300, 57.9);
        sectionRepository.save(section208);
        Section section209 = new Section("SHS 300x300x8.0", 93.1, 13210, 13210, 881, 881, 8, 300, 300, 73.1);
        sectionRepository.save(section209);
        Section section210 = new Section("SHS 300x300x10.0", 116, 16150, 16150, 1077, 1077, 10, 300, 300, 90.7);
        sectionRepository.save(section210);
        Section section211 = new Section("SHS 300x300x12.5", 143, 19630, 19630, 1309, 1309, 12.5, 300, 300, 112);
        sectionRepository.save(section211);
//        Section section212 = new Section("SHS 300x300x16.0", 181, 24160, 24160, 1610, 1610, 16, 300, 300, 142);
//        sectionRepository.save(section212);
        Section section213 = new Section("SHS 350x350x8.0", 109, 21240, 21240, 1214, 1214, 8, 350, 350, 85.7);
        sectionRepository.save(section213);
        Section section214 = new Section("SHS 350x350x10.0", 136, 26050, 26050, 1489, 1489, 10, 350, 350, 106);
        sectionRepository.save(section214);
        Section section215 = new Section("SHS 350x350x12.5", 168, 31810, 31810, 1817, 1817, 12.5, 350, 350, 132);
        sectionRepository.save(section215);
//        Section section216 = new Section("SHS 350x350x16.0", 213, 39370, 39370, 2250, 2250, 16, 350, 350, 167);
//        sectionRepository.save(section216);
        Section section217 = new Section("SHS 400x400x10.0", 156, 39350, 39350, 1968, 1968, 10, 400, 400, 122);
        sectionRepository.save(section217);
        Section section218 = new Section("SHS 400x400x12.5", 193, 48190, 48190, 2409, 2409, 12.5, 400, 400, 152);
        sectionRepository.save(section218);
//        Section section219 = new Section("SHS 400x400x16.0", 245, 59910, 59910, 2995, 2995, 16, 400, 400, 192);
//        sectionRepository.save(section219);
//        Section section220 = new Section("SHS 400x400x20.0", 302, 72400, 72400, 3620, 3620, 20, 400, 400, 237);
//        sectionRepository.save(section220);
    }
}
