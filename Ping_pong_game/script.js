let userPaddle=document.querySelector('#user-paddle')
let compPaddle=document.querySelector('#comp-paddle')
let ball=document.querySelector('#ball')

userPaddle.style.marginLeft='30px'
userPaddle.style.marginTop='0px'
compPaddle.style.marginLeft='1048px'
compPaddle.style.margintop='0px'
ball.style.marginLeft='534px'
ball.style.marginTop='262px'

let W_pressed=false
let S_pressed=false

document.addEventListener('keydown',(e)=>{
    if(e.KeyCode=='87'){
        W_pressed= true
    }
    else if(e.KeyCode=='83'){
        S_pressed=true
    }
})

document.addEventListener('keyup',(e)=>{
    if(e.KeyCode=='87'){
        W_pressed= false
    }
    else if(e.KeyCode=='83'){
        S_pressed=false
    }
})

gameLoop()

function gameLoop(){
    setTimeout(()=>{
        setInterval(()=>{
            if(W_pressed && marginTop(userPaddle)>0){
                userPaddle.style.marginTop=`${marginTop(userPaddle)-2}px`
            }
            else if(S_pressed && marginTop(userPaddle)<472){
                userPaddle.style.marginTop=`${marginTop(userPaddle)+2}px` 
            }
        },5)
    },500)
}

function marginTop(elem){
    return Number(elem.style.marginTop.split('p')[0])
}

function marginLeft(elem){
    return Number(elem.style.marginLeft.split('p')[0])
}