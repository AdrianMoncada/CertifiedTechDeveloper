const PersonalInformation = ({ name, lastName, nationality, age, avatar }) => {
  return (
    <section className='sectionContainer'>
      <div className='sectionPersonalInformation'>
        <h1>Personal Information:</h1>
        <p>Name: {name}</p>
        <p>Last Name: {lastName}</p>
        <p>Age: {age} years old</p>
        <p>Nationality: {nationality}</p>
      </div>
      <div>
        <img className='imgAvatar' src={avatar} alt='profile picture' />
      </div>
    </section>
  );
};

export default PersonalInformation;
