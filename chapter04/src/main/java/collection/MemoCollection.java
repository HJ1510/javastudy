package collection;

public class MemoCollection {

}

/* collection framework 자바 자료구조 라이브러리=>인터페이스 클래스
 * generic<> 지정 필요
 * 
 * 1.List 순서 o 중복 o
 * - ArrayList vs LinkedList (vs Vector)
 * -- List l = new ArrayList() ** 주로 사용
 * 리스트를 배열로 구현 삭제 삽입이 많이 일어나는 데이터의 경우에는 사용하지 않는 것이 좋음
 * -- List l = new LinkedList()
 * 참조 임의의 장소에 삭제삽입에 용의
 * 자료는 객체로 저장됨
 * -- Vector
 * 배열기반 리스트
 * 
 * 2.Set 순서 x 중복 x => 중복제거에 활용 가능
 * - HashSet에선 동일성x 동질성 체크를 함
 * 
 * 3.Map
 * 
 * 
 */

/* Stack, Queue
 * 1.Stack
 * push, pop 
 * Last In First Out/First In Last Out 후입선출
 * 
 * 2.Queue
 * First In First Out 선입선출
 * KAFKA, RabbitMQ등의 소프트웨어
 */
