public class Main {
    public static void main(String[] args) {
        ageAndTemperature(36, -6);
        ageAndTemperature(15, 1);
        ageAndTemperature(26, -4);
        ageAndTemperature(56, 32);
        ageAndTemperature(12, -12);

    }

    public static String ageAndTemperature(int age, double temperature) {

        if (age > 19 && age < 46) {
            if (temperature > -19 && temperature < 31) {
                System.out.println("����� ���� ������");

            }
        } else if (age <= 20) {
            if (temperature > 1 && temperature < 9) {
                System.out.println("����� ���� ������");
            }
        } else if (age >= 46) {
            if (temperature > -11 && temperature < 25) {
                System.out.println("����� ���� ������");
            } else {
                System.out.println("����������� ����!");
            }
        }
        return "������� �������� = " + age + " ����������� �� ����� = " + temperature;
    }
}