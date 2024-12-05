package connection;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import interfaces.IConexionBD;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author angelsn
 */
public class ConexionBD implements IConexionBD{
    MongoClient mongoClient;
    MongoDatabase database;

    public ConexionBD() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings settings = MongoClientSettings.builder()
        .codecRegistry(pojoCodecRegistry)
        .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("bibliotecamusical2");
    }
    
    
    
    @Override
    public MongoDatabase crearConexion() {
        return database;
    }
    
    public void cerrarConexion(){
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            database = null;
            System.out.println("La conexion se ha cerrado correctamente");
        }
    }
}
