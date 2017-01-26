package osvrclientreporttypes;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OSVR_AnalogReport extends Structure {
	public int sensor;
	/** C type : OSVR_AnalogState */
	public double state;
	public OSVR_AnalogReport() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("sensor", "state");
	}
	/** @param state C type : OSVR_AnalogState */
	public OSVR_AnalogReport(int sensor, double state) {
		super();
		this.sensor = sensor;
		this.state = state;
	}
	public OSVR_AnalogReport(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OSVR_AnalogReport implements Structure.ByReference {
		
	};
	public static class ByValue extends OSVR_AnalogReport implements Structure.ByValue {
		
	};
}
