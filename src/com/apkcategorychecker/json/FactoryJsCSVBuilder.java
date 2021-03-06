/*
	<Author: Gabriele Martini
	Description: This Software is a A Command-Line Program written in Java 
	to check what Framework it's been used to build the APK>
    Copyright (C) <2014>  <Gabriele Martini>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.apkcategorychecker.json;


/**
 * This factory choose what kind of json builder will be used
 *
 * @author Gabriele Martini
 */
public class FactoryJsCSVBuilder {
	
	/*Constructor*/
    private FactoryJsCSVBuilder() {
    }
    
    /**
     * Applying the Singleton Design-Pattern
     * 
     * @return
     */
    public static FactoryJsCSVBuilder getInstance() {
        return FactoryJsonBuilderHolder.INSTANCE;
    }
    
    private static class FactoryJsonBuilderHolder {

        private static final FactoryJsCSVBuilder INSTANCE = new FactoryJsCSVBuilder();
    }
    
    /**
     * This method choose the json builder (for the moment there is only one builder)
     * 
     * @return
     */
    public JsCSVBuilder getJsCSVBuilder() {
    	JsCSVBuilder builder = null;
        
    	/*here will put the condition for which you choose the builder*/
    	
    	builder = new DefaultJsCSVBuilder();
        
        return builder;
    }

}
