const Info = ({ name, lastname, age, nationality, residence, occupation }) => {
  return (
      <main>
          <section className="personalData">
              <h1> Personal information </h1> 
                  <p>Name:{name}</p>
                  <p> Lastname: {lastname} </p> 
                  <p> Age: {age} years old </p>
                  <p> Nationality: {nationality} </p> 
                  <p> Residence: {residence} </p>
                  <p> Occupation: {occupation} </p>
          </section>
      </main>
  );
};

export default Info;