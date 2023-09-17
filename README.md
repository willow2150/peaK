![peaK_](https://user-images.githubusercontent.com/110278377/232226574-8626ce7d-3853-426b-9798-8b8e2f2fdcf1.png)

# peaK - 나만의 아이돌 분석기

---

## :sparkles: 서비스 소개

내가 관심있는 아이돌을 선택하고

아이돌에 대한 peaK만의 랭킹과 차트를 확인해보세요

<br/>

## :pushpin: 주요 기능

**트위터 감성분석**을 통한 나의 아이돌 평판 확인

내가 좋아하는 아이돌의 **핫 키워드 및 인기 뉴스 기사** 확인

peaK만의 기준으로 **아이돌 랭킹** 제공

<br/>

## :date: 프로젝트 진행 기간

2023.02.27.MON ~ 2023.04.07.FRI (6주)

<br/>

## :triangular_ruler: 아키텍처

![architecture](https://user-images.githubusercontent.com/110278377/232226556-df7f34ac-c7ec-44bd-b370-a6650ae79a69.png)

<br/>

## :wrench: 기술스택

### `CI/CD`

AWS EC2 Ubuntu 20.04.6 LTS (GNU/Linux 5.4.0-1018-aws x86_64)

Docker 20.10.23

Jenkins 2.375.2

Nginx : 1.23.3

### `Backend`

IntelliJ IDEA : 2022.3.1

JVM : OpenJDK 11

SpringBoot Gradle 2.7.10

Spring Security

Spring Data MongoDB

Swagger

JWT 0.11.5

### `Frontend`

Visual Studio Code 1.77.1

Node.js 16.16.0

TypeScript 4.9.5

React 18.2.0

Redux

Apache ECharts 5.4.2

### `Database`

MongoDB 6.0.5

Redis 7.0.10

<br/>

## :computer: 서비스 화면

### 인트로

- 모든 기능은 회원가입 후 이용 가능하므로 서비스 소개 확인
  ![peaK_인트로](https://user-images.githubusercontent.com/110278377/232226599-d3efa2c4-fad0-4862-b4fa-7223ab7cfc16.gif)

### 회원가입

- 카카오 로그인 후 닉네임과 관심 아이돌을 설정하면 서비스 회원가입 완료
  ![peaK_회원가입](https://user-images.githubusercontent.com/110278377/232226607-ec42fdab-deed-4fab-a19f-38b8d6664202.gif)

### 홈

- 아이돌 랭킹 top8과 트렌딩 유튜브, 뉴스를 한 눈에 보기
  ![peaK_홈](https://user-images.githubusercontent.com/110278377/232226617-2fa2a3c1-f356-4000-b820-fb5a09679ba2.gif)

### 관심아이돌

- 내가 설정한 관심 아이돌의 페이지 목록으로 바로가기
  ![peaK_관심아이돌](https://user-images.githubusercontent.com/110278377/232226622-42c160c0-14b1-4cac-a6eb-28377df58fbb.gif)

### 아이돌

- 아이돌 검색
- 아이돌의 순위와 긍부정 지수, 워드 클라우드와 뉴스
- 응원 한 마디 남기기
  ![peaK_아이돌](https://user-images.githubusercontent.com/110278377/232226627-a6565a08-ad9d-4262-a679-595fc546d63d.gif)

### 랭킹 / 차트

- 한 시간마다 업데이트 되는 랭킹
- 내가 고른 아이돌들의 추이를 차트로 확인
  ![peaK_랭킹_차트](https://user-images.githubusercontent.com/110278377/232226633-1193a911-a464-402e-a4f0-5e4aa9ef744b.gif)

### 트렌딩

- 지금 이 시간, 아이돌에게 어떤 일이 일어나는지 트렌딩 뉴스 모아보기
- 오늘의 트렌딩 유튜브 모아보기
![peaK_트렌딩](https://user-images.githubusercontent.com/110278377/232237783-d476b959-8b4d-41d3-bae6-de694eba7537.gif)

### 마이페이지

- 내 아이돌에게 얼마나 관심을 쏟았는지 수치로 확인
- 내가 남겼던 2주 간의 응원 한 마디 기록
  ![peaK_마이페이지](https://user-images.githubusercontent.com/110278377/232226636-88cbceb4-8986-48ac-b3e4-dbc13410d6ad.gif)

<br/>

## :clipboard: 포팅 매뉴얼

[Porting_Manual_peaK.pdf](./exec/Porting_Manual_peaK.pdf)
