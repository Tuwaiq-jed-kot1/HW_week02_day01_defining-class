# Kotlin I Assignment  I defining class
---
The Kotlin assignment has one component:
- writing code(required)
- open-ended question (optional)
- ...
> Note: You must save your solution as `homeworkSolution.kt`.

## Part I - defining a class ( writing code "required").
---
###  `write a kotlin program with student class that has three proprty "name" and "age" and "GPA"` 
### ` and give the student  abilty to (speake hint:use print ) and the abilty to add two numbers `
###
## Part II - open-ended question ( optional ) .
---
### read the code below and answer the questions
### 
> ### class Weapon(val name: String)
>  ##### class Player {
> ##### var weapon: Weapon? = Weapon("Ebony Kris")
> ##### fun printWeaponName() {
> ##### if (weapon != null) {
> ##### println(weapon.name)
> ##### }
> ##### } }
> ##### fun main() {
> ##### Player().printWeaponName()
> ##### }

### Q1 = what dose Race Conditions mean
#### when a shared variable is being accessed from multiple threads at the same time, and both threads are preforming operations on it
#### so they race to be last to edit the variable, because last to edit is what's being preserved
###
### Q2 = is there any Race Conditions in the code
#### yes 'weapon' object is mutable therefore the 'name' variable could be edited after initializing
###
###
### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
###
#### solution1:
#### changing 'weapon' object from var to val which is immutable, can't be changed after the first initializing
> ##### val weapon: Weapon? = Weapon("Ebony Kris")
#### solution2
#### using scope function let{}
#### let function is thread safe, it captures the value and use it in lambda expression through 'it' variable
> ##### fun printWeaponName() {
> ##### weapon?.let { println(it.name) }
> ##### }