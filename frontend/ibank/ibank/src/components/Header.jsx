import Button from "./Button";
import { Link } from "react-router-dom";

import imgIBank from "../util/ibank.png"

const Header = () =>{
    return(
        <div className="header">
            <Link to="/"><img src={imgIBank} width="200px"></img></Link>
        </div>
    )
}

export default Header;