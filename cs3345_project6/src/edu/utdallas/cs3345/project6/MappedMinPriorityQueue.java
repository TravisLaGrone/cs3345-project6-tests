package edu.utdallas.cs3345.project6;

import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * A min priority queue that maps each element to a priority. Does not allow duplicate elements,
 * where two elements are considered duplicates if they are equal according to
 * {@link java.util.Objects#equals(Object, Object)}. The elements are ordered according to the order
 * of their priorities, which is specified at construction-time by a {@link java.util.Comparator}
 * and may be updated dynamically via {@link #decrease(Object,Object)}.
 * 
 * @param <E>
 *            Type of an element in the queue, which should be usable as a {@link java.util.Map} key
 * @param <P>
 *            Type representing the priority of an element
 * 
 * @implSpec You may choose which underlying "concrete" data structure to implement (e.g. binary
 *           heap, fibonacci heap, etc.). You may also use (almost) any class found in the Java
 *           Collections Library, i.e. the {@link java.util} package. The only thing you cannot use
 *           are library implementations of a priority queue (e.g. you may not use
 *           {@link java.util.PriorityQueue}).
 * 
 * @implNote Most of the code for this class may be drawn from the slides and the textbook. The hard
 *           parts will be the {@link #decrease(Object,Object)} method and how to internally store
 *           the elements and their priorities. Depending on your choice of heap and storage
 *           architecture, you may or may not need more than one internal data structure and/or need
 *           to create some nested class. You might find {@link java.util.HashMap} useful.
 * 
 * @apiNote The distinction between an element and its priority (i.e. what I am calling a "mapped"
 *          priority queue here) is intended to make it easier to use and safely implement the
 *          <i>decrease key</i> operation. However, this type of mapped queue is uncommon in library
 *          code, as few library-based priority queue implementations provide an operation like
 *          <i>decrease key</i> in the first place.
 */
public class MappedMinPriorityQueue <E,P>
{

	/**
	 * Constructs a new, empty <code>MappedMinPriorityQueue</code> that orders priorities according
	 * to the given comparator.
	 * <p>
	 * {@link java.util.Comparator#naturalOrder()} may be used only if <code>K</code> implements
	 * <code>Comparable</code>. Moreover, any priority comparator must entail a <i>total
	 * ordering</i> over its domain. However, these two restrictions are not enforced at
	 * construction-time.
	 * 
	 * @param priorityComparator
	 *            The comparator used to order the priorities
	 * @throws NullPointerException
	 *             If the priority comparator is <code>null</code>
	 * 
	 * @see java.util.Comparator
	 * @see Comparable
	 */
	public MappedMinPriorityQueue(Comparator<P> priorityComparator)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Adds the specified element to the queue with the given priority iff the element is not
	 * already present. More formally, adds the specified element iff the queue contains no element
	 * <code>containedElem</code> such that <code>element.equals(containedElem)</code>.
	 * <p>
	 * Returns whether the queue did not already contain the specified element.
	 * 
	 * @param element
	 *            The element to add to the queue
	 * @param priority
	 *            The priority to associate with <code>element</code>
	 * @return <code>true</code> iff the queue did not already contain <code>element</code>
	 * @throws NullPointerException
	 *             If any argument is <code>null</code>
	 */
	public boolean add(E element, P priority)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Removes and returns an element of the priority queue with minimal priority.
	 * 
	 * @return An element of the priority queue with minimal priority
	 * @throws NoSuchElementException
	 *             If the queue is empty
	 */
	public E remove()
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Updates the priority of the specified element to the given priority iff the new priority is
	 * less than the old priority. Returns whether the new priority is less than the old priority.
	 * 
	 * @param element
	 *            The element whose priority is to be decreased
	 * @param newPriority
	 *            The new priority to associate with <code>element</code>
	 * @return <code>true</code> iff the new priority is less than the old priority
	 * @throws NoSuchElementException
	 *             If the <code>element</code> does not exist in the queue
	 * @throws NullPointerException
	 *             If any argument is <code>null</code>
	 * 
	 * @implSpec Input validation should be performed in order of nullity check, then existential check.
	 */
	public boolean decrease(E element, P newPriority)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Returns whether the queue is empty.
	 * 
	 * @return <code>true</code> iff the queue contains no elements
	 */
	public boolean isEmpty()
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

}
