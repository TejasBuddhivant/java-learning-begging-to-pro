

function defaultpropsOldV(props){
  return (
    <div>
        
        <h1>this is example of default props {props.msg} .</h1>
    </div>
  );
}

defaultpropsOldV.defaultProps={
    msg:"this is the default props"
};

export default defaultpropsOldV;