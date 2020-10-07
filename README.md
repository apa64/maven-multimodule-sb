# Maven Multi-Module Spring Boot Project Sample

> My barebones Maven multi-module Spring Boot project boilerplate sample.

Boilerplate for a multi-module Maven project in Spring Boot.

## Getting Started

### Prerequisites

- JDK 11
- Maven 3.6

### Build

```shell
mvn clean install
```

### Run

```shell
java -jar core/target/multimodule-sb-core.jar
```

## Tools

- set project version: `mvn versions:set -DnewVersion=1.2-SNAPSHOT`
- display available dependency updates: `mvn versions:display-dependency-updates`
- display available plugin updates: `mvn versions:display-plugin-updates`
- display the current information as detected by the built-in rules: `mvn enforcer:display-info`

## Roadmap

- Make this an archetype.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

Distributed under the MIT License. See LICENSE for details.

## Contact

- GitHub repository: [apa64/maven-multimodule-sb](https://github.com/apa64/maven-multimodule-sb)
