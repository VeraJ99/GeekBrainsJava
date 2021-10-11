package lesson7;

import javax.swing.*;

public class MainGameWindow extends JFrame {
    MainGameWindow(){
}
    private int windowWidth = 1024;
private int windowHeight = 768;
    private int windowPositionX = 300;
    private int windowPositionY = 100;

    private Map gameMap;
    private JPanel gui;

    private JPanel gameControlArea;
    private JButton buttonStartGame;
    private JButton buttonExitGame;

    private JPanel gameInfoArea;
    private JLabel gameLevelInfo;
    private JLabel gameMapSizelInfo;
    private JLabel gameEnemyCountInfo;

    private JPanel playerInfoArea;
    private JPanel playerHealthInfo;
    private JPanel playerStrInfo;
    private JPanel playerPositionInfo;

    private JPanel playerControllerArea;
    private JButton playerMoveUp;
    private JButton playerMoveLeft;
    private JButton playerMoveRight;
    private JButton playerMoveDown;

    private JScrollPane scrollPanel;
    private JTextArea gamelog;


    MainGameWindow(){
        setupWindow();
        gameMap = new Map();

       setupGui();

        add(gui, borderLayout.EAST);
        add(gameMap);

        setVisible(true);
    }
    private void setupGui(){
       gui = new JPanel();
       gui.setlayout(new Gridlayout(rows:5, cols:1));

        setupGameControl();
        setupGameInfo();
        setupLayerInfo();
        setupLayerController();
        setupGameLog();

        gui.add(gameControlArea);
        gui.add(gameInfoArea);
      //  gui.add(playerInfoArea);
       // gui.add(playerControllerArea);
    }


    private void setupGameControl() {
        gameControlArea = new JPanel();
        gameControlArea.setlayout(new GridLayout(rows:2, cols:1))

        buttonStartGame = new JButton ("Start Game!");
        buttonExitGame = new JButton ("Exit Game!");

        gameControlArea.add(buttonStartGame);
        gameControlArea.add(buttonExitGame);
    }
    private void setupGameInfo() {
        gameInfoArea = new JPanel();
        gameInfoArea.setlayout(new GridLayout(rows:3, cols:1))

        gameLevelInfo = new JLabel(text:"Levell: -");
        gameMapSizelInfo = new JLabel(text:"Map Size: -:-");
        gameEnemyCountInfo = new JLabel(text:"Enemies: - ");

        gameInfoArea.add(gameLevelInfo);
        gameInfoArea.add(gameMapSizelInfo);
        gameInfoArea.add(gameEnemyCountInfo);
    }
    private void setupLayerInfo() {
    }
    private void setupLayerController() {
    }
    private void setupGameLog() {
    }



    private void setupWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(windowPositionX, windowPositionY);
        setSize(windouWidth,windouHeight);
        setTitle("Gui Application");
        setResizable(false);
    }}
