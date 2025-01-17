function Calculate(){
    const form= document.forms["form1"];

    const num1= form["num1"].value;
    const num2= form["num2"].value;
    const num3= form["num3"].value;

    

    let n1=parseFloat(num1);
    let n2=parseFloat(num2);
    let n3=parseFloat(num3);

  const Simp =(n1*n2*n3)/100;

  const Result =document.getElementById("result");

  const PrincipleAmmount =document.getElementById("PrincipleAmmount");

  const TotalAmmount =document.getElementById("TotalAmmount");

  
  console.log(Simp);
  console.log(n1);
  console.log(TotalAmmount);
  
  Result.innerHTML="Simple Interest is :"+Simp+"<br>";
  PrincipleAmmount.innerHTML="Your Principle Ammount :"+n1+"<br>";
  TotalAmmount.innerHTML="Total Ammount is :"+(Simp+n1)+"<br>";
}