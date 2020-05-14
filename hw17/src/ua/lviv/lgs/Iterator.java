/**
 * 
 */
package ua.lviv.lgs;

/**
 * @author alexl
 *
 */
public interface Iterator {

	public boolean hasNext();

	public Number next();

}

/* Collection declaration block */
class Collection {

	private static Number[] arr;

	Collection(Number[] arr) {
		Collection.arr = arr;
	}

	/* ----------First ------------- */
	public class First implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {

			return count < arr.length;
		}

		@Override
		public Number next() {
			double num = arr[count++].doubleValue();

			if ((num % 2) != 0) {
				return (Number) num; // added (Number) for sure. Also works without...
			} else {
				return (Number) 0; // added (Number) for sure. Also works without...
			}
		}
	}

	public First createFirst() {
		return new First();
	}

	/*---------Second -----------------*/

	public class Second implements Iterator {
		private int count = arr.length - 1;

		@Override
		public boolean hasNext() {

			return count >= 0;
		}

		@Override
		public Number next() {
			Number ret = arr[count];
			count -= 2;
			return ret;
		}
	}

	public Second createSecond() {
		return new Second();
	}

	/* ---------- Third ------------------ */

	public Iterator createAnonymousIterator() {

		return new Iterator() {
			int count = arr.length - 3;

			@Override
			public boolean hasNext() {
				return count >= 0;
			}

			@Override
			public Number next() {
				
				double num = arr[count].doubleValue();
				count -= 3;
				if (((num % 2) == 1) || ((num % 2) == -1)) {
					return (Number) num;
				} else {
					return null;
				}

			}

		};
	}

	/* ------------ Fourth -------------- */

	public Iterator createLocalIterator() {

		class Fourth implements Iterator {
			private int count = 4;

			@Override
			public boolean hasNext() {

				return count < arr.length;
			}

			@Override
			public Number next() {
				
				double num = arr[count].doubleValue();
				count += 5;
				if ((num % 2) == 0) {
					return (Number) (num + 100);
				} else {
					return (Number) num;
				}

			}

		}

		return new Fourth();

	}

	/*------------Fifth ---------------------*/

	private static class Fifth implements Iterator {
		private int count = 1;

		@Override
		public boolean hasNext() {

			return count < arr.length;
		}

		@Override
		public Number next() {
			
			double num = arr[count].doubleValue();
			count += 2;
			if ((num % 2) == 0) {
				return (Number) (num + 1);
			} else {
				return (Number) null;
			}

		}

	}

	public static Fifth createFifthIterator() {
		return new Fifth();
	}

}
