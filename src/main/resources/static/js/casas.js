const cerrarSesion = () => {
    alert('Cerrando sesión, espere...');
    url = "../views/login.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}

const consultarBitacora = () => {
    url = "../views/bitacora.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}