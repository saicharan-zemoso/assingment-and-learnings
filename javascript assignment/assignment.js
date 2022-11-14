//assignment
//first question 
/*
Q1. Write a program to demonstrate how a function can be passed as a parameter to another function.
*/
function add(a,b)
{
	return a+b
}
function fun3(a,b,sfun)
{
	let c=sfun(a,b)
	return c
}
console.log("output of 10 + 20 is ",fun3(10,20,add))
//secound question
/*
Q2. An arrow function takes two arguments firstName and lastName and returns a 2 letter string that represents the first letter of both the arguments. For the arguments Roger and Waters, the function returns ‘RW’. Write this function.
Submit the github link to the code
*/
let fun4=(fname,lname)=>{
	return fname[0]+lname[0]
}
console.log("output of the function is ",fun4("Roger","Waters"))