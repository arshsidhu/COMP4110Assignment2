package COMP4110;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import COMP4110.CustomMath.CustomTrig;

import java.lang.Math;

public class CustomMathTest {
	
	public CustomMath.CustomTrig t;
	public final double PI = 3.14159265358979323846;

	@Before
	public void setUp() throws Exception {
		
		t = new CustomMath.CustomTrig();
		
	}

	//Test with a negative value
	@Test
	public void negSinTest() {
		double a = -3.1;
		double result = CustomTrig.sin(a);
		
		assertEquals(Math.sin(a), result, 0.05);
	}
	
	//Test with a value of 0
	@Test
	public void zeroSinTest() {
		double a = 0;
		double result = CustomTrig.sin(a);
		
		assertEquals(Math.sin(a), result, 0.05);
	}
	
	//Test with the edge case of 2PI
	@Test
	public void edgeSinTest() {
		double a = 2 * PI;
		double result = CustomTrig.sin(a);
		
		assertEquals(Math.sin(a), result, 0.05);
	}
	
	//Test in first quadrant
	@Test
	public void firstQuadSinTest() {
		double a = 1.2;
		double result = CustomTrig.sin(a);
		
		assertEquals(Math.sin(a), result, 0.05);
	}
	
	//Test in second quadrant
	@Test
	public void secondQuadSinTest() {
		double a = 2.2;
		double result = CustomTrig.sin(a);
		
		assertEquals(Math.sin(a), result, 0.05);
	}
	
	//Test in third quadrant
	@Test
	public void thirdQuadSinTest() {
		double a = 3.2;
		double result = CustomTrig.sin(a);
		
		assertEquals(Math.sin(a), result, 0.05);
	}
	
	//Test in fourth quadrant
	@Test
	public void fourthQuadSinTest() {
		double a = 5.2;
		double result = CustomTrig.sin(a);
		
		assertEquals(Math.sin(a), result, 0.05);
	}
	
	//Test with a negative value
	@Test
	public void negCosTest() {
		double a = -3.1;
		double result = CustomTrig.cos(a);
		
		assertEquals(Math.cos(a), result, 0.05);
	}
	
	//Test with a value of 0
	@Test
	public void zeroCosTest() {
		double a = 0;
		double result = CustomTrig.cos(a);
		
		assertEquals(Math.cos(a), result, 0.05);
	}
	
	//Test with the edge case of 2PI
	@Test
	public void edgeCosTest() {
		double a = 2 * PI;
		double result = CustomTrig.cos(a);
		
		assertEquals(Math.cos(a), result, 0.05);
	}
	
	//Test in first quadrant
	@Test
	public void firstQuadCosTest() {
		double a = 1.2;
		double result = CustomTrig.cos(a);
		
		assertEquals(Math.cos(a), result, 0.05);
	}
	
	//Test in second quadrant
	@Test
	public void secondQuadCosTest() {
		double a = 2.2;
		double result = CustomTrig.cos(a);
		
		assertEquals(Math.cos(a), result, 0.05);
	}
	
	//Test in third quadrant
	@Test
	public void thirdQuadCosTest() {
		double a = 3.2;
		double result = CustomTrig.cos(a);
		
		assertEquals(Math.cos(a), result, 0.05);
	}
	
	//Test in fourth quadrant
	@Test
	public void fourthQuadCosTest() {
		double a = 5.2;
		double result = CustomTrig.cos(a);
		
		assertEquals(Math.cos(a), result, 0.05);
	}
	
	//Test with a negative value
	@Test
	public void negTanTest() {
		double a = -3.1;
		double result = CustomTrig.tan(a);
		
		assertEquals(Math.tan(a), result, 0.05);
	}
	
	//Test with a value of 0
	@Test
	public void zeroTanTest() {
		double a = 0;
		double result = CustomTrig.tan(a);
		
		assertEquals(Math.tan(a), result, 0.05);
	}
	
	//Test with the edge case of 2PI
	@Test
	public void edgeTanTest() {
		double a = 2 * PI;
		double result = CustomTrig.tan(a);
		
		assertEquals(Math.tan(a), result, 0.05);
	}
	
	//Test in first quadrant
	@Test
	public void firstQuadTanTest() {
		double a = 1.2;
		double result = CustomTrig.tan(a);
		
		assertEquals(Math.tan(a), result, 0.05);
	}
	
	//Test in second quadrant
	@Test
	public void secondQuadTanTest() {
		double a = 2.2;
		double result = CustomTrig.tan(a);
		
		assertEquals(Math.tan(a), result, 0.05);
	}
	
