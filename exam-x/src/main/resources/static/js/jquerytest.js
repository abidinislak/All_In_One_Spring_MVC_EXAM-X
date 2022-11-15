

$("#buttonJquery").click(function(){
	var obj=$("#category").val();
		
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

var table = $('#employeesTable').DataTable();
table.ajax.reload();
				}
		else if (response == "hata") {

								alert("OPPPS.. Something wrong");
							}
						}).fail(function() {
							alert("Oppss..  Something wrong and we dont know why, please conatct admin");
				});



});


   function  test(id){

 $.post("/denemePurejavascript",
{

sendid:id
},
    function(data){

     var table = $('#employeesTable').DataTable();
     table.ajax.reload();



    });
   }
$(document).ready(function(){
	 var table = $('#employeesTable').DataTable({
			ajax: "/categorylist",
			"sAjaxDataProp": "",
			order: [[ 0, "asc" ]],
			columns: [
                { data: "id"},
		      { data: "name" },
		      {
                  data: null,
                  render: function (data, type, row) {
                                          let val = '';
                                          val += `<a onclick="test(${row.id})" class="btn btn-primary m-2"><i class="fas fa-drafting-compass"></i>  Delete </a>`;

                    return val;
                  }
              }


			]
	 })




});
