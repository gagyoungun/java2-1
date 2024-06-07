# 가경건 학번 202330101

## 6월 07일
내용정리

▶ 스윙 컴포넌트 그리기
GUI플랫폼에서 컴포넌트는 스스로 자신의 모양을 그린다.
paintComponent()의 오버라이딩 하면 원하는 모양을 그릴 수 있다.

▶ Graphics
의 기능  색상, 문자열, 도형그리기, 도형 칠하기 ,이미지, 클리핑

```java
void drawString(String str, int x, int y) 
// x, y 좌표에 문자열을 출력해!
```

색을 표현하는 클래스 rgb로 구성됨
```java
Color (int r, int g, int b) 
Color(int rgb)
```

▶ 도형그리기와 칠하기
```java
void drawLine(int x1, int y1, int x2, int y2)
//x1, y1 -> x2, y2까지의 선을 그린다.
void drawOval(int x, int y, int w, int h)
//(x, y)에서 w x h크기의 사각형에 내접하는 타원을 그린다.
void drawRect(int x, int y, int w, int h)
//(x, y)에서 w x h 크기의 사각형을 그린다.
void drawRoundRect(int x, int y, int w, int h, int arcWidth, int arcHeight)
//(x, y)에서 w x h 크기의 사각형을 그리되, 4모서리는 arcWidth,arcHeight를 이용해 원호를 그린다.
```

▶ 스레드와 운영체제
스레드란 운영체제에 의해 관리 되는 하나의 작업 혹은 데스크를 말하며,
스레드=프로세스와 같은 개념.

▶ 멀티스레딩(multi-threading):

멀티스레딩은 하나의 애플리케이션이 여러 작업을 동시에 수행할 수 있도록 여러 쓰레드를 사용하는 기법
예를 들어, 웹 브라우저는 하나의 쓰레드를 사용하여 사용자 입력을 처리하고, 다른 쓰레드를 사용하여 페이지를 로드하며, 또 다른 쓰레드를 사용하여 비디오를 재생할 수 있습니다.

하나의 프로그램이 돌 때 여러 개의 스레드를 동시에 하는 것

▶ 스레드 객체 생성 
```java
Thread th = new Thread(new TimerRunnable());

th. start();
//쓰레드 시작
```

▶ 멀티스레드 프로그램 작성 시 주의점
다수의 스레드가 공유 데이터에 동시에 접근하는 경우

▶ 스레드 동기화(Thread Synchronization)
스레드 동기화는 여러 스레드가 공유 자원에 접근할 때 그 접근을 제어하는 메커니즘입니다. 동기화 기법을 사용하면 경합 조건을 방지하고,
자원의 일관성을 유지할 수 있습니다.

▶ synchronized 블록
사용하면 특정 코드 블록을 하나의 스레드만 실행할 수 있게 하여 경합 조건을 방지하고, 데이터 일관성을 유지할 수 있습니다.
```java
synchronized (lockObject) {
    // 동기화가 필요한 코드
}
```

▶ wait()-notify()를 이용한 스레드 동기화

wait() 메서드
기능: wait() 메서드는 스레드가 해당 객체의 모니터 락(Monitor Lock)을 해제하고 대기 상태로 들어가도록 만듭니다. 스레드는 다른 스레드가 notify() 또는 notifyAll() 메서드를 호출하여 대기 중인 스레드를 깨울 때까지 기다립니다.

notify() 메서드
기능: notify() 메서드는 해당 객체의 모니터 락을 소유하고 있는 스레드 중 하나를 깨웁니다. 깨어난 스레드는 대기 상태에서 실행 가능한 상태로 전환됩니다.
사용법: notify() 메서드도 반드시 synchronized 블록 내에서 호출되어야 합니다.

## 5월 31일
내용정리

▶ 스윙 컴포넌트 소개

스윙(Swing) 컴포넌트는 자바 프로그래밍에서 그래픽 사용자 인터페이스(GUI)를 구축하는 데 사용되는 라이브러리
    JFrame, JPanel, JButton, JTextField, JLabel, JComboBox, JCheckBox이 있다.

