import Button from "./Button";

const Header =({ChangeState})=>{
    return(
        <header className="header">
            <Button color="#B6A136" text="Rock Type" onClick={()=>ChangeState(1)}/>
            <Button color="#6390F0" text="Water Type" onClick={()=>ChangeState(2)}/>
            <Button color="#EE8130" text="Fire Type" onClick={()=>ChangeState(3)}/>
            <Button color="#F7D02C" text="Electric Type" onClick={()=>ChangeState(4)}/>
        </header>
    )
}

export default Header;