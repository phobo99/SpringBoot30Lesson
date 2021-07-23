# Thymeleaf căn bản

ở file thymeleaf có sử dụng if để chọn loại ảnh cho giới tính nam và nữ

Code :

```html

<div class="img">
    <img th:if="${person.gender == 'Male'}"
         src="https://64.media.tumblr.com/c869dda7b0d43c1600d5ba130ef2e04f/15bda826b481de6f-bb/s1280x1920/4a7c6dcdbaf91c5005f15ee256b0f432647138ef.jpg"
         alt="" width="100px" height="100px">

    <img th:if="${person.gender == 'Female'}"
         src="https://pbs.twimg.com/media/Eo1pHn3U0AAAjmb?format=jpg&name=large" alt="" width="100px"
         height="100px">
</div>
```
Xem chi tiết tại ảnh 2 và 4

## 1. Hiển thị danh sách

![image](photo/home.jpg)

## 2. Hiển thị danh sách

![image](photo/show1.jpg)

## 3. Tính hai số

![image](photo/calculate.jpg)

## 4. Hiển thị danh sách theo 2 cột

![image](photo/show2.jpg)


Bài có tham khảo.