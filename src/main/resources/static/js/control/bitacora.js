const cerrarSesion = () => {
    alert('Cerrando sesión, espere...');
    url = "../login.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}

const consultarCasas = () => {
    url = "../casas.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}