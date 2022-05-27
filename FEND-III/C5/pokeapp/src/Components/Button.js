import { objBg } from "../assets/backgroundColor";
const Button = ({text, ChangeState, index}) => {
  return <button style = {{backgroundColor: objBg[text]}} onClick={()=>ChangeState(index)} className="btn" >{text}</button>
}


export default Button