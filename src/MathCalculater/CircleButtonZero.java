package MathCalculater;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleButtonZero extends JButton {

    public CircleButtonZero(String label) {
        super(label);


        // 獲取按鈕的最佳大小
        Dimension size = getPreferredSize();
        size.width = 135;
        size.height = 65;
        setPreferredSize(size);

        this.setContentAreaFilled(false);
        this.setBorderPainted(false); // 不繪製邊框
        this.setFocusPainted(false); // 不繪製焦點狀態

    }

    // 畫圓的按鈕的背景和標籤
    protected void paintComponent(Graphics g) {

        if (getModel().isArmed()) {
            g.setColor(Color.lightGray); // 點擊時高亮
        } else {
            g.setColor(getBackground());
        }
        // fillOval方法畫一個矩形的內切橢圓，並且填充這個橢圓，
        // 當矩形爲正方形時，畫出的橢圓便是圓
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);

        super.paintComponent(g);
    }

    // 用簡單的弧畫按鈕的邊界。
    protected void paintBorder(Graphics g) {
        g.setColor(Color.BLACK);
        // drawOval方法畫矩形的內切橢圓，但不填充。只畫出一個邊界
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }

    // shape對象用於保存按鈕的形狀，有助於偵聽點擊按鈕事件
    Shape shape;

    public boolean contains(int x, int y) {

        if ((shape == null) || (!shape.getBounds().equals(getBounds()))) {
            // 構造一個橢圓形對象
            shape = new Ellipse2D.Float(10, 10, getWidth(), getHeight());
        }
        // 判斷鼠標的x、y座標是否落在按鈕形狀內。
        return shape.contains(x, y);
    }

}

