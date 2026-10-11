package bytebloom.Week8.TestingCoroutines

import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest

class UserProfileRepositoryTest {
    fun `fetchProfile should return correct profile after delay`() = runTest {
        // Given
        val repository = UserProfileRepository()

        // When
        val profile = repository.fetchProfile("123")

        // Then
        assertThat(profile).isEqualTo("User Profile for user id 123")
    }
}