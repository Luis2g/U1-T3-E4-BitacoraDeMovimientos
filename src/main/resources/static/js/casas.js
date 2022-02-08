const cerrarSesion = () => {
    alert('Cerrando sesión, espere...');
    url = "../login.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}

const consultarBitacora = () => {
    url = "../bitacora.html"
    var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
}