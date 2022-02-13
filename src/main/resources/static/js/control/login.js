const login = () => {
    alert('Estas entrando al sistema...');
    url = "../casas.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}