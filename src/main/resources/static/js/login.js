const login = () => {
    alert('Estas entrando al sistema...');
    url = "../views/casas.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}