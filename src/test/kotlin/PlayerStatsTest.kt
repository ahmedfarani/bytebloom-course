import bytebloom.Week7.PlayerStats
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class PlayerStatsTest { // TDD Test Driven Development

    @Test
    fun `taking damage should decrease player health`(){
        // Given: player with a known state
        val playerStats = PlayerStats()

        // When: when taking damage
        playerStats.takeDamage(30) // 100 - 30 = 70

        // Then: player health decreased by 30
        val expectedHealth = 70
        assertThat(playerStats.health).isEqualTo(expectedHealth)
    }

    @Test
    fun `heal should increase player health`(){
        // Given
        val playerStats = PlayerStats()
        playerStats.takeDamage(100)

        // when
        playerStats.heal(30)

        // Then
        val expectedHealth = 30
        assertThat(playerStats.health).isEqualTo(expectedHealth)
    }

    @Test
    fun `healing should not exceed max health`(){
        // Given
        val playerStats = PlayerStats()

        // when
        playerStats.heal(120)

        // Then
        assertThat(playerStats.health).isEqualTo(100)
    }
}