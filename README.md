# Project Structure
1. Controller - To publish message.
2. Publisher 
3. Consumer

# Configuration of AMQ
1. Define broker url - "${activemq.broker-url}"
2. Define new Bean with Queue (name) with the Queue name created in AMQ. 
3. Define new ActiveMQConnectionFactory and register the broker URL.
4. Define new JmsTemplate which takes the ActiveMQConnectionFactory
5. Default port of broker url - _activemq.broker-url=tcp://localhost:61616_ 

# Active AMQ
1. Download the AMQ from here - https://activemq.apache.org/components/classic/download/
2. Unzip it and run the AMQ server with below command under the bin folder.

> activemq start &
3. The local host url is http://127.0.0.1:8161/admin/ and user/pass is admin/admin


