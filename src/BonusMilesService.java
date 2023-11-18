public class BonusMilesService {
    public int calculate(int price) {
    int result = 0;
    if (price > 0) {
        result = price / 20;
    }
    return result;
    }
}


