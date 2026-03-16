import Button from "./Button";
import "../styles/Header.css"
import { Link } from "react-router-dom";

import imgIBank from "../util/ibank.png"

const HeaderMenu = () =>{
    return(
        <div className="header">
            <Link to="/"><img src={imgIBank} width="200px"></img></Link>
            <Link to="/acessar-conta"><Button id="btnAccessAccount" text="ACESSE SUA CONTA"></Button></Link>
        </div>
    )
}

export default HeaderMenu;