// Script para lidar com a lógica de cadastro de veículos

function adicionarVeiculo() {
    // Obter valores do formulário
    var modelo = document.getElementById("modelo").value;
    var placa = document.getElementById("placa").value;
    var marca = document.getElementById("marca").value;
    var valor = document.getElementById("valor").value;

    // Validar se os campos foram preenchidos
    if (modelo && placa && marca && valor) {
        // Criar uma nova linha na tabela
        var table = document.getElementById("veiculos-table").getElementsByTagName('tbody')[0];
        var newRow = table.insertRow(table.rows.length);

        // Inserir células na nova linha
        var cell1 = newRow.insertCell(0);
        var cell2 = newRow.insertCell(1);
        var cell3 = newRow.insertCell(2);
        var cell4 = newRow.insertCell(3);

        // Preencher células com os dados do veículo
        cell1.innerHTML = modelo;
        cell2.innerHTML = placa;
        cell3.innerHTML = marca;
        cell4.innerHTML = valor;

        // Limpar campos do formulário
        document.getElementById("modelo").value = "";
        document.getElementById("placa").value = "";
        document.getElementById("marca").value = "";
        document.getElementById("valor").value = "";
    } else {
        alert("Por favor, preencha todos os campos.");
    }
}
