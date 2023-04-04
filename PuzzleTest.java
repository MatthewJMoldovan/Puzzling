public class PuzzleTest{
  public static void main(String[] args){

    PuzzleJava puzzleTest = new PuzzleJava();

    System.out.println(puzzleTest.getTenRolls());
    
    System.out.println(puzzleTest.getRandomLetter());

    System.out.println(puzzleTest.generatePassword());

    System.out.println(puzzleTest.getNewPasswordSet(8));

  }
}