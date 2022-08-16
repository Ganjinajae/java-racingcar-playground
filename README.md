## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

feature list
1. 문자열 덧셈 계산기
   1. 문자열 받기
   2. 쉼표(,), 콜론(:)을 분리
      1. null이나 빈 문자열은 0을 반환
      2. 구분자가 없이 숫자하나만 있는 경우
      3. 쉼표만 있는 경우
      4. 콜론만 있는 경우
      5. 쉼표 콜론 같이 있는 경우
   3. 커스텀 구분자를 찾기
      1. 커스텀 구분자가 있으면 커스텀 구분자로 분리
   4. 숫자 이외의 값 또는 음수 값은 Runtime Exception 처리
      1. 숫자 이외의 값이 있는 경우
      2. 음수 값이 있는 경우
   5. 구분 한 값끼리 더해서 리턴
