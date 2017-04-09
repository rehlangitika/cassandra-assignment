import com.datastax.driver.core.Cluster

object Connector extends App {

  val cluster = Cluster.builder().addContactPoint("127.0.0.1").build()
  val session = cluster.connect("data")
  val dataQuery = new DataQuery
  println("Executing Query 1: ")
  val ansQuery1 = dataQuery.findUserByEmail("gitikarehlan@gmail.com")
  println("Executing Query 2: ")
  val ansQuery2 = dataQuery.videoByName("afreen afreen")
  println("Executing Query 3: ")
  val ansQuery3 = dataQuery.videoByYear(2015)
  println("Executing Query 4: ")
  val ansQuery4 = dataQuery.videoByUserAndYear(1, 2014)
  session.close()

}
