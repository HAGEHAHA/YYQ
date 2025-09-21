public class StudentTest{
  public static void main(String[]args){
    Student g1=new Student("0901","a",17);
    Student g2=new Student("0902","b",18);
    Student g3=new Student("0903","c",19);

   Student[]arr=new Student[3];
   arr[0]=g1;
   arr[1]=g2;
   Student g4=new Student("0907","d",20);
   if(contains(arr,g4)){
      System.out.println("Ñ§ÉúÒÑ´æÔÚ");
   }
   else{
    int count=result(arr);
      if(count==arr.length){
        Student[]newArr=new Student[arr.length+1];
        for(int i=0;i<arr.length;i++){
          newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=g4;
        System.out.println(newArr[newArr.length-1]);
      }
      else{
        arr[count]=g4;
        System.out.println(arr[arr.length-1]);
      }
    }
   }
  public static int result(Student[]arr){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(i!=0){
          count++;
      }
    }
    return count;

  }


   public static boolean contains(Student []arr,Student g4){
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=null){
      Student stu=arr[i];
      String id=stu.getId();
      if(g4.getId()==stu.getId()){
        return true;
      }
    }
  }
    return false;

   }
  }
