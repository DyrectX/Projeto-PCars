function adicionarCliente() {
    // Obter valores do formulário
    var nome = document.getElementById("nomeCliente").value;
    var cpf = document.getElementById("cpf").value;
    var cnh = document.getElementById("cnh").value;
    var telefone = parseInt(document.getElementById("telefone").value);

    // Validar se os campos foram preenchidos
    if (nome && cpf && cnh && telefone) {
        // Criar uma nova linha na tabela
        var table = document.getElementById("clientes-table").getElementsByTagName('tbody')[0];
        var newRow = table.insertRow(table.rows.length);

        // Inserir células na nova linha
        var cell1 = newRow.insertCell(0);
        var cell2 = newRow.insertCell(1);
        var cell3 = newRow.insertCell(2);
        var cell4 = newRow.insertCell(3);

        // Preencher células com os dados do cliente
        cell1.innerHTML = nome;
        cell2.innerHTML = cpf;
        cell3.innerHTML = cnh;
        cell4.innerHTML = telefone;

        // Limpar campos do formulário
        document.getElementById("nomeCliente").value = "";
        document.getElementById("cpf").value = "";
        document.getElementById("cnh").value = "";
        document.getElementById("telefone").value = "";
    } else {
        alert("Por favor, preencha todos os campos.");
    }
}
