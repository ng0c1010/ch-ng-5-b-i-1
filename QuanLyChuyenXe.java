import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> listChuyenXe;
    Scanner sc;
    ChuyenXe cx;
    int chon;

    public QuanLyChuyenXe() {
        super();
        listChuyenXe = new ArrayList<ChuyenXe>();
        sc = new Scanner(System.in);
    }

    public void nhap(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("1: chuyen xe noi thanh");
            System.out.println("2: chuyen xe ngoai thanh");
            System.out.println("0: Thoat");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: {
                    String maSo;
                    String tenTaiXe;
                    double doanhThu;
                    int soTuyen;
                    int soKM;
                    System.out.println("Nhap ma so: ");
                    maSo = sc.nextLine();
                    System.out.println("Ho ten tai xe: ");
                    tenTaiXe = sc.nextLine();
                    System.out.println("So Tuyen: ");
                    soTuyen = sc.nextInt();
                    sc.nextLine();
                    System.out.println("So KM: ");
                    soKM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Doanh thu: ");
                    doanhThu = sc.nextDouble();
                    sc.nextLine();
                    cx = new ChuyenNoiThanh(maSo, tenTaiXe, doanhThu, soTuyen, soKM);
                    listChuyenXe.add(cx);
                    System.out.println("add thanh cong tuyen noi thanh");
                }
                break;
                case 2: {
                    String maSo;
                    String tenTaiXe;
                    double doanhThu;
                    String noiDen;
                    int soNgayDiDuoc;
                    System.out.println("Nhap ma so: ");
                    maSo = sc.nextLine();
                    System.out.println("Ho ten tai xe: ");
                    tenTaiXe = sc.nextLine();
                    System.out.println("Noi den: ");
                    noiDen = sc.nextLine();
                    System.out.println("So ngay di duoc: ");
                    soNgayDiDuoc = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Doanh thu: ");
                    doanhThu = sc.nextDouble();
                    sc.nextLine();
                    cx = new ChuyenNgoaiThanh(maSo, tenTaiXe, doanhThu, noiDen, soNgayDiDuoc);
                    listChuyenXe.add(cx);
                    System.out.println("add thanh cong tuyen ngoai thanh");
                }
                break;

                default:
                    break;
            }
        }
    }

    public void xuat() {
        for (ChuyenXe cx : listChuyenXe) {
            System.out.println(cx.toString());
        }
    }

    public void TongDoanhthuTungLoai() {
        double doanhThuNoiThanh = 0, doanhThuNgoaiThanh = 0;
        for (ChuyenXe cx : listChuyenXe) {
            if (cx instanceof ChuyenNoiThanh) {
                doanhThuNoiThanh += cx.getDoanhThu();
            }
            if (cx instanceof ChuyenNgoaiThanh) {
                doanhThuNgoaiThanh += cx.getDoanhThu();
            }
        }


        System.out.println("\n\nTong doanh thu tuyen noi thanh: " + doanhThuNoiThanh);
        System.out.println("\n\nTong doanh thu tuyen ngoai thanh: " + doanhThuNgoaiThanh);
    }
}