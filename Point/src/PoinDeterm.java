public class PoinDeterm {

    public String  result(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            return "in I fourth";
        } else if (point.getX() < 0 && point.getY() > 0) {
            return "in II fourth";
        } else if (point.getX() < 0 && point.getY() < 0) {
            return "in III fourth";
        } else if (point.getX() > 0 && point.getY() < 0) {
            return "in IV fourth";
        } else return "on axis/zero";
    }
}
