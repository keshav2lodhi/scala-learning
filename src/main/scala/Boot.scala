import java.util
import java.util.Arrays

import kafka.consumers.{KafkaConsumer1, KafkaConsumer2, KafkaConsumer3}
import kafka.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.TopicPartition

import collection.JavaConverters._

/**
 * An application to check kafka behaviour based on number of
 * partitions and consumer groups
 *
 **/
object Boot extends App {

  var count = 0
  while (true) {
    val testing = "{\"count_no\": \"" + count + "\"}"
    val testingRecord: ProducerRecord[String, String] = new
        ProducerRecord[String, String]("test-topic-new", 1, null, testing)
    KafkaProducer.kProducer.send(testingRecord)

    count = count + 1
    if (count >= 7)
      Thread.sleep(60000)
  }
}

object Boot1 extends App {
  val consumer1 = KafkaConsumer1.consumeFromKafka("test-topic-new")
  val list = new util.ArrayList[TopicPartition]()
  list.add((new TopicPartition("test-topic-new", 1)))
  consumer1.assign(list)
  while (true) {
    val record = consumer1.poll(10).asScala
    for (data <- record.iterator) {
      println("consumer1:--> " + data.value())
    }
  }
}

object Boot2 extends App {
  val consumer2 = KafkaConsumer2.consumeFromKafka("test-topic-new")
  consumer2.subscribe(Arrays.asList("test-topic-new"))
  while (true) {
    val record = consumer2.poll(10).asScala
    for (data <- record.iterator) {
      println("consumer2:--> " + data.value())
    }
  }
}

object Boot3 extends App {
  val consumer3 = KafkaConsumer3.consumeFromKafka("test-topic-new")
  consumer3.subscribe(Arrays.asList("test-topic-new"))
  while (true) {
    val record = consumer3.poll(10).asScala
    for (data <- record.iterator) {
      println("consumer3:--> " + data.value())
    }
  }
}
