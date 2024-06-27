class Arrayrev{

static void reverse(int arr[]){
int first = 0;
int last = arr.length-1;
while(first<last){
int temp =arr[first];
arr[first]=arr[last];
arr[last]=temp;
first++;
last--;
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}

} 
public static void main(String... arg){

int arr[]= {1,2,3,4,5,5,6,};
System.out.println("array before reverseing ");

for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
System.out.println("array after reverseing ");
reverse(arr);


}
}