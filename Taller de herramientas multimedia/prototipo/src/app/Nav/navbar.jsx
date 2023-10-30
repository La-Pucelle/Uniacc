'use client'
import React from "react"
import {Navbar, NavbarBrand, NavbarContent, NavbarMenuToggle, NavbarMenu, NavbarItem, NavbarMenuItem, Link, Button} from "@nextui-org/react"

export function Nav() {
  const [isMenuOpen, setIsMenuOpen] = React.useState(false)

  const menuItems = [
    "Inicio",
    "Exposiciones",
    "Contacto",
    "Tienda"
  ]

  return (
    <Navbar onMenuOpenChange={setIsMenuOpen}>
      <NavbarContent>
        <NavbarMenuToggle
          aria-label={isMenuOpen ? "Close menu" : "Open menu"}
          className="sm:hidden"
        />
        <NavbarBrand>
          <p className="font-bold text-inherit">ACME</p>
        </NavbarBrand>
      </NavbarContent>

      <NavbarContent className="hidden sm:flex gap-4" justify="center">
        <NavbarItem>
          <Link color="foreground" href="/">
          Inicio
          </Link>
        </NavbarItem>
        <NavbarItem isActive>
          <Link href="/exposiciones" aria-current="page">
          Exposiciones
          </Link>
        </NavbarItem>
        <NavbarItem>
          <Link color="foreground" href="/contacto">
          Contacto
          </Link>
        </NavbarItem>
        <NavbarItem>
          <Link color="foreground" href="/tienda">
          Tienda
          </Link>
        </NavbarItem>
      </NavbarContent>
      <NavbarContent justify="end">
      </NavbarContent>
      <NavbarMenu>
        {menuItems.map((item, index) => (
          <NavbarMenuItem key={`${item}-${index}`}>
            <Link
              color={
                index === 2 ? "primary" : index === menuItems.length - 1 ? "danger" : "foreground"
              }
              className="w-full"
              href="#"
              size="lg"
            >
              {item}
            </Link>
          </NavbarMenuItem>
        ))}
      </NavbarMenu>
    </Navbar>
  )
}
