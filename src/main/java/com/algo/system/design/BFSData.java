// How would you design the data structures for a very large social network like Facebook or LinkedIn
// Decribe how you would design and algorithm to show the shortest path between two people

package com.algo.system.design;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFSData {
	public Queue<PathNode> toVisit = new LinkedList<PathNode>();
	public HashMap<Integer, PathNode> visited = new HashMap<Integer, PathNode>();

	public BFSData(Person root) {
		PathNode sourcePath = new PathNode(root, null);
		toVisit.add(sourcePath);
		visited.put(root.getID(), sourcePath);	
	}
	
	public boolean isFinished() {
		return toVisit.isEmpty();
	}
}
