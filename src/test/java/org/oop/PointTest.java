package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        double expectedDistance = 0;
        double actualDistance = origin.distance(origin);
        assertEquals(expectedDistance, actualDistance);
    }


    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        double expectedDistance = 1;

        double actualDistance1 = origin.distance(point1);
        double actualDistance2 = origin.distance(point2);

        assertEquals(expectedDistance, actualDistance1);
        assertEquals(expectedDistance, actualDistance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        double expectedDistance = 2;

        double actualDistance = point1.distance(point2);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double expectedDirection = 0;

        double actualDirection1 = origin.direction(point1);
        double actualDirection2 = origin.direction(point2);

        assertEquals(expectedDirection, actualDirection1);
        assertEquals(expectedDirection, actualDirection2);


    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        double expectedDirection = Math.PI;

        double actualDirection1 = origin.direction(point1);
        double actualDirection2 = origin.direction(point2);

        assertEquals(expectedDirection, actualDirection1);
        assertEquals(expectedDirection, actualDirection2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        double expectedDirection = Math.PI / 2;

        double actualDirection1 = origin.direction(point1);
        double actualDirection2 = origin.direction(point2);

        assertEquals(expectedDirection, actualDirection1);
        assertEquals(expectedDirection, actualDirection2);
    }
}
