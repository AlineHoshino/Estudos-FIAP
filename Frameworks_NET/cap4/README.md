Convenção 

[HttpGet]

public IActionResult Create()
{
    return View();
}

Ele entende que o nome da view é o nome do método, então não precia colocar um create ali depois da view


        <form asp-action="Create" asp-controller="Cliente">

Essa tag diz qual o controller e a action.
10:38 vídeo views 