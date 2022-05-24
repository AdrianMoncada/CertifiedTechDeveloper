import Bio from "./Bio";
const SectionInfo = ({ items, bio }) => {
  if (bio) {
    return (
      <section>
        <div className='sectionContainer'>
          <div>
            <img
              className='imgAvatar'
              src='https://readgem.files.wordpress.com/2021/01/20200609-giant-rooks-studio-c2a9-by-jean-raclet-150.jpg?w=683'
              alt='second'
            />
          </div>
          <div>
            <h2 className='subTittleStyle'>Biography</h2>
            <Bio bio={bio} />
          </div>
        </div>
      </section>
    );
  } else {
    return (
      <section>
        <div className='sectionContainer'>
          <div>
            <img
              className='imgAvatar'
              src='https://readgem.files.wordpress.com/2021/01/20200609-giant-rooks-studio-c2a9-by-jean-raclet-150.jpg?w=683'
              alt='second'
            />
          </div>
          <div>
            <h2 className='subTittleStyle'>Experience</h2>
            <ul className='liStyle'>
              {items.map((item) => (
                <li key={item.id}>{item.info}</li>
              ))}
            </ul>
          </div>
        </div>
      </section>
    );
  }
};

export default SectionInfo;
