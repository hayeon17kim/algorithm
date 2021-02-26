package algorithm.programmers.survivalkit;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
  class Position {
    int x,y;

    Position(int x, int y) {
      this.x = x;
      this.y = y;
    }

    boolean isValid (int width, int height) {
      if (x < 0 || x >= width) return false;
      if (y < 0 || y >= height) return false;
      return true;
    }
  }

  public int solution(int[][] maps) {
    int mapWidth = maps[0].length;
    int mapHeight = maps.length;

    Queue<Position> queue = new LinkedList<>();
    int[][] count = new int[mapHeight][mapWidth];
    boolean[][] visited = new boolean[mapHeight][mapWidth];

    queue.offer(new Position(0, 0));
    count[0][0] = 1;
    visited[0][0] = true;

    while (!queue.isEmpty()) {
      Position current = queue.poll();

      int currentCount = count[current.y][current.x];
      int[][] moving= {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
      for (int i = 0; i < moving.length; i++) {
        Position moved = new Position(current.x + moving[i][0], current.y + moving[i][1]);
        if (!moved.isValid(mapWidth, mapHeight)) continue;
        if (visited[moved.y][moved.x]) continue;
        if (maps[moved.y][moved.x] == 1) continue;

        count[moved.y][moved.x] = currentCount + 1;
        visited[moved.y][moved.x] = true;
        queue.offer(moved);
      }
    }
    int answer = count[mapHeight - 1][mapWidth - 1];
    if (answer == 0) return -1;
    return answer;
  }
}
