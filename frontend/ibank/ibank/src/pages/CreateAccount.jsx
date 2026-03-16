import { useState } from "react";
import Button from "../components/Button";
import Header from "../components/Header";
import "../styles/CreateAccountStyle.css"
import PostAccount from "../api/PostAccount";

const CreateAccount = () =>{
    const [name, setName] = useState("")
    const [nameMother, setNameMother] = useState("")
    const [email, setEmail] = useState("")
    const [cpf, setCpf] = useState("")
    const [maritalStatus, setMaritalStatus] = useState("")
    const [phone, setPhone] = useState("")
    const [profession, setProfession] = useState("")
    const [address, setAddress] = useState("")
    const [dateBirth, setDateBirth] = useState("")

    //função post
    const btnClickPost = () =>{
        //objeto do usuário para passar como parâmetro
        const user = {
            name: name,
            nameMother: nameMother,
            email: email,
            cpf: cpf,
            maritalStatus: maritalStatus,
            phone: phone,
            profession: profession,
            address: address,
            dateBirth: dateBirth
        }

        //criar post
        PostAccount(user)
    
    }

    return(
        <div className="createAccount">
            <Header></Header>
            <form id="form">
                <input id="nameForm" type="text" placeholder="Nome completo" value={name} onChange={(e) => setName(e.target.value)}/>
                <input id="nameMotherForm" type="text" placeholder="Nome de mãe" value={nameMother} onChange={(e) => setNameMother(e.target.value)}/>
                <input id="emailForm" type="email" placeholder="Email" value={email} onChange={(e) => setEmail(e.target.value)}/>
                <input id="cpfForm" type="text" placeholder="CPF" value={cpf} onChange={(e) => setCpf(e.target.value)}/>
                <div className="selectDiv">
                    <label>Estado civil:</label>
                    <select id="selectMaritalStatus" value={maritalStatus} onChange={(e) => setMaritalStatus(e.target.value)}>
                        <option>Selecione:</option>
                        <option>Solteiro(a)</option>
                        <option>Casado(a)</option>
                        <option>Viúvo(a)</option>
                    </select>
                </div>
                <input id="phoneForm" type="text" placeholder="Telefone" value={phone} onChange={(e) => setPhone(e.target.value)}/>
                <input id="professionForm" type="text" placeholder="Profissão" value={profession} onChange={(e) => setProfession(e.target.value)}/>
                <textarea id="addressForm" placeholder="Endereço" value={address} onChange={(e) => setAddress(e.target.value)}></textarea>
                <div className="dateBirthDiv">
                    <label>Data de nascimento:</label>
                    <input id="dateBirthForm" type="date" value={dateBirth} onChange={(e) => setDateBirth(e.target.value)}/>
                </div>
                <Button id="btnCreateAccount" text="Criar conta" onClick={btnClickPost}></Button>
            </form>

        </div>
    )
}

export default CreateAccount;