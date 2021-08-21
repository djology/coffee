package djology.collect.oracle.se.learn;

/**
 * @Author: djology.w
 * @Description:
 * @Date: 2021/8/8 18:53
 */

public interface Bicycle {

    // wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);

}
