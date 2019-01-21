//import java.awt.event.KeyListener;

//import javax.swing.JFrame;

public class HalloWelt {

	public static void main(String[] args) {
		System.out.println("Mein Name ist Attila Mroz");
		// Kommadivision
		System.out.println(9 / 4.0);
		// Variable
		// Keinste: 1 Bit 0..1
		boolean testBool = false;
		System.out.println(testBool);
		// 8 Bit = 1 Byte -128..127
		byte testByte = 54;
		System.out.println(testByte);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		// 16 Bit = 1 Char 0..65535
		char testChar = 'x';
		System.out.println(testChar);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		// String = mehrere chars verkettet
		String testString = "Hi";
		System.out.println(testString);
		System.out.println(testString.length());
		System.out.println(testString.isEmpty());
		// Short = 16 Bit -32768..32767
		short testShort = -33;
		System.out.println(testShort);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		// Int = 32 Bit -2147483648..2147483647
		int testInt = 50000000;
		System.out.println(testInt);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		// Long = 64 Bit
		long testLong = 55767567;
		System.out.println(testLong);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		// Float = 32 Bit
		float testFloat = 123.321F;
		System.out.println(testFloat);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		// Double = 64 Bit (Genauer)
		double testDouble = 3534.355464;
		System.out.println(testDouble);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		/*JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 512, 512);
		frame.setResizable(false);
		frame.addKeyListener((KeyListener) frame);
		frame.setVisible(true);*/

	}
}
