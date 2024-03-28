package HangmanGame;
/*
    FileReader 는 "한번에 한문자" 씩 데이터를 읽어온다. 따라서 큰 파일을 처리할 때는 상대적으로 느리다.
    BufferedReader 는 문자 입력 스트림으로부터 텍스트를 읽어 들이기 위해 버퍼링을 사용한다.
    버퍼링은 데이터를 임시 저장공간(Buffer) 에 저장했다가 한꺼번에 처리함으로써, 데이터 처리 효율성을 높인다.
    BufferedReader 는 FileReader 와 같은 다른 리더와 함께 사용되며, "한 번에 한 줄" 씩 데이터를 읽어들일 수 있게 해준다.

    BufferedReader br = new BufferedReader(new FileReader("example.txt"));

    -------------------------------------------------------------------------------------------------------
    println 을 사용했을 때 소수점 한자리로 표현하고 싶은 경우
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(1);

    nf.format();
    -------------------------------------------------------------------------------------------------------
    람다식 (Lambda Expression)
    Java 8부터 도입된 기능이다. 간결하게 함수를 나타내는 표현식으로, 익명함수(Anonymous Function)를 의미한다.
    단, 인터페이스는 단 하나의 추상 메소드만 가지고 있어야 한다.
 */
