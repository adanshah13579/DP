package iterator_tv;

public class ConcreteTV implements TV{
	private String [] channels = {"CNN", "ARY", "Fox News", "PTV Sports"};
	private Iterator iterator;
	
	public ConcreteTV() {
		iterator = new ConcreteIterator();
	}
	@Override
	public Iterator getIterator() {
		return iterator;
	}
	
	public class ConcreteIterator implements Iterator{
		private int index = 0;
		@Override
		public boolean hasMore() {
			if(index>=channels.length)
				return false;
			else
				return true;
		}

		@Override
		public String getNext() {
			return channels[index++];
		}
		
	}
}