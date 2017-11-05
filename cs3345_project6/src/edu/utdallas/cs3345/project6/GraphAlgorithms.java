package edu.utdallas.cs3345.project6;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * Static utility methods for {@link DirectedValuedGraph} instances.
 */
public class GraphAlgorithms
{
	
	/**
	 * <code>GraphAlgorithms</code> is a static utility class that should never be instantiated.
	 */
	private GraphAlgorithms() { }

	/**
	 * Finds a shortest path in the graph from the source node to the destination node using
	 * Dijkstra's algorithm with the provided cost function.
	 * <p>
	 * Returns the shortest path as a sequence of nodes where the first node is the source and the
	 * last node is the destination. If there is no path in the graph from the source to the
	 * destination, then this method will return the empty path. If the source is the destination,
	 * then this method will return a singleton path.
	 * <p>
	 * The cost function extracts the "cost" of an edge (for the purposes of finding a "shortest"
	 * path) from the "value" of an edge as it is represented in the given
	 * <code>DirectedValuedGraph</code>. The cost function should never return a negative cost.
	 * Given a <code>null</code> (i.e. non-existent) edge value, the cost function should return
	 * positive infinity.
	 * 
	 * @param graph
	 *            The graph in which to find a shortest path
	 * @param src
	 *            The source node from which a shortest path is to be found
	 * @param dst
	 *            The destination node to which a shortest path is to be found
	 * @param costFunction
	 *            A function that extracts the numeric representation of the "cost" of an edge given
	 *            the value associated with an edge
	 * @return A shortest path in <code>graph</code> from <code>src</code> to <code>dst</code> as
	 *         induced by <code>costFunction</code>
	 * @throws IllegalArgumentException
	 *             If <code>costFunction</code> ever returns a negative cost in the course of
	 *             executing Dijkstra's algorithm over the given problem instance
	 * @throws NoSuchElementException
	 *             If either of <code>src</code> or <code>dst</code> is not contained in
	 *             <code>graph</code>
	 * @throws NullPointerException
	 *             If any argument is <code>null</code>
	 * 
	 * @see DirectedValuedGraph
	 * @see java.util.function.Function
	 * @see java.lang.Double#POSITIVE_INFINITY
	 * 
	 * @implSpec Input validation should be performed in order of nullity check, then existential
	 *           check.
	 *           <p>
	 *           You may create additional helper methods and nested classes with <code>private
	 *           static</code> access within this class -- in fact, you are encouraged to do so. You
	 *           may also add additional <code>public</code> methods to {@link DirectedValuedGraph}
	 *           and {@link MappedMinPriorityQueue} -- however, this is discouraged (but will not
	 *           hurt your grade).
	 * 
	 * @apiNote The cost function is primarily beneficial in situations where the "value" of an edge
	 *          is a complex non-numeric type with multiple attributes, and only one of its
	 *          attributes should be used to find a shortest path.
	 */
	public static <N,V> List<N> dijkstra(DirectedValuedGraph<N,V> graph, N src, N dst,
			Function<V,Double> costFunction)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet");  // TODO remove after implementing
	}

}
