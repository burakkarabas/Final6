package soru6;

public class Soru6 {

    public static int[] Dizi = {1,1,1,0,0,0,1,1,0,0,1};
    public static void Bul(){
        int max = -1,i=0;
        int sana=0,start=0;
        
        while (i < Dizi.length){
            if (Dizi[i]==0){
                sana++;
                if (sana>max){
                    max = sana;
                    start = i;
                }
            }else {
                sana=0;
            }
            i++;
        }
        System.out.println("Baslangic: "+(start-max)+". "+max+" Tane 0 var.");
    }
    public static void main(String[] args) {
        Bul();
    }
    
}
