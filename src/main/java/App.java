// 👇 Code smells intencionados para prueba de SonarQube
public class SmellExample {

    // 1️⃣ Código duplicado (mismo método dos veces)
    public void printMessage() {
        System.out.println("Hola mundo");
    }

    public void printMessageDuplicate() {
        System.out.println("Hola mundo");
    }

    // 2️⃣ Variable sin usar
    public void unusedVariable() {
        int x = 10;
    }

    // 3️⃣ Método muy largo con complejidad innecesaria
    public void tooComplex() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) total += i;
            else if (i % 3 == 0) total -= i;
            else if (i % 5 == 0) total *= i;
            else if (i % 7 == 0) total /= (i + 1);
        }
        System.out.println("Resultado: " + total);
    }
}
