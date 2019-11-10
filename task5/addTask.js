window.onload = function() {

	document.getElementById('todo-button-add').onclick = function() {

	let inText = document.getElementById('in').value.trim() ;

	if (inText) {
    document.getElementById('list').innerHTML += '<li>'+inText+ '</li>';
	}
	}
}
