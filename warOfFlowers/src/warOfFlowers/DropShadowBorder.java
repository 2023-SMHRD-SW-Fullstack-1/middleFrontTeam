package warOfFlowers;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;

import javax.swing.border.Border;

public class DropShadowBorder implements Border {
    private Color shadowColor;
    private int shadowSize;
    private int cornerRadius;
    private int shadowDistance;

    public DropShadowBorder(Color shadowColor, int shadowSize, int cornerRadius, int shadowDistance) {
        this.shadowColor = shadowColor;
        this.shadowSize = shadowSize;
        this.cornerRadius = cornerRadius;
        this.shadowDistance = shadowDistance;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Set rendering hints to improve the quality of the shadow
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);

        // Draw the shadow
        g2.setColor(shadowColor);
        g2.fillRoundRect(x + shadowDistance, y + shadowDistance, width - shadowDistance, height - shadowDistance, cornerRadius, cornerRadius);

        // Dispose the graphics object to free up resources
        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(shadowSize + shadowDistance, shadowSize + shadowDistance, shadowSize + shadowDistance, shadowSize + shadowDistance);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}