
class StringCompareTo{
  public static void main(String args[]){
    String arr[] = {"aaaa","fffff","eeee","ssss","ccccc"};
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[j].compareTo(arr[i])<0){
          String temp = arr[j];
          arr[j] = arr[i];
          arr[i] =temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
    }
  }
}
