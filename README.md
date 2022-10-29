# Spring-5
SpringBook5 for recap about Spring :) ⚗🧪🍃🌺  
References author 최범균  
Images exist in Issues  

### 📝 Terms
  - Spring Data
  - Spring Security
  - Spring Batch
  - Transitive Dependency(의존 전이)
  - Cache

  1. Spring Data
     - 적은 양의 코드로 데이터 연동을 처리할 수 있도록 도와주는 프레임워크이다. JPA, 몽고DB, Redis 등 다양한 저장소 기술을 지원한다.

  2. Spring Security
     - 인증/인가와 관련된 프레임워크로서 웹 접근 제어, 객체 접근 제어, DB - 오픈 ID - LDAP 등
     다양한 인증 방식, 암호화 기능을 제공한다.
  
  3. Spring Batch
     - 로깅/추적, 작업 통계, 실패 처리 등 배치 처리에 필요한 기본 기능을 제공한다.

  4. Transitive Dependency(의존 전이)
     - 의존한 아티팩트가 또 다시 의존하고 있는 다른 아티팩트가 있다면 그 아티팩트도 함께 다운로드한다. 메이븐은 의존하는 대상뿐만 아니라 의존 대상이 다시 의존하는 대상도 함께 다운로드한다. 이렇게 의존 대상이 다시 의존하는 대상까지도 의존 대상에 포함하기 때문에 이를 의존 전이(Transitive Dependency)라고 한다.

  5. Spring ApplicationContext Hierarchy
     - AnnotationConfigApplicationContext : 자바 애노테이션을 이용한 클래스로부터 객체 설정 정보를 가져온다.
     - GenericXmlApplicationContext : XML로부터 객체 설정 정보를 가져온다.
     - GenericGroovyApplicationContext : 그루비 코드를 이용해 설정 정보를 가져온다.

  6. Cache(캐시)
     - 캐시는 데이터 값을 복사해 놓은 임시 장소를 가리킨다. 보통 조회 속도 향상을 위해 캐시를 사용한다. 예를 들어 데이터베이스에서 데이터를 조회하는 경우를 생각해보자. 데이터베이스에서 데이터를 읽어오는데 10밀리초(1밀리초는 0.001초)가 걸린다면 메모리에 있는 데이터를 접근할 때에는 1밀리초도 안 걸릴 것이다. DB에 있는 데이터 중 자주 조회하는 데이터를 메모리를 사용하는 캐시에 보관하면 조회 속도를 향상시킬 수 있다.
