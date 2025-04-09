// Learn Kotlin - Lesson: Augmented Assignment Operators
// Objective:
// Use augmented assignment operators to fix values of variables.

// Instructions:
// speedOfLight: add 282 and reassign the new value
// perfectSquare: multiply by 2 and reassign the new value
// sheldonsFavoriteNum: divide by 3 and reassign the new value
// emergency: subtract 9 and reassign the new value
// firstCountingNum: use modulo to divide by 5 and reassign the remainder


fun main() {
  var speedOfLight = 186_000
  // Write your code here 
  speedOfLight += 282

  var perfectSquare = 32
  // Write your code here 
  perfectSquare *= 2

  var sheldonsFavoriteNum = 219
  // Write your code here 
  sheldonsFavoriteNum /= 3 

  var emergency = 920 
  // Write your code here 
  emergency -= 9 

  var firstCountingNum = 10 
  // Write your code here 
  firstCountingNum %= 5

  println("The speed of light is ${speedOfLight}.")
  println("A perfect square is ${perfectSquare}.")
  println("Sheldon's favorite number is ${sheldonsFavoriteNum}.")
  println("The emergency number in the United States is ${emergency}.")
  println("The first counting number in programming is ${firstCountingNum}.")
}

