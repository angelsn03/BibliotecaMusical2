
package ui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import interfaces.IAlbumService;
import interfaces.IArtistaService;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Album;
import models.Artista;
import models.Cancion;
import services.AlbumService;
import services.ArtistaService;

/**
 *
 * @author angelsn
 */
public class frmMenu extends javax.swing.JFrame implements Runnable{

    private Thread frameRate;
    private IAlbumService albumService;
    private IArtistaService artistaService;
//    private ButtonGroup grupo;
    private List<Artista> artistas;
    private List<Album> albumes;
    private String busqueda;
    private List<String> generos;
    private LocalDate fechaFiltro;
    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        try {
            // Dark theme
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
//        setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        startFramerateThread();

        // Cargar datos en segundo plano
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                artistas = artistaService.obtenerTodosLosArtistas();
                albumes = albumService.obtenerTodosLosAlbumes();
                generos = albumes.stream()
                        .map(Album::getGenero)
                        .distinct()
                        .collect(Collectors.toList());
                return null;
            }

            @Override
            protected void done() {
                // Actualiza la interfaz después de cargar los datos
                cargarArtistas(artistas, jTableArtistas);
                cargarAlbumes(albumes, jTableAlbumes);
                cargarCanciones(albumes, jTableCanciones);
                for (String genero : generos) {
                    jComboBoxGeneros.addItem(genero);
                }
            }
        }.execute();
