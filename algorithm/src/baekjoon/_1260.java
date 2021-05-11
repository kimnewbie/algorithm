package baekjoon; 
import java.util.*;
/*
문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
탐색을 시작할 정점의 번호 V가 주어진다. 
다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

예제 입력 1 
4 5 1
1 2
1 3
1 4
2 4
3 4

예제 출력 1 
1 2 4 3
1 2 3 4

예제 입력 2 
5 5 3
5 4
5 2
1 2
3 4
3 1

예제 출력 2 
3 1 2 5 4
3 1 4 2 5

예제 입력 3 
1000 1 1000
999 1000

예제 출력 3 
1000 999
1000 999
*/
public class _1260 {
	static int[][] map; // 간선 연결상태
	static boolean[] visit; // 확인여부
	static int node; // 정점의 개수
	static int edge; // 간선의 개수
	static int start; // 시작 정점
	
	public static void main(String[] args) throws Exception{ // DFS와 BFS
		Scanner sc = new Scanner(System.in);
		node = sc.nextInt();
		edge = sc.nextInt();
		start = sc.nextInt();
		
		map = new int[node+1][node+1]; // 인덱스 활용을 위해 +1
		visit = new boolean[node+1]; // 방문 여부
		
		// 간선 연결 상태 저장
		for(int i=0; i<edge; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			map[x][y] = map[y][x] = 1; // 방향이 나오지 않았으므로 앞뒤로 갈 수 있음
		}
		
		dfs(start); // dfs 호출 - 재귀함수
		
		visit = new boolean[node+1]; // dfs 후에 bfs로도 시작해야하기 때문에 확인 사항 초기화
		System.out.println(); // 줄바꿈
		
		bfs(); // bfs 호출
		
		sc.close();
	}
	
	// 시작
	public static void dfs(int i) { // 깊이 우선 탐색
		visit[i] = true; // 방문한 노드임을 확인
		System.out.print(i+" ");
		
		for(int j=1; j<=node; j++) {
			if(map[i][j] == 1 && visit[j] == false) { // 간선으로 연결되어있으나 아직 방문하지 않은 노드
				dfs(j);
			}
		}
	}
	 
	public static void bfs() { // 너비 탐색
		Queue<Integer> queue = new LinkedList<Integer>(); // Queue 선언 방식, LinkedList 각각의 노드를 연결
		queue.offer(start); // queue.offer(값 넣기), 시작점도 Queue에 넣어야함
		visit[start] = true; // 처음 시작노드 방문처리
		System.out.print(start+" ");
		
		// Queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
		while(!queue.isEmpty()) {
			int temp = queue.poll(); // 첫번째 값을 반환하고 제거 비어있다면 null
			
			for(int j=1; j<=node; j++) {
				if(map[temp][j] == 1 && visit[j] == false) {
					queue.offer(j);
					visit[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
}
/*
LinkedList<String> colors = new LinkedList<>();
// add() method
colors.add("Black");
colors.add("White");
colors.add(0, "Green");
colors.add("Red");

// set() method
colors.set(0, "Blue");

System.out.println(colors);

결과 : Blue, Black, White, Red
*/