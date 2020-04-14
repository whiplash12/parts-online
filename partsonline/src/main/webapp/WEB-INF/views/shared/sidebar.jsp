<!-- <h1 class="my-4">Shop Name</h1> -->

<div class="list-group"><br/>

	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.category_id}/products"
			class="list-group-item" id="a_${category.category_name}">${category.category_name}</a>
	</c:forEach>

</div>