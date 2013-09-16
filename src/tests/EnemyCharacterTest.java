import Evercraft.*;

// Have to refactor these to utilize Before and After cases
public class EnemyCharacterTest extends junit.framework.TestCase {


	// Damaging the enemy character with one damage should reduce the enemy hit points by 1
	public void testDamage() {
		EnemyCharacter enemy = new EnemyCharacter();
		int enemyHealth = enemy.getHealthPoints();
		enemy.damage(1);
		assertEquals(enemyHealth - 1, enemy.getHealthPoints());
	}

	// Damage equal to or over the HP of the enemy, kills the enemy
	public void testDeath() {
		EnemyCharacter enemy = new EnemyCharacter();
		int enemyHealth = enemy.getHealthPoints();
		enemy.damage(enemyHealth);
		assertEquals(false, enemy.getAlive());
	}
}
