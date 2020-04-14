<div class="container">

	<div class="row">
		<div class="col-lg-12">
			<br />
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item"><a href="${contextRoot}/show/all/products">Products</a></li>
					<li class="breadcrumb-item active">${product.product_name}</li>
				</ol>
			</nav>
		</div>
	</div>

	<div class="row">

		<!-- Display the product image -->
		<div class="cols-lg-4">
			<img src="${images}/${product.product_code}.jpg"
				class="img-fluid" />
		</div>

		<!-- Display the product description -->
		<div class="cols-lg-8">
			<h3>${product.product_name}</h3>
			<hr />

			<p>${product.product_description}</p>
			<hr />

			<h4>
				Price: <strong>&#8377; ${product.product_unit_price} /-</strong>
			</h4>
			<hr />

			<h6>Qty. Available: ${product.product_quantity}</h6>

			<a href="${contextRoot}/cart/add/${product.product_id}/product"
				class="btn btn-success"><i class="fa fa-shopping-cart"></i>&nbsp;Add
				to Cart</a> <a href="${contextRoot}/show/all/products"
				class="btn btn-primary">Back</a>
		</div>

	</div>

</div>