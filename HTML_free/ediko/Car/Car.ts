import { Engine } from "./Engine";
import { Case } from "./Case";
import { SmartSystem } from "./SmartSystem";
import { Tank } from "./Tank";
export class Car {
    private _theEngine: Engine;
    private _theCase: Case;
    private _smartSystem: SmartSystem;
    private _theTank: Tank;
    private _weight: number;
    private _model: string;

	constructor(theEngine: Engine, theCase: Case, smartSystem: SmartSystem, theTank: Tank, weight: number, model: string) {
		this._theEngine = theEngine;
		this._theCase = theCase;
		this._smartSystem = smartSystem;
        this._theTank = theTank;
        this._weight = weight;
        this._model = model;
	}

    /**
     * Getter theEngine
     * @return {Engine}
     */
	public get theEngine(): Engine {
		return this._theEngine;
	}

    /**
     * Getter theCase
     * @return {Case}
     */
	public get theCase(): Case {
		return this._theCase;
	}

    /**
     * Getter smartSystem
     * @return {SmartSystem}
     */
	public get smartSystem(): SmartSystem {
		return this._smartSystem;
	}

    /**
     * Getter theTank
     * @return {Tank}
     */
	public get theTank(): Tank {
		return this._theTank;
    }

    /**
     * Getter weight
     * @return {number}
     */
	public get weight(): number {
		return this._weight;
	}

    /**
     * Getter model
     * @return {string}
     */
	public get model(): string {
		return this._model;
	}
        
    public powerUp(): void{
        console.log("Powering up");
        
    }
    
}