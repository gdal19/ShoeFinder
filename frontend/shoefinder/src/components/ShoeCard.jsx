import "./ShoeCard.css"

function ShoeCard({name, price}) {

    return (
        <div className="shoe-card"> 
            <h2>{name}</h2>
            <p>R$ {price}</p>
        </div>
    )
}

export default ShoeCard
