function testAjaxPost()
{
	$.ajax({
        url: "/fund/history/getHistory",
        type: "POST",
        dataType: "json",
        async: false,
        data: {
          "fundCode": "1"
        },
        success: function(data) {
          alert("success");
          alert(data);
        },
        error: function() {
          alert("error");
        }
      });
}