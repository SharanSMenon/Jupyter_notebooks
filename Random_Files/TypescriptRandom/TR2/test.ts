import { Car } from "./Car";
import { Engine } from "./Engine";
import { Case } from "./Case";
import { SmartSystem } from "./SmartSystem";
import { Tank } from "./Tank";
let tank: Tank = new Tank(200,"Tank-200",23,"Diesel");
let engine: Engine = new Engine("Super V16","Bugatti","V16",16,4200);
let smartsys: SmartSystem = new SmartSystem("Smart 50",true,true,true,true,"Windows",[50,87]);
let theCase: Case = new Case("Blue","Chromium",80,"Metallic");
let myCar: Car = new Car(engine,theCase,smartsys,tank,2500,"Bugatti Veryon V16");
myCar.powerUp()
myCar.theTank.refuel(14)
console.log(myCar.theTank.capacity)
console.log(myCar.theTank.amountOfFuel)