	//Test in third quadrant
	@Test
	public void thirdQuadTanTest() {
		double a = 3.2;
		double result = CustomTrig.tan(a);
		
		assertEquals(Math.tan(a), result, 0.05);
	}
	
	//Test in fourth quadrant
	@Test
	public void fourthQuadTanTest() {
		double a = 5.2;
		double result = CustomTrig.tan(a);
		
		assertEquals(Math.tan(a), result, 0.05);
	}
	
	//Test with a negative value in degrees
	@Test
	public void negSinDegreesTest() {
		double a = -45;
		double result = CustomTrig.sin_degree(a);
		
		assertEquals(Math.sin(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a value of 0 in degrees
	@Test
	public void zeroSinDegreesTest() {
		double a = 0;
		double result = CustomTrig.sin_degree(a);
		
		assertEquals(Math.sin(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a edge case of 360 degrees
	@Test
	public void edgeSinDegreesTest() {
		double a = 360;
		double result = CustomTrig.sin_degree(a);
		
		assertEquals(Math.sin(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in first quadrant in degrees
	@Test
	public void firstQuadSinDegreesTest() {
		double a = 45;
		double result = CustomTrig.sin_degree(a);
		
		assertEquals(Math.sin(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in second quadrant in degrees
	@Test
	public void secondQuadSinDegreesTest() {
		double a = 120;
		double result = CustomTrig.sin_degree(a);
		
		assertEquals(Math.sin(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in third quadrant in degrees
	@Test
	public void thirdQuadSinDegreesTest() {
		double a = 200;
		double result = CustomTrig.sin_degree(a);
		
		assertEquals(Math.sin(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in fourth quadrant in degrees
	@Test
	public void fourthQuadSinDegreesTest() {
		double a = 300;
		double result = CustomTrig.sin_degree(a);
		
		assertEquals(Math.sin(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a negative value in degrees
	@Test
	public void negCosDegreesTest() {
		double a = -45;
		double result = CustomTrig.cos_degree(a);
		
		assertEquals(Math.cos(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a value of 0 in degrees
	@Test
	public void zeroCosDegreesTest() {
		double a = 0;
		double result = CustomTrig.cos_degree(a);
		
		assertEquals(Math.cos(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a edge case of 360 degrees
	@Test
	public void edgeCosDegreesTest() {
		double a = 360;
		double result = CustomTrig.cos_degree(a);
		
		assertEquals(Math.cos(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in first quadrant in degrees
	@Test
	public void firstQuadCosDegreesTest() {
		double a = 45;
		double result = CustomTrig.cos_degree(a);
		
		assertEquals(Math.cos(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in second quadrant in degrees
	@Test
	public void secondQuadCosDegreesTest() {
		double a = 120;
		double result = CustomTrig.cos_degree(a);
		
		assertEquals(Math.cos(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in third quadrant in degrees
	@Test
	public void thirdQuadCosDegreesTest() {
		double a = 200;
		double result = CustomTrig.cos_degree(a);
		
		assertEquals(Math.cos(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in fourth quadrant in degrees
	@Test
	public void fourthQuadCosDegreesTest() {
		double a = 300;
		double result = CustomTrig.cos_degree(a);
		
		assertEquals(Math.cos(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a negative value in degrees
	@Test
	public void negTanDegreesTest() {
		double a = -45;
		double result = CustomTrig.tan_degree(a);
		
		assertEquals(Math.tan(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a value of 0 in degrees
	@Test
	public void zeroTanDegreesTest() {
		double a = 0;
		double result = CustomTrig.tan_degree(a);
		
		assertEquals(Math.tan(Math.toRadians(a)), result, 0.05);
	}
	
	//Test with a edge case of 360 degrees
	@Test
	public void edgeTanDegreesTest() {
		double a = 360;
		double result = CustomTrig.tan_degree(a);
		
		assertEquals(Math.tan(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in first quadrant in degrees
	@Test
	public void firstQuadTanDegreesTest() {
		double a = 45;
		double result = CustomTrig.tan_degree(a);
		
		assertEquals(Math.tan(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in second quadrant in degrees
	@Test
	public void secondQuadTanDegreesTest() {
		double a = 120;
		double result = CustomTrig.tan_degree(a);
		
		assertEquals(Math.tan(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in third quadrant in degrees
	@Test
	public void thirdQuadTanDegreesTest() {
		double a = 200;
		double result = CustomTrig.tan_degree(a);
		
		assertEquals(Math.tan(Math.toRadians(a)), result, 0.05);
	}
	
	//Test in fourth quadrant in degrees
	@Test
	public void fourthQuadTanDegreesTest() {
		double a = 300;
		double result = CustomTrig.tan_degree(a);
		
		assertEquals(Math.tan(Math.toRadians(a)), result, 0.05);
	}

}
