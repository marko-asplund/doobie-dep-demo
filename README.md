# doobie-dep-demo

Project for reproducing a dependency resolution issue that would appear to be caused by Coursier bug.

For details see discussion on Doobie Discord channel
https://discord.com/channels/632277896739946517/632727524434247691/862740376757600277

and Twitter posts https://twitter.com/tpolecat/status/1413531508749520900

### usage

```
docker-compose run doobie
```

after that checkout generated files `evicted.out` and `deptree.out`
