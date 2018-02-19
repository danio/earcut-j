package com.earcutj.test;

import java.util.List;

import com.earcutj.Earcut;

public final class MainActivity {

	private static void dumpTriangle(float[][] triangle) {
		System.out.println("[ " + triangle[0][0] + "," + triangle[0][1] + "] [ " + triangle[1][0] + "," + triangle[1][1] + "] [ " + triangle[2][0] + "," + triangle[2][1] + "] ");
	}

	private static void dumpTriangles(List<float[][]> lTriangleList) {
		for (final float[][] lCurrentTriangle : lTriangleList) {
			dumpTriangle(lCurrentTriangle);
		}
	}

	private static float triangleArea(float[][] triangle) {
		final float[] a = triangle[0];
		final float[] b = triangle[1];
		final float[] c = triangle[2];
		return Math.abs((a[0] - c[0]) * (b[1] - a[1]) - (a[0] - b[0]) * (c[1] - a[1])) / 2;
	}

	private static double trianglesArea(List<float[][]> lTriangleList) {
		double area = 0.0;
		for (final float[][] lCurrentTriangle : lTriangleList) {
			area += triangleArea(lCurrentTriangle);
		}
		return area;
	}

	public static final void main(final String[] pArgs) {
		
		/* Input should be an array of rings, where the first is outer ring and others are holes; each ring is an array of pofloats, where each pofloat is of the [x, y] form. */
		final float[][][] lExample = new float[][][]{new float[][]{new float[]{10, 0}, new float[]{0, 50}, new float[]{60, 60}, new float[]{70, 10}}};
		
		/* A very pretty letter w. (Font: Pacifico.ttf) */
		final float[][][] lLetterW = new float[][][]{new float[][]{new float[] {864,1542}, 
		new float[] {859,1499}, 
		new float[] {847,1441}, 
		new float[] {828,1369}, 
		new float[] {806,1288}, 
		new float[] {781,1201}, 
		new float[] {752,1099}, 
		new float[] {723,997}, 
		new float[] {698,892}, 
		new float[] {673,787}, 
		new float[] {656,685}, 
		new float[] {640,584}, 
		new float[] {640,497}, 
		new float[] {640,426}, 
		new float[] {649,364}, 
		new float[] {659,303}, 
		new float[] {679,257}, 
		new float[] {699,212}, 
		new float[] {729,186}, 
		new float[] {759,160}, 
		new float[] {800,160}, 
		new float[] {841,160}, 
		new float[] {879,184}, 
		new float[] {918,208}, 
		new float[] {954,250}, 
		new float[] {990,292}, 
		new float[] {1023,350}, 
		new float[] {1056,408}, 
		new float[] {1086,475}, 
		new float[] {1117,543}, 
		new float[] {1144,617}, 
		new float[] {1171,692}, 
		new float[] {1195,768}, 
		new float[] {1279,1036}, 
		new float[] {1344,1377}, 
		new float[] {1357,1427}, 
		new float[] {1372,1469}, 
		new float[] {1390,1502}, 
		new float[] {1412,1528}, 
		new float[] {1436,1546}, 
		new float[] {1465,1559}, 
		new float[] {1498,1565}, 
		new float[] {1536,1568}, 
		new float[] {1570,1566}, 
		new float[] {1598,1561}, 
		new float[] {1620,1552}, 
		new float[] {1637,1542}, 
		new float[] {1649,1528}, 
		new float[] {1658,1513}, 
		new float[] {1662,1495}, 
		new float[] {1664,1475}, 
		new float[] {1662,1456}, 
		new float[] {1656,1416}, 
		new float[] {1646,1357}, 
		new float[] {1635,1284}, 
		new float[] {1623,1204}, 
		new float[] {1608,1102}, 
		new float[] {1594,1000}, 
		new float[] {1581,892}, 
		new float[] {1569,785}, 
		new float[] {1561,680}, 
		new float[] {1553,575}, 
		new float[] {1553,487}, 
		new float[] {1553,397}, 
		new float[] {1559,324}, 
		new float[] {1566,252}, 
		new float[] {1581,201}, 
		new float[] {1597,150}, 
		new float[] {1622,123}, 
		new float[] {1647,96}, 
		new float[] {1684,96}, 
		new float[] {1748,96}, 
		new float[] {1800,146}, 
		new float[] {1853,196}, 
		new float[] {1896,279}, 
		new float[] {1940,363}, 
		new float[] {1974,473}, 
		new float[] {2009,583}, 
		new float[] {2035,703}, 
		new float[] {2062,823}, 
		new float[] {2081,945}, 
		new float[] {2101,1067}, 
		new float[] {2114,1175}, 
		new float[] {2127,1284}, 
		new float[] {2134,1370}, 
		new float[] {2142,1457}, 
		new float[] {2145,1506}, 
		new float[] {2151,1552}, 
		new float[] {2163,1588}, 
		new float[] {2181,1615}, 
		new float[] {2203,1636}, 
		new float[] {2228,1650}, 
		new float[] {2257,1658}, 
		new float[] {2288,1662}, 
		new float[] {2320,1664}, 
		new float[] {2343,1662}, 
		new float[] {2365,1658}, 
		new float[] {2384,1650}, 
		new float[] {2401,1639}, 
		new float[] {2414,1623}, 
		new float[] {2424,1603}, 
		new float[] {2430,1577}, 
		new float[] {2432,1546}, 
		new float[] {2428,1445}, 
		new float[] {2419,1336}, 
		new float[] {2405,1223}, 
		new float[] {2388,1111}, 
		new float[] {2369,999}, 
		new float[] {2348,891}, 
		new float[] {2327,789}, 
		new float[] {2308,698}, 
		new float[] {2291,618}, 
		new float[] {2277,553}, 
		new float[] {2265,494}, 
		new float[] {2265,478}, 
		new float[] {2265,439}, 
		new float[] {2276,411}, 
		new float[] {2287,384}, 
		new float[] {2305,366}, 
		new float[] {2324,348}, 
		new float[] {2349,340}, 
		new float[] {2375,332}, 
		new float[] {2404,332}, 
		new float[] {2433,332}, 
		new float[] {2463,345}, 
		new float[] {2494,359}, 
		new float[] {2522,383}, 
		new float[] {2550,407}, 
		new float[] {2573,440}, 
		new float[] {2597,474}, 
		new float[] {2613,515}, 
		new float[] {2630,308}, 
		new float[] {2554,232}, 
		new float[] {2477,174}, 
		new float[] {2401,137}, 
		new float[] {2330,125}, 
		new float[] {2298,127}, 
		new float[] {2268,135}, 
		new float[] {2240,148}, 
		new float[] {2216,168}, 
		new float[] {2195,193}, 
		new float[] {2179,225}, 
		new float[] {2166,263}, 
		new float[] {2158,308}, 
		new float[] {2106,219}, 
		new float[] {2050,140}, 
		new float[] {1991,71}, 
		new float[] {1928,13}, 
		new float[] {1862,-33}, 
		new float[] {1793,-67}, 
		new float[] {1721,-88}, 
		new float[] {1648,-96}, 
		new float[] {1560,-83}, 
		new float[] {1486,-46}, 
		new float[] {1426,13}, 
		new float[] {1378,90}, 
		new float[] {1342,183}, 
		new float[] {1318,292}, 
		new float[] {1303,411}, 
		new float[] {1299,539}, 
		new float[] {1300,585}, 
		new float[] {1304,629}, 
		new float[] {1309,671}, 
		new float[] {1312,704}, 
		new float[] {1271,494}, 
		new float[] {1221,322}, 
		new float[] {1162,184}, 
		new float[] {1093,76}, 
		new float[] {1014,-3}, 
		new float[] {925,-56}, 
		new float[] {825,-86}, 
		new float[] {716,-96}, 
		new float[] {651,-85}, 
		new float[] {590,-52}, 
		new float[] {533,1}, 
		new float[] {484,77}, 
		new float[] {443,173}, 
		new float[] {411,292}, 
		new float[] {390,432}, 
		new float[] {384,595}, 
		new float[] {387,702}, 
		new float[] {396,812}, 
		new float[] {410,924}, 
		new float[] {430,1036}, 
		new float[] {455,1147}, 
		new float[] {486,1258}, 
		new float[] {521,1366}, 
		new float[] {561,1472}, 
		new float[] {586,1523}, 
		new float[] {611,1562}, 
		new float[] {636,1590}, 
		new float[] {662,1610}, 
		new float[] {688,1622}, 
		new float[] {714,1629}, 
		new float[] {741,1631}, 
		new float[] {768,1632}, 
		new float[] {789,1631}, 
		new float[] {808,1629}, 
		new float[] {824,1624}, 
		new float[] {838,1616}, 
		new float[] {849,1604}, 
		new float[] {857,1589}, 
		new float[] {862,1568}, 
		new float[] {864,1542}, }};
		
		/* The course insides of the letter O. Font: Sans.ttf. (This is missing inside and outside Bezier curve data, it is used here to demonstrate hole processing.) */
		final float[][][] lLetterO = new float[][][]{new float[][]{new float[] {1436,733}, 
				new float[] {1392,421}, 
				new float[] {1262,182}, 
				new float[] {1055,30}, 
				new float[] {782,-20}, 
				new float[] {509,30}, 
				new float[] {303,182}, 
				new float[] {172,421}, 
				new float[] {129,735}, 
				new float[] {172,1046}, 
				new float[] {304,1284}, 
				new float[] {512,1434}, 
				new float[] {784,1485}, 
				new float[] {1056,1434}, 
				new float[] {1263,1283}, 
				new float[] {1392,1045}, 
				new float[] {1436,733}, }, new float[][]{
				new float[] {240,733}, 
				new float[] {240,419}, 
				new float[] {380,247}, 
				new float[] {520,76}, 
				new float[] {782,76}, 
				new float[] {1046,76}, 
				new float[] {1185,246}, 
				new float[] {1325,416}, 
				new float[] {1325,733}, 
				new float[] {1325,1049}, 
				new float[] {1185,1217}, 
				new float[] {1046,1386}, 
				new float[] {784,1386}, 
				new float[] {523,1386}, 
				new float[] {381,1216}, 
				new float[] {240,1046}, 
				new float[] {240,733}, 
		}};
		
		/* The course insides of the letter O. Font: Sans.ttf. (This is missing inside and outside Bezier curve data, it is used here to demonstrate hole processing.) */
		final float[][][] lLetter8 = new float[][][]{new float[][]{new float[] {582,1487}, 
				new float[] {749,1463}, 
				new float[] {881,1392}, 
				new float[] {966,1280}, 
				new float[] {995,1135}, 
				new float[] {977,1029}, 
				new float[] {924,937}, 
				new float[] {832,854}, 
				new float[] {696,778}, 
				new float[] {859,695}, 
				new float[] {966,605}, 
				new float[] {1024,501}, 
				new float[] {1044,377}, 
				new float[] {1012,214}, 
				new float[] {917,88}, 
				new float[] {769,7}, 
				new float[] {578,-20}, 
				new float[] {382,5}, 
				new float[] {239,81}, 
				new float[] {150,205}, 
				new float[] {121,375}, 
				new float[] {141,498}, 
				new float[] {204,605}, 
				new float[] {309,696}, 
				new float[] {461,774}, 
				new float[] {323,852}, 
				new float[] {234,934}, 
				new float[] {184,1027}, 
				new float[] {168,1137}, 
				new float[] {181,1235}, 
				new float[] {221,1321}, 
				new float[] {284,1391}, 
				new float[] {369,1444}, 
				new float[] {470,1476}, 
				new float[] {582,1487}, }, new float[][]{new float[] {223,360}, 
				new float[] {223,222}, 
				new float[] {316,146}, 
				new float[] {410,70}, 
				new float[] {578,70}, 
				new float[] {742,70}, 
				new float[] {842,150}, 
				new float[] {942,231}, 
				new float[] {942,369}, 
				new float[] {942,493}, 
				new float[] {863,570}, 
				new float[] {785,648}, 
				new float[] {561,733}, 
				new float[] {377,662}, 
				new float[] {300,576}, 
				new float[] {223,490}, 
				new float[] {223,360}, }, new float[][]{new float[] {580,1397}, 
				new float[] {439,1397}, 
				new float[] {353,1327}, 
				new float[] {268,1258}, 
				new float[] {268,1137}, 
				new float[] {268,1067}, 
				new float[] {299,1013}, 
				new float[] {331,960}, 
				new float[] {390,916}, 
				new float[] {450,873}, 
				new float[] {590,815}, 
				new float[] {753,878}, 
				new float[] {824,954}, 
				new float[] {895,1030}, 
				new float[] {895,1137}, 
				new float[] {895,1257}, 
				new float[] {810,1327}, 
				new float[] {726,1397}, 
				new float[] {580,1397}, }, };
		
		
		List<float[][]> lTriangleList = Earcut.earcut(lLetterW, true);
		lTriangleList = Earcut.earcut(lLetterO, true);	
		lTriangleList = Earcut.earcut(lExample, true);	
		lTriangleList = Earcut.earcut(lLetter8, true);

		dumpTriangles(lTriangleList);

		// Failing example for winding fix
		final float[][][] minimalWindingFailingExample = new float[][][] {
			new float[][] {
				new float[]{-31.528161308724968f, -113.92911761454135f},
				new float[]{-31.55738451637037f, -113.75652283714695f},
				new float[]{-31.24371293623057f, -113.16385020118966f}
			}
		};
		List<float[][]> minimalWindingTriangles = Earcut.earcut(minimalWindingFailingExample, true);
		if (Math.abs(trianglesArea(minimalWindingTriangles) - triangleArea(minimalWindingFailingExample[0])) < 1e-9) {
			System.out.println("minimalWindingFailingExample failed");
			System.out.println(trianglesArea(minimalWindingTriangles));
			System.out.println(triangleArea(minimalWindingFailingExample[0]));
			System.exit(1);
		}

		// Simple rectangle
		final float[][][] simpleRectangle = new float[][][] {
			new float[][] {
				new float[]{10, 10},
				new float[]{30, 10},
				new float[]{30, 20},
				new float[]{10, 20}
			}
		};
		List<float[][]> simpleRectangleTriangles = Earcut.earcut(simpleRectangle, true);
		if (trianglesArea(simpleRectangleTriangles) != 200) {
			System.out.println("simpleRectangle failed");
			System.out.println(trianglesArea(simpleRectangleTriangles));
			System.exit(1);
		}

		// Simple rectangle with hole
		final float[][][] simpleRectangleWithHole = new float[][][] {
			// a rectangle from (10, 10) to (30, 20)
			new float[][] {
				new float[]{10, 10},
				new float[]{30, 10},
				new float[]{30, 20},
				new float[]{10, 20}
			},
			// with a hole from (20, 12) to (25, 16)
			new float[][]{
				new float[]{20, 12},
				new float[]{25, 12},
				new float[]{25, 16},
				new float[]{20, 16}
			}
		};
		List<float[][]> simpleRectangleWithHoleTriangles = Earcut.earcut(simpleRectangleWithHole, true);
		if (trianglesArea(simpleRectangleWithHoleTriangles) != 200 - 20) {
			System.out.println("simpleRectangleWithHole failed");
			System.out.println(trianglesArea(simpleRectangleWithHoleTriangles));
			System.exit(1);
		}

		// Polygon with hole
		final float[][][] holeExample = new float[][][] {
			new float[][] {
				new float[]{3.0479999999559757f, -24.3744744186397f},
				new float[]{3.0479999999559757f, -9.134474999999567f},
				new float[]{3.352799999955975f, -9.134474999999567f},
				new float[]{3.352799999955975f, -3.6480749999995656f},
				new float[]{7.924799999955975f, -3.6480750000152398f},
				new float[]{7.924799999955975f, -24.374474418655375f}
			},
			// a hole
			new float[][]{
				new float[]{5.892849609330605f, -6.594474224853127f},
				new float[]{6.502449609330606f, -6.594474224853127f},
				new float[]{6.502449609330606f, -7.2040742248531275f},
				new float[]{5.892849609330605f, -7.2040742248531275f}
			}
		};
		List<float[][]> holeExampleTriangles = Earcut.earcut(holeExample, true);
		if (holeExampleTriangles.size() != 10) {
			System.out.println("holeExample failed");
			System.out.println(holeExampleTriangles.size());
			System.exit(1);
		}
	}

}
