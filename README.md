# Netty Demo

Quick Netty demo extracted from the netty examples repository, added some dropwizard metrics and exported them using the Prometheus format.

Added a graph in Grafana to count the total incoming requests:
```
rate(incoming_requests_total[1m])
```
