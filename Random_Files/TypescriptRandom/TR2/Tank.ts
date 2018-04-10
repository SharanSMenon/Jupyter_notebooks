export class Tank {
    private _weight: number;
    private _model: string;
    private _capacity: number;
    private _fuelType: string;
    private _amountOfFuel: number = 0;

    constructor(weight: number, model: string, capacity: number, fuelType: string) {
        this._weight = weight;
        this._model = model;
        this._capacity = capacity;
        this._fuelType = fuelType;
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

    /**
     * Getter capacity
     * @return {number}
     */
    public get capacity(): number {
        return this._capacity;
    }

    /**
     * Getter fuelType
     * @return {string}
     */
    public get fuelType(): string {
        return this._fuelType;
    }

    /**
     * Getter amountOfFuel
     * @return {number}
     */
	public get amountOfFuel(): number {
		return this._amountOfFuel;
	}
    

    /**
     * refuel
     */
    public refuel(gallons): void {
        // console.log(`Gallons: `)
        if (this._amountOfFuel + gallons > this.capacity) {
            console.log("Not enough capacity");
        } else {
            console.log("Tank successfully refueled.");
            this._amountOfFuel += gallons;

        }
    }

}