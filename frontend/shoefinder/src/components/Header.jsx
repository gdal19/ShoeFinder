import { Link } from "react-router-dom"
import "./Header.css"


function Header({name, username, favoritesCount}){

    return (
        <div className="header-container">
            <Link to='/' className="header-title">
                {name}
            </Link>
            <div className="user">
                <Link to='/login' className="login-button">
                    Login
                </Link>
                <Link to='/profile' className="user-name">
                    {username}
                </Link>
                <p className="user-favorites">
                    {favoritesCount} Favorites
                </p>
            </div>
        </div>



    )
}

export default Header