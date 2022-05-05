object Versions {
    const val kotlinVersion = "1.5.30"
    /**
     * spring security core 버전이 올라가면 {@link org.springframework.security.core.context.SecurityContextImpl}
     * 부분을 deserialize 문제가 생기기 때문에, session serialize 먼저 jackson 으로 변경하고 진행해야 함
     *
     */
    const val springBootVersion = "2.5.4"
    const val springDependencyManagementVersion = "1.0.11.RELEASE"
//    const val springCloudVersion = "2020.0.1"

    const val reactorFeignVersion = "3.1.1"

    const val jibVersion = "3.1.4"

    const val slackApiVersion = "0.0.2"
}
