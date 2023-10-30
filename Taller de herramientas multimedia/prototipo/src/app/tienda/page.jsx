export default function tienda(){
    return(
        <main className="flex min-h-screen flex-col items-center justify-between p-4 md:p-24" style={{ backgroundColor: 'white', color: 'black' }}>
            <div>
                <p style={{fontWeight: 'bold'}}>Nuestra tienda ofrece una variedad de souvenirs y productos relacionados con nuestras exposiciones. Llévate un recuerdo de tu visita al Museo de Historia Natural de Chile.</p>
            </div>

            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(1, 1fr)', width: '100%', gap: '2rem', textAlign: 'center' }}>
                <p>Libros y Guías: Amplia tu conocimiento con publicaciones especializadas.</p>
                <p>Artesanías: Productos hechos a mano por artistas locales.</p>
                <p>Juguetes Educativos: Para que los más pequeños sigan aprendiendo en casa.</p>
                <p>Ropa y Accesorios: Luce con orgullo tu amor por la historia natural.</p>
                <p>Productos Ecológicos: Para aquellos comprometidos con el medio ambiente.</p>
                <div style={{width: '100%', display: 'flex', alignItems: 'center', justifyContent: 'center'}}>
                    <img src="https://www.palaciosymuseos.com/v2/images/home/tiendasslideb.png" style={{ width: '50%', height: 'auto', objectFit: 'cover', objectPosition: 'center' }} alt="Museo" />
                </div>
            </div>
        </main>
    )
}