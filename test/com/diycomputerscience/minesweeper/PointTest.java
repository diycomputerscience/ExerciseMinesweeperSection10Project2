package com.diycomputerscience.minesweeper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

	private Point p;
	private int row = 4;
	private int col = 2;
	
	@Before
	public void setUp() throws Exception {
		this.p = new Point(this.row, this.col);
	}

	@After
	public void tearDown() throws Exception {
		this.p = null;
	}

	@Test
	public void test() {
		assertEquals(row, this.p.row);
		assertEquals(col, this.p.col);
	}
	
	@Test
	public void testPointEqualityContract() {
		Map<Point, Boolean> pointMineStatus = new HashMap<Point, Boolean>();
		pointMineStatus.put(new Point(0,0), Boolean.TRUE);
		pointMineStatus.put(new Point(0,0), Boolean.FALSE);
		
		// Only one key should have been created in the map since it cannot have duplictae keys
		assertEquals(1, pointMineStatus.keySet().size());		
	}

}
