import java.util.ArrayList;
class PrimeDirective {
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println("7 prime? " + pd.isPrime(7));
    System.out.println("28 prime? " + pd.isPrime(28));

    ArrayList<Integer> primes = pd.onlyPrimes(numbers);
    System.out.println("Primes in array: " + primes);
  }  
  public boolean isPrime(int number){
    for(int i = 2; i < number; i++){
        if(number % i == 0) return false;
    }
    if(number == 2) return true;
    if(number < 2) return false;
    return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<>();
    for(int number : numbers){
      if(isPrime(number)) primes.add(number);
    }
    return primes;
  }
}
