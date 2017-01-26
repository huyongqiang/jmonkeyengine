package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotificationBitmap_t extends Structure {
	/**
	 * void *<br>
	 * C type : void*
	 */
	public Pointer m_pImageData;
	public int m_nWidth;
	public int m_nHeight;
	public int m_nBytesPerPixel;
	public NotificationBitmap_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("m_pImageData", "m_nWidth", "m_nHeight", "m_nBytesPerPixel");
	}
	/**
	 * @param m_pImageData void *<br>
	 * C type : void*
	 */
	public NotificationBitmap_t(Pointer m_pImageData, int m_nWidth, int m_nHeight, int m_nBytesPerPixel) {
		super();
		this.m_pImageData = m_pImageData;
		this.m_nWidth = m_nWidth;
		this.m_nHeight = m_nHeight;
		this.m_nBytesPerPixel = m_nBytesPerPixel;
	}
	public NotificationBitmap_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends NotificationBitmap_t implements Structure.ByReference {
		
	};
	public static class ByValue extends NotificationBitmap_t implements Structure.ByValue {
		
	};
}
