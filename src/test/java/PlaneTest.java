import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType() );
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(416, plane.getPlaneCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(183500, plane.getPlaneWeight());
    }
}


