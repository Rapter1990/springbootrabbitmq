# Spring Boot and RabbitMq via Docker

<img src="screenshots\rabbitmq_11.PNG" alt="Main Information" width="800" height="300">

### 📖 Information

<ul style="list-style-type:disc">
  <li>It is a structure of <b>message-queueing</b></li>
  <li><b>RabbitMQ</b> just transfers data which is coming from <b>Producer</b> to its subcriber which is called as <b>Consumer</b> by turns</li>
  <li>Here is the explanation of the project
      <ul>
        <li>In <b>Producer</b> part, the project sends a <b>message</b> containg text or POJO to <b>Rabbit Server</b></li>
        <li>As <b>Producer</b> has no idea about <b>queue</b> , the <b>message</b> is transmitted to the <b>queue</b> over the <b>exchange</b> according to the <b>queue routing key</b></li>
        <li>Then <b>Consumer</b> part listens the <b>queue</b> which works with <b>FIFO</b> logic and <b>consume</b> the message. After that, it completes the <b>process</b></li>
      </ul>
  </li>
</ul>

### 🔨 Run the App

<b>1 )</b> Install <b>Docker Desktop</b>. Here is the installation <b>link</b> : https://docs.docker.com/docker-for-windows/install/

<b>2 )</b> Open <b>Terminal</b> under <b>resources</b> folder to run <b>RabbitMq</b> on <b>Docker</b> Container
```
    docker-compose up -d
```

<b>2 )</b> Show <b>container</b> which runs on <b>Docker</b>
```
    docker ps
```

<b>3 )</b> Open <b>RabbitMq</b> in localhost</b>
```
    http://localhost:15672/
```

<b>4 )</b> Enter <b>username</b> and <b>password</b> which are defined in <b>application.properties</b> file </b>
```
    spring.rabbitmq.username=rabbitmq
    spring.rabbitmq.password=123456
```

<b>5 )</b> Open Postman and define body before implementing post request to defined url
```
    http://localhost:8080/order/dinnerRestaurant

    {
        "name" : "Noyan"
        "qty" : 1
        "price" : 10
    }

```

<b>6 )</b> After <b>submission</b>, click <b>connection</b> in the navigation bar to trace packets and then click <b>queue</b> to determine if it is empty

### Screenshots

<details>
<summary>Click here to show the screenshots of project</summary>
    <p> Figure 1 </p>
    <img src ="screenshots\rabbitmq_1.PNG">
    <p> Figure 2 </p>
    <img src ="screenshots\rabbitmq_2.PNG">
    <p> Figure 3 </p>
    <img src ="screenshots\rabbitmq_3.PNG">
    <p> Figure 4 </p>
    <img src ="screenshots\rabbitmq_4.PNG">
    <p> Figure 5 </p>
    <img src ="screenshots\rabbitmq_5.PNG">
    <p> Figure 6 </p>
    <img src ="screenshots\rabbitmq_6.PNG">
    <p> Figure 7 </p>
    <img src ="screenshots\rabbitmq_7.PNG">
    <p> Figure 8 </p>
    <img src ="screenshots\rabbitmq_8.PNG">
    <p> Figure 9 </p>
    <img src ="screenshots\rabbitmq_9.PNG">
    <p> Figure 10 </p>
    <img src ="screenshots\rabbitmq_10.PNG">
</details>