<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Feel n Chill</title>

    <!-- font -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&display=swap" rel="stylesheet">

    <!-- icon -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<link rel="stylesheet" href="<c:url value="/assets/css/home.css"/>">
    <script type="text/javascript" src="<c:url value="/assets/js/home.js"/>"></script>
</head>
<body>
    <div class="header">
        <div class="h-top">
            <div class="logo">
                <img src="assets/src-file/img/Green Light Home Shop About Contact-Photoroom.png"	 style ="width: 9vw;"alt="">
                <h1>Feel n Chill</h1>
            </div>
            <div class="h-center">
                <search>
                    <form method="POST" action="">
                        <label for="search"></label>
                        <input type="search" id="search" name="keyword" placeholder="  Typing..." />
                      
                        <button id = "btn-search" 	type="submit">
                            <i class="fa-solid fa-magnifying-glass"></i>
                            Search
                        </button>
                    </form>
                  </search>
            </div>
            <div class="h-right">
                <button type="submit" id = "login" onclick="f_login()">
                    <i class="fa-solid fa-right-to-bracket"></i>
                    Login
                </button>
            </div>
        </div>
        <div class="header-list">
            <ul>
                <li><a href="">Specials</a></li>
                <li><a href="">Thương hiệu</a></li>
                <li><a href="">Sản phẩm</a></li>
                <li><a href="">Chia sẻ trải nghiệm</a></li>
                <li><a href="">Thông tin cửa hàng</a></li>
            </ul>
        </div>
    </div>
    <div class="main-container"></div>
        <div class="slideshow-container">
            <div class="slideshow">
                <div class="slide">
        			<img src="assets/src-file/img\SLVN_Multi_Effects_Pedals_Amp_Modellers_Ft_CE24_Non-Full-Width-Slideshow_Desktop_1110X333_1x_2220x666_2x_74d47715-2b31-49d2-98df-35d2ae08118c_1110x333_crop_top.png" alt="">
                </div>
                <div class="slide">
                    <img src="assets/src-file/img\SLVN_Heritage_Ascent_Bundle_Non-Full-Width-Slideshow_Desktop_1110X333_1x_2220x666_2x_3a149b64-3b2c-48ab-b2a6-340d0ca9f594_2220x666_crop_top.png" alt="">
                </div>
                <div class="slide">
                    <img src="assets/src-file/img\SLVN_PRS_New_Arrivals_Ft_CE24_Non-Full-Width-Slideshow_Desktop_1110X333_1x_2220x666_2x_e2bef85c-e5cb-44be-a6d7-a467601d8e34_2220x666_crop_top.png" alt="">
                </div>
                <div class="change">
                    <i id = "prev" onclick = "plusSlide(-1)" class="fa-solid fa-angle-left"></i>
                    <i id = "next" onclick = "plusSlide(1)" class="fa-solid fa-angle-right"></i>
                </div>
            </div>
            <div class="slidedot">
                <span class="dot" onclick ="currentSlide(1)"></span>
                <span class="dot" onclick ="currentSlide(2)"></span>
                <span class="dot" onclick ="currentSlide(3)"></span>
            </div>  
        </div>
        <div class="service-container">
            <div class="service">
                <i class="fa-solid fa-truck"></i>
                <div class="service-content">
                    <h1>Miễn phí giao hàng</h1>
                    <span>Ưu đãi vận chuyển với hàng loạt voucher cực xịn</span>
                </div>
            </div>
            <div class="service">
                <i class="fa-solid fa-business-time"></i>
                <div class="service-content">
                    <h1>Click & collect</h1>
                    <span>Nhận hàng tại store sau 2h</span>
                </div>
            </div>
            <div class="service">
                <i class="fa-solid fa-file-invoice"></i>
                <div class="service-content">
                    <h1>Thanh toán bảo đảm</h1>
                    <span>Mua hàng trực tuyến dễ dàng, nhanh chóng</span>
                </div>
            </div>
               
            <div class="service">
                <i class="fa-solid fa-rotate"></i>
                <div class="service-content">
                    <h1>13 ngày hoàn trả</h1>
                    <span>Tận hưởng chính sách linh hoạt khi bạn đổi ý</span>
                </div>
            </div>
        </div>
        <div class="sort-container">
            <div class="brandSort">
                <h2>Tìm theo thương hiệu</h2>
                <div class="brand">
                    <ul>
                        <li><img class ="item" src="assets/src-file/brand\brands_2F6_2Ffender_1582874349627_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\brands_2F104_2Felixir_1647598509279_90x90.png" alt=""></li>
                        <li><img class ="item" rc="assets/src-file/brand\focusrite_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\harmony_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\ibanez_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\marshall_a6fe8954-3e6b-4b44-a849-9fbe0abcde9b_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\mono_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\squier_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\tama_90x90.png  " alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\brands_2F6_2Ffender_1582874349627_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\brands_2F104_2Felixir_1647598509279_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\focusrite_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\harmony_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\ibanez_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\marshall_a6fe8954-3e6b-4b44-a849-9fbe0abcde9b_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\mono_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\squier_90x90.png" alt=""></li>
                        <li><img class ="item" src="assets/src-file/brand\tama_90x90.png  " alt=""></li>
                    </ul>
                </div>
                <div class="change">
                    <i id = "iprev" onclick = "itemPlusSlide(1)" class="fa-solid fa-angle-left"></i>
                    <i id = "inext" onclick = "itemPlusSlide(-1)" class="fa-solid fa-angle-right"></i>
                </div>
            </div>
            <div class="itemSort">
                <div class="title">
                    <h2>Tìm theo sản phẩm</h2>
                    <span>Xem tất cả sản phẩm</span>
                </div>
                <div class="itemIcon">
                    <ul>
                        <li>
                            <img class ="item" src="assets/src-file/itemSort\drumsSort.png" alt="">
                            <p>Drum</p>
                        </li>
                        <li>
                            <img class ="item" src="assets/src-file/itemSort\guitarSort.png" alt="">
                            <p>Guitar & bass</p>
                        </li>
                        <li>
                            <img class ="item" src="assets/src-file/itemSort\keyboardSort.png" alt="">
                            <p>Keyboard & piano</p>
                        </li>
                    </ul>
                </div>
                <div class="change">
                    <i id = "iprev" onclick = "itemPlusSlide(1)" class="fa-solid fa-angle-left"></i>
                    <i id = "inext" onclick = "itemPlusSlide(-1)" class="fa-solid fa-angle-right"></i>
                </div>
            </div>
        </div>
        <div class="bestSeller-container">
            <h2>Sản phẩm bán chạy</h2>
            <div class="product-container">
                <div class="product">
                    <div class="p">
                        <img  src="assets/src-file/items\guitar\products_2FA00-HRT-016119121-BDL_2FA00-HRT-016119121-BDL_1707278895220_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img  src="assets/src-file/items\guitar\products_2FF03-011-8030-771_2FF03-011-8030-771_1707890484630_158x158_crop_center.png" alt="">                        
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img  src="assets/src-file/items\guitar\products_2FF03-014-7040-397_2FF03-014-7040-397_1708058288260_158x158_crop_center.png" alt="">                        
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img  src="assets/src-file/items\guitar\products_2FF03-014-9835-377_2FF03-014-9835-377_1705548175670_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img  src="assets/src-file/items\guitar\products_2FF03-014-9903-579_2FF03-014-9903-579_1712217239830_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
            </div>
        </div>
        <div class="bestSeller-container">
            <div class="title">
                <h2>Hàng mới về</h2>
                <span>Xem tất cả sản phẩm mới</span>
            </div>
            <div class="product-container">
                <div class="product">
                    <div class="p">
                        <img src="assets/src-file/items\guitar\products_2FM07-11LXK2_2FM07-11LXK2_1689212939570_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img src="assets/src-file/items\guitar\products_2FI01-GWB1005-NTF_2FI01-GWB1005-NTF_1713433811540_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img src="assets/src-file/items\guitar\products_2FI01-GWB35BKF_2FI01-GWB35BKF_1713509505790_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img src="assets/src-file/items\guitar\products_2FI01-AE245-NT_2FI01-AE245-NT_1713429885670_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
                <div class="product">
                    <div class="p">
                        <img src="assets/src-file/items\guitar\products_2FF03-560-1600-306_2FF03-560-1600-306_1699955390720_158x158_crop_center.png" alt="">
                        <span></span>
                    </div>
                    <div class="status">
                        <h3>Có hàng</h3>
                        <span></span>
                    </div>
                </div>
            </div>
        </div>
        <div class="offer">
            <img src="assets/src-file/items\offer\offer1.png" alt="">
            <img src="assets/src-file/items\offer\offer2.png" alt="">
        </div>
       
    
    
</body>
</html>