○ 컴포넌트 모양과 관련된
```java
void setForeground(Color) //전경색 설정
void setBackgroung(Color) //배경색 설정
void setOpaque(Color) //불투명성 설정
void setFont(font) //폰트 설정
Font getRont()//폰트 리턴
```

○ 컴포넌트 상태와 관련된 메소드
```java
void setEnabled(boolean)  //컴포넌트 활성화/비활성화
void setVisible(boolean) //컴포넌트 보이기/숨기기
boolean isVisible() //컴포턴트의 보이는 상태 리턴
```

○ 컴포넌트 위치와 크기에 관련된 메소드
```java
int getWidth() //폭 리턴
int getHeight() //높이 리턴
int getX() //x 좌표 리턴
int getY() //y 좌표 리턴 
Point getLocationOnScreen() //스크린 좌표상에서의 컴포넌트 좌표
void setLocation(int, int) //위치지정
void setSize(int, int) //크기저장
```
○ 컨테이너를 위한 메소드
```java
Component add(Component)  //자식 컴포넌트 추가
void remove(Component) //자식컴포넌트 제거
void removeALL()   //모든 자식 컴포넌트 제거
Component[] getComponents() //자식컴포넌트 배열 리턴
Container getParent()  //부모 컨테이너 리턴
Container getTopLevelAncestor() //최상위 부모 컨테이너 리턴
```


▶ JButton으로 버튼 만들기
```java
JButton()  //빈 버튼
JButton(Icon image) //이미지 버튼
JButton(String text)//문자열 버튼
JButton(String text, Icon image)//문자열과 이미지 모두 가진 버튼
```

-normalIcon
버튼이 보통 상태로 있을 때 출력되는 디폴트 이미지, setIcon(Icon image)를 통해 설정

-rolloverIcon
버튼에 마우스가 올라가면 출력되는 이미지, setRolloverIcon(Icon image)를 통해 호출

-pressedIcon
마우스 버튼이 눌러져 있는 동안 출력되는 이미지, setPressedIcon(Icon image)를 호출하여 설정


▶ JCheckBox 체크박스 만들기
```java
JCheckBox() //빈 체크박스
JCheckBox(Icon image) //이미지 체크박스
JCheckBox(Icon image, boolean selected) //이미지 체크박스
JCheckBox(String text, Icon image) //문자열과 이미지를 가진 체크박스
JCheckBox(String text, Icon image, boolean selected) //문자열과 이미지 체크박스
-selected: true이면 선택 상태로 초기화
```

▶ JTextField
한 줄의 문자열을 입력받는 창(텍스트필드)을 만들 수 있다.
```java
JTextField() //빈 텍스트필드
JTextField(int cols)  //입력 창의 열의 개수가 cols개인 택스트필드
JTextField(String text) //text 문자열로 초기화된 택스트필드
JTextField(String text, int cols) //입력 창의 열의 개수는 cols개이고 text문자열로 초기화된 택스트필드
```

▶ JTextArea
여러 줄의 문자열을 입력받는 창(텍스트영역)을 만들 수 있다.
```java
JTextArea() //빈 텍스트영역
JTextArea(int rows, int cols)  //입력 창의 rows x cols개의 문자 크기인 택스트영역
JTextArea(String text) //text 문자열로 초기화된 택스트영역
JTextArea(String text, int rows, int cols) //입력 창의 열의 개수는  rows x cols개의 문자크기이며 text 문자열로 초기화된 택스트영역
```

▶ JList<E>
데이터를 표시하고 선택할 수 있는 목록
```java
JList<E>() //빈 리스트
JList<E>(Vector listData) //벡터로부터 아이템을 공급받는 리스트
JList<E>(object [] ListData) //배열로 부터 아이탬을 공급받는 리스트
```

▶ JComboBox<E>
텍스트필드, 버튼, 드롭다운 리스트가 있는 박스여.
```java
JComboBox<E>() //빈 콤보박스
JComboBox<E>(Vector items) //벡터로부터 아이템을 공급받는 콤보박스
JComboBox<E>(object [] items) //배열로 부터 아이탬을 공급받는 콤보박스
```

