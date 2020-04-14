<div class="container">

	<div class="row">

		<div class="col-lg-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>
		<!-- /.col-lg-3 -->
		<!-- Added Breadcrumb -->

		<div class="col-lg-9">
			<br />

			<c:if test="${userClicksAllProducts == true}">
				<script>
					window.categoryId = '';
				</script>
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home / </a></li>
					<li class="active">&nbsp;All Products</li>
				</ol>
			</c:if>

			<c:if test="${userClicksCategoryProducts == true}">
				<script>
					window.categoryId = '${category.category_id}';
				</script>
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home / </a></li>
					<li class="active">&nbsp;${category.category_name}</li>
				</ol>
			</c:if>

			<table id="productListTable"
				class="table table-striped  table-borderd ">

				<thead>
				
					<tr>
						<th></th>
						<th>Name</th>
						<th>Brand</th>
						<th>Price</th>
						<th>Qty. Available</th>
						<th></th>
					</tr>
				</thead>
				
				<tfoot>
					<tr>
						<th></th>
						<th>Name</th>
						<th>Brand</th>
						<th>Price</th>
						<th>Qty. Available</th>
						<th></th>
					</tr>
				</tfoot>

			</table>

		</div>

	</div>
	<!-- /.row -->

</div>
<!-- /.container -->