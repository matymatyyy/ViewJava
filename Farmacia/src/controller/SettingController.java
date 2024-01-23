
package controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.systemView;


public class SettingController implements MouseListener {
    
    private systemView view;
    
    public SettingController(systemView view){
        this.view = view;
        this.view.jLabelProducts.addMouseListener(this);
        this.view.jLabelPucharse.addMouseListener(this);
        this.view.jLabelCustiom.addMouseListener(this);
        this.view.jLabelEmployees.addMouseListener(this);
        this.view.jLabelSupplies.addMouseListener(this);
        this.view.jLabelReports.addMouseListener(this);
        this.view.jLabelSetting.addMouseListener(this);
        this.view.jLabelCategories.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()== view.jLabelProducts){
            view.jPanelProduc.setBackground(new Color(40,147,153));
        }else if(e.getSource()== view.jLabelPucharse){
            view.jPanelPucharse.setBackground(new Color(40,147,153));
        }else if(e.getSource()== view.jLabelCustiom){
            view.jPanelCustiom.setBackground(new Color(40,147,153));
        }else if(e.getSource()==view.jLabelEmployees){
            view.jPanelEmployees.setBackground(new Color(40,147,153));
        }else if(e.getSource()==view.jLabelSupplies){
            view.jPanelSupplies.setBackground(new Color(40,147,153));
        }else if(e.getSource()==view.jLabelReports){
            view.jPanelReports.setBackground(new Color(40,147,153));
        }else if(e.getSource()==view.jLabelSetting){
            view.jPanelSetting.setBackground(new Color(40,147,153));
        }else if(e.getSource()==view.jLabelCategories){
            view.jPanelCategories.setBackground(new Color(40,147,153));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()== view.jLabelProducts){
            view.jPanelProduc.setBackground(new Color(18,45,61));
        }else if(e.getSource()== view.jLabelPucharse){
            view.jPanelPucharse.setBackground(new Color(18,45,61));
        }else if(e.getSource()== view.jLabelCustiom){
            view.jPanelCustiom.setBackground(new Color(18,45,61));
        }else if(e.getSource()==view.jLabelEmployees){
            view.jPanelEmployees.setBackground(new Color(18,45,61));
        }else if(e.getSource()==view.jLabelSupplies){
            view.jPanelSupplies.setBackground(new Color(18,45,61));
        }else if(e.getSource()==view.jLabelReports){
            view.jPanelReports.setBackground(new Color(18,45,61));
        }else if(e.getSource()==view.jLabelSetting){
            view.jPanelSetting.setBackground(new Color(18,45,61));
        }else if(e.getSource()==view.jLabelCategories){
            view.jPanelCategories.setBackground(new Color(18,45,61));
        }
    }
    
}
