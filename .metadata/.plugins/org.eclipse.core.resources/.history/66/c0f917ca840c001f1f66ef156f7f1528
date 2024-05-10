let slideIndex = 1;
let slideItemIndex = 1;

var translateValue = 1;
let items = document.getElementsByClassName("item");
let prev = document.getElementById("iprev");
let next = document.getElementById("inext");

next.style.visibility = "visible";

showSlide(slideIndex, "slide");


function plusSlide(n)
{
    
    showSlide(slideIndex += n,"slide")
}
function currentSlide(n)
{
    showSlide(slideIndex = n, "slide")

}

// slide of items

function itemPlusSlide(n)
{
    translateValue += n * 50;
    showSlideItem(translateValue);
    slideItemIndex += -n;
    prev.style.visibility ="visible";
    next.style.visibility = "visible";
    if (slideItemIndex > items.length)
        {
            next.style.visibility ="hidden";
        }
    if (slideItemIndex < 1)
        {
            prev.style.visibility ="hidden";
        }
}


function showSlideItem(translateValue)
{
    let i;
    for(i = 0; i < items.length; i++)
        {
            items[i].style.transform = "translateX(" + translateValue + "px)";
        }
}

function showSlide(n, slide)
{

    let i ;
    let slides = document.getElementsByClassName(slide);
    let dots = document.getElementsByClassName("dot");
    if(n > slides.length)
    {
        slideIndex = 1;
    }
    if(n < 1)
    {
        slideIndex = slides.length; 
    }
    for(i = 0; i < slides.length; i++)
    {
        slides[i].style.display = "none";
    }
    for(i = 0; i < dots.length; i++)
    {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex - 1].style.display = "block";
    dots[slideIndex -1 ].className += " active"; 
    setTimeout(()=>
    {
        slideIndex++;
        showSlide(slideIndex, "slide");
    }, 3000);
}

// login
function f_login()
{
    window.location.href = "http://127.0.0.1:5500/login-reigis/login.html"
}