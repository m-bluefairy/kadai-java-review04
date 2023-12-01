package animal;

public class Animal {
    // フィールド
    private String fullName; //名前
    private int age; //年齢

    // 引数なしのコンストラクタ
    public Animal() {
    }

    // 引数ありコンストラクタ
   public Animal(String fullName, int age) {
       this.fullName = fullName;
       this.age =age;
   }

   // getter
   public String getfullName() {
       return fullName;
   }

   // setter
   public void setfullName(String fullName) {
       this.fullName = fullName;
   }

   // getter
   public int getAge() {
       return age;
   }

   // setter
   public void setAge(int age) {
       this.age = age;
   }


   public void say() {
       System.out.println( this.getfullName() + "です。"+ this.getAge() + "歳です。");
   }

}//--class Animal
