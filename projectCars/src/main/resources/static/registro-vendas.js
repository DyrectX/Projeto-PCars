// Script para lidar com a lógica de registro de vendas

function registrarVenda() {
    // Obter valores do formulário
    var cliente = document.getElementById("cliente").value;
    var veiculo = document.getElementById("veiculo").value;
    var data = document.getElementById("data").value;
    var valor = document.getElementById("valor").value;

    // Validar se os campos foram preenchidos
    if (cliente && veiculo && data && valor) {
        // Criar uma nova linha na tabela
        var table = document.getElementById("vendas-table").getElementsByTagName('tbody')[0];
        var newRow = table.insertRow(table.rows.length);

        // Inserir células na nova linha
        var cell1 = newRow.insertCell(0);
        var cell2 = newRow.insertCell(1);
        var cell3 = newRow.insertCell(2);
        var cell4 = newRow.insertCell(3);

        // Preencher células com os dados da venda
        cell1.innerHTML = cliente;
        cell2.innerHTML = veiculo;
        cell3.innerHTML = data;
        cell4.innerHTML = valor;

        // Limpar campos do formulário
        document.getElementById("cliente").value = "";
        document.getElementById("veiculo").value = "";
        document.getElementById("data").value = "";
        document.getElementById("valor").value = "";
    } else {
        alert("Por favor, preencha todos os campos.");
    }
}
