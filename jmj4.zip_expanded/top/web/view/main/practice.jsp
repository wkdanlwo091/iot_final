<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!-- 연습 코드  -->
<script>
HTML CSS JSResult
$( document ).ready ( function ()
{
    console.log('ready!');
    $('[data-toggle="tooltip"]').tooltip();
    var template = $( '#template' ).html ();
    Mustache.parse ( template );
    var rendered = Mustache.render ( template, get_basket () );
    $( '#template' ).html ( rendered );
    if ( $('.basket-body').hasScrollBar () )
    {
        $('.column-titles').addClass('fix-overflow');
        $('.basket-body').niceScroll({autohidemode: false,cursorcolor:"#ffffff",cursorborder:"1px solid #D0D0D0",cursorborderradius: "0",background: "#ffffff"});
    }
    else
    {
        $('.column-titles').removeClass('fix-overflow');
    }
    
    $('.card-expiration').datepicker({
    format: "mm/yyyy",
    startView: "months", 
    minViewMode: "months"        
});
});

function get_basket ()
{
    var products =
    [ 
        { name: "Product 1 lorem", additional: "Additional Informations", quantity: 1, unit: "pc", price: 10, thumbnail: "http://via.placeholder.com/200x200" }, 
        { name: "Product 2 ipsum", additional: "Additional Informations", quantity: 1, unit: "kg", price: 20, thumbnail: "http://via.placeholder.com/640x480" }, 
        { name: "Product 3 dolor sit amet", additional: "Additional Informations", quantity: 2, unit: "l", price: 30, thumbnail: "http://via.placeholder.com/1920x1080" },
        { name: "Product 4 consectetur adipiscing elit", additional: "Additional Informations", quantity: 1, unit: "pcs", price: 25, thumbnail: "http://via.placeholder.com/800x400" },
        { name: "Product 5 sed dapibus nibh", additional: "Additional Informations", quantity: 3, unit: "pcs", price: 9, thumbnail: "http://via.placeholder.com/400x800" },
        { name: "Product 6 sit amet maximus ultrices", additional: "Additional Informations", quantity: 1, unit: "pcs", price: 13, thumbnail: "http://via.placeholder.com/2048x1024" },
        { name: "Product 7 duis rutrum", additional: "Additional Informations", quantity: 5, unit: "pcs", price: 200, thumbnail: "http://via.placeholder.com/20x20" },
        { name: "Product 8 efficitur lectus et facilisis", additional: "Additional Informations", quantity: 1, unit: "pc", price: 350, thumbnail: "http://via.placeholder.com/256x64" },
        { name: "Product 9 nulla at ipsum nec risus vestibulum ullamcorper", additional: "Additional Informations", quantity: 10, unit: "pcs", price: 70, thumbnail: "http://via.placeholder.com/64x256" },
        { name: "Product 10 proin facilisis magna", additional: "Additional Informations", quantity: 4, unit: "pcs", price: 1000, thumbnail: "http://via.placeholder.com/1024x768" },
        { name: "Product 11 donec at arcu a tortor pellentesque cursus vel a quam", additional: "Additional Informations", quantity: 300, unit: "pcs", price: 6600, thumbnail: "http://via.placeholder.com/400x100" },
        { name: "Product 12 nulla auctor libero in velit vulputate", additional: "Additional Informations", quantity: 6, unit: "pcs", price: 17.5, thumbnail: "http://via.placeholder.com/100x500" }
    ]
    return { "products": products, "order_number": "1-23-456789A", "subtotal": 13579, "taxes": 246, "shipping_cost": 810, "total": 16825, "currency": "&dollar;" };
}

//https://stackoverflow.com/questions/4814398/how-can-i-check-if-a-scrollbar-is-visible
(function($) {
    $.fn.hasScrollBar = function() {
        return this.get(0).scrollHeight > this.height();
    }
})(jQuery);


