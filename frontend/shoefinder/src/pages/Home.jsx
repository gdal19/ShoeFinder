import { useState } from "react"
import ShoeCard from "../components/ShoeCard"

function Home(){
    const [message, setMessage] = useState("Welcome")
    let appName = "Shoe Finder"
    //let message = "Welcome"

    const shoes = [
        {id: 1, name: "Jordan 1", price: 1300},
        {id: 2, name : "Curry 6", price: 1100}
    ]

    function newMessage(){
        setMessage("botao clicado")
    }

    return(
        <div>
            <h1>{appName}</h1>
            <p>{message}</p>
            <button onClick={newMessage}> 
                CLICK HERE!!!
            </button>
            {
                shoes.map((shoe) => { 
                    return (
                        <ShoeCard key = {shoe.id} name = {shoe.name} price={shoe.price} />
                    )
                })
            }
        </div>
    )
}

export default Home