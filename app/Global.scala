import models.{Entry, Entries => DOA}
import play.api._

object Global extends GlobalSettings {

    override def onStart(app: Application) {

        DAO.save(Entry("Guillaume Bort", "+33 5 55 55 55 55"))
        DAO.save(Entry("Sadek Drobi", "+33 5 55 55 55 55"))
    }
}