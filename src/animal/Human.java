package animal;

import animal.Thinkable;

public class Human extends Animal {

 // フィールド
    private String hobby; // 趣味

    // 引数なしのコンストラクタ
    public Human() {
    }

    // 引数ありのコンストラクタ
    public Human(String fullName, int age, String hobby) {
        super.setfullName(fullName);
        super.setAge(age);
        this.setHobby(hobby);
    }

    // 趣味のメソッド
     public void think() {
        System.out.println( "私は"+ this.getHobby() + "について考えています。");
    }

    //getter
    public String getHobby() {
        return hobby;
    }

    //setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}//--class Human

