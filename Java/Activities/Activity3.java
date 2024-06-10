package Activities;

public class Activity3 {
    public static void main(String[] args) {
        double second = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        System.out.println("Age on Mercury: " + second / EarthSeconds / MercurySeconds);
        System.out.println("Age on Venus: " + second / EarthSeconds / VenusSeconds);
        System.out.println("Age on Earth: " + second / EarthSeconds);
        System.out.println("Age on Mars: " + second / EarthSeconds / MarsSeconds);
        System.out.println("Age on Jupiter: " + second / EarthSeconds / JupiterSeconds);
        System.out.println("Age on Saturn: " + second / EarthSeconds / SaturnSeconds);
        System.out.println("Age on Uranus: " + second / EarthSeconds / UranusSeconds);
        System.out.println("Age on Neptune: " + second / EarthSeconds / NeptuneSeconds);
    }
}