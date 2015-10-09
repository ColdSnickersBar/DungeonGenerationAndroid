package com.coldsnickersbar.dungeongenerationtests;

import com.coldsnickersbar.dungeongeneration.Grid;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Adam on 10/9/15.
 */
public class GridTests {



    @Test
    public void hasGivenDimensions() throws Exception {

        Grid grid = new Grid(100, 100);

        assertEquals(100, grid.getWidth());
        assertEquals(100, grid.getHeight());
    }
}
