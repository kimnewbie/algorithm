package kakao;

public class _2020_기둥과_보_설치 {
	boolean[][] Pillar; //기둥
	boolean[][] Bar; //보
	
	boolean checkPillar(int x, int y) { // checkPillar 메서드 생성
		if(y == 0 || Pillar[x][y-1]) { // 기둥 세울 수 있음 (1. 바닥면일 때 y ==0 || 2.기둥아래 Pillar[x][y-1])
			return true;
		}
		if((x > 0 && Bar[x-1][y])||Bar[x][y]) { // 보가 밑에 왼쪽에 있는지 확인, x가 음수가 나오면 안됨 || 보가 같은 위치일 경우
			return true;
		}
		return false;
	}
	
	boolean checkBar(int x, int y) { // checkBar 메서드 생성
		if(Pillar[x][y-1] || Pillar[x+1][y-1]) { // 밑에 기둥이 있으면 설치 가능 || 기둥이 오른쪽에 있어도 가능
			return true;
		}
		if(x > 0 && Bar[x+1][y] && Bar[x-1][y]) { // 양쪽에 보가 있는 경우: 바닥에 보를 설치하는  경우는 없음 y>0
			return true;
		}
		return false;
	}
	
	boolean canDelete(int x, int y) { // 건축물 삭제 시 영향을 주는 건축물은 몇개가 전부임, 아래는 필요 없고 위만 신경
		for(int i=Math.max(x-1,0); i<=x+1; i++) { // x가 0일 때 -1이 되므로 Math.max 사용 음수일 경우 0 으로 처리
			for(int j=y; j<=y+1; j++) { // 밑에서 이미 지우고 이 메서드를 호출한 상태라서
				if(Pillar[i][j] && checkPillar(i,j) == false) { // 기둥이 존재할 수 없다면
					return false;
				}
				if(Bar[i][j] && checkBar(i,j) == false) { // 보가 존재할 수 없다면
					return false;
				}
			}
		}
		
		return true; // 지워도 돼! true 리턴
	}
	 
	public int[][] solution(int n, int[][] build_frame){
		
		// 기둥과 보 설치
		Pillar = new boolean[n+2][n+2]; // n=5 지만 인덱스를 0~5까지 사용하므로 +1, 여유있게는 +2
		Bar = new boolean[n+2][n+2]; // n=5 지만 인덱스를 0~5까지 사용하므로 +1, 여유있게는 +2
		
		int count = 0; // answer를 위한 count
		
		// build_frame을 하나씩 처리
		for(int[] build : build_frame) {
			int x = build[0], y = build[1]; // x, y좌표
			int type = build[2], cmd = build[3]; // type : 기둥, 보/ cmd : 삭제, 설치
			
			if(type == 0) { // 기둥인 경우
				if(cmd == 1) { // 설치
					if(checkPillar(x,y)) { // 설치할 수 있는지 확인
						Pillar[x][y] = true; // 설치 가능
						count++;
					}
				} else { // 삭제
					Pillar[x][y] = false; // 기둥을 지워보기
					if(canDelete(x,y) == false) { // 지울 수 없는 경우
						Pillar[x][y] = true; // 기둥 삭제 가능
					} else { // 삭제 성공한 경우
						count--;
					}
				}
			} else { // type 이 0이 아닌 경우 = 보인 경우
				if(cmd == 1) {
					if(checkBar(x,y)) { // 설치할 수 있는지 확인
						Bar[x][y] = true; // 설치 가능
						count++;
					} 
				} else { // 삭제
					Bar[x][y] = false; // 보를 지워보기
					if(canDelete(x, y) == false) { // 삭제 실패한 경우
						Bar[x][y] = true;
					} else { // 삭제 성공한 경우
						count--;
					}
				}
			}
		}
		
		// 남은 기둥과 보 개수만큼만 answer 출력
		int[][] answer = new int[count][3];
		
		count = 0; // 0으로 초기화
		
		for(int x=0; x<=n; x++) { // x좌표를 오름차순으로
			for(int y=0; y<=n; y++) { // x좌표 같을 경우 y좌표 기준 오름차순
				if(Pillar[x][y]) {
					answer[count][0] = x;
					answer[count][1] = y;
					answer[count++][2] = 0; // 기둥은 0
				}
				if(Bar[x][y]) {
					answer[count][0] = x;
					answer[count][1] = y;
					answer[count++][2] = 1; // 보는 1
				}
			}
		}
		
		return answer;
	}
}
