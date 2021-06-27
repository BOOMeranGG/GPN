function login() {
    $("#errorMessage").text("");
    const mail = $("#email")[0].value;
    const pass = $("#password")[0].value;
    // window.localStorage.setItem("mail", mail);
    // window.localStorage.setItem("pass", pass);
    sendLogin(mail, pass);
}

function sendLogin(arg1, arg2) {
    if (arg1 === "mdm@mail.ru" && arg2 === "123") {
        animateLoginSuccess();
        setTimeout(redirectToMapPage, 1500)
    } else {
        $(".error_message").text("Неверный логин или пароль");
        $(".error_message").toggleClass("test");
    }

    // $.ajax({
    //     url: "../../api/user/auth",
    //     type: "POST",
    //     data: JSON.stringify({
    //         "email": arg1,
    //         "password": arg2
    //     }),
    //     dataType: "json",
    //     contentType: "application/json",
    //     success: function (data) {
    //         animateLoginSuccess();
    //         setTimeout(redirectToMapPage, 1500)
    //     },
    //     error: function () {
    //         $(".error_message").text("Неверный логин или пароль");
    //         $(".error_message").toggleClass("test");
    //     }
    // });
}

function redirectToMapPage() {
    window.location.href = "./main.html";
}

function animateLoginSuccess() {
    $(".btn-animate").toggleClass("btn-animate-grow");
    $(".welcome").toggleClass("welcome-left");
    $(".cover-photo").toggleClass("cover-photo-down");
    $(".frame").toggleClass("frame-short");
    $(".profile-photo").toggleClass("profile-photo-down");
    $(".forgot").toggleClass("forgot-fade");
}

// $(function () {
//     $(".btn").click(function () {
//         $(".form-signin").toggleClass("form-signin-left");
//         $(".form-signup").toggleClass("form-signup-left");
//         $(".frame").toggleClass("frame-long");
//         $(".signup-inactive").toggleClass("signup-active");
//         $(".signin-active").toggleClass("signin-inactive");
//         $(".forgot").toggleClass("forgot-left");
//         $(this).removeClass("idle").addClass("active");
//     });
// });

$(function () {
    $(".btn-signup").click(function () {
        $(".nav").toggleClass("nav-up");
        $(".form-signup-left").toggleClass("form-signup-down");
        $(".success").toggleClass("success-left");
        $(".frame").toggleClass("frame-short");
    });
});