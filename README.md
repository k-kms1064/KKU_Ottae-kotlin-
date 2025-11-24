# 🚀 건대 어때 (KU Bus & Facility App)

<h3 align="center"><b>건국대학교 글로컬 캠퍼스 학생을 위한<br>버스 · 편의시설 · 즐겨찾기 통합 앱</b></h3>


------------------------------------------------------------------------

# 🎯 오픈 미션 개요

이번 프로젝트는 **우아한테크코스 프리코스 오픈미션**의 일환으로 진행되었습니다.  
프리코스 과정에서 학습한 문제 해결 방식, 책임 분리, 테스트 중심 사고를 기반으로  
2주간 스스로 기획·설계·구현하는 **자율 프로젝트 챌린지**입니다.

------------------------------------------------------------------------

## 📚 목차

1.  프로젝트 소개
2.  주요 기능
3.  기술 스택
4.  아키텍처
5.  실행 방법
6.  폴더 구조
7.  개발 목적 & 학습 포인트

------------------------------------------------------------------------

# 🌟 프로젝트 소개

**건대 어때**는 건국대학교 글로컬 캠퍼스 학생들을 위한\
생활 밀착형 Android 애플리케이션입니다.

-   버스 도착 정보
-   주변 편의시설 탐색
-   즐겨찾기 관리

학생들의 실제 요구를 기반으로 설계된 실용 앱입니다.

------------------------------------------------------------------------

# 🔥 주요 기능

## 🚍 버스 도착 정보

-   주요 정류장(건국대 정문/건국대 후문/KU 스테이션) 선택
-   도착 예정 시간 자동 정렬
-   RecyclerView 기반 UI 구성

------------------------------------------------------------------------

## 🍽️ 편의시설 카테고리 탐색

-   한식/중식/일식/카페 등 세부 카테고리 제공
-   카테고리 선택 시 시설 리스트 Activity 이동
-   향후 지도 API로 확장 가능

------------------------------------------------------------------------

## ⭐ 즐겨찾기(Room)

-   Room 기반 영구 저장
-   FavoriteListActivity 제공
-   ViewModel + Repository 패턴 적용

------------------------------------------------------------------------

## 🧩 기술 스택

| 구분 | 기술 |
|------|------|
| **Language** | Kotlin |
| **UI** | ViewBinding, Material Components, RecyclerView |
| **Data** | Room Database, LiveData |
| **Architecture** | MVVM 일부 적용, Repository 패턴 |
| **Build** | Gradle Kotlin DSL |
| **Layout** | XML, Drawable |


------------------------------------------------------------------------

# 🧱 아키텍처

## Activity 구조

    MainActivity
    ├── BusCategoryActivity
    │     └── BusArrivalActivity
    ├── FacilityCategoryActivity
    │     └── FacilityListActivity
    └── FavoriteListActivity

## Room 구조

    FavoriteEntity
    FavoriteDao
    FavoriteRepository
    FavoriteViewModel

## 데이터 흐름

    Activity → ViewModel → Repository → DAO → Room DB
                        ↑ LiveData observe

------------------------------------------------------------------------

# 📱 실행 방법

## ▶ Android Studio

1.  Android Studio 실행
2.  File → Open → 프로젝트 선택
3.  에뮬레이터 또는 기기 연결
4.  Run ▶ 실행

------------------------------------------------------------------------

## ▶ CLI 실행

### Build

    ./gradlew assembleDebug

### Install

    adb install -r app/build/outputs/apk/debug/app-debug.apk

### Run

    adb shell am start -n com.konkuk.ottae/.MainActivity

### adb 확인

    adb devices

------------------------------------------------------------------------

# 📂 폴더 구조

    app/
    └── src/main/
        ├── java/com/konkuk/ottae/
        │    ├── bus/
        │    │  ├── BusAdapter.kt                   # 버스 리스트 RecyclerView 어댑터
        │    │  ├── BusArrivalActivity.kt           # 버스 도착 정보 표시 화면
        │    │  ├── BusCategoryActivity.kt          # 버스 정류장 선택 화면
        │    │  └── BusItem.kt                      # 버스 도착 정보 데이터 클래스
        │    │
        │    ├── facility/
        │    │  ├── Facility.kt                     # 편의시설 정보 데이터 클래스
        │    │  ├── FacilityAdapter.kt              # 편의시설 리스트 어댑터
        │    │  ├── FacilityCategoryActivity.kt     # 편의시설 카테고리 선택 화면
        │    │  └── FacilityListActivity.kt         # 편의시설 목록 화면
        │    │
        │    ├── favorite/
        │    │  ├── FavoriteDao.kt                  # DAO (Insert/Delete/Query)
        │    │  ├── FavoriteEntity.kt               # Room 엔티티
        │    │  ├── FavoriteListActivity.kt         # 즐겨찾기 화면
        │    │  ├── FavoriteListAdapter.kt          # 즐겨찾기 리스트 어댑터
        │    │  ├── FavoriteRepository.kt           # DB Repository
        │    │  ├── FavoriteViewModel.kt            # ViewModel (LiveData)
        │    │  └── FavoriteViewModelFactory.kt     # ViewModel 생성용 Factory 클래스
        │    │
        │    ├── AppDatabase.kt              # 앱 홈 화면 (버스/편의시설/즐겨찾기 진입)  
        │    └── MainActivity.kt             # Room Database 설정
        │
        ├── res/layout/
        ├── res/drawable/
        ├── res/values/
        └── AndroidManifest.xml

------------------------------------------------------------------------

# 📸 스크린샷

<table>
  <tr>
    <th align="center">🚍 버스 도착</th>
    <th align="center">🍽️ 편의시설 목록</th>
    <th align="center">⭐ 즐겨찾기</th>
  </tr>
  <tr>
    <td align="center"><img src="docs/images/bus_arrival.png" width="250"></td>
    <td align="center"><img src="docs/images/facility_list.png" width="250"></td>
    <td align="center"><img src="docs/images/favorite_list.png" width="250"></td>
  </tr>
</table>

------------------------------------------------------------------------


# ⚙ 개발 목적 & 학습 포인트

-   Activity/Intent 구조 학습
-   RecyclerView + Adapter 기반 리스트 UI
-   Room 기반 영구 데이터 저장
-   MVVM 일부 적용
-   Android Material Components 활용
-   실무 확장 가능 구조 설계

------------------------------------------------------------------------

# ✨ 오픈 미션에서 배운 점

- Kotlin Android라는 낯선 기술 스택을 빠르게 분석하고 프로젝트에 적용
- Room + ViewModel + Repository 구조를 직접 설계하며 MVVM 감각 확보
- RecyclerView·Adapter 패턴에 대한 이해 심화
- UI/로직 분리를 통한 유지보수성 향상
- Git commit 단위의 기능별 관리, 문서화 역량 상승
- 단순 구현이 아닌 **“설계 → 책임 분리 → 확장 가능성 고려”** 의 사고 정착

------------------------------------------------------------------------
