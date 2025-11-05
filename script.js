
   document.addEventListener('DOMContentLoaded', () => {
    
    const headerNav = document.querySelector('header nav');
    
    const menuToggle = document.createElement('button');
    menuToggle.textContent = '☰';
    menuToggle.classList.add('menu-toggle');
    menuToggle.setAttribute('aria-expanded', 'false');
    menuToggle.setAttribute('aria-controls', 'main-navigation');
    
    document.querySelector('header').prepend(menuToggle);
    headerNav.id = 'main-navigation';

    menuToggle.addEventListener('click', () => {
        const isExpanded = menuToggle.getAttribute('aria-expanded') === 'true' || false;
        menuToggle.setAttribute('aria-expanded', !isExpanded);
        headerNav.classList.toggle('active');
    });

    const inputCPF = document.querySelector('.input-mascara-cpf');
    const inputTelefone = document.querySelector('.input-mascara-tel');
    const inputCEP = document.querySelector('.input-mascara-cep');

    if (inputCPF) inputCPF.addEventListener('input', (e) => mascaraCPF(e.target));
    if (inputTelefone) inputTelefone.addEventListener('input', (e) => mascaraTelefone(e.target));
    if (inputCEP) inputCEP.addEventListener('input', (e) => mascaraCEP(e.target));

    function mascaraCPF(campo) {
        let valor = campo.value.replace(/\D/g, ""); 
        valor = valor.replace(/(\d{3})(\d)/, "$1.$2");
        valor = valor.replace(/(\d{3})(\d)/, "$1.$2");
        valor = valor.replace(/(\d{3})(\d{1,2})$/, "$1-$2");
        campo.value = valor.substring(0, 14);
    }

    function mascaraTelefone(campo) {
        let valor = campo.value.replace(/\D/g, ""); 
        valor = valor.replace(/^(\d{2})(\d)/g, "($1) $2");

        if (valor.length <= 14) { 
            valor = valor.replace(/(\d{4})(\d)/, "$1-$2");
        } else {
            valor = valor.replace(/(\d{5})(\d)/, "$1-$2");
        }
        campo.value = valor.substring(0, 15);
    }

    function mascaraCEP(campo) {
        let valor = campo.value.replace(/\D/g, ""); 
        valor = valor.replace(/^(\d{5})(\d)/, "$1-$2");
        campo.value = valor.substring(0, 9);
    }
});