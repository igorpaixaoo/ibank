import Background from "../components/BackgroundIBank";
import Button from "../components/Button";
import HeaderMenu from "../components/HeaderMenu";
import { Menu } from "../components/Menu";
import "../styles/IBankStyle.css"

import { Link } from "react-router-dom";

const IBank = () =>{
    return(
        <div className="App">
            <Background></Background>
            <HeaderMenu></HeaderMenu>
            <div className='abrirConta'>
                <Menu></Menu>
                <h1>Abra sua Conta</h1>
                <Link to="/criar-conta"><Button id="btnAbrirConta" text="Clique aqui"></Button></Link>
            </div>
        </div>
    )
}

export default IBank;