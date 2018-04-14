export class Case {
    private _color: string;
    private _metal: string;
    private _weight: number;
    private _finish: string;

	constructor(color: string, metal: string, weight: number, finish: string) {
		this._color = color;
		this._metal = metal;
		this._weight = weight;
		this._finish = finish;
    }

    /**
     * Getter color
     * @return {string}
     */
	public get color(): string {
		return this._color;
	}

    /**
     * Getter metal
     * @return {string}
     */
	public get metal(): string {
		return this._metal;
	}

    /**
     * Getter weight
     * @return {number}
     */
	public get weight(): number {
		return this._weight;
	}

    /**
     * Getter finish
     * @return {string}
     */
	public get finish(): string {
		return this._finish;
	}
    
    
}