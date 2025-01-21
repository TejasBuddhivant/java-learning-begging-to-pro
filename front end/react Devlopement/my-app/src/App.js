import logo from './logo.svg';
import './App.css';
import Firstcomponent from './firstcomponent';
import Secondcomponent from './component/secondcomponent';
import Classcomponent from './component/classcomponent';
import Expression from './component/Expression';
function App() {
  return (
    <div className="App">
    
    <Firstcomponent/>
    <Secondcomponent/>
    <Classcomponent/>
    <Expression/>
    </div>
  );
}

export default App;
