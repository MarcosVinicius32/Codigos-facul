const button = document.querySelector('.button-add-task')
const input = document.querySelector('.input-task')
const listaCompleta = document.querySelector('.list-task')
let minhalistadeitens = []
function adicionarNovaTarefa(){
    minhalistadeitens.push({
        tarefa: input.ariaValue,
        concluida : false,
    })
    input.value =''
    mostrarTarefas()
}
function mostrarTarefas(){
    let novaLi = ''
    //['criação lista , 'estuadar programação']
    minhalistadeitens.forEach((item,posicao)=>){
        novaLi =
        novaLi +
        <li class="task ${item.concluida && 'done"}>
        <img src="./img/chevked.png" alt="check-na-tarefa" onclick="concluirTarefa($(posicao})">
        <p>${item.tarefa}</p>
        <img src="./img/trash.png" alt="Tarefa-para-lixo" onclick="deletarItem($(posicao})">
        </img>
        </img>
        </li>
        })
      listaCompleta.innerHTML = novaLi
      localStorage.setItem('lista', JSON.stringify(minhalistadeitens))
      }
      function concluirTarefa(posicao){
        minhalistadeitens.splice(posicao,1)
        mostrarTarefas()
      }
      function recarregarTarefas(){
        const tarefasDoLocalStorege = localStorage.getItem('lista')
        if (tarefasDoLocalStorege){
            minhalistadeitens = JSON.parse(tarefaDostorege)
        }
        mostrarTarefas()
      }
      recarregarTarefas(
        button.addEventListener('click' , adicionarNovaTarefa)
      )
    }

}
