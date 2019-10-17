package kafka.producer

import java.util.Properties
import org.apache.kafka.clients.producer.KafkaProducer

/**
 * Kafka producer
 *
 **/
object KafkaProducer {
  val props = new Properties()
  val kProducer: KafkaProducer[String, String] = getKafkaProducer()

  def getKafkaProducer(): KafkaProducer[String, String] = {

    props.put("bootstrap.servers", "localhost:9092")
    props.put("client.id", "test")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    //props.put("partitioner.class", "de.cidaas.fds.kafka.TenantPartitioner")

    new KafkaProducer[String, String](props)
  }
}
