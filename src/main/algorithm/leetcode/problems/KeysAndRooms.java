package algorithm.leetcode.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/keys-and-rooms/
 * medium
 */
public class KeysAndRooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		Set<Integer> visited = new HashSet<>();

		addKey(0, rooms,visited);

		return visited.size() == rooms.size();
	}

	private void addKey(int room, List<List<Integer>> rooms, Set<Integer> visited) {
		visited.add(room);

		for (int key: rooms.get(room)) {
			if (!visited.contains(key)) addKey(key, rooms,visited);
		}
	}
}
