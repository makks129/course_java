package collection.geometry;

public class RectangleWidthComparator implements MyComparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Rectangle && o2 instanceof Rectangle) {
            Rectangle r1 = (Rectangle) o1;
            Rectangle r2 = (Rectangle) o2;
            if (r1.getWidth() > r2.getWidth()) {
                return 1;
            } else if (r1.getWidth() < r2.getWidth()) {
                return -1;
            } else {
                return 0;
            }
        }
        throw new RuntimeException("o1 or o2 are not Rectangle");
    }

}
