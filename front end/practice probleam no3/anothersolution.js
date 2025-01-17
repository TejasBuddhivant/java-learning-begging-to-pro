function Calculate()
{
  const form=document.forms["form1"];
  
  const num1=form["num1"].value;
  const num2=form["num2"].value;
  const op=form["op"].value;

  let n1=parseInt(num1);
  let n2=parseInt(num2);

  const result=document.getElementById("result");

  switch(op){
    case "add": result.innerHTML="Addition is :"+(n1+n2); break;
    case "sub": result.innerHTML="Subtraction is :"+(n1-n2); break;
    case "mult": result.innerHTML="Multiplication is :"+(n1*n2); break;
    case "div": result.innerHTML="Division is :"+(n1/n2); break;
  }
}