export default function exposiciones(){
    return(
        <main className="flex min-h-screen flex-col items-center justify-between p-4 md:p-24" style={{ backgroundColor: 'white', color: 'black' }}>
            <div>
                <p style={{fontWeight: 'bold'}}>En el Museo de Historia Natural de Chile, te invitamos a explorar nuestras exposiciones actuales. Cada una de nuestras exposiciones está diseñada para sumergirte en un fascinante mundo de descubrimiento y aprendizaje sobre la historia natural de Chile.</p>
            </div>

            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(1, 1fr)', width: '100%', gap: '2rem', textAlign: 'center' }}>
                <p style={{fontWeight: 'bold'}}>Botánica</p>
                <p>Esta exposición ofrece un viaje por la rica y diversa flora de Chile. Desde los bosques templados lluviosos del sur hasta los áridos desiertos del norte.</p>
                <p>Flora Endémica de Chile: Descubre las especies que solo puedes encontrar en nuestro país.</p>
                <p>Plantas Medicinales: Conoce las plantas que han sido usadas tradicionalmente para curar enfermedades.</p>
                <p>Jardín de Cactus: Maravíllate con la resistencia y belleza de estas plantas desérticas.</p>
                <div style={{width: '100%', display: 'flex', alignItems: 'center', justifyContent: 'center'}}>
                    <img src="https://www.mnhn.gob.cl/sites/www.mnhn.gob.cl/files/styles/16x9_grande/public/2021-04/Mutisia%20acuminata_0.JPG?h=88553ecf&itok=4tCFUHwJ" style={{ width: '50%', height: 'auto', objectFit: 'cover', objectPosition: 'center' }} alt="Museo" />
                </div>
            </div>

            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(1, 1fr)', width: '100%', gap: '2rem', textAlign: 'center' }}>
                <p style={{fontWeight: 'bold'}}>Antropología</p>
                <p>Un recorrido por la historia y las culturas de los pueblos originarios de Chile.</p>
                <p>Mapuches: Conoce la rica historia y tradiciones de este pueblo originario.</p>
                <p>Moais de Isla de Pascua: Descubre los misterios detrás de estas imponentes estatuas.</p>
                <p>Culturas Precolombinas: Un vistazo a las antiguas civilizaciones que habitaron el territorio chileno.</p>
                <div style={{width: '100%', display: 'flex', alignItems: 'center', justifyContent: 'center'}}>
                    <img src="https://www.mnhn.gob.cl/sites/www.mnhn.gob.cl/files/styles/16x9_grande/public/2021-04/30816%2C%2020%20%28llolleo%29.JPG?h=97b7a75c&itok=zkTJB2Zw" style={{ width: '50%', height: 'auto', objectFit: 'cover', objectPosition: 'center' }} alt="Museo" />
                </div>
            </div>

            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(1, 1fr)', width: '100%', gap: '2rem', textAlign: 'center' }}>
                <p style={{fontWeight: 'bold'}}>Zoología</p>
                <p>Una muestra de la diversidad animal de Chile, desde las alturas de Los Andes hasta la profundidad del Océano Pacífico.</p>
                <p>Fauna Andina: Descubre animales como el cóndor y la vicuña.</p>
                <p>Animales del Desierto: Conoce cómo sobreviven especies en el lugar más árido del mundo.</p>
                <p>Vida Marina: Deléitate con la rica biodiversidad de nuestros mares.</p>
                <div style={{width: '100%', display: 'flex', alignItems: 'center', justifyContent: 'center'}}>
                    <img src="https://www.mnhn.gob.cl/sites/www.mnhn.gob.cl/files/2021-04/Figura%202_Stenothoe.jpg" style={{ width: '50%', height: 'auto', objectFit: 'cover', objectPosition: 'center' }} alt="Museo" />
                </div>
            </div>

            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(1, 1fr)', width: '100%', gap: '2rem', textAlign: 'center' }}>
                <p style={{fontWeight: 'bold'}}>Geología</p>
                <p>Entiende la formación y características del terreno chileno, y descubre la historia geológica que ha dado forma a nuestro país.</p>
                <p>Minerales de Chile: Descubre las riquezas minerales que se encuentran bajo nuestros pies.</p>
                <p>Formaciones Rocosas: Conoce impresionantes formaciones como el Valle de la Luna.</p>
                <p>Sismología: Entiende por qué Chile es uno de los países más sísmicos del mundo.</p>
                <div style={{width: '100%', display: 'flex', alignItems: 'center', justifyContent: 'center'}}>
                    <img src="https://pbs.twimg.com/media/De78RDuXUAIetPj?format=jpg&name=large" style={{ width: '50%', height: 'auto', objectFit: 'cover', objectPosition: 'center' }} alt="Museo" />
                </div>
            </div>

            <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center', width: '100%', textAlign: 'center' }}>
                <p>A lo largo de este sitio, encontrarás información sobre nuestras exposiciones actuales, nuestras colecciones permanentes y la historia del museo. También te invitamos a ponerte en contacto con nosotros para cualquier pregunta o consulta que puedas tener.</p>
                <p>Te animamos a explorar y disfrutar de tu visita virtual a través de este sitio web, y esperamos verte pronto en persona en el Museo de Historia Natural de Chile.</p>
            </div>
        </main>
    )
}