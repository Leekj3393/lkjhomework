document.addEventListener("DOMContentLoaded", function(event) {
  window.addEventListener("scroll", fillProgressBars);
});

function fillProgressBars() {
  var scrollTop = window.pageYOffset;
  var windowHeight = window.innerHeight;
  var backendBar = document.querySelector('.progress .progress-bar[data-target="backend"]');
  var frontendBar = document.querySelector('.progress .progress-bar[data-target="frontend"]');
  var backendElement = document.querySelector('[data-target="backend"]');
  var frontendElement = document.querySelector('[data-target="frontend"]');
  var backendOffsetTop = backendElement.offsetTop;
  var frontendOffsetTop = frontendElement.offsetTop;
  var backendHeight = backendElement.offsetHeight;
  var frontendHeight = frontendElement.offsetHeight;

  if (scrollTop > backendOffsetTop - windowHeight + backendHeight) {
    var percent = backendBar.getAttribute('aria-valuenow');
    backendBar.style.width = percent + '%';
    backendElement.querySelector('.val').innerText = percent + '%';
  }

  if (scrollTop > frontendOffsetTop - windowHeight + frontendHeight) {
    var percent = frontendBar.getAttribute('aria-valuenow');
    frontendBar.style.width = percent + '%';
    frontendElement.querySelector('.val').innerText = percent + '%';
  }
}

const docStyle = document.documentElement.style
const aElem = document.querySelector('a')
const boundingClientRect = aElem.getBoundingClientRect()

aElem.onmousemove = function (e) {

  const x = e.clientX - boundingClientRect.left
  const y = e.clientY - boundingClientRect.top

  const xc = boundingClientRect.width / 2
  const yc = boundingClientRect.height / 2

  const dx = x - xc
  const dy = y - yc

  docStyle.setProperty('--rx', `${dy / -1}deg`)
  docStyle.setProperty('--ry', `${dx / 10}deg`)

}

aElem.onmouseleave = function (e) {

  docStyle.setProperty('--ty', '0')
  docStyle.setProperty('--rx', '0')
  docStyle.setProperty('--ry', '0')

}

aElem.onmousedown = function (e) {

  docStyle.setProperty('--tz', '-25px')

}

document.body.onmouseup = function (e) {

  docStyle.setProperty('--tz', '-12px')

}
const $text = document.querySelector(".text");

// 글자 모음
const letters = [
  "HTML",
  "CSS", 
  "JavaScript"
];

// 글자 입력 속도
const speed = 100;
let i = 0;

// 타이핑 효과
const typing = async () => {  
  const letter = letters[i].split("");
  
  while (letter.length) {
    await wait(speed);
    $text.innerHTML += letter.shift(); 
  }
  
  // 잠시 대기
  await wait(800);
  
  // 지우는 효과
  remove();
}

// 글자 지우는 효과
const remove = async () => {
  const letter = letters[i].split("");
  
  while (letter.length) {
    await wait(speed);
    
    letter.pop();
    $text.innerHTML = letter.join(""); 
  }
  
  // 다음 순서의 글자로 지정, 타이핑 함수 다시 실행
  i = !letters[i+1] ? 0 : i + 1;
  typing();
}

// 딜레이 기능 ( 마이크로초 )
function wait(ms) {
  return new Promise(res => setTimeout(res, ms))
}

// 초기 실행
setTimeout(typing, 1500);