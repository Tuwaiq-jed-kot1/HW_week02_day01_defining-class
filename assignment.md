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
### A race condition occurs when some other part of your program simultaneously 
### modifies the state of your code in a manner that leads to unpredictable results.
### for Example : Threads , changing the weapon value to null before calling Player().printWeaponName()

### Q2 = is there any Race Conditions in the code
### I don't think there is a race condition, but I could be wrong
###
###

### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
### use safe call and also scope function , remove the if statement we don't need it
### .also (it) refers to a locale variable that exists only within the scope of the anonymous function  
### so the (it) variable is granted it will not be changed by other part of the code
