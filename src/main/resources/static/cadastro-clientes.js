<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Cadastro de Clientes - PCars Project</title>
</head>

<body>
    <header>
        <h1>Cadastro de Clientes</h1>
    </header>

    <nav>
        <ul>
            <li><a href="index.html">Página Inicial</a></li>
        </ul>
    </nav>

    <main>
        <form id="cliente-form">
            <label for="nome">Nome:</label>
            <input type="text" id="nome" required>

            <label for="cpf">CPF:</label>
            <input type="text" id="cpf" required>

            <label for="cnh">CNH:</label>
            <input type="text" id="cnh" required>

            <label for="telefone">Telefone:</label>
            <input type="text" id="telefone" required>

            <button type="button" onclick="adicionarCliente()">Adicionar Cliente</button>
        </form>

        <table id="clientes-table">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>CNH</th>
                    <th>Telefone</th>
                </tr>
            </thead>
            <tbody>
                <!-- Os clientes adicionados serão exibidos aqui -->
            </tbody>
        </table>
    </main>

    <footer>
        <p>&copy; 2023 PCars Project. Todos os direitos reservados.</p>
    </footer>

    <script src="script.js"></script>
    <script src="cadastro-clientes.js"></script>
</body>

</html>