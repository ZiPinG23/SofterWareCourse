window.onload=function (){
    let textarea1 = document.querySelector("#firstNum")
    let textarea2 = document.querySelector("#secondNum")
    let operator = document.querySelector("#operator")
    let answer_textarea = document.querySelector("#answer")
    let a = document.querySelector("#button")
    a.addEventListener("click",()=>{
        let choice = operator.value;
        let firstNumber =parseInt(textarea1.value);
        let secondNumber =parseInt(textarea2.value);
        if(choice === "+"){
            answer_textarea.value=firstNumber+secondNumber;
        }
        else if(choice === "-"){
            answer_textarea.value=firstNumber-secondNumber;
        }
        else if(choice === "*"){
            answer_textarea.value=firstNumber*secondNumber;
        }
        else if(choice==="/"){
            if(secondNumber===0){
                alert("被除数不能为零请重新输入")
            }
            else {
                answer_textarea.value=firstNumber/secondNumber;
            }
        }
    })
    textarea1.addEventListener("input",()=>{
        answer_textarea.value=""
    })
    textarea2.addEventListener("input",()=>{
        answer_textarea.value=""
    })

}
