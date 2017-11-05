package edu.utdallas.cs3345.project6;

import java.util.NoSuchElementException;
import java.util.Set;

/**
 * A mutable, directed, edge-valued graph that does not support self-loops, parallel edges, or
 * <code>null</code> values.
 * <p>
 * All methods of this class immediately throw {@link java.lang.NullPointerException} if any
 * argument is null. All methods of this class that take a parameter of type <code>N</code> throw
 * {@link java.util.NoSuchElementException} if any node argument is not contained in the graph
 * (except {@link #addNode} and {@link #contains}).
 * <p>
 * The argument for the type parameter <code>N</code> is assumed to constitute a valid keys for
 * <i>any</i> concrete implementation of {@link java.util.Map} in the JDK 8 Collections Framework.
 *
 * @param <N>
 *            Type of a node
 * @param <V>
 *            Type of an edge value
 * 
 * @implSpec You may choose which underlying "concrete" graph representation to implement (e.g.
 *           adjacency list, adjacency matrix, etc.), as well as how to store the edge values.
 *           Depending your choice of graph representation and storage architecture, you may or may
 *           not need more than one internal data structure and/or need to create some nested class.
 * 
 * @apiNote <a href=
 *          "https://google.github.io/guava/releases/23.0/api/docs/com/google/common/graph/ValueGraph.html">
 *          com.google.common.graph.ValueGraph</a> and <a href=
 *          "https://google.github.io/guava/releases/23.0/api/docs/com/google/common/graph/MutableValueGraph.html">
 *          com.google.common.graph.MutuableValueGraph</a> are the original classes that this
 *          simplified class is based on.
 *
 * @implNote If you choose to use {@link java.util.HashMap} for anything, then you should know that
 *           the correct way to use multiple objects as a single key is with the variadic function
 *           {@link java.util.Objects#hash(Object...)}, <i>not</i> by manually combining multiple
 *           invocations of {@link Object#hashCode()}.
 */
public class DirectedValuedGraph <N,V>
{

	/**
	 * Constructs a new, empty <code>DirectedValuedGraph</code>. An empty graph contains no nodes
	 * and has no edges.
	 */
	public DirectedValuedGraph() { }

	
	//////////////
	// MUTATORS //
	//////////////

	/**
	 * Adds the given node to the graph iff the graph does not already contain a node that
	 * <code>equals</code> the given node. Returns whether the graph did not already contain
	 * the specified node.
	 * 
	 * @param node
	 *            The given node to add to the graph
	 * @return <code>true</code> iff the graph did not already contain <code>node</code>
	 * @throws NullPointerException
	 *             If the argument is <code>null</code>
	 */
	public boolean addNode(N node)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Adds the given directed edge with the specified value to the graph iff the graph does not
	 * already contain an edge from the <code>src</code> node to the <code>tar</code> node. Returns
	 * whether the graph did not already have an edge connecting <code>src</code> to
	 * <code>tar</code>.
	 * 
	 * @param src
	 *            The source ("from") node endpoint of the directed edge
	 * @param tar
	 *            The target ("to") node endpoint of the directed edge
	 * @param val
	 *            The value of the edge
	 * @return <code>true</code> iff the graph did not already have an edge connecting
	 *         <code>src</code> to <code>tar</code>
	 * @throws IllegalArgumentException
	 *             If the specified edge is a self-loop
	 * @throws NoSuchElementException
	 *             If either of the given <code>src</code> or <code>tar</code> nodes does not exist
	 *             in the graph
	 * @throws NullPointerException
	 *             If any argument is <code>null</code>
	 * 
	 * @implSpec Input validation should be performed in order of nullity check, existential check,
	 *           then self-loop check.
	 */
	public boolean addDirectedEdge(N src, N tar, V val)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	
	////////////////////
	// NODE ACCESSORS //
	////////////////////

	/**
	 * Returns whether the graph contains the specified node. More formally, returns
	 * <code>true</code> if and only if the graph contains a node <code>V</code> such that
	 * <code>(node.equals(V))</code>. Returns <code>false</code> otherwise.
	 * 
	 * @param node
	 *            Node whose presence in this collection is to be tested
	 * @return <code>true</code> iff the graph contains <code>node</code>
	 * @throws NullPointerException
	 *             If the argument is <code>null</code>
	 */
	public boolean contains(N node)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Returns the set of all successors of the specified node, which may be an empty set. The
	 * "successors" of <code>node</code> are all nodes in the graph adjacent to
	 * <code>node</code> which can be reached by traversing <code>node</code>'s outgoing edges
	 * in the direction of the edge.
	 * 
	 * @param node
	 *            The node whose successors are to be returned
	 * @return All successors of <code>node</code> in the graph
	 * @throws NoSuchElementException
	 *             If the graph does not contain <code>node</code>
	 * @throws NullPointerException
	 *             If the argument is <code>null</code>
	 * 
	 * @implSpec Input validation should be performed in order of nullity check, then existential check.
	 */
	public Set<N> successors(N node)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Returns the set of all nodes in the graph, which may be an empty set.
	 * 
	 * @return The set of all nodes in the graph
	 * 
	 * @implSpec The returned set should <i>not</i> be coupled to any internal data structure. I.e.
	 *           any changes the client code makes to the returned set object should not affect any
	 *           internal data structure of the graph. However, you should not clone the node
	 *           objects themselves (see the note below for why).
	 *
	 * @implNote Avoiding dangerous modifications to the node objects themselves is the
	 *           responsibility of the client, since the node objects were originally provided by
	 *           the client and this class cannot ensure their unmodifiability.
	 */
	public Set<N> nodes()
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}
	
	
	////////////////////
	// EDGE ACCESSORS //
	////////////////////

	/**
	 * Returns whether the graph has a directed edge connecting <code>src</code> to
	 * <code>tar</code>.
	 * 
	 * @param src
	 *            The source ("from") node of the directed edge
	 * @param tar
	 *            The target ("to") node of the directed edge
	 * @return <code>true</code> iff the graph has a directed edge connecting <code>src</code> to
	 *         <code>tar</code>
	 * @throws NoSuchElementException
	 *             If either of the <code>src</code> or <code>tar</code> nodes does not exist in the graph
	 * @throws NullPointerException
	 *             If any argument is <code>null</code>
	 * 
	 * @implSpec Input validation should be performed in order of nullity check, then existential check.
	 */
	public boolean hasEdgeConnecting(N src, N tar)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

	/**
	 * Returns the value of the directed edge connecting <code>src</code> to <code>tar</code>.
	 * 
	 * @param src
	 *            The source ("from") node endpoint of the given directed edge
	 * @param tar
	 *            The target ("to") node endpoint of the given directed edge
	 * @return The value of the specified edge
	 * @throws NoSuchElementException
	 *             If any of the <code>src</code> node, the <code>tar</code> node, or the directed
	 *             edge identified by those two nodes does not exist in the graph
	 * @throws NullPointerException
	 *             If any argument is <code>null</code>
	 * 
	 * @implSpec Input validation should be performed in order of nullity check, then existential
	 *           check.
	 */
	public V edgeValue(N src, N tar)
	{
		// TODO implement this
		throw new UnsupportedOperationException("not implemented yet"); // TODO remove after implementing
	}

}
