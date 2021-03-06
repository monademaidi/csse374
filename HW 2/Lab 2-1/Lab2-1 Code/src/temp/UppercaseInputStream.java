package temp;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UppercaseInputStream extends FilterInputStream {

	public UppercaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		
		if (c == -1) {
			return c;
		}
		
		return Character.toUpperCase(c);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int total = super.read(b, off, len);
		
		for (int i = off; i < off + total; i++) {
			if (b[i] != -1) {
				b[i] = (byte) Character.toUpperCase(b[i]);
			}
		}
		
		return total;
	}
	
	

}
