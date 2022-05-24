import logo from './logo.svg';
import Header from './Header';
import PersonalInformation from './PersonalInformation';
import './App.css';
import { Info } from "./Data.js";
import SectionInfo from './SectionInfo';

function App() {
  return (
    <div className="App">
      <Header/>
      <PersonalInformation
        name={Info.personalData.name}
        lastName={Info.personalData.lastname}
        age={Info.personalData.age}
        nationality={Info.personalData.nationality}
        avatar={Info.personalData.avatar}
      />
      <SectionInfo items={Info.career}/>
      <SectionInfo items={Info.education}/>
      <SectionInfo bio={Info.bio}/>
    </div>
  );
}

export default App;
