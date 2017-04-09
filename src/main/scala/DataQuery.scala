
class DataQuery {

  def findUserByEmail(email: String) = {
    val res = Connector.session.execute(s"SELECT * FROM User where email = '$email'")
    val iterator = res.iterator()
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }

  def videoByName(videoname: String) = {
    val res = Connector.session.execute(s"SELECT * FROM VideoByName where videoname = '$videoname'")
    val iterator = res.iterator()
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }

  def videoByYear(year: Int) = {
    val res = Connector.session.execute(s"SELECT * FROM VideoByYear where year>$year ALLOW FILTERING")
    val iterator = res.iterator()
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }

  def videoByUserAndYear(userid: Int, year: Int) = {
    val res = Connector.session.execute(s"SELECT * FROM VideoByUseridYear where userid = $userid AND year>=$year ORDER BY year DESC")
    val iterator = res.iterator()
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }

}
