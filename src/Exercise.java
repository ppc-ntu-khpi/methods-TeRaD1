//package domain;

public class Exercise {

    // Метод для знаходження простих чисел між двома числами
    public static String calculate(int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int number = Math.max(2, start); number <= end; number++) {
            if (isPrime(number)) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(number);
            }
        }

        return result.toString();
    }

    // Приватний допоміжний метод для перевірки, чи є число простим
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
