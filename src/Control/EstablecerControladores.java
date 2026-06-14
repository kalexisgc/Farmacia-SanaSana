package Control;

import Vista.SistemaVista;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EstablecerControladores implements MouseListener {
private SistemaVista views;
public EstablecerControladores(SistemaVista views){
    this.views=views;
    
    this.views.jLabelInicio.addMouseListener(this);
    this.views.jLabelMisRecetas.addMouseListener(this);
    this.views.jLabelMedicamentos.addMouseListener(this);
    this.views.jLabelPedidos.addMouseListener(this);
    this.views.jLabelPromociones.addMouseListener(this);
    this.views.jLabelRecordatorios.addMouseListener(this);
    this.views.jLabelMiPerfil.addMouseListener(this);
    this.views.jLabelAyuda.addMouseListener(this);
    this.views.jLabelCerrarSesion.addMouseListener(this);
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
        if(e.getSource()==views.jLabelInicio){
            views.jPanelInicio.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelMisRecetas){
            views.jPanelMisRecetas.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelMedicamentos){
            views.jPanelMedicamentos.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelPedidos){
            views.jPanelPedidos.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelPromociones){
            views.jPanelPromociones.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelRecordatorios){
            views.jPanelRecordatorios.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelMiPerfil){
            views.jPanelMiPerfil.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelAyuda){
            views.jPanelAyuda.setBackground(new Color(152,202,63));
        }
          else if(e.getSource()==views.jLabelCerrarSesion){
            views.jPanelCerrarSesion.setBackground(new Color(152,202,63));
        }
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==views.jLabelInicio){
            views.jPanelInicio.setBackground(new Color(18,45,61));
    }
        else if(e.getSource()==views.jLabelMisRecetas){
            views.jPanelMisRecetas.setBackground(new Color(18,45,61));
        }
          else if(e.getSource()==views.jLabelMedicamentos){
            views.jPanelMedicamentos.setBackground(new Color(18,45,61));
        }
          else if(e.getSource()==views.jLabelPedidos){
            views.jPanelPedidos.setBackground(new Color(18,45,61));
        }
          else if(e.getSource()==views.jLabelPromociones){
            views.jPanelPromociones.setBackground(new Color(18,45,61));
        }
          else if(e.getSource()==views.jLabelRecordatorios){
            views.jPanelRecordatorios.setBackground(new Color(18,45,61));
        }
          else if(e.getSource()==views.jLabelMiPerfil){
            views.jPanelMiPerfil.setBackground(new Color(18,45,61));
        }
          else if(e.getSource()==views.jLabelAyuda){
            views.jPanelAyuda.setBackground(new Color(18,45,61));
        }
          else if(e.getSource()==views.jLabelCerrarSesion){
            views.jPanelCerrarSesion.setBackground(new Color(18,45,61));
        }
    }

}
