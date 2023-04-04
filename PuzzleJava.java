import java.util.*;

public class PuzzleJava {

  Random randMachine = new Random();

  public ArrayList<Integer> getTenRolls(){
    int max =20;
    int min = 1;
    ArrayList<Integer> rolls = new ArrayList<Integer>();
    for (int i=0; i<10;i++){
      rolls.add(randMachine.nextInt(max-min+1)+min);
    }
    return rolls;
  }

  public char getRandomLetter(){
    char[] myAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int min = 0;
    int max = 25;
    char randomLetter = myAlphabet[randMachine.nextInt(max-min+1)+min];
    return randomLetter;
  }

  public String generatePassword(){
    
    char[] myPasswordChars = new char[8];
    for (int i=0; i<8; i++){
      myPasswordChars[i] = getRandomLetter();
    }
    String myPassword = String.valueOf(myPasswordChars);
    return myPassword;
  }

  public ArrayList<String> getNewPasswordSet(int numOfPasswords){
    ArrayList<String> passwords = new ArrayList<String>();
    for(int i = 0; i<numOfPasswords;i++){
      passwords.add(generatePassword());
    }
    return passwords;
  }

}