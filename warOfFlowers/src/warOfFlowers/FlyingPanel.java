package warOfFlowers;

import javax.swing.*;
import java.awt.*;

public class FlyingPanel extends JPanel {
    private static final int ANIMATION_DURATION = 1000; // 애니메이션 지속 시간 (밀리초)
    private static final int ANIMATION_DELAY = 20; // 애니메이션 업데이트 주기 (밀리초)

    private long startTime; // 애니메이션 시작 시간
    private Timer timer; // 애니메이션 업데이트를 위한 Timer
    private boolean isAnimating; // 애니메이션 동작 여부

    public FlyingPanel() {
        // 패널 초기 설정
        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.YELLOW);
    }

    // 애니메이션 시작 메서드
    public void startAnimation() {
        if (!isAnimating) {
            isAnimating = true;
            startTime = System.currentTimeMillis();

            // Timer를 사용하여 애니메이션 업데이트
            timer = new Timer(ANIMATION_DELAY, e -> {
                long elapsedTime = System.currentTimeMillis() - startTime;
                if (elapsedTime >= ANIMATION_DURATION) {
                    // 애니메이션 종료
                    setLocation(0, 0);
                    isAnimating = false;
                    timer.stop();
                } else {
                    // 애니메이션 중간 상태 업데이트
                    double fraction = (double) elapsedTime / ANIMATION_DURATION;
                    int x = (int) (getParent().getWidth() * (1 - fraction));
                    setLocation(x, 0);
                }
            });
            timer.start();
        }
    }
}