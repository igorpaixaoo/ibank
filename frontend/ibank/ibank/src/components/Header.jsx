import Button from "./Button";
import "../styles/Header.css"
import { Link } from "react-router-dom";

import imgIBank from "../util/ibank.png"

const Header = () =>{
    return(
        <div className="header">
            <img src={imgIBank} width="200px"></img>
            <Link to="/acessar-conta"><Button id="btnAccessAccount" text="ACESSE SUA CONTA"></Button></Link>
        </div>
    )
}

export default Header;