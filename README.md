# **Calculator**

***

## 1️⃣ 프로젝트 개요

이 프로젝트는 계산기를 구현한 프로젝트이며 사칙연산 뿐만 아니라 계산 결과, 계산 결과 삭제 등과 같은 계산 이외의 기능을 제공한다.

***

## 2️⃣ 실행 방법

1. 필요한 환경 구성하기

- Java Jdk: 17버전
- IDE: IntelliJ IDEA

2. 프로젝트 클론하기

   https://github.com/hosung77/calculatorr.git

3. Main에서 실행

***


## 3️⃣ 주요 기능

### ✅ **사칙연산을 통한 계산**

- +,-,*,/의 사칙연산이 가능하며 정수형뿐만이 아닌 실수형의 입력도 받을 수 있다. 

### ✅ **계산 결과들 보기**

- 계산 후 메뉴 리스트를 통해 계산 결과들을 볼 수 있는 번호를 누르면 계산된 결과의 리스트를 볼 수 있다.
  
### ✅ **계산기 기록 삭제**

- 계산 후 메뉴 리스트를 통해 계산기 기록 삭제 버튼을 누르면 계산 리스트가 보여지고 자기가 원하는 번호를 입력하여 특정 기록을 삭제할 수 있다.
  
### ✅ **계산기 종료**

- 계산 후 메뉴 리스트를 통해 종료 버튼을 누르면 계산기가 종료됨.

### ✅ **계산기 계속하기**

- 계산 후 계산을 더 하고 싶으면 원하는 만큼 계속할 수 있다.

### **자신이 원하는 숫자를 입력하여 그 숫자보다 큰 결과들 확인하기**

- 기존의 나온 결과들 중에서 자신이 입력할 숫자보다 큰 결과값들을 확인할 수 있다.
  
***

## 4️⃣ Git 전략

- gitflow 방식 적용

  gitflow방식을 사용해보려고 노력하였다. Main -> develop -> feature 방식으로 나누었으며 Main은 최종 코드 완성되면 develop이랑 merge를 통해 업데이트 시켜주었고 develop 브랜치는 하위에 기능별 브랜치를 만들어 기능이 완성될 때 마다 develop과 merge후 새로운 브랜치를 만들어 새로운 기능을 구현하는 식으로 진행함. 필수기능 쪽은 기능별로 브랜치를 안두었고 한 브랜치 안에서 커밋을 통해 필수기능이 다 완성되었을때 develop과 merge 했다. 반면에 도전기능에서는 각 기능마다 브랜치를 두어 개발 머지 브랜치 생성을 반복하였다. 이렇게 한 이유는 어떤 것이 더 유지보수성에 좋을까 직접 시도해보고자 진행하였다.






