'use client'

import { NextUIProvider } from '@nextui-org/react'
import {ThemeProvider as NextThemesProvider} from "next-themes" 
 
export const Providers = ({children}) => {
    return (
        <NextUIProvider>
            <NextThemesProvider defaultTheme='dark'>
                    {children}   
            </NextThemesProvider>
        </NextUIProvider>
    )
}

module.exports = { Providers }