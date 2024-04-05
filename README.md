# 가경건 학번 202330101

## 4월 5일 강의
내용정리
▶ 배열 생성, 배열이 너무 많은면 DB를 써.

▶ 메소드 리턴 타입
    주소만 리턴해 주는 것.
    배열에서의 치완은 주소를 바꿔줘.

▶ 예외처리
```java
    try{
        예외가 발생할 가능성이 있는 실행문(try문)
    }
    catch(처리할 예외 타입 선언) {
        예외 처리문
    }
    finally{
        finally 블록문(생략가능)
    }
```
▶ 자바특성
    객체지향언어

    캡슐화 객체를 캡슐로 싸서 내부를 볼 수 없게 하는것
    자바는 class를 이용해서 틀을 만들어주는 것
    그 안에 있는 것은 instance 라 한다.

    상속
     슈퍼클래스 -> 서브 클라스 (받아서 추가해)
     
    다형성
        메소드 오버라이딩
        메소드 오버로딩


▶ 객체 지향 언어의 목적
    소프트웨어 생명 주기 단축

클래스 = 객체의 설계도 혹은 특 [붕어빵 틀]
객체  = 클래스의 인스턴스 안에 있는 거 [팥붕, 슈붕, 피자붕]

▶ 생성자
생성자 이름은 클래스 이름과 동일
생성자는 여러 개 작성가능
객체를 생성할 때 1번만 호출
생성자는 리턴타입X

기본생성자-자동으로 컴파일러가 알아서 해줌
          추가할 필요가 없음. 뭐라도 앞에 있으면 오류가 생김.

▶ this 레퍼런스
this는 메스드에서 사용되며 현재 객체를 가르킴

▶ 객체배열

▶ 메소드
    = 함수다.
    캡슐화가 원칙이기에 class 밖에 있으면 안된다.

```java
    
    int n =10;
    increase(n); //기본 타입의 값이 전달되는 경우
    
   
    increase(pizza); //객체자체를 보내는 것
    
    //배열이 전달되는 경우도 있다.
```

▶ 객체의 소멸
가르키는 함수가 없는 레퍼런스는 사용하지 않기에 메모리 확보를 위해 바로바로 삭제함
```java
    a = new Person("이몽룡");
    b = new Person("성춘향");

    b=a;

    //b가 가르킨 new Person("성춘향")이 사라짐 ㅠㅠ
```
▶ 가비지컬렉션
    가용메모리가 일정 이하로 부족해 질때
    가비지컬렉션을 할 때는 실행을 잠시 멈추기에, 프로그램이 중지된 것 처럼 보임.
    실시간 처리 목적에는 부적합.



## 3월 29일 강의
내용정리

▶ 증감연산자 a++,a-- = a에 1를 적용하기 전에 값을 반환
            ++a,--a = a에 1를 적용하고 값을 반환

▶ 조건문 : 단순 If 문
```java
    if(n%2 ==0) {
        System.out.print(n);
        System.out.println("짝수입니다.");
    }
    if(score >= 80 && score <= 89 )
        System.out.println("학점은 B 입니다.");
```
▶ If else 문
```java
    if(score >= 90 ) {
        System.out.println("합격입니다.");
    }
    else
        System.out.println("괜찮아요! 할 수 있어요");
```
▶ switch문
```java
    switch(grade) {
    case 'A' :
        System.out.println("합격입니다.");
    case 'B' :
        System.out.println("좋아여");
    case 'C' :
        System.out.println("괜찮아요! 할 수 있어요");
    }
```
▶ 반복문
    1. for 문
    2. while 문
    3. do-while 문

    + continue: 다음 반복문으로 가고자 할때 , break:현재 반복문을 벗어나는 것

▶ 배열
```java
    int i[] = new int [10]
```
배열로 구성하면 데이터가 순차적으로 저장됨
## 3월 22일 강의
내용 정리

▶프로젝트만들기
ctrl shift p > java pro -> create java project pile -> 
ctul / => // 예제 2-1

▶식별자
특수문자 공백은 안됨 _,$는 예외
대소문자구별한다
첫번째 문자는 숫자 X
길이제한 없음

▶문자열
string 000="가경건";

▶상수선언 
선언시 초깃값지정
실행 중 값 변경 불가
final 키워드로 선언하며

▶var 키워드
타입을 생략하고 변수 선언 가능
컴파일러가 출ㄴ하여 변수 타입 결정


```java
public class Test {

    public static void main(String[] args) throws Exception{
    var foo = 200;
    var name = "woogie";
    System.out.printin(foo + name);
    }
}
```


## 3월 15일 강의
내용 정리

이번에는 올리지마!!

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello! VScode가 좋아여");
    }
```

