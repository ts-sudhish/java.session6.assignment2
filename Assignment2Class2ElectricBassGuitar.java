/**
 * 
 */
package sdh.java.session6;

/**
 * @author sudhi
 * 
 */
public class Assignment2Class2ElectricBassGuitar extends
		Assignment2SubClassStringedInstrument {

	@Override
	public void play() {
		deviceName = "Electric Bass Guitar";
		System.out.println("I am " + deviceName + " with " + numberOfStrings
				+ " number of strings");
	}

}
