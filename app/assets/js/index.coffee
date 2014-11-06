$ ->
	$.get "/persons", (persons) ->
		$.each persons, (index, listEmployee) ->
			$('#persons').append $("<li>").text listEmployee.name