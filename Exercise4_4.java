public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber(); // 1.Cevap: Program hata vermez, sorunsuz derlenir.
        // Ancak çoğu IDE/Derleyici "Dönen değer kullanılmadı" şeklinde bir uyarı verir.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // 2.Cevap: DERLEME HATASI verir.(Compile-time error)
        //Hata mesajı: 'void' type not allowed here.
        // sayHello() metdu bir değer döndürmez. Toplama gibi ifadeler değer gerektirdiğinden, değeri olmayan bir metotla toplama yapılamaz.

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
