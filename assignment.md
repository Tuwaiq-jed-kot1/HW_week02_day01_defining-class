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
###
when two or more threads access same variable 
and try to change it at the same time 
###
### Q2 = is there any Race Conditions in the code
###
yes {println(weapon.name)} here the weapon might change while printing it 
### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
###
 scope function deals with variable's copy (it or this), not 
the variable itself so the interference won't occur 

the solution 
fun printWeaponName() {
weapon?.also{
 println(it.name)}
  }

###
