import logo from '../../assets/img/logo-icon.svg';

import './styles.css'

function Header() {
    return(
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="" />
                <h1> DSMeta </h1>
                <p>
                    Desenvolvidor por
                    <a href="https://github.com/segredo-luciano"> Luciano Segredo </a>
                </p>
            </div>
        </header>
    )
} export default Header