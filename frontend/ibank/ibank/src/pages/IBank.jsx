import Button from "../components/Button";
import Header from "../components/Header";

import { Link } from "react-router-dom";

const IBank = () =>{
    return(
        <div className="App">
            <Header></Header>
            <div className=''>
                <h1>Abra sua conta</h1>
                <Link to="/criar-conta"><Button id="btnAbrirConta" text="Clique aqui"></Button></Link>
            </div>
        </div>
    )
}

export default IBank;