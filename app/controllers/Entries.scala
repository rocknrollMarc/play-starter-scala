package package controllers

import play.api._
import play.api.mvc._
import play.api.data.Forms._
import play.api.data._

// substitute class name !!!
import models.{Entries => DAO}

/** Uncomment the following lines as needed **/
/**
import play.api.Play.current
import play.api.libs._
import play.api.libs.iteratee._
import play.api.libs.concurrent._
import java.util.concurrent._
import scala.concurrent.stm._
import akka.util.duration._
import play.api.cache._
import play.api.libs.json._
**/

object Entries extends Controller {

  def list(filter: String) = Action {
    val entries = DAO.findByName(filter.trim)
    Ok(views.html.index(entries))
  }

  def remove(id: Long) = Action {
    DAO.delete(id)
    Redirect(routes.Entries.list())
  }

  def edit(id: Long) = TODO

  def save = TODO

}