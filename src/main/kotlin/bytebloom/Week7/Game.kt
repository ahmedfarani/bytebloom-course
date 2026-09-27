package bytebloom.Week7

class Game(
    private val playerStats: PlayerStats,
    private val auditService: AuditService
) {
    private val playerName = "Arin"

    fun damagePlayer(amount: Int) {
        playerStats.takeDamage(amount)
        if (!playerStats.isAlive){
            // This is a "Side Effect" we need to test.
            auditService.logPlayerDeath(playerName)
        }
    }
}