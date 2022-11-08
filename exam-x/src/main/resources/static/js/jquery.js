$(document).ready(function(){
//alert("test ankara");


$("#buttonJquery").click(function(){
	var obj=$("#category").val();
		alert(obj);

	url = "/categories/check_unique";
		csrfValue = $("input[name='_csrf']").val();




params = {
category : obj,
			_csrf : csrfValue
		};

$.post(
	url,
	params,
	function(response)
	 {
	 debugger;
			if (response == "oldu") {
			alert("oldu");
										}
		else if (response == "hata") {

								alert("OPPPS.. Something wrong");
							}
						}).fail(function() {
							alert("Oppss..  Something wrong and we dont know why, please conatct admin");
				});



});

$(document).ready( function () {
	 var table = $('#employeesTable').DataTable({
			"sAjaxSource": "/categorylist",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		      { "mData": "name" }

			]
	 })
});





});