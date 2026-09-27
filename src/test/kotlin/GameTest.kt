import bytebloom.Week7.AuditService
import bytebloom.Week7.Game
import bytebloom.Week7.PlayerStats
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `when player die should call logAudistService`() {
        // Given
        val playerStats = PlayerStats()
        val auditService = mockk<AuditService>(relaxed = true)
        val game = Game(playerStats, auditService)

        // When
        game.damagePlayer(100)

        // Then
        verify(exactly = 1) { auditService.logPlayerDeath("Arin") }
    }
}