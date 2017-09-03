public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double legs = legA*legA + legB*legB;
        double squareRoot = Math.sqrt(legs);
        return squareRoot;
    }
}
