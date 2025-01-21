import logo from './logo.svg';
import './App.css';
import Firstcomponent from './firstcomponent';
import Secondcomponent from './component/secondcomponent';
import Classcomponent from './component/classcomponent';
import Expression from './component/Expression';
import PropsFunction from './component/PropsFunction';

import defaultpropsOldV from './component/defaultpropsOldV';
import MultipleC from './component/MultipleC';
import { Child1 } from './component/MultipleC';
import { Child2 } from './component/MultipleC';
function App() {
  return (
    <div className="App">
    
    <Firstcomponent/>
    <Secondcomponent/>
    <Classcomponent/>
    <Expression />
    {/* <PropsFunction t="Tejas GB"/>
    <PropsFunction t1=" full stack webdev"/>
    <PropsFunction ts="Tej"/>
    <defaultpropsOldV msg="props xyzx"/> */}
    <defaultpropsOldV />
    <defaultpropsOldV msg="props"/>
    <MultipleC/>
    <Child1/>
    <Child2/>
    </div>
  );
}

export default App;
