package problem.client;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter<T> implements Enumeration<T> {
	private Iterator<T> iter;

	public EnumerationAdapter(Iterator<T> iterator) {
		this.iter = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return this.iter.hasNext();
	}

	@Override
	public T nextElement() {
		return this.iter.next();
	}

}
