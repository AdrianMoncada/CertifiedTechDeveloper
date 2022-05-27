import Button from "./Button";
import { objBg } from "../assets/backgroundColor";
// style = {{backgroundColor: objBg[element]}
const Header =({arrOfKey, ChangeState})=>{
    return(
        <header className="header">
            {arrOfKey.map((type,index)=> 
            <Button key={index} text={type} ChangeState= {ChangeState} index={index} />
            )}
        </header>
    )
}

export default Header;