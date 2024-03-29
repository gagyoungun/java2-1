# 가경건 학번 202330101

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