//        grupo = new ButtonGroup();
        
        this.artistaService = new ArtistaService();
        this.albumService = new AlbumService();
        
        this.artistas = artistaService.obtenerTodosLosArtistas();
        this.albumes = albumService.obtenerTodosLosAlbumes();
        
        this.generos = albumes.stream()
                .map(Album::getGenero)
                .distinct()
                .collect(Collectors.toList());
        busqueda = jTextField1.getText();
        for (String genero : generos) {
            jComboBoxGeneros.addItem(genero);
        }
        
        fechaFiltro = datePicker1.getDate();
        
        //Metodo para el llenado de los campos seleccionados de la tabla
        jTableCanciones.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent Mouse_evt){
            JTable table = (JTable) Mouse_evt.getSource();
            Point point = Mouse_evt.getPoint();
            int row = table.rowAtPoint(point);
            if (Mouse_evt.getClickCount() == 1) {
                jTituloCancion.setText(jTableCanciones.getValueAt(jTableCanciones.getSelectedRow(), 0).toString());
                jAutor.setText(jTableCanciones.getValueAt(jTableCanciones.getSelectedRow(), 1).toString());
                 jAlbum.setText(jTableCanciones.getValueAt(jTableCanciones.getSelectedRow(), 2).toString());
                  jDuracion.setText(jTableCanciones.getValueAt(jTableCanciones.getSelectedRow(), 3).toString());
            }
        }
        
        });
        cargarArtistas(artistas, jTableArtistas);
        cargarAlbumes(albumes, jTableAlbumes);
        cargarCanciones(albumes, jTableCanciones);
    }

    private void startFramerateThread() {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(16); // Aproximadamente 60 FPS
                    SwingUtilities.invokeLater(() -> {
                        repaint(); // Actualiza la interfaz gráfica
                    });
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }).start();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCanciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        pnlImagenCancion = new javax.swing.JPanel();
        jTituloCancion = new javax.swing.JLabel();
        jDuracion = new javax.swing.JLabel();
        jAlbum = new javax.swing.JLabel();
        jAutor = new javax.swing.JLabel();
        btnBaneados = new javax.swing.JButton();
        btnFavoritos = new javax.swing.JButton();
        jTituloCancion1 = new javax.swing.JLabel();
        jTituloCancion2 = new javax.swing.JLabel();
        jTituloCancion3 = new javax.swing.JLabel();
        jTituloCancion4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlbumes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableArtistas = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBoxGeneros = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBoxFecha = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableIntegrantes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCanciones.setRowHeight(60);
        jScrollPane1.setViewportView(jTableCanciones);

        jLabel2.setText("BlibliotecaMusical2");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        pnlImagenCancion.setBackground(new java.awt.Color(0, 102, 255));
        pnlImagenCancion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlImagenCancion.setPreferredSize(new java.awt.Dimension(180, 180));

        javax.swing.GroupLayout pnlImagenCancionLayout = new javax.swing.GroupLayout(pnlImagenCancion);
        pnlImagenCancion.setLayout(pnlImagenCancionLayout);
        pnlImagenCancionLayout.setHorizontalGroup(
            pnlImagenCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        pnlImagenCancionLayout.setVerticalGroup(
            pnlImagenCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        btnBaneados.setText("Añadir a baneados");

        btnFavoritos.setText("Añadir a favoritos");

        jTituloCancion1.setText("Titulo:");

        jTituloCancion2.setText("Autor:");

        jTituloCancion3.setText("Album:");

        jTituloCancion4.setText("Duracion:");

        jButton1.setText("Insersion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableAlbumes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Albumes"
            }
        ));
        jTableAlbumes.setRowHeight(60);
        jScrollPane2.setViewportView(jTableAlbumes);

        jLabel1.setText("Canciones");

        jLabel3.setText("Artistas");

        jTableArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableArtistas.setRowHeight(60);
        jTableArtistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableArtistasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableArtistas);

        jComboBoxGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));

        jLabel4.setText("Género");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha");

        jButton2.setText("Refrescar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jComboBoxFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Antes de", "Después de" }));

        jButton3.setText("Buscar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTableIntegrantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableIntegrantes);

        jLabel6.setText("Integrantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxGeneros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTituloCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jTituloCancion2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTituloCancion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTituloCancion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTituloCancion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlImagenCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBaneados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(btnFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jComboBoxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlImagenCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBaneados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTituloCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTituloCancion2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTituloCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTituloCancion4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTituloCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (artistas.isEmpty()) {
            artistaService.insertarDatosMasivos();
            reOpenFrame();
        } else {
            JOptionPane.showMessageDialog(null, "La inserción ya está hecha", "AtenciónS", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        reOpenFrame();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        cargarCancionesFiltradas(albumes, jTableCanciones, busqueda, jComboBoxGeneros);
        cargarAlbumesFiltrados(albumes, jTableAlbumes, fechaFiltro, jComboBoxFecha, jComboBoxGeneros);
        cargarArtistasFiltrados(artistas, jTableArtistas, busqueda, jComboBoxGeneros);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTableArtistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableArtistasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableArtistasMouseClicked

    // proximamente añadir una función en la que cuando selecciones 
    // un artista en alguna parte se despliegue la info de los integrantes
    // vengo el futuro: ahí va
    public void cargarArtistas(List<Artista> artistas, JTable table) {
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"Imagen", "Nombre", "Tipo", "Género"});

        for (Artista a : artistas) {
            model.addRow(new Object[]{a.getImageIcon(), a.getNombre(), a.getTipo(), a.getGenero()});
        }
        cargarImagenes(table);
    }
    
    private void cargarAlbumes(List<Album> albumes, JTable table){
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"Portada", "Nombre", "Fecha de Lanzamiento"});
        
        for (Album a : albumes) {
            model.addRow(new Object[]{
                a.getImageIcon(), a.getNombre(), a.getFechaLanzamiento()
            });
        }
        table.setModel(model);
    }
    
    private void cargarCanciones(List<Album> albumes, JTable table){
       DefaultTableModel model = (DefaultTableModel) table.getModel(); 
       model.setRowCount(0);
       model.setColumnIdentifiers(new String[]{"Título", "Album", "Género", "Duración"});
       
       for (Album a : albumes) {
            for (Cancion c : a.getCanciones()) {
                model.addRow(new Object[]{
                    c.getTitulo(), a.getNombre(), a.getGenero(), c.getDuracion()
                });
            }
        }
        table.setModel(model);

    }
    
    // método que hice para que no estar repitiendo todo este bloque en cada método cargar
    private void cargarImagenes(JTable table){
        table.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = new JLabel();
                if (value instanceof ImageIcon) {
                    label.setIcon((ImageIcon) value);
                }
                label.setHorizontalAlignment(SwingConstants.CENTER);
                return label;
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(25);
    }
    
    /**
     * 
     * @param albumes
     * @param table
     * @param busqueda 
     */
    private void cargarCancionesFiltradas(List<Album> albumes, JTable table, String busqueda, JComboBox<String> generos) {
        // Get the selected genre from the combo box
        String filtroGenero = generos.getSelectedItem().toString();

        List<Object[]> cancionesFiltradas = albumes.stream()
            .flatMap(album -> album.getCanciones().stream()
                .filter(cancion -> {
                    // Filtro de nombre (búsqueda)
                    boolean pasaFiltroBusqueda = busqueda.equals("---") || 
                        (cancion.getTitulo().toLowerCase().contains(busqueda.toLowerCase()) ||
                         album.getNombre().toLowerCase().contains(busqueda.toLowerCase()));

                    // Filtro de género
                    boolean pasaFiltroGenero = filtroGenero.equals("---") || 
                        album.getGenero().equalsIgnoreCase(filtroGenero);

                    return pasaFiltroBusqueda && pasaFiltroGenero;
                })
                .map(cancion -> new Object[]{
                    cancion.getTitulo(), 
                    album.getNombre(), 
                    album.getGenero(), 
                    cancion.getDuracion()
                })
            )
            .collect(Collectors.toList());

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"Título", "Album", "Género", "Duración"});

        // Add filtered songs to the table model
        cancionesFiltradas.forEach(model::addRow);

        cargarImagenes(table);
    }
    
    /**
     * Método que carga en la tabla los albumes con sus respectivos filtros
     * @param albumes lista de albumes que serán filtrados y cargados dentro de la tabla
     * @param table tabla donde serán cargados los datos
     * @param fecha fecha usada para filtrar las canciones
     * @param comboBoxFecha comboBox que determina si se buscarán los albumes 
     * ,si la opcion seleccionada es "---" entonces no se aplicará este filtro
     * "Antes de" o "Despues de" dependiendo de la elección del usuario dentro del comboBox
     * @param comboBoxGeneros Combobox que filtra las canciones dependiendo del género elegido
     * ,si la opcion seleccionada es "---" entonces no se aplicará este filtro
     */
    private void cargarAlbumesFiltrados(List<Album> albumes, JTable table, LocalDate fecha, JComboBox<String> comboBoxFecha, JComboBox<String> comboBoxGeneros) {
        String filtroFecha = comboBoxFecha.getSelectedItem().toString();
        String filtroGenero = comboBoxGeneros.getSelectedItem().toString();

        List<Album> albumesFiltrados = aplicarFiltros(
            albumes, fecha, filtroFecha, filtroGenero, Album::getFechaLanzamiento, Album::getGenero
        );

        cargarAlbumes(albumesFiltrados, table);
        cargarImagenes(table);
    }

    private void cargarArtistasFiltrados(List<Artista> artistas, JTable table, String filtroNombre, JComboBox<String> generos) {
        
        String filtroGenero = generos.getSelectedItem().toString();
        
        // Filtrar los artistas según los filtros de nombre y género
        List<Artista> artistasFiltrados = artistas.stream()
            .filter(a -> {
                boolean pasaFiltroNombre = filtroNombre.equals("---") || a.getNombre().toLowerCase().contains(filtroNombre.toLowerCase());
                boolean pasaFiltroGenero = filtroGenero.equals("---") || a.getGenero().equalsIgnoreCase(filtroGenero);
                return pasaFiltroNombre && pasaFiltroGenero;
            })
            .collect(Collectors.toList());

        cargarArtistas(artistasFiltrados, table);
        cargarImagenes(table); // Método para cargar las imágenes
    }


    
    // Otro método ahorrarme código y que se vea clean
    private <T> List<T> aplicarFiltros(List<T> elementos, LocalDate fecha, String filtroFecha, String filtroGenero, Function<T, LocalDate> getFecha, Function<T, String> getGenero) {
        return elementos.stream().filter(elemento -> {
            boolean pasaFiltroFecha = true;
            boolean pasaFiltroGenero = true;

            // Filtro de fecha
            if (!filtroFecha.equals("---")) {
                LocalDate fechaElemento = getFecha.apply(elemento);
                if (filtroFecha.equals("Antes de")) {
                    pasaFiltroFecha = fechaElemento.isBefore(fecha);
                } else if (filtroFecha.equals("Después de")) {
                    pasaFiltroFecha = fechaElemento.isAfter(fecha) || fechaElemento.isEqual(fecha);
                }
            }

            // Filtro de género
            if (!filtroGenero.equals("---")) {
                String generoElemento = getGenero.apply(elemento);
                pasaFiltroGenero = generoElemento.equalsIgnoreCase(filtroGenero);
            }

            return pasaFiltroFecha && pasaFiltroGenero;
        }).collect(Collectors.toList());
    }
    
    private void reOpenFrame(){
        // Dispose the current frame
        dispose();

        // Reopen the main menu frame
        SwingUtilities.invokeLater(() -> {
            try {
                // Create a new instance of the main menu frame
                frmMenu mainMenu = new frmMenu();
                mainMenu.setVisible(true);
            } catch (Exception e) {
                // Log or display any errors that occur while reopening the frame
                JOptionPane.showMessageDialog(null, 
                    "Error al abrir el menú principal: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaneados;
    private javax.swing.JButton btnFavoritos;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jAlbum;
    private javax.swing.JLabel jAutor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxFecha;
    private javax.swing.JComboBox<String> jComboBoxGeneros;
    private javax.swing.JLabel jDuracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableAlbumes;
    private javax.swing.JTable jTableArtistas;
    private javax.swing.JTable jTableCanciones;
    private javax.swing.JTable jTableIntegrantes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTituloCancion;
    private javax.swing.JLabel jTituloCancion1;
    private javax.swing.JLabel jTituloCancion2;
    private javax.swing.JLabel jTituloCancion3;
    private javax.swing.JLabel jTituloCancion4;
    private javax.swing.JPanel pnlImagenCancion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
