package bytebloom.Week7

class LiveAuditService: AuditService {
    override fun logPlayerDeath(playerName: String) {
        println("[AUDIT] Player $playerName has been defeated!")
    }
}