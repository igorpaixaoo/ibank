import { useEffect, useState } from "react";
import "../styles/Background.css";

import img1 from "../util/img1.jpg";
import img2 from "../util/img2.jpg";
import img3 from "../util/img3.jpg";
import img4 from "../util/img4.jpg";

//função para mudar a imagem background 
export default function Background() {
    const images = [img1, img2, img3, img4];
    const [index, setIndex] = useState(0);

    useEffect(() => {
        const interval = setInterval(() => {
            setIndex((prev) => (prev + 1) % images.length);
        }, 5000); //troca a cada 5 segundos
        return () => clearInterval(interval);
    }, []);

    return (
        <div className="background" style={{backgroundImage: `url(${images[index]})`,}}/>
    );
}