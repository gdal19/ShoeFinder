import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './Login.css'
import Header from "../components/Header"

function Login({ username, setUsername, favorites, password, setPassword }){

    //const [email, setEmail] = useState("")
    // const [password, setPassword] = useState("")

    const navigate = useNavigate()

    function handleUser(event){
        setUsername(event.target.value)
    }

    function handlePassword(event){
        setPassword(event.target.value)
    }

    async function verifyLogin(){
        const response = await fetch("http://localhost:8080/login", {
            method: "POST",
            body: JSON.stringify({
                username: username,
                password: password
            }),
            headers: {"Content-Type": "application/json"}
        }
        )

        if (!response.ok) {
            alert("Invalid username or password")
            return false
        }

        //const data = await response.json()
        return true
    }

    async function handleLogin(event){
        event.preventDefault()
        if (username === "" || password === "") {
            alert("Please fill in all fields")
            return
        }
        console.log(username)
        console.log(password)

        const success = await verifyLogin()

        if (success) {
            navigate("/profile")
        }
    }

    return (
        <div>
            <Header name="Shoe Finder" username={username} favoritesCount={favorites.length}/>
            <div className='login-container'>
                <form className='login-form' onSubmit={handleLogin}>
                    <p>User Name</p>
                    <input className='login-input' type='text' value={username} onChange={handleUser} />
                    <p>Password</p>
                    <input className='login-input' type='password' value={password} onChange={handlePassword} />
                    <button className='login-button'>
                        Forgot Password
                    </button>
                    <button className='login-button' type='submit'>
                        Login
                    </button>
                </form>
            </div>
        </div>

    )
}

export default Login