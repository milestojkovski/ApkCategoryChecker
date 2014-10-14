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
package com.apkcategorychecker;

import java.io.IOException;

import com.apkcategorychecker.analyzer.PathAnalyzer;
import com.apkcategorychecker.cli.CommandLineInterface;


/**
 * 
 * Main class
 * @author Gabriele Martini
 *
 */
public class Main {
	
    /**
     * Initialize CLI and PathAnalyzer
     * 
     * @param args Arguments
     * @throws IOException Exception
     */
	public static void main(String[] args) throws IOException {
		
		/*--Initializing Command Line Interface--*/
		CommandLineInterface.getInstance().Initialize(args);
		
		/*--Instance of new Analyzer--*/
        
        PathAnalyzer analyzer;
        analyzer = new PathAnalyzer();
        
        /*--Analyze given path--*/
        
        analyzer.Analyze();

	}
	
	

}
