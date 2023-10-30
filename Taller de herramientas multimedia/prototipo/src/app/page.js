export default function Home() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-4 md:p-24" style={{ backgroundColor: 'white', color: 'black' }}>
      <div>
        <p style={{ fontWeight: 'bold', fontSize: '3vh' }}>Museo de Historia Natural de Chile</p>
      </div>

      <div style={{ display: 'grid', gridTemplateColumns: 'repeat(1, 1fr)', width: '100%', gap: '2rem', textAlign: 'center' }}>
        <div style={{width: '100%', display: 'flex', alignItems: 'center', justifyContent: 'center'}}>
          <img src="https://www.mnhn.gob.cl/sites/www.mnhn.gob.cl/files/styles/3x1_destacado_slide/public/2023-04/frontis_mnhn.jpg?h=27371658&itok=4pESB_5B" style={{ width: '50%', height: 'auto', objectFit: 'cover', objectPosition: 'center' }} alt="Museo" />
        </div>
        <p>Bienvenido al Museo de Historia Natural de Chile, un lugar donde la historia y la naturaleza se entrelazan para ofrecerte una experiencia única. Aquí, podrás explorar la riqueza de la biodiversidad chilena, descubrir fósiles antiguos y sumergirte en la fascinante historia cultural de nuestro país.</p>
      </div>

      <div style={{ display: 'grid', gridTemplateColumns: 'repeat(1, 1fr)', width: '100%', gap: '2rem', textAlign: 'center' }}>
        <div style={{width: '100%', display: 'flex', alignItems: 'center', justifyContent: 'center'}}>
          <img src="https://www.radiopop.cl/wp-content/uploads/2018/01/Ballena-Museo-Nacional-de-Historia-Natural.jpg" style={{ width: '50%', height: 'auto', objectFit: 'cover', objectPosition: 'center' }} alt="Ballena" />
        </div>
        <p>Nuestro museo es un espacio dedicado a la ciencia, la educación y la conservación. Nuestras colecciones y exposiciones te llevarán en un viaje a través del tiempo y el espacio, revelando los secretos de la naturaleza y la evolución de Chile.</p>
      </div>

      <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center', width: '100%', textAlign: 'center' }}>
        <p>A lo largo de este sitio, encontrarás información sobre nuestras exposiciones actuales, nuestras colecciones permanentes y la historia del museo. También te invitamos a ponerte en contacto con nosotros para cualquier pregunta o consulta que puedas tener.</p>
        <p>Te animamos a explorar y disfrutar de tu visita virtual a través de este sitio web, y esperamos verte pronto en persona en el Museo de Historia Natural de Chile.</p>
      </div>
    </main>
  )
}
