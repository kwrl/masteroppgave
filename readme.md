# The Klang Programming Language and Environment
The Klang project seeks to aid in easing the transition from visual to textual programming. Klang is a new programming language with both a visual and a textual syntax. 

## Requirements
1. Eclipse Neon Modelling Tools 
2. Java 8

## Project structure
* com.kaurel.klang.jbox2d -- Klang Interpreter and the game development framework integrated. Includes a sample program.
* com.kaurel.klang.model -- The definition of the underlying semantics of Klang.
* com.kaurel.klang.model.edit
* com.kaurel.klang.model.editor
* com.kaurel.klang.model.tests
* com.kaurel.klang.runtime -- The Klang Interpreter.
* com.kaurel.klang.xtext -- The definition of the textual syntax and its text editor.
* com.kaurel.klang.xtext.ide
* com.kaurel.klang.xtext.tests
* com.kaurel.klang.xtext.ui
* com.kaurel.klang.xtext.ui.tests
* demo -- Simple demo of the Klang Interpreter without game framework integration.
* jbox2ddemo -- The game development framework.  

## Running a sample program
1. com.kaurel.klang.jbox2d -> Run as Java Application -> KlangApplication
2. A window will appear, to start the interpreter and physics simulation press backspace.

## Running a sample program without the game development framework
1. demo -> Run as Java Application -> Demo 

## Running the text editor
1. com.kaurel.klang.xtext -> Run as Eclipse Application
2. Create a new project in the new Eclipse instance.
3. Create a file with the file extension *.klang
4. Right click the file and choose open with Klang Editor

## Running the visual editor
1. Import the projects from https://github.com/hallvard/emfblocks.git
2. no.hal.emfblocks.editor -> Run as Eclipse Application
3. Import the com.kaurel.klang.jbox2d project into the new workspace
4. Right click the file src/com.kaurel.klang.jbox2d/KlangApplication.klang and choose open with EMF Block Editor