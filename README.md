🚀 건대 어때
<div align="center">

건국대학교 글로컬 캠퍼스 주변의
버스 도착 정보 + 편의시설 탐색 + 즐겨찾기 관리 기능을 제공하는 종합 생활 편의 애플리케이션

</div>


🌟 소개

'건대 어때'는
건국대학교 글로컬 캠퍼스 학생들을 위해 제작된 생활 밀착형 Android 애플리케이션으로, 다음 기능을 제공합니다:

정문/후문 + 주요 정류장 버스 도착 정보 조회

식당/카페/간식 등 편의시설 카테고리 탐색

즐겨찾기(Room DB) 기반 편의시설 저장/관리

직관적인 UI/UX(ViewBinding + Material Design)

RecyclerView 기반 목록 UI 및 Activity 간 네비게이션

해당 프로젝트는 Kotlin + Jetpack 기반으로 설계되었으며,
안드로이드 실무에 필요한 구성 요소들을 학습하기 좋은 구조로 이루어져 있습니다.


🔥 주요 기능 하이라이트


🚍 실시간 버스 정보

정문/후문/기숙사/주요 정류장 선택 후 도착 정보 표시

TAGO(교통정보시스템) API 기반 데이터 처리 구조에 맞춘 설계

BusCategory > BusArrivalActivity 구조

RecyclerView 어댑터 기반 정렬된 UI 표시

추후 네트워크 모듈 추가 확장성이 높도록 설계됨

🍽️ 편의시설 카테고리 탐색

한식 / 중식 / 일식 / 카페 / 간식 / 고깃집 / 패스트푸드 등 카테고리를 제공

각 카테고리를 클릭하면 해당 목록 Activity로 이동

FacilityListActivity에서 시설명/카테고리 기반 깔끔한 리스트 UI 표시

향후 상세 페이지 및 지도 API 연동 구조로 확장 가능하게 설계

⭐ 즐겨찾기 기능 (Room 기반 영구 저장)

사용자가 관심 있는 시설을 Favorite으로 저장

Room Database + DAO + ViewModel + Repository 패턴 적용

앱 종료 후에도 데이터 유지

FavoriteListActivity에서 전체 목록 확인

확장: 즐겨찾기 삭제·정렬·필터 기능을 추가하기 쉬운 구조



🧩 기술 스택 및 아키텍처

📌 사용 기술
영역	기술
Language	Kotlin
UI	ViewBinding, Material Components, RecyclerView
Data	Room Database, LiveData, Repository
Architecture	MVVM 일부 적용
Build	Gradle Kotlin DSL (build.gradle.kts)
UI Layout	XML 기반 레이아웃, Drawable, Shape 기반 버튼 스타일
🧱 아키텍처 개요

전체 앱은 Activity 기반 구조 + MVVM 일부 적용된 형태로 구성된다.

MainActivity
├── BusCategoryActivity
│     └── BusArrivalActivity
├── FacilityCategoryActivity
│     └── FacilityListActivity
└── FavoriteListActivity

Room 구조
FavoriteEntity
FavoriteDao
FavoriteRepository
FavoriteViewModel

📱 실행 방법
▶ Android Studio (권장)

Android Studio 실행

File → Open 후 프로젝트 선택

에뮬레이터 실행 또는 휴대폰 USB 연결

상단의 Run ▶ 버튼 클릭

▶ CLI 실행
./gradlew assembleDebug

adb install -r app/build/outputs/apk/debug/app-debug.apk

adb shell am start -n com.konkuk.ottae/.MainActivity


ADB 에러 시:

adb devices


또는 플랫폼 도구 경로 추가:

C:\Users\kms10\AppData\Local\Android\Sdk\platform-tools

📂 폴더 구조
app/
└── src/main
├── java/com/konkuk/ottae/
│    ├── bus/            # 버스 관련 Activity/Adapter/Data
│    ├── facility/       # 편의시설 카테고리/UI/Adapter
│    ├── favorite/       # Room DB + Favorite 기능
│    ├── AppDatabase.kt
│    └── MainActivity.kt
│
├── res/layout/          # Activity 및 item 레이아웃 XML
├── res/drawable/        # UI 버튼/백그라운드/Icon
├── res/values/          # colors, strings, themes, styles
└── AndroidManifest.xml

⚙️ 개발 목적 & 학습 포인트

이 애플리케이션을 통해 다음을 학습할 수 있다:

Android 앱 구조 분석 능력

Activity 간 Intent 데이터 전달 구조

RecyclerView + Adapter + ViewHolder 패턴

Room 기반 DB 설계 및 MVVM 연결

Material UI 컴포넌트 활용

Gradle Kotlin DSL 기반 설정

실제 서비스로 확장 가능한 구조 설계

🌈 향후 확장 기능 (추천)

Retrofit 기반 실시간 버스 API 연동

Kakao / Naver 지도 API로 편의시설 위치 표시

Hilt 기반 DI 구조로 리팩토링

Coroutine + Flow 적용

Dark Mode UI 적용

무한 스와이프 또는 검색 기능 추가