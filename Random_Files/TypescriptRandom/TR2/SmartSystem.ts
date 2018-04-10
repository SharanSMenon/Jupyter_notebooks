export class SmartSystem {
    private _model: string;
    private _touchscreen: boolean;
    private _TV: boolean;
    private _rearCamera: boolean;
    private _AirConditioning: boolean;
    private _AirBag: boolean = true;
    private _OS: string;
    private _ACRange: Array<number>;

    constructor(model: string, touchscreen: boolean, TV: boolean, rearCamera: boolean, AirConditioning: boolean, OS: string, ACRange: Array<number>) {
        this._model = model;
        this._touchscreen = touchscreen;
        this._TV = TV;
        this._rearCamera = rearCamera;
        this._AirConditioning = AirConditioning;
        this._OS = OS;
        this._ACRange = ACRange;
    }

    /**
     * Getter model
     * @return {string}
     */
    public get model(): string {
        return this._model;
    }

    /**
     * Getter touchscreen
     * @return {boolean}
     */
    public get touchscreen(): boolean {
        return this._touchscreen;
    }

    /**
     * Getter TV
     * @return {boolean}
     */
    public get TV(): boolean {
        return this._TV;
    }

    /**
     * Getter rearCamera
     * @return {boolean}
     */
    public get rearCamera(): boolean {
        return this._rearCamera;
    }

    /**
     * Getter AirConditioning
     * @return {boolean}
     */
    public get AirConditioning(): boolean {
        return this._AirConditioning;
    }

    /**
     * Getter AirBag
     * @return {boolean }
     */
    public get AirBag(): boolean {
        return this._AirBag;
    }

    /**
     * Getter OS
     * @return {string}
     */
    public get OS(): string {
        return this._OS;
    }

    /**
     * Getter ACRange
     * @return {Array<number>}
     */
    public get ACRange(): Array<number> {
        return this._ACRange;
    }

    /**
     * playMusic
     */
    public playMusic(song: string): void {
        console.log(`Playing ${song}`)
    }
    /**
     * playMovie
     */
    public playMovie(movie: string): void {
        console.log(`Playing movie ${movie}`);
    }

}