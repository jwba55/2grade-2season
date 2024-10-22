
// 프로필 사진 미리보기 기능
function previewProfileImage(event) {
  var reader = new FileReader();
  reader.onload = function(){
    var output = document.getElementById('profileimage-preview');
    output.src = reader.result; // 이미지 미리보기 설정
  };
  reader.readAsDataURL(event.target.files[0]); // 파일 읽기
}