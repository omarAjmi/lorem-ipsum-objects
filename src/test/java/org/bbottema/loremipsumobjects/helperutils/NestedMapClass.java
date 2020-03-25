package org.bbottema.loremipsumobjects.helperutils;

import java.util.List;
import java.util.Map;

/**
 * Master class containing many lists and maps nested in several ways.
 */
public class NestedMapClass {

	@SuppressWarnings("rawtypes")
	public static class NestedSingleSimpleMapClass {
		public Map map;

		public Map getMap() {
			return map;
		}

		public void setMap(Map map) {
			this.map = map;
		}
	}

	public static class NestedSingleMapClass {
		public Map<Double, LoopClass> numbers;

		public Map<Double, LoopClass> getNumbers() {
			return numbers;
		}

		public void setNumbers(final Map<Double, LoopClass> numbers) {
			this.numbers = numbers;
		}

	}

	public static class NestedDoubleMapClass {
		public Map<Map<Integer, NestedDoubleMapClass>, Map<Double, LoopClass>> MapsOfNumbers;

		public Map<Map<Integer, NestedDoubleMapClass>, Map<Double, LoopClass>> getMapsOfNumbers() {
			return MapsOfNumbers;
		}

		public void setMapsOfNumbers(final Map<Map<Integer, NestedDoubleMapClass>, Map<Double, LoopClass>> mapsOfNumbers) {
			MapsOfNumbers = mapsOfNumbers;
		}
	}

	/**
	 * Tests whether uneven sized lists of generic types are treated correctly two. This is to make sure that the code doesn't just assume
	 * the same number of generic nesting-depth on both sides of the {@link Map}.
	 */
	public static class NestedDoubleAssymetricMapClass {
		public Map<Map<Integer, NestedDoubleMapClass>, Character> MapsOfCharacters;

		public Map<Map<Integer, NestedDoubleMapClass>, Character> getMapsOfCharacters() {
			return MapsOfCharacters;
		}

		public void setMapsOfCharacters(final Map<Map<Integer, NestedDoubleMapClass>, Character> mapsOfCharacters) {
			MapsOfCharacters = mapsOfCharacters;
		}
	}

	public static class NestedTripleMapClass {
		public Map<Map<Integer, Map<Double, LoopClass>>, Map<Double, Map<Double, LoopClass>>> mapsOfMapsOfNumbers;

		public Map<Map<Integer, Map<Double, LoopClass>>, Map<Double, Map<Double, LoopClass>>> getMapsOfMapsOfNumbers() {
			return mapsOfMapsOfNumbers;
		}

		public void setMapsOfMapsOfNumbers(
				final Map<Map<Integer, Map<Double, LoopClass>>, Map<Double, Map<Double, LoopClass>>> mapsOfMapsOfNumbers) {
			this.mapsOfMapsOfNumbers = mapsOfMapsOfNumbers;
		}
	}

	public static class NestedEverythingClass {
		public Map<Map<List<List<String>>, NestedDoubleMapClass>, List<Byte>> MapsOfLists;

		public Map<Map<List<List<String>>, NestedDoubleMapClass>, List<Byte>> getMapsOfLists() {
			return MapsOfLists;
		}

		public void setMapsOfLists(final Map<Map<List<List<String>>, NestedDoubleMapClass>, List<Byte>> mapsOfLists) {
			MapsOfLists = mapsOfLists;
		}
	}
}