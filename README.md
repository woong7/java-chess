# java-chess
체스 게임 구현을 위한 저장소

## 기능 요구 사항

1단계
 - [x] 명령어를 입력 받는다(start, end)
    - [x] (예외) start, end 외의 명령어가 입력된 경우 다시 명령어를 입력 받는다
 - [x] start 를 입력 시 체스판을 초기화 한다
 - [x] end 를 입력 시 게임을 종료한다
 
 2단계
 - [x] 체스 말 규칙에 따라 말을 이동한다
    - [x] 폰은 시작 위치에서 2칸 이동이 가능하고 시작 위치가 아닐 때 대각선의 적을 잡을 수 있다
 - [x] `move source위치 target위치` 명령어로 말을 움직인다
 
 3단계
 - [x] 왕을 잡으면 게임이 종료된다
 - [x] `status` 명령어를 입력하면 현재 남아있는 말의 점수를 구할 수 있다
 - [x] 한 번에 한 쪽의 점수만 계산한다
 - [x] 같은 세로줄에 같은 색의 폰이 있는 경우 1점이 아닌 0.5점을 준다
