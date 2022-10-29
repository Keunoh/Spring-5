# Spring-5
SpringBook5 for recap about Spring :) ⚗🧪🍃🌺

### 📝 Terms
  - Spring Data
  - Spring Security
  - Spring Batch
  - Transitive Dependency(의존 전이)

  1. Spring Data
     - 적은 양의 코드로 데이터 연동을 처리할 수 있도록 도와주는 프레임워크이다. JPA, 몽고DB, Redis 등 다양한 저장소 기술을 지원한다.

  2. Spring Security
     - 인증/인가와 관련된 프레임워크로서 웹 접근 제어, 객체 접근 제어, DB - 오픈 ID - LDAP 등
     다양한 인증 방식, 암호화 기능을 제공한다.
  
  3. Spring Batch
     - 로깅/추적, 작업 통계, 실패 처리 등 배치 처리에 필요한 기본 기능을 제공한다.

  4. Transitive Dependency(의존 전이)
     - 의존한 아티팩트가 또 다시 의존하고 있는 다른 아티팩트가 있다면 그 아티팩트도 함께 다운로드한다. 메이븐은 의존하는 대상뿐만 아니라 의존 대상이 다시 의존하는 대상도 함께 다운로드한다. 이렇게 의존 대상이 다시 의존하는 대상까지도 의존 대상에 포함하기 때문에 이를 의존 전이(Transitive Dependency)라고 한다.
     ![2022-10-29(maven_transitive_dependency)](https://user-images.githubusercontent.com/96904103/198826847-c2e86e92-f4d0-4051-b339-63ead228add5.png)

