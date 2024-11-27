/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import interfaces.IIntegranteDAO;
import models.Integrante;
import org.bson.Document;

/**
 *
 * @author angelsn
 */
public class IntegranteDAO implements IIntegranteDAO{

    private final MongoCollection<Document> collection;

    public IntegranteDAO(MongoDatabase database) {
        this.collection = database.getCollection("canciones");
    }
    @Override
    public void insertar(Integrante integrante) {
        Document integranteDoc = new Document(
                "_id", integrante.getId())
                .append("nombre", integrante.getNombre())
                .append("apellido", integrante.getApellido())
                .append("rol", integrante.getRol())
                .append("fecha_ingreso", integrante.getFechaIngreso())
                .append("fecha_salida", integrante.getFechaSalida())
                .append("estado_activo", integrante.isEstadoActivo());
        
        collection.insertOne(integranteDoc);
    }
    
}
