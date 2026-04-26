import { useState } from "react"

function Home(){
    const [message, setMessage] = useState("Welcome")
    let appName = "Shoe Finder"
    //let message = "Welcome"

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
        </div>
    )
}

export default Home