▶ 메뉴 만들기
메뉴(JMenu), 메뉴바(JMnuBar), 메뉴아이템(JMenuItem), 분리선 
```java
1. JMenuBar mb = new JMenubar(); //메뉴바 mb생성

2. JMenu screenMenu = new JMenu("Screen") //Screen 메뉴 생성
   mb.add(screenMenu); //screen메뉴삽입

3. screenMenu.add(new JMenuItem("Load"));  
   screenMenu.add(new JMenuItem("Hide"));
   screenMenu.add(new JMenuItem("ReShow"));
   screenMenu.addSeparator(); //분리선
   screenMenu.add(new JMenuItem("Exit"));

4.frame.setJMenuBar(mb); //프레임일 붙친다.
```

▶ 입력 다이얼로그
```java
String name = JOptionPane.showInpuDialog("이름을 입력하세요");
//name에 ~~ 확인하면
//취소 버튼이나 , 입력없이 다이얼로그가 닫히면 null 리턴
```


## 5월 24일
내용정리

▶ 이벤트 기반 프로그래밍

어떤 일이 발생하면 프로그램이 자동으로 대응하도록 하는 방식

이벤트 기반 GUI 프로그래밍은 사용자의 입력이나 시스템의 변화에 따라 프로그램이 동작하는 방식입니다. 즉, 프로그램은 미리 정의된 이벤트를 처리하고, 이벤트가 발생하면 이에 맞는 코드를 실행하여 사용자와의 상호 작용을 구현합니다.
            이벤트 소스 -> 이벤트 객체 -> 이벤트 리스너 -> 이벤트 분배 스레드

▶ 이벤트 객체
이벤트 객체가 포함하는 정보
○ 이벤트 종류와 이벤트 소스
 이벤트가 발생한 화면과 


▶ 이벤트 리스너
```java
interface MouseListener {
    public void mousePressed(MouseEvent e);     //마우스가 눌러지는 순간
    public void mouseReleased(MouseEvent e);    //눌러진 마우스 버튼이 떼어지는 순간
    public void mouseClicked(MouseEvent e);     //마우스가 클릭되는 순간
    public void mouseEntered(MouseEvent e);     //마우스가 컴포넌트 위에 올라가는 순간
    public void mouseExited(MouseEvent e);      //마우스가 컴포턴트 위에 내려오는 순간
}
```
익명클래스(anonymous class), 어댑터 클래스

▶ Key 이벤트와 KeyListener

Key 이벤트는 사용자가 키보드를 누르거나 눌렀을 때 발생하는 이벤트입니다. 키를 누르면 키 누름 이벤트가 발생하고, 키를 놓으면 키 놓음 이벤트가 발생합니다. 또한, 특정 키를 누르고 있을 때 지속적으로 발생하는 키 누르기 이벤트도 있습니다.

KeyListener는 키 이벤트를 처리하는 데 사용되는 Java 인터페이스입니다. KeyListener를 구현하는 클래스는 keyPressed(), keyReleased(), keyTyped() 메서드를 오버라이딩해야 합니다. 각 메서드는 각각 키 누름, 키 놓음, 키 입력 이벤트가 발생했을 때 호출됩니다.

▶ Mouse 이벤트와 MouseListener, MouseMotionListener

Mouse 이벤트는 사용자가 마우스를 클릭하거나 움직일 때 발생하는 이벤트입니다. 마우스를 클릭하면 마우스 클릭 이벤트가 발생하고, 마우스를 움직이면 마우스 움직임 이벤트가 발생합니다. 또한, 마우스 버튼을 누르고 있으면 지속적으로 발생하는 마우스 드래그 이벤트도 있습니다.

