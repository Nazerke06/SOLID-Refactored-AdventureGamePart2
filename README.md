 Game refactoring documentation
 This project is a simple combat game where the player fights different types of enemies.
 The code has been refactored according to SOLID principles, making it more modular and extensible.

 Key features:
- Player with health, experience, and an inventory system.
- Enemies with different health and attack power.
- A combat system that allows players and enemies to fight.
- A factory to create random enemy types.

SOLID principles applied:
1. **SRP (Single Responsibility Principle)**
- `Player` only handles player-related logic, while `InventoryManager` handles inventory management.
2. **OCP (Open/Closed Principle)**
- New enemy types can be added without changing existing logic using `EnemyFactory`.

3. **LSP (Lisk Substitution Principle)**
 - `Enemy` subclasses (`Ninja`, `Mage`, `Zombie`) can be used interchangeably without changing logic.
 4. **ISP (Interface Segregation Principle)**
 - `ICombatParticipant` ensures that combat entities only require combat-related methods.
 5. **DIP (Dependency Inversion Principle)**
 - `CombatManager` depends on `ICombatParticipant`, reducing coupling to specific classes.

 Classes:
- `Player`: represents the player character, managing health, experience, and inventory.
- `InventoryManager`: Manages the list of items collected by the player.
- `CombatManager`: Manages combat between the player and the enemy.
- `ICombatParticipant`: Interface defining combat behavior.
- `Enemy`: Abstract class for enemies, extended by `Ninja`, `Mage`, and `Zombie`.
- `EnemyFactory`: Generates random enemy instances.

How to run:
1. Compile and run `MainGame.java`.
2. The player will automatically engage in combat with a randomly generated enemy.
3. The battle continues until either the player or the enemy is defeated.

How it looked:
![image](https://github.com/user-attachments/assets/6675555b-bd57-4c3e-b9c9-8a3bdf0cc29d)

How it looks now:
![image](https://github.com/user-attachments/assets/127f6055-82ec-40a8-abe7-c7d219c019e2)


