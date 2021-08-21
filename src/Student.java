public class Student {
    public static void main(String[] args) {


        System.out.println("Das erste Projekt geht zu Ende");

        StudentNoten();

        System.out.println("Alles werden sehr shön");

        OgrenciNotEkle();
        OgrenciOrt();


    }

    public static void StudentNoten() {

        System.out.println("Die Noten können von der Lehrerin eingegeben werden");

        System.out.println("not girisi bölümü çağrıldı");
    }



    public static void OgrenciNotEkle()
    {
        System.out.println("Not girisi");

        for(int i=0;i<5;i++)
        {
            System.out.println("i = " + i);
        }


        for(int i=10;i>0;i--)
        {
            System.out.println("i = " + i);
        }

        for(int i=10;i>0;i-=3)
        {
            System.out.println("i = " + i);
        }

        System.out.println(" yeni değişiklik ");

    }

    public static void OgrenciOrt()
    {
        System.out.println(" 1 ");
    }

}
