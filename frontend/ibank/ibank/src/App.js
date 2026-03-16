import {BrowserRouter, Routes, Route} from "react-router-dom";

import './App.css';
import Button from './components/Button';
import Header from './components/Header';
import IBank from "./pages/IBank";
import CreateAccount from "./pages/CreateAccount"
import LoginAccount from "./pages/LoginAccount"

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<IBank/>}/>
          <Route path="/criar-conta" element={<CreateAccount/>}/>
          <Route path="/acessar-conta" element={<LoginAccount/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
