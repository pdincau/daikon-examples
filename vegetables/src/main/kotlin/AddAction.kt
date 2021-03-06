import daikon.Context
import daikon.Request
import daikon.Response
import daikon.RouteAction

class AddAction(val repository: VegetableRepository) : RouteAction {

    override fun handle(request: Request, response: Response, context: Context) {
        val name = request.param("name")
        val description = request.param("description")
        repository.add(Vegetable(name, description))

        response.redirect("/")
    }
}
