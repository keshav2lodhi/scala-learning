package kafka.consumers

import java.util.Properties
import org.apache.kafka.clients.consumer.KafkaConsumer

/**
 * Kafka properties for consumer groups
 *
 **/
object KafkaConsumer1 {

  def consumeFromKafka(topic: String): KafkaConsumer[String, String] = {
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("auto.offset.reset", "latest")
    props.put("group.id", "consumer-group1")
    val consumer: KafkaConsumer[String, String] = new KafkaConsumer[String, String](props)
    consumer
  }
}
