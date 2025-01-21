function Expression()
{
    const name= "Tejas G B";
    let arr=[23,42,556,542,12];
    let x=20 ,b=19;
    return(<>
    <h1>Hello world my Name is :{name}</h1>
    <h1>i have two value X={x} and Y={b}</h1>
    <h2>

        {
            arr.map((num)=>
            <li>{num}</li>
            )
        }
    </h2>
    </>)
}
export default Expression;