public class CombinedProgram {
public static void main(String[] args){
      // 1. 간단한 계산기 기능 호출
    performCalculations();

      // 2. 나이 비교 기능 호출
    compareAges(25, 30);

      // 3. 논리 연산자 활용 기능 호출
    performLogicalOperations();
}

  // 1. 간단한 계산기 기능을 수행하는 메소드
public static void performCalculations(){
    int num1 = 15;
    int num2 = 4;

      // 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 계산
    int add = num1 + num2;
    int minus = num1 - num2;
    int mul = num1 * num2;
    int div = num1 / num2;
    int remainder = num1 % num2;

      // 결과 출력
    System.out.println("=== 간단한 계산기 ===");
    System.out.println("덧셈: " + add);
    System.out.println("뺄셈: " + minus);
    System.out.println("곱셈: " + mul);
    System.out.println("나눗셈: " + div);
    System.out.println("나머지: " + remainder);
    System.out.println();
}

  // 2. 나이 비교 기능을 수행하는 메소드
public static void compareAges(int age1, int age2) {
    System.out.println("=== 나이 비교 ===");
    if(age1 > age2){
        System.out.println("나이1이 더 많습니다.");
    } else if(age1 < age2){
        System.out.println("나이2가 더 많습니다.");
    } else {
        System.out.println("두 사람의 나이가 같습니다.");
    } 
    System.out.println();
}

  // 3. 논리 연산자 활용 기능을 수행하는 메소드
public static void performLogicalOperations(){
    boolean hasLicense = true;
    boolean isOldEnough = false;

      // 논리 연산자 사용
      boolean canDrive = hasLicense && isOldEnough; // AND 연산
      boolean canParty = hasLicense || isOldEnough; // OR 연산
      boolean cannotDrive = !isOldEnough;           // NOT 연산

      // 결과 출력
    System.out.println("=== 논리 연산자 활용 ===");
    System.out.println("운전 가능 여부 (AND): " + canDrive);
    System.out.println("파티 참석 가능 여부 (OR): " + canParty);
    System.out.println("운전 불가능 여부 (NOT): " + cannotDrive);
    System.out.println();
}
}