</script>
</head>
<body>
	HTML CSS JSResult
	<div class="container-fluid background">
		<div class="row padding-top-20">
			<div
				class="col-12 col-sm-12 col-md-10 col-lg-10 col-xl-8 offset-md-1 offset-lg-1 offset-xl-2 padding-horizontal-40">
				<div class="row">
					<div class="col-12 main-wrapper">
						<div class="row">
							<div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
								<div id="template" class="row panel-wrapper">
									<div class="col-12 panel-header basket-header">
										<div class="row">
											<div class="col-6 basket-title">
												<span class="description">review your</span><br> <span
													class="emphasized">Cart Summary</span>
											</div>
											<div class="col-6 order-number align-right">
												<span class="description">order #</span><br> <span
													class="emphasized">{{order_number}}</span>
											</div>
										</div>
										<div class="row column-titles padding-top-10">
											<div class="col-2 align-center">
												<span>Photo</span>
											</div>
											<div class="col-5 align-center">
												<span>Name</span>
											</div>
											<div class="col-2 align-center">
												<span>Quantity</span>
											</div>
											<div class="col-3 align-right">
												<span>Price</span>
											</div>
										</div>
									</div>
									<div class="col-12 panel-body basket-body">
										{{#products}}
										<div class="row product">
											<div class="col-2 product-image">
												<img src="{{thumbnail}}">
											</div>
											<div class="col-5">
												{{name}}<br> <span class="additional">{{additional}}</span>
											</div>
											<div class="col-2 align-right">
												<span class="sub">{{unit}}</span> {{quantity}}
											</div>
											<div class="col-3 align-right">
												<span class="sub">{{{currency}}}</span> {{price}}
											</div>
										</div>
										{{/products}}
									</div>
									<div class="col-12 panel-footer basket-footer">
										<hr>
										<div class="row">
											<div class="col-8 align-right description">
												<div class="dive">Subtotal</div>
											</div>
											<div class="col-4 align-right">
												<span class="emphasized">{{{currency}}}{{subtotal}}</span>
											</div>
											<div class="col-8 align-right description">
												<div class="dive">Taxes</div>
											</div>
											<div class="col-4 align-right">
												<span class="emphasized">{{{currency}}}{{taxes}}</span>
											</div>
											<div class="col-8 align-right description">
												<div class="dive">Shipping</div>
											</div>
											<div class="col-4 align-right">
												<span class="emphasized">{{{currency}}}{{shipping_cost}}</span>
											</div>
										</div>
										<hr>
										<div class="row">
											<div class="col-8 align-right description">
												<div class="dive">Total</div>
											</div>
											<div class="col-4 align-right">
												<span class="very emphasized">{{{currency}}}{{total}}</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
								<div class="row panel-wrapper">
									<div class="col-12 panel-header creditcard-header">
										<div class="row">
											<div class="col-12 creditcard-title">
												<span class="description">please enter your</span><br>
												<span class="emphasized">Credit Card Information</span>
											</div>
										</div>
									</div>
									<div class="col-12 panel-body creditcard-body">
										<form action="#" method="post" target="_self">
											<fieldset>
												<label for="card-name">Name on the Card</label><br> <i
													class="fa fa-user-o" aria-hidden="true"></i><input
													type='text' id='card-name' name='card-name'
													placeholder='John Doe' title='Name on the Card'>
											</fieldset>
											<fieldset>
												<label for="card-number">Card Number</label><br> <i
													class="fa fa-credit-card" aria-hidden="true"></i><input
													type='text' id='card-number' name='card-number'
													placeholder='1234 5678 9123 4567' title='Card Number'>
											</fieldset>
											<fieldset>
												<label for="card-expiration">Expiration Date</label><br>
												<i class="fa fa-calendar" aria-hidden="true"></i><input
													type='text' id='card-expiration' name='card-expiration'
													placeholder='YY/MM' title='Expiration'
													class="card-expiration">
											</fieldset>
											<fieldset>
												<label for="card-ccv">CVC/CCV</label>&nbsp;<i
													class="fa fa-info-circle" aria-hidden="true"
													data-toggle="tooltip" data-placement="right"
													title="The CVV Number on your credit card or debit card is a 3 digit number on VISA, MasterCard and Discover branded credit and debit cards. On your American Express branded credit or debit card it is a 4 digit numeric code."></i><br>
												<i class="fa fa-lock" aria-hidden="true"></i><input
													type='text' id='card-ccv' name='card-ccv' placeholder='123'
													title='CVC/CCV'>
											</fieldset>
										</form>
									</div>
									<div class="col-12 panel-footer creditcard-footer">
										<div class="row">
											<div class="col-12 align-right">
												<button class="cancel">Cancel</button>
												&nbsp;
												<button class="confirm">Confirm & Pay</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>