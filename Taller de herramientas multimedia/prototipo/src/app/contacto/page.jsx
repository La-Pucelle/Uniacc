'use client'
import React, { useState } from 'react';

export default function Contacto() {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    message: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Puedes hacer validaciones aquí antes de mostrar el alert
    alert('Mensaje enviado: ' + JSON.stringify(formData));
    // Aquí podrías realizar una solicitud fetch si lo deseas
  };

  return (
    <main
      className="flex min-h-screen flex-col items-center justify-between p-4 md:p-24"
      style={{ backgroundColor: 'white', color: 'black', display: 'flex', justifyContent: 'center'}}
    >
      <h1>Contacto</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="name">Nombre:</label>
          <input
            type="text"
            id="name"
            name="name"
            value={formData.name}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label htmlFor="email">Correo Electrónico:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label htmlFor="message">Mensaje:</label>
          <textarea
            id="message"
            name="message"
            value={formData.message}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Enviar</button>
      </form>
    </main>
  );
}
