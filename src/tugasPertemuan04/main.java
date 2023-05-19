package tugasPertemuan04;

public class main {
    public static void main(String[] args) {
        int pengenceranAntibiotik = 0;
        int batas                 = 20;

        do {
            pengenceranAntibiotik++;
            System.out.println("menambahkan aquadest..");
            System.out.println("tuang ke botol :" + pengenceranAntibiotik + "ml");

            }while(pengenceranAntibiotik == batas);

            System.out.println("Finale : tuang ke botol :" + pengenceranAntibiotik + "ml");
    }
}
