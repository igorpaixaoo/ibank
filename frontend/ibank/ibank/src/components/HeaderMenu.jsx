import Button from "./Button";
import "../styles/HeaderMenu.css"
import { Link } from "react-router-dom";

import imgIBank1 from "../util/ibank.png"
import imgIBank2 from "../util/ibank2.png"

const HeaderMenu = () =>{
    return(
        <div className="header">
            <Link to="/"><img src={imgIBank2} width="200px"></img></Link>
            <Link to="/acessar-conta"><Button id="btnAccessAccount" text="ACESSE SUA CONTA"></Button></Link>
        </div>
    )
}

export default HeaderMenu;