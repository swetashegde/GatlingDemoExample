# GatlingDemoExample
Gatling Demo with Maven

###  System Setup

#### Install homebrew

`/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`

#### Install Java and
Now that you have homebrew,you can get JDK using Homebrew cask.

`brew cask install java`

#### Get Maven

`brew install maven`


### Get IntelliJ or any IDE of your choice
https://www.jetbrains.com/idea/


Finally clone or download this repo & import it on IntelliJ as a maven project
to clone: 

`git clone https://github.com/swetashegde/GatlingDemoExample.git`


Step by step instructions are also available on my blog
https://medium.com/@hegdeshweta/load-performance-testing-using-gatling-1-9123c755dd87


To run a simulation:
Example to run DemoExampleSimulation


`gatling:test -Dgatling.simulationClass=example.demo.DemoExampleSimulation`

or right click on Engine & choose `Run`






