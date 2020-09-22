import java.util.Scanner;

public class Main {
    /**
     * Skriver ut meny när användare behöver göra en val
     */
    public static void meny() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose one of these alternatives : " +
                "\n1. Volume of sphere" +
                "\n2. Volume of cylinder " +
                "\n3. Fraction" +
                "\n4. Sum" +
                "\n5. CalcPoint" +
                "\n0. Quit");
    }

    /**
     * Beräkna volymen av ett klot med radien r och returnerar volymen
     *
     * @ Användare matar in värde av radien som heltal
     * @ returnerar volymen som double
     * @return
     */
    public static double volume(int r) {
        double volume = (4 * 3.14 * r * r * r) / 3;
        return volume;
    }
    /**
     * Beräknar volymen av en cyliner med radien r och höjden h och returnerar volymen
     *
     * @ Användare matar in värde av radien och höjden som är heltala
     * @ returnerar volymen som double
     */
    public static double volume(int r, int h) {
        double volume = h * 3.14 * r * r;
        return volume;
    }
    /**
     * Skriver om bråket med täljaren (numerator) och nämnaren (demominator) till blandad form.
     *
     * @ Användare matar in värde av numerator och denominator som är heltala
     * @ returnerar bråket i blandad formen
     */
    public static String fraction(int numerator, int denominator) {
        String mixedNum;
        int wholeNum = numerator / denominator;
        int fraction = numerator % denominator;
        if (numerator > denominator) {
            if (numerator % denominator == 0) {
                mixedNum = (wholeNum + ".");
                return mixedNum;
            } else {
                mixedNum = (wholeNum + " " + fraction + "/" + denominator);
                return mixedNum;
            }
        } else {
            mixedNum = (numerator + "/" + denominator);
            return mixedNum;
        }
    }
    /**
     * Lägger ihop alla heltal mellan 1 och max.
     *
     * @ Användare matar in värde av max som är en heltal
     * @ returnerar summa al alla heltal mellan 1 och max
     */
    public static int sum(int max) {
        int sum = max;
        for (int i = 0; i < max; i++) {
            sum = sum + i;
        }
        return sum;
    }
    /**
     * Beränkar funktionsvärdet av y på linjen y = kx +m
     *
     * @ Användaren matar in värde av k, m och x, alla är en heltal
     * @ Returnerar värde av y
     */
    public static int calcPoint(int k, int m, int x) {
        int y = k * x + m;
        return y;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        meny();

        while (in.hasNext()) {
            String answer = in.next();
            if (answer.equals("0")) {
                System.out.println("You are quitting. ");
                break;
    /** Val 1 */
            }else if (answer.equals("1")) {
                boolean error = true;
                System.out.println("Enter the value of the radius: ");
                while (error) {
                    if (in.hasNextInt()) {
                        int radius = in.nextInt();
                        error = false;
                        double volume = volume(radius);
                        System.out.format("The volume of a sphere is: %1.2f", volume);
                        System.out.println();
                        System.out.println();
                        meny();
                    }else {
                        System.out.println("Invalid input, make sure your input is a whole number");
                        in.next(); }
                }
    /** Val 2 */
            }else if (answer.equals("2")) {
                boolean error = true;
                System.out.println("Enter the value of the radius: ");
                while (error) {
                    if (in.hasNextInt()) {
                        int radius = in.nextInt();
                        error = false;
                        System.out.println("Enter the value of the height: ");
                        if (in.hasNextInt()) {
                            int heigth = in.nextInt();
                            error = false;
                            double volume = volume(radius, heigth);
                            System.out.format("The volume of a sphere is: %1.2f", volume);
                            System.out.println();
                            System.out.println();
                            meny();
                        }else {
                            System.out.println("Invalid input, make sure your input is a whole number");
                            in.next(); }
                    }else {
                        System.out.println("Invalid input, make sure your input is a whole number");
                        in.next();}
                }
    /** Val 3 */
            }else if (answer.equals("3")) {
                boolean error = true;
                System.out.println("Enter the value of the numerator: ");
                while (error) {
                    if (in.hasNextInt()) {
                        int numerator = in.nextInt();
                        error = false;
                        System.out.println("Enter the value of the denominator: ");
                        if (in.hasNextInt()) {
                            int denominator = in.nextInt();
                            error = false;
                            String mixednum = fraction(numerator, denominator);
                            System.out.println("The mixed fraction is: " + mixednum);
                            System.out.println();
                            System.out.println();
                            meny();
                        } else {
                            System.out.println("Invalid input, make sure your input is a whole number");
                            in.next(); }
                    } else {
                        System.out.println("Invalid input, make sure your input is a whole number");
                        in.next(); }
                }
    /** Val 4*/
            }else if (answer.equals("4")) {
                boolean error = true;
                System.out.println("Enter a number bigger then 0: ");
                while (error) {
                    if (in.hasNextInt()) {
                        int max = in.nextInt();
                        error = false;
                        int result = sum(max);
                        System.out.println("The sum of all the numbers between 1 and your number is: " + result);
                        System.out.println();
                        meny();
                    }else {
                        System.out.println("Invalid input, make sure your input is a whole number");
                        in.next(); }
                }
    /** Val 5  */
            }else if (answer.equals("5")) {
                boolean error = true;
                System.out.println("Enter k value : ");
                while (error) {
                    if (in.hasNextInt()) {
                        int k = in.nextInt();
                        error = false;
                        System.out.println("Enter x value : ");
                        if (in.hasNextInt()) {
                            int x = in.nextInt();
                            error = false;
                            System.out.println("Enter m value : ");
                            if (in.hasNextInt()) {
                                int m = in.nextInt();
                                error = false;
                                int result = calcPoint(k, x, m);
                                System.out.println("The value of y (y = kx +m) is: " + result);
                                System.out.println();
                                meny();
                            }else {
                                 System.out.println("Invalid input, make sure your input is a whole number");
                                 in.next(); }
                        }else {
                            System.out.println("Invalid input, make sure your input is a whole number");
                            in.next();}
                    }else {
                        System.out.println("Invalid input, make sure your input is a whole number");
                        in.next();}
                    }
                /** error om man knappar in en siffra som in inte är 0-5, man får menyval igen */
            }else {
                System.out.println("Error. Try again.");
                        System.out.println();
                        meny(); }
        }
    }
}
