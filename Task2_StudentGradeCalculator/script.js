function calculateGrade(){

let s1=parseFloat(document.getElementById("sub1").value)||0;
let s2=parseFloat(document.getElementById("sub2").value)||0;
let s3=parseFloat(document.getElementById("sub3").value)||0;
let s4=parseFloat(document.getElementById("sub4").value)||0;
let s5=parseFloat(document.getElementById("sub5").value)||0;

let total=s1+s2+s3+s4+s5;

let percentage=total/5;

let grade="";

if(percentage>=90)
grade="A+";
else if(percentage>=80)
grade="A";
else if(percentage>=70)
grade="B";
else if(percentage>=60)
grade="C";
else if(percentage>=50)
grade="D";
else
grade="F";

document.getElementById("result").innerHTML=
`
<h3>Result</h3>
<p><b>Total Marks:</b> ${total}/500</p>
<p><b>Percentage:</b> ${percentage.toFixed(2)}%</p>
<p><b>Grade:</b> ${grade}</p>
`;
}
