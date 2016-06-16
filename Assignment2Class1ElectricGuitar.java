/**
 * 
 */
package sdh.java.session6;

/**
 * @author sudhi
 * 
 */
public class Assignment2Class1ElectricGuitar extends
		Assignment2SubClassStringedInstrument {

	@Override
	public void play() {
		deviceName = "Electric Guitar";
		System.out.println("I am " + deviceName + " with " + numberOfStrings
				+ " number of strings");
	}

}
