
import { useState } from "react"
import Button from "../components/Button.jsx"

import { api } from "../api/Api.js"

const LoginAccount = () =>{
    const [accountValue, setAccountValue] = useState("")
    const [passwordValue, setPasswordValue] = useState("")

    const clickBtnLogin = () =>{
        alert(api.get("/login?account=" + accountValue + "&password=" + passwordValue))
    }

    return(
        <div>
            <div className="divInputsLogin">
                <input id="inputAccount" placeholder="Número da conta" value={accountValue} onChange={(e) => setAccountValue(e.target.value)}></input>
                <input id="inputPassword" placeholder="Senha de 4 dígitos" value={passwordValue} onChange={(e) => setPasswordValue(e.target.value)}></input>
            </div>
            <Button id="btnLogin" text="Entrar na conta" onClick={clickBtnLogin}></Button>
        </div>
    )
}

export default LoginAccount;