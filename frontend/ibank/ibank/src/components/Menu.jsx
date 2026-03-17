import { useEffect, useState } from "react"


export const Menu = () =>{
    const [h1, setH1] = useState("")
    const [p, setP] = useState("")

    const textsH1 = [
        "Um banco dinâmico, ágil, fácil e moderno.", 
        "Sua segurança é muito importante para nós!"
    ]

    const textsP = [
        "Aqui você conta com soluções para facilitar sua vida financeira...",
        "Com o melhor banco, sua segurança é o nosso lema"
    ]

    useEffect(() => {
        const interval = setInterval(() => {
            const textsH1Index = Math.floor(Math.random() * textsH1.length)
            const textPIndex = Math.floor(Math.random() * textsP.length)

            setH1(textsH1[textsH1Index])
            setP(textsP[textPIndex])
        }, 5000)

        return () => clearInterval(interval)
    }, [])


    return(
        <div>
            <h1>{h1}</h1>
            <p>{p}</p>
        </div>
    )

}