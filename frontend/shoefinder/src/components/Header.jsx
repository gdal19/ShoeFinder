import "./Header.css"


function Header({name, username, favoritesCount}){

    return (
        <div className="header-container">
            <h1 className="header-title">
                {name}
            </h1>
            <div className="user">
                <p className="user-name">
                    {username}
                </p>
                <p className="user-favorites">
                    {favoritesCount} Favorites
                </p>
            </div>
        </div>



    )
}

export default Header