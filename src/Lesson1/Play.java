package lesson4;

public class Play {
}
package ConsoleApp;
        import java.util.Random;
        import java.util.Scanner;
/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 23.09.2021
 */
public class MyFirstConsoleApplication {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static char player = '@';
    public static String playerName = "Boris";
    public static int playerHealth = 100;
    public static int playerStr = 15;
    public static int playerPosX;
    public static int playerPosY;
    public static final int playerMoveUp = 8;
    public static final int playerMoveDown = 2;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;
    public static char enemy = 'E';
    public static int enemyHealth;
    public static int enemyStr;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 50;
    public static int countEnemies;
    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapValueMin = 2;
    public static int mapValueMax = 5;
    public static char emptyCell = '_';
    public static char readyCell = '*';
    public static int levelGame = 0;
    public static void main(String[] args) {
        while (isAlivePlayer()) {
            ++levelGame;
            System.out.println(">>>>> START LEVEL " + levelGame + " <<<<<");
            levelCycle();
        }
        System.out.println(">>>>> GAME OVER! " + playerName + " ready " + levelGame + " level(s) <<<<<");
    }
    public static void levelCycle() {
        createMap();
        spawnPlayer();
        spawnEnemy();
        while (true) {
            showMap();
            movePlayer();
            if (!isAlivePlayer()) {
                System.out.println(playerName + " is dead");
                break;
            }
            if (!isExistEnemies()) {
                System.out.println("Level " + levelGame + " is WIN!");
                break;
            }
        }
    }
    public static void createMap() {
        mapWidth = randomValue(mapValueMin, mapValueMax);
        mapHeight = randomValue(mapValueMin, mapValueMax);
        map = new char[mapHeight][mapWidth];
        invisibleMap = new char[mapHeight][mapWidth];
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = emptyCell;
                invisibleMap[y][x] = emptyCell;
            }
        }

        @@ -110,7 +111,7 @@ public static void spawnEnemy() {
            do {
                enemyPosX = random.nextInt(mapWidth);
                enemyPosY = random.nextInt(mapHeight);
            } while ((enemyPosX == playerPosX && enemyPosY == playerPosY) && !isEmptyCell(invisibleMap, enemyPosX, enemyPosY));
        } while (!isEmptyCell(map, enemyPosX, enemyPosY) || !isEmptyCell(invisibleMap, enemyPosX, enemyPosY));

        invisibleMap[enemyPosY][enemyPosX] = enemy;
    }
        System.out.println("Create enemy. Count = " + countEnemies + " (HP=" + enemyHealth + ", STR=" + enemyStr + ")");
}
    public static void showMap() {
        System.out.println("=====> MAP <=====");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("=================");
    }
    public static void movePlayer() {
        int currentX = playerPosX;
        int currentY = playerPosY;
        int playerMove;
        do {
            System.out.print("Enter destination: (UP-" + playerMoveUp + "|DOWN-" + playerMoveDown + "|LEFT-" + playerMoveLeft + "|RIGHT-" + playerMoveRight + ") >>> ");
            playerMove = scanner.nextInt();
            switch (playerMove) {
                case playerMoveUp:
                    playerPosY -= 1;
                    break;
                case playerMoveDown:
                    playerPosY += 1;
                    break;
                case playerMoveLeft:
                    playerPosX -= 1;
                    break;
                case playerMoveRight:
                    playerPosX += 1;
                    break;
            }
        } while (!isValidMovePlayer(currentX, currentY, playerPosX, playerPosY));
        playerNextMoveAction(currentX, currentY, playerPosX, playerPosY);
    }

    public static void playerNextMoveAction(int lastPosX, int lastPosY, int nextPosX, int nextPosY) {
        if (invisibleMap[nextPosY][nextPosX] == enemy) {
            playerHealth -= enemyStr;
            System.out.println("ALERT! Enemy give damage " + enemyStr + ". " + playerName + " health now " + playerHealth);
            battle(nextPosX, nextPosY);
//            playerHealth -= enemyStr;
//            System.out.println("ALERT! Enemy give damage " + enemyStr + ". " + playerName + " health now " + playerHealth);
        }

        countEnemies--;
        invisibleMap[nextPosY][nextPosX] = emptyCell;

        map[lastPosY][lastPosX] = readyCell;
        map[playerPosY][playerPosX] = player;
        System.out.println("Count enemies = " + countEnemies);
    }

    public static void battle(int x, int y) {
        int battleRoundCount = 1;
        int currentEnemyHealth = enemyHealth;

        System.out.println("=== START BATTLE ===");

        while (isAlivePlayer() && currentEnemyHealth > 0) {
            System.out.println("=== ROUND BATTLE " + battleRoundCount + " ===");
            System.out.println("PlayerHP: " + playerHealth + " PlayerAtk: " + playerStr);
            System.out.println("EnemyHP: " + currentEnemyHealth + " EnemyAtk: " + enemyStr);
            currentEnemyHealth -= playerStr;
            System.out.println("Player give damage to Enemy. Enemy HP is " + currentEnemyHealth);
            if (currentEnemyHealth > 0) {
                playerHealth -= enemyStr;
                System.out.println("Enemy give damage to Player. Player HP is " + playerHealth);
            } else {
                countEnemies--;
                invisibleMap[y][x] = emptyCell;
                break;
            }
            battleRoundCount++;
        }
        System.out.println("=== END BATTLE ===");
    }

    public static boolean isEmptyCell(char[][] mapCheck, int x, int y) {
        return mapCheck[y][x] == emptyCell;
    }
    public static boolean isValidMovePlayer(int currentPosXPlayer, int currentPosYPlayer, int nextX, int nextY)  {
        if (nextX >= 0 && nextX < mapWidth && nextY >= 0 && nextY < mapHeight) {
            System.out.println(playerName + " move to [" + (nextX + 1) + ":" + (nextY + 1) + "] success!");
            return true;
        } else {
            System.out.println(playerName + " you Invalid! Your move is FAIL. Please try again!");
            playerPosX = currentPosXPlayer;
            playerPosY = currentPosYPlayer;
            return false;
        }
    }
    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1); //(min;max]
    }
    public static boolean isAlivePlayer() {
        return playerHealth > 0;
    }
    public static boolean isExistEnemies() {
        return countEnemies > 0;
    }
}