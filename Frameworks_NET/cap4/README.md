Convenção 

[HttpGet]

public IActionResult Create()
{
    return View();
}

Ele entende que o nome da view é o nome do método, então não precia colocar um create ali depois da view


        <form asp-action="Create" asp-controller="Cliente">

Essa tag diz qual o controller e a action.


        public IActionResult Create(ClienteModel clienteModel) 
        {
            return RedirectToAction(nameof(Index));
        }

Use o RedirectToAction(nameof(Index)); para voltar para o indice

TempData é uma ferramenta útil para transmitir informações temporárias entre ações do Controller