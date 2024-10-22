const images = [
  'url("images/1.jpg")',
  'url("images/2.jpg")',
  'url("images/3.jpg")',
  'url("images/4.jpg")',
  'url("images/5.png")',
  'url("images/6.jpg")'
];

let currentImageIndex = 0;
const body = document.body;

// 5초마다 배경 이미지 변경
function changeBackgroundImage() {
  currentImageIndex = (currentImageIndex + 1) % images.length;
  body.style.backgroundImage = images[currentImageIndex];
}

// 처음 배경 이미지 설정
body.style.backgroundImage = images[0];

// 5초마다 이미지 변경 실행
setInterval(changeBackgroundImage, 5000);