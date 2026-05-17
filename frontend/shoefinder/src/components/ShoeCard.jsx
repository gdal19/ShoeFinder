import "./ShoeCard.css"

function ShoeCard({name, price, image}) {

    return (
        <div className="shoe-card"> 
            <img className="shoe-image" src={image} alt={name}/>
            <h2>{name}</h2>
            <p>R$ {price}</p>
        </div>
    )
}

export default ShoeCard
