import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './Login.css'

function Login(){

    const [email, setEmail] = useState("")
    const [password, setPassword] = useState("")

    const navigate = useNavigate()

    function handleEmail(event){
        setEmail(event.target.value)
    }

    function handlePassword(event){
        setPassword(event.target.value)
    }

    function handleLogin(event){
        event.preventDefault()
        if (email === "" || password === "") {
            alert("Please fill in all fields")
        }
        console.log(email)
        console.log(password)

        navigate("/profile")
    }

    return (
        <div className='login-container'>
            <form className='login-form' onSubmit={handleLogin}>
                <p>User Name</p>
                <input className='login-input' type='text' value={email} onChange={handleEmail} />
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

    )
}

export default Login