MouseListener는 마우스 이벤트를 처리하는 데 사용되는 Java 인터페이스입니다. MouseListener를 구현하는 클래스는 mousePressed(), mouseReleased(), mouseClicked(), mouseEntered(), mouseExited() 메서드를 오버라이딩해야 합니다. 각 메서드는 각각 마우스 버튼 누름, 마우스 버튼 놓음, 마우스 클릭, 마우스 포인터가 컴포넌트 영역에 들어옴, 마우스 포인터가 컴포넌트 영역을 벗어남 이벤트가 발생했을 때 호출됩니다.

MouseMotionListener는 마우스 움직임 이벤트를 처리하는 데 사용되는 Java 인터페이스입니다. MouseMotionListener를 구현하는 클래스는 mouseMoved() 및 mouseDragged() 메서드를 오버라이딩해야 합니다. 각 메서드는 각각 마우스 포인터가 움직였을 때, 마우스 버튼을 누른 채로 움직였을 때 호출됩니다.


## 5월 17일
내용정리

▶ 컨테이너와 배치

FlowLayout 
컨테이너에 삽입되는 순서대로 왼쪽부터 오른쪽으로 배치한다. 옆에 배치

```java
contentPane.setLayout((new FlowLayout(FlowLayout.LEFT,  30    ,   40   )));
                                     (왼쪽정렬        ,수평간격, 수직간격)
    contentPane.add(new JButton("add"));
    contentPane.add(new JButton("sub"));
    contentPane.add(new JButton("mul"));
    contentPane.add(new JButton("diw"));
    contentPane.add(new JButton("Calculate"));
```

BorderLayout
동,서,남,북,중앙에 따라 5개의 영역으로 나누고 지정된 장소에 배치하는 것

```java
contentPane.setLayout(new BorderLayout(   30  ,  20    ));
                                      (수평간격, 수직간격)
    contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
    contentPane.add(new JButton("add"), BorderLayout.NORTH);
    contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
    contentPane.add(new JButton("mul"), BorderLayout.EAST);
    contentPane.add(new JButton("div"), BorderLayout.WEST);
```

GridLayout
2차원 그리드로 나누고 컴포넌트가 들어오는 순서대로 좌우 위아래 순서로 배치

```java
contentPane.setLayout(new GridLayout(4,3, 10, 10));

for(int i=9; i>=0; i--){
    String text = Integer.toString(i);
    contentPane.add(new JButton(text));
    }
```

CardLayout
포개에 배치한다 카드를 겹치듯이
```java
contentPane.setLayout(null);

        JLabel la = new JLabel("hello");
        la.setLocation(130,50);
        la.setSize(200,20);
        contentPane.add(la);
```


AWT와 스윙컨테이너 | 디폴트 배치관리자 
---------|----------
 window,JWindow Frame, JFrame, Dialog, JDialog | BorderLayout
 Panel, JPanel, Applet, JApplet | FlowLayout


## 5월 3일
내용정리
▶ 컬렉션
컬렉션(Collection)은 자바에서 데이터를 저장하고 관리하기 위한 중요한 개념입니다
제네릭 기법으로 구현

객체만 가능, 기본 데이터 타입X

    컬렉션의 활용
     Vector<E>
    컬렉션에서 요소를 표시할 때 사용
    잘 이해가 안됨
    
    ArrayList<E>: 가변 크기 배열로 리스트를 구현.

    Iterator는 컬렉션을 순회하면서 요소에 접근하는 데 사용되는 인터페이스.
    LinkedList<E>: 노드로 연결된 리스트로 리스트를 구현.
    HashMap<K,V>: 해시맵으로 키-값 쌍을 저장하는 맵 구현.

▶ 자바의 GUI
GUI 사용자가 편리하게 입출력 할 수 있도록 그래픽 화면을 구성하고 입력받을 수 있는 인터페이스

▶ AWT Swing 패키지
AWT 거의 사용하지 않음
Swing 패키지 AWT 기반의 고급 컨포턴트 모두 스웅으로 재작성 순수 java언어로 구현
운영체제의 부담없음. 현재 자바의 GUI

▶ 컨테이너
컴포턴트를 포함할 수 있는 특별한 GUI 컴포넌트다. 

▶ 컨포넌트
GUI 객체이다.  컨테이너 위에 컨포넌트가 쌓는 느낌

▶ 스윙 프레임
```
import javax.swing.*;

public class Ex8_1 extends JFrame {
    public Ex8_1() {
        setTitle("getTitle()");
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[] args)
 {
    Ex8_1 frame = new Ex8_1();
 }    
}

```


## 4월 19일 강의
내용정리

▶추상클래스
인스턴스를 생성할 수 없다.
추상클래스가 인터페이스를 제공하면 그걸 상속 받는다. 
추상클래스에서 파생된 것이 인터페이스

▶인터페이스
인터페이스의 객체는 생성할 수 없다.
자바의 인터페이스는  interface 키워드를 사용하여 클래스를 선언하듯 선언한다.
대부분의 것을 다 허용, 멤버변수만 허용X

▶ 패키지의 개념과 필요성
파일의 중복 문제를 해결하기 위해서 안에 들어가 있는 것, 맞는 때 마다 따로 꺼내쓰는
package 키워드를 이용하여 클래스가 소속될 패키지 명을 선언한다.

▶ 모듈
패키지들을 담는 컨테이너로 부분 부분 담겨있는 것
목적 : 하드웨어가 열악한 소형IoT장치 

▶ 자바JDK에서 제공하는 패키지
.lang .util .io .awt .swing

▶ Object 클래스의 특징
아무 클래스도 상속 받지 않는 최상위 클래스이다. 

▶ Wrapper 클래스 개념
static 타입 8개의 타입들을 wrapper 클래스라 말한다.
Byte, Short, Integer, Long, Character, Float, Double, Boolean 

▶ 박싱과 언박싱
 ```java
    Integer ten = Integer.valueOf(10); //박싱
    int n = ten.intValue(); //언박싱
 ```
▶ Math 클래스
기본적인 산술 연앗을 수행하는 메소드 제공하는 클래스로서, static타입
 

## 4월 12일 강의
내용정리

▶static 멤버
클래스당 하나만 생성되는 멤버, 동일한 클래스의 모든 객체들이 공유함으로 클래스 멤버라고 불린다.

▶final
final 이붙으면 더이상 오버라이딩할 수 없음을 지정한다.

▶상속의 개념
extends 로 이어주는  슈퍼클래스 서브클래스가 있다.
 ```java
    class subclass extends superclass {
        String rkru;
        .......
    }
```
▶protected 접근지정
슈퍼 클래스의 디폴트 멤버에 대한 서브클래스의 접근
상속과 생성자
2개의 클래스 모두 생성자를 가지고 있다

▶업캐스팅(up)과 다운(down)캐스팅
(casting)은 타입변화를 말한다. 종으로 분류하는 것 

업캐스팅 생물 - 사람,동물
다운캐스팅 다시 각자로 되돌려 주는 것

▶메소드 오버라이딩
'새로운 것'이 들어와서 '원래 것'을 무력화 시켜 새 것을 이용함. 후입선출?
여러 클래스가 상속 받고 다형성을 실현 하는 도구.

▶오버로딩(overloading) 과 오버라이딩(overriding)

비교 요소 | 메소드 오버로딩 | 메소드 오버라이딩
---------|----------|---------
 선언 | 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성 | 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성
 관계 | 동일한 클래스 내 혹은 상속 관계 | 상속 관계
 목적 | 이름이 같은 여러개의 메소드를 중복 선언하여 사용의 편리성 향상 | 슈퍼 클래스에 구현된 메소드를 무시하고 서브 클래스에서 새로운 기능의 메소드를 재정의하고자 함.
 조건 | 메소드 이름은 반드시 동일함. 메소드의 인자의 개수나 인자의 타입이 달라야 성립 | 메소드의 이름, 인자의 타입, 인자의 개수, 리턴 타입 등이 모두 동일하여야 성립
 바인딩 | 정적 바인딩. 컴파일 시에 중복된 메소드 중 호출되는 메소드 결정 | 동적 바인딩. 실행 시간에 오버라이딩된 메소드 찾아 호출


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

▶ static 멤버 선언
    


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

