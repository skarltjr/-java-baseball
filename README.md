# java-baseball

- 숫자 야구 게임
- 목표 : 맡은 역할을 줄이고 객체 간 협력을 고려해보자

### 필요한 기능
1. check
    -  결과 검증 및 힌트 제공
    - ans checker
        - ans checker는 sb checker, returner 협력한다
        - 먼저 정답인지 체크하고
        - 아니라면 sb checker에게 strike/ball 개수확인 요청
        - 이후 결과를 returner에게 전달하고 
        - returner는 결과를 출력
    - strike / ball checker
        - strike/ball의 개수 체크
    - result return 
        - 결과 전달
2. game
    - 게임 진행
    - 정답생성
    - 유저에게 추측값 받고
    - 비교하여 힌트 제공
    - 예외 추측값은 예외처리
    - 정답이 맞으면 진행 | 종료 선택
3. player
    - 랜덤 3자리 수를 생성한다
    - 사용자에게 3자리 수를 입력받는다.
    - (check)를 통해 검사
    - (check)를 통해 맞을 때까지 힌트 제공
    - 틀렸을 때 재입력요구
    - (check)를 통해 검증 후 맞으면 게임 재진행 여부를 묻는다
    