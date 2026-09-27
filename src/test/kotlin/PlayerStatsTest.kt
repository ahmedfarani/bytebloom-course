import bytebloom.Week7.PlayerStats
import org.junit.jupiter.api.Test

class PlayerStatsTest {

    @Test
    fun `taking damage should decrease player health`(){
        // Given: player with a known state
        val playerStats = PlayerStats()

        // When: when taking damage
        playerStats.takeDamage(30) // 100 - 30 = 70

        // Then: player health decreased by 30
        val expectedHealth = 70
        assert(playerStats.health == expectedHealth)
    }
}