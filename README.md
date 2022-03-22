# java-chess

## 페어 프로그래밍 목표
- 판다: 처음 짤 때부터 깔끔하게 짜자.
- 라라: 페어의 순서와 역할을 존중하자. 의견을 적극적으로 제안하고 받아들이자!
- 공동: TDD 를 잘 지키려 노력하자. 

## 기능 구현 목록
- [x] 체스판을 초기화한다.
  - [x] 가로 위치는 왼쪽부터 a ~ h로 한다.
  - [x] 세로 위치는 아래부터 위로 1 ~ 8로 한다.
  - [x] 각 진영은 검은색(대문자)과 흰색(소문자) 편으로 구분한다. 
- [x] start 를 입력받으면 게임을 초기화한다. 
- [x] end 를 입력받으면 게임을 종료한다. 

## 예외 처리 목록
- [x] start 또는 end 가 아닌 입력 

## 객체 목록
- Piece: 체스 기물
  - King
  - Queen
  - Rook
  - Bishop
  - Knight
  - Pawn 
- Board: 체스판 
- Position: 기물의 위치 
- PositionX: 가로 위치 enum 
- PositionY: 세로 위치 enum 
- Color: 기물의 색깔이 저장된 enum 