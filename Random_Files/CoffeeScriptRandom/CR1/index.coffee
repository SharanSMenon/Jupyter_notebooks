score = 83
grade = switch
  when score < 60 then 'E'
  when score < 70 then 'D'
  when score < 80 then 'C'
  when score < 90 then 'B'
  else 'A'
console.log grade
areaOfAquare = (s) -> s*s
numbers = [1..10]
console.log numbers
for number in numbers
    console.log "Number: "+number
class Animal
    constructor: (@name) -> 
    move: (meters) -> 
        console.log(@name + " moved " + meters + " meters.")
class Horse extends Animal
    constructor: (name, type) ->
        super(name)
    neigh: () ->
        console.log("Neighhh")
horse = new Horse("Misty", "Arab Race Horse")
horse.neigh()
horse.move(500)