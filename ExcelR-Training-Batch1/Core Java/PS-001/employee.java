public class employee{
    int id;
    String firstName;
    String lastName;
    String address;

    public employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getfullName(){
        return firstName +' '+ lastName;
    }
    public static void main(String[] args){
        employee person = new employee("papani","Chetan");
        System.out.println("FullName:"+person.getfullName());
    }
}