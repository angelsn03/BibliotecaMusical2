/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercionMasiva;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import models.Album;
import models.Artista;
import models.Cancion;
import models.Integrante;

/**
 *
 * @author pausa
 */
public class InsercionMasiva {
    private List<Artista> artistas;
    private List<Album> albumes;
    
    public InsercionMasiva(){
        artistas = Arrays.asList(
            // Artistas previamente añadidos
            new Artista("La Máquina de Hacer Pájaros", "banda", "Rock Progresivo", Arrays.asList(
                new Integrante("Carlos Alberto", "García", "Vocalista y Tecladista", new Date("1982-01-01"), null, true),
                new Integrante("Rodrigo", "Páez", "Tecladista y Compositor", new Date("1982-01-01"), null, true),
                new Integrante("Omar", "Chaves", "Bajista", new Date("1982-01-01"), new Date("1983-12-31"), false)
            )),
            new Artista("System of a Down", "banda", "Metal", Arrays.asList(
                new Integrante("Serj", "Tankian", "Vocalista", new Date("1995-01-01"), null, true),
                new Integrante("Daron", "Malakian", "Guitarrista y Vocalista", new Date("1995-01-01"), null, true),
                new Integrante("Shavo", "Odadjian", "Bajista", new Date("1995-01-01"), null, true),
                new Integrante("John", "Dolmayan", "Baterista", new Date("1995-01-01"), null, true)
            )),
            new Artista("José José", "solista", "Balada", Arrays.asList()),
            new Artista("Joan Sebastián", "solista", "Ranchera", Arrays.asList()),
            new Artista("Serú Girán", "banda", "Rock", Arrays.asList(
                new Integrante("Charly", "García", "Vocalista y Tecladista", new Date("1978-01-01"), null, true),
                new Integrante("David", "Lebón", "Guitarrista", new Date("1978-01-01"), null, true),
                new Integrante("Pedro", "Aznar", "Bajista", new Date("1978-01-01"), null, true),
                new Integrante("Gustavo", "Cerati", "Guitarrista", new Date("1978-01-01"), null, true)
            )),
            new Artista("Gulu Gulu", "banda", "Rock", Arrays.asList(
                new Integrante("Carlos", "Rodríguez", "Bajista", new Date("1990-01-01"), null, true),
                new Integrante("Omar", "Velázquez", "Batería", new Date("1990-01-01"), null, true),
                new Integrante("Juan", "Pérez", "Guitarrista", new Date("1990-01-01"), null, true)
            )),
            new Artista("Shazna", "banda", "J-Rock", Arrays.asList(
                new Integrante("Izumi", "Shikibu", "Vocalista", new Date("1993-01-01"), null, true),
                new Integrante("Kyo", "Hayashi", "Guitarrista", new Date("1993-01-01"), null, true),
                new Integrante("Tetsuya", "Miyashita", "Bajista", new Date("1993-01-01"), null, true),
                new Integrante("Daisuke", "Nakahara", "Batería", new Date("1993-01-01"), null, true)
            )),
            new Artista("Bon Jovi", "banda", "Rock", Arrays.asList(
                new Integrante("Jon", "Bon Jovi", "Vocalista", new Date("1983-01-01"), null, true),
                new Integrante("Richie", "Sambora", "Guitarrista", new Date("1983-01-01"), null, true),
                new Integrante("Tico", "Torres", "Batería", new Date("1983-01-01"), null, true),
                new Integrante("Hugh", "McDonald", "Bajista", new Date("1983-01-01"), null, true)
            )),
            new Artista("Queen", "banda", "Rock", Arrays.asList(
                new Integrante("Freddie", "Mercury", "Vocalista", new Date("1970-01-01"), null, true),
                new Integrante("Brian", "May", "Guitarrista", new Date("1970-01-01"), null, true),
                new Integrante("John", "Deacon", "Bajista", new Date("1970-01-01"), null, true),
                new Integrante("Roger", "Taylor", "Batería", new Date("1970-01-01"), null, true)
            )),
            new Artista("Skelephant", "banda", "Electrónica", Arrays.asList(
                new Integrante("Maya", "Sato", "Vocalista", new Date("2010-01-01"), null, true),
                new Integrante("Kenta", "Sakamoto", "Productor", new Date("2010-01-01"), null, true),
                new Integrante("Kenji", "Matsumoto", "Tecladista", new Date("2010-01-01"), null, true)
            )),
            new Artista("Juan Gabriel", "solista", "Balada", Arrays.asList()),
            new Artista("Charlie Puth", "solista", "Pop", Arrays.asList()),
            new Artista("Charly García", "solista", "Rock", Arrays.asList()),
            new Artista("Caifanes", "banda", "Rock", Arrays.asList(
                new Integrante("Saúl", "Hernández", "Vocalista y Guitarrista", new Date("1987-01-01"), null, true),
                new Integrante("Sabo", "Romero", "Bajista", new Date("1987-01-01"), null, true),
                new Integrante("Alfonso", "Andrade", "Batería", new Date("1987-01-01"), null, true)
            )),
            new Artista("The Beatles", "banda", "Rock", Arrays.asList(
                new Integrante("John", "Lennon", "Vocalista y Guitarrista", new Date("1960-01-01"), null, true),
                new Integrante("Paul", "McCartney", "Bajista y Vocalista", new Date("1960-01-01"), null, true),
                new Integrante("George", "Harrison", "Guitarrista", new Date("1960-01-01"), null, true),
                new Integrante("Ringo", "Starr", "Batería", new Date("1960-01-01"), null, true)
            )),
            new Artista("Michael Jackson", "solista", "Pop", Arrays.asList()),
            new Artista("Soda Stereo", "banda", "Rock", Arrays.asList(
                new Integrante("Gustavo", "Cerati", "Vocalista y Guitarrista", new Date("1982-01-01"), null, true),
                new Integrante("Zeta", "Bosan", "Bajista", new Date("1982-01-01"), null, true),
                new Integrante("Charly", "Alberti", "Batería", new Date("1982-01-01"), null, true)
            )),
            new Artista("Hombres G", "banda", "Pop Rock", Arrays.asList(
                new Integrante("David", "Muñoz", "Vocalista", new Date("1985-01-01"), null, true),
                new Integrante("Rafael", "González", "Bajista", new Date("1985-01-01"), null, true),
                new Integrante("Javi", "Cabañero", "Guitarrista", new Date("1985-01-01"), null, true)
            )),
            new Artista("Malice Mizer", "banda", "Gothic Metal", Arrays.asList(
                new Integrante("Mana", "Watanabe", "Guitarrista", new Date("1992-01-01"), null, true),
                new Integrante("Kami", "Ikeuchi", "Batería", new Date("1992-01-01"), new Date("1999-06-15"), false),
                new Integrante("Közi", "Ueno", "Guitarrista", new Date("1992-01-01"), null, true),
                new Integrante("Yu~ki", "Shibuya", "Bajista", new Date("1992-01-01"), null, true),
                new Integrante("Gackt", "Takamatsu", "Vocalista", new Date("1992-01-01"), null, true)
            )),
            new Artista("Pescado Rabioso", "banda", "Rock", Arrays.asList(
                new Integrante("Luis", "Alberti", "Bajista", new Date("1972-01-01"), null, true),
                new Integrante("Spinetta", "Luis", "Vocalista", new Date("1972-01-01"), null, true)
            )),
            new Artista("Aphex Twin", "solista", "Electrónica", Arrays.asList()),
            new Artista("Depeche Mode", "banda", "Synthpop", Arrays.asList(
                new Integrante("Dave", "Gahan", "Vocalista", new Date("1980-01-01"), null, true),
                new Integrante("Martin", "Gore", "Teclados y Guitarrista", new Date("1980-01-01"), null, true),
                new Integrante("Andy", "Fletcher", "Teclados", new Date("1980-01-01"), null, true)
            )),
            new Artista("Nero's Day at Disneyland", "banda", "Electrónica", Arrays.asList()),
            new Artista("SewerSlvt", "solista", "Breakcore", Arrays.asList()),
            new Artista("Candleheads", "banda", "Post-Rock", Arrays.asList()),
            new Artista("Psh Psh", "banda", "Experimental", Arrays.asList()),
            new Artista("Björk", "solista", "Electrónica", Arrays.asList(
                new Integrante("Björk", "Guðmundsdóttir", "Vocalista", new Date("1993-01-01"), null, true)
            )),
            new Artista("Creedence Clearwater Revival", "banda", "Rock", Arrays.asList(
                new Integrante("John", "Fogerty", "Vocalista y Guitarrista", new Date("1967-01-01"), null, true),
                new Integrante("Tom", "Fogerty", "Guitarrista", new Date("1967-01-01"), null, true),
                new Integrante("Stu", "Cook", "Bajista", new Date("1967-01-01"), null, true),
                new Integrante("Doug", "Clifford", "Batería", new Date("1967-01-01"), null, true)
            )),
            new Artista("Diego Lorenzini", "solista", "Indie", Arrays.asList()),
            new Artista("Cosmovisión", "banda", "Rock", Arrays.asList()),
            new Artista("Rojuu", "banda", "Experimental", Arrays.asList()),
            new Artista("Joji", "solista", "R&B", Arrays.asList(
                new Integrante("Joji", "Miyashiro", "Vocalista", new Date("2014-01-01"), null, true)
            )),
            new Artista("Tyler, The Creator", "solista", "Hip Hop", Arrays.asList()),
            new Artista("Kendrick Lamar", "solista", "Hip Hop", Arrays.asList()),
            new Artista("Have a Nice Life", "banda", "Post-Punk", Arrays.asList()),
            new Artista("Kali Uchis", "solista", "R&B", Arrays.asList()),
            new Artista("Post Malone", "solista", "Pop-Rock", Arrays.asList()),
            new Artista("Natalia Lafourcade", "solista", "Folk", Arrays.asList()),
            new Artista("The Marías", "banda", "Indie", Arrays.asList()),
            new Artista("Plástica", "banda", "Pop", Arrays.asList()),
            new Artista("Rosalía", "solista", "Flamenco", Arrays.asList()),
            new Artista("Los Panchos", "banda", "Bolero", Arrays.asList()),
            new Artista("Enjambre", "banda", "Rock", Arrays.asList(
                new Integrante("Julio", "Ramirez", "Vocalista", new Date("2001-01-01"), null, true),
                new Integrante("Erick", "Hernández", "Guitarrista", new Date("2001-01-01"), null, true),
                new Integrante("Luis", "Hernández", "Bajista", new Date("2001-01-01"), null, true)
            )),
            new Artista("Tool", "banda", "Prog Metal", Arrays.asList()),
            new Artista("Machine Girl", "banda", "Electrónica", Arrays.asList()),
            new Artista("Sistema de Entretenimiento", "banda", "Electrónica", Arrays.asList()),
            new Artista("Connan Mockasin", "solista", "Indie", Arrays.asList()),
            new Artista("Chet Baker", "solista", "Jazz", Arrays.asList()),
            new Artista("Radiohead", "banda", "Alternative", Arrays.asList(
                new Integrante("Thom", "Yorke", "Vocalista", new Date("1985-01-01"), null, true),
                new Integrante("Jonny", "Greenwood", "Guitarrista", new Date("1985-01-01"), null, true),
                new Integrante("Ed", "O'Brien", "Guitarrista", new Date("1985-01-01"), null, true),
                new Integrante("Colin", "Greenwood", "Bajista", new Date("1985-01-01"), null, true),
                new Integrante("Phil", "Selway", "Batería", new Date("1985-01-01"), null, true)
            )),
            new Artista("Cannonball Adderley", "solista", "Jazz", Arrays.asList()),
            new Artista("Plastic Tree", "banda", "Visual Kei", Arrays.asList()),
            new Artista("Maximum the Hormone", "banda", "Metal", Arrays.asList()),
            new Artista("Peter'sTV-OFC", "banda", "Post-Punk", Arrays.asList()),
            new Artista("Macroblank", "solista", "Industrial", Arrays.asList()),
            new Artista("Hideki Naganuma", "solista", "Electrónica", Arrays.asList()),
            new Artista("Koji Kondo", "solista", "Video Game Music", Arrays.asList()),
            new Artista("Junichi Masuda", "solista", "Video Game Music", Arrays.asList()),
            new Artista("Crush 40", "banda", "Video Game Music", Arrays.asList()),
            new Artista("Junior H", "solista", "Regional Mexicano", Arrays.asList()),
            new Artista("Julieta Venegas", "solista", "Pop", Arrays.asList())
        );
        
        albumes = Arrays.asList(
            new Album("Películas", new Date(1977, 1, 1), "Rock", Arrays.asList(
                new Cancion("La máquina de hacer pájaros", "4:30"),
                new Cancion("Cuentos de la buena pipa", "3:45"),
                new Cancion("La mujer del amigo", "4:00"),
                new Cancion("Avanzando", "3:50"),
                new Cancion("La última canción", "3:55"),
                new Cancion("El retrato de un amigo", "4:20")
            )),
            new Album("System of a Down", new Date(1998, 1, 1), "Metal", Arrays.asList(
                new Cancion("Suite Pee", "2:00"),
                new Cancion("Know", "3:00"),
                new Cancion("Sugar", "2:30"),
                new Cancion("Spiders", "3:10"),
                new Cancion("Ddevil", "2:15"),
                new Cancion("P.L.U.C.K.", "3:25")
            )),
            new Album("Mezmerize", new Date(2005, 1, 1), "Metal", Arrays.asList(
                new Cancion("B.Y.O.B.", "4:10"),
                new Cancion("Question!", "3:15"),
                new Cancion("Revenga", "3:05"),
                new Cancion("Sad Statue", "3:40"),
                new Cancion("Bounce", "3:00"),
                new Cancion("Forest", "4:20")
            )),
            new Album("José José", new Date(1970, 1, 1), "Balada", Arrays.asList(
                new Cancion("El Triste", "3:00"),
                new Cancion("La nave del olvido", "3:20"),
                new Cancion("¿Sabes una cosa?", "3:30"),
                new Cancion("La felicidad", "3:40"),
                new Cancion("El amor", "4:00"),
                new Cancion("Gavilán o paloma", "3:10")
            )),
            new Album("Lo Pasado, Pasado", new Date(1978, 1, 1), "Balada", Arrays.asList(
                new Cancion("Lo Pasado, Pasado", "3:40"),
                new Cancion("¿Sabes una cosa?", "3:25"),
                new Cancion("O tú o nada", "3:30"),
                new Cancion("Lo que no fue no será", "3:15"),
                new Cancion("Amor, amor", "3:55"),
                new Cancion("El amor es un placer", "4:05")
            )),
            new Album("Joan Sebastián", new Date(1986, 1, 1), "Ranchera", Arrays.asList(
                new Cancion("Tú y yo", "3:30"),
                new Cancion("La ley del monte", "4:10"),
                new Cancion("El carretero", "3:45"),
                new Cancion("Que bonita es mi tierra", "3:30"),
                new Cancion("Las mariposas", "4:00"),
                new Cancion("Pajarillo", "3:15")
            )),
            new Album("El Caballo de la Troya", new Date(2002, 1, 1), "Ranchera", Arrays.asList(
                new Cancion("La Troya", "3:15"),
                new Cancion("Eres", "4:00"),
                new Cancion("Ven a mi", "3:50"),
                new Cancion("Cuando yo te encuentre", "4:10"),
                new Cancion("Mujer", "3:40"),
                new Cancion("Puedo ser", "4:05")
            )),
            new Album("Serú Girán", new Date(1978, 1, 1), "Rock", Arrays.asList(
                new Cancion("Seminare", "4:15"),
                new Cancion("La Grasa de las Capitales", "5:30"),
                new Cancion("Eiti Leda", "3:50"),
                new Cancion("Los libros de la buena memoria", "4:00"),
                new Cancion("El anillo del Capitán Beto", "4:10"),
                new Cancion("Que ves el cielo", "5:00")
            )),
            new Album("La Grasa de las Capitales", new Date(1979, 1, 1), "Rock", Arrays.asList(
                new Cancion("Los libros de la buena memoria", "3:50"),
                new Cancion("El anillo del Capitán Beto", "4:10"),
                new Cancion("La Grasa de las Capitales", "5:30"),
                new Cancion("Las cosas que pasan", "4:00"),
                new Cancion("Jogo de Damas", "4:40"),
                new Cancion("Serú Girán", "5:00")
            )),
            new Album("Gulu Gulu", new Date(1990, 1, 1), "Pop", Arrays.asList(
                new Cancion("Gulu Gulu", "3:40"),
                new Cancion("El último beso", "3:50"),
                new Cancion("No quiero perderte", "4:00"),
                new Cancion("Dame tu amor", "3:30"),
                new Cancion("La esperanza", "4:10"),
                new Cancion("Mundo cruel", "4:15")
            )),
                new Album("Shazna", new Date(1997, 1, 1), "J-Rock", Arrays.asList(
                new Cancion("Kimi to Iu Hikari", "4:30"),
                new Cancion("Sakura", "5:00"),
                new Cancion("Yume no Naka", "3:40"),
                new Cancion("Kaze to Kioku", "4:15"),
                new Cancion("Shizuka na Yoru", "4:00")
            )),
            new Album("Graffiti", new Date(2000, 1, 1), "J-Rock", Arrays.asList(
                new Cancion("One", "4:30"),
                new Cancion("Innocent", "3:45"),
                new Cancion("Graffiti", "5:00"),
                new Cancion("Desire", "4:00"),
                new Cancion("Last Dance", "4:10")
            )),
            new Album("Slippery When Wet", new Date(1986, 1, 1), "Rock", Arrays.asList(
                new Cancion("Livin' on a Prayer", "4:10"),
                new Cancion("You Give Love a Bad Name", "3:45"),
                new Cancion("Wanted Dead or Alive", "5:00"),
                new Cancion("Never Say Goodbye", "4:20"),
                new Cancion("Wild in the Streets", "3:50")
            )),
            new Album("New Jersey", new Date(1988, 1, 1), "Rock", Arrays.asList(
                new Cancion("Bad Medicine", "5:10"),
                new Cancion("Born to Be My Baby", "4:20"),
                new Cancion("I'll Be There for You", "4:30"),
                new Cancion("Lay Your Hands on Me", "4:00"),
                new Cancion("Living in Sin", "4:15")
            )),
            new Album("A Night at the Opera", new Date(1975, 1, 1), "Rock", Arrays.asList(
                new Cancion("Bohemian Rhapsody", "5:55"),
                new Cancion("You're My Best Friend", "2:50"),
                new Cancion("Love of My Life", "3:30"),
                new Cancion("Seaside Rendezvous", "2:15"),
                new Cancion("The Prophet's Song", "8:00")
            )),
            new Album("News of the World", new Date(1977, 1, 1), "Rock", Arrays.asList(
                new Cancion("We Will Rock You", "2:00"),
                new Cancion("We Are the Champions", "3:00"),
                new Cancion("Spread Your Wings", "4:30"),
                new Cancion("It's Late", "6:00"),
                new Cancion("My Melancholy Blues", "3:00")
            )),
            new Album("People Are Machines", new Date(2018, 1, 1), "Electronic", Arrays.asList(
                new Cancion("Intro", "2:30"),
                new Cancion("Lonely Robots", "4:00"),
                new Cancion("Fading Lights", "5:10"),
                new Cancion("No Escape", "3:45"),
                new Cancion("Machines Are People", "4:00")
            )),
            new Album("El Alma Joven", new Date(1971, 1, 1), "Balada", Arrays.asList(
                new Cancion("Querida", "4:00"),
                new Cancion("Así Fue", "3:30"),
                new Cancion("Te lo Pido por Favor", "3:20"),
                new Cancion("Me Gusta Estar Contigo", "4:15"),
                new Cancion("Mi Vida", "3:40")
            )),
            new Album("Recuerdos", new Date(1980, 1, 1), "Balada", Arrays.asList(
                new Cancion("No Tengo Dinero", "3:15"),
                new Cancion("Amor Eterno", "4:10"),
                new Cancion("Te Digo Que Te Quiero", "3:50"),
                new Cancion("Abrazame Muy Fuerte", "4:30"),
                new Cancion("Copa Tras Copa", "3:25")
            )),
            new Album("Nine Track Mind", new Date(2016, 1, 1), "Pop", Arrays.asList(
                new Cancion("One Call Away", "3:20"),
                new Cancion("Attention", "3:30"),
                new Cancion("We Don't Talk Anymore", "3:45"),
                new Cancion("Suffer", "4:00"),
                new Cancion("My Gospel", "3:35")
            )),
            new Album("Voicenotes", new Date(2018, 1, 1), "Pop", Arrays.asList(
                new Cancion("Attention", "3:30"),
                new Cancion("How Long", "3:00"),
                new Cancion("Done for Me", "3:40"),
                new Cancion("If You Leave Me Now", "3:20"),
                new Cancion("Through It All", "4:00")
            )),
            new Album("Clics Modernos", new Date(1983, 1, 1), "Pop Rock", Arrays.asList(
                new Cancion("Clics Modernos", "3:30"),
                new Cancion("No Voy en Tren", "3:15"),
                new Cancion("Demasiado Ego", "3:50"),
                new Cancion("La Larga Noche", "4:00"),
                new Cancion("En El Borde", "4:10")
            )),
            new Album("Filosofía Barata y Zapatos de Charol", new Date(1990, 1, 1), "Rock", Arrays.asList(
                new Cancion("Yendo a la Casa de Damián", "4:00"),
                new Cancion("Confesiones de Invierno", "3:20"),
                new Cancion("Los Libros de la Buena Memoria", "3:50"),
                new Cancion("Cerca de la Revolución", "4:10"),
                new Cancion("Quiero Ser", "3:30")
            )),
            new Album("Caifanes", new Date(1988, 1, 1), "Rock", Arrays.asList(
                new Cancion("La Celula Que Explota", "3:35"),
                new Cancion("Afuera", "4:10"),
                new Cancion("No Dejes Que", "4:00"),
                new Cancion("Viento", "3:40"),
                new Cancion("El Diablo", "3:25")
            )),
            new Album("El Silencio", new Date(1992, 1, 1), "Rock", Arrays.asList(
                new Cancion("Aquí No Es Así", "4:00"),
                new Cancion("La Negra Tomasa", "4:20"),
                new Cancion("Mundo de Piedra", "3:30"),
                new Cancion("El Silencio", "5:00"),
                new Cancion("Los Dioses Ocultos", "4:10")
            )),
            new Album("Please Please Me", new Date(1963, 1, 1), "Rock", Arrays.asList(
                new Cancion("I Saw Her Standing There", "2:40"),
                new Cancion("Please Please Me", "2:00"),
                new Cancion("Love Me Do", "2:20"),
                new Cancion("P.S. I Love You", "2:10"),
                new Cancion("Baby It's You", "2:30")
            )),
            new Album("Abbey Road", new Date(1969, 1, 1), "Rock", Arrays.asList(
                new Cancion("Come Together", "4:20"),
                new Cancion("Something", "3:00"),
                new Cancion("Octopus's Garden", "2:45"),
                new Cancion("Here Comes the Sun", "3:05"),
                new Cancion("The End", "2:00")
            )),
            new Album("Thriller", new Date(1982, 1, 1), "Pop", Arrays.asList(
                new Cancion("Thriller", "5:00"),
                new Cancion("Beat It", "4:20"),
                new Cancion("Billie Jean", "4:50"),
                new Cancion("Wanna Be Startin' Somethin'", "6:00"),
                new Cancion("Human Nature", "4:00")
            )),
            new Album("Bad", new Date(1987, 1, 1), "Pop", Arrays.asList(
                new Cancion("Bad", "4:30"),
                new Cancion("The Way You Make Me Feel", "4:00"),
                new Cancion("Smooth Criminal", "4:30"),
                new Cancion("Man in the Mirror", "5:00"),
                new Cancion("Dirty Diana", "4:40")
            )),
            new Album("Signos", new Date(1986, 1, 1), "Rock", Arrays.asList(
                new Cancion("Te Hacen Falta Vitaminas", "3:30"),
                new Cancion("En el Borde", "4:00"),
                new Cancion("Prófugos", "4:30"),
                new Cancion("Signos", "4:00"),
                new Cancion("La Calle del Viento", "3:40")
            )),
            new Album("Canción Animal", new Date(1990, 1, 1), "Rock", Arrays.asList(
                new Cancion("Te Hacen Falta Vitaminas", "3:35"),
                new Cancion("Un Día Más", "4:00"),
                new Cancion("Un Millón de Años Luz", "3:30"),
                new Cancion("Ella Usó mi Cabeza Como un Revólver", "4:10"),
                new Cancion("Prófugos", "4:00")
            )),
            new Album("Hombres G", new Date(1985, 1, 1), "Pop Rock", Arrays.asList(
                new Cancion("Devuélveme a Mi Chica", "3:20"),
                new Cancion("Venecia", "3:45"),
                new Cancion("La Cagaste... Burt Lancaster", "4:10"),
                new Cancion("El Ataque de los Hombres G", "3:00"),
                new Cancion("Me Cago en el Amor", "4:00")
            )),
            new Album("La Cagaste... Burt Lancaster", new Date(1990, 1, 1), "Pop Rock", Arrays.asList(
                new Cancion("Vuelvo a Verte", "4:00"),
                new Cancion("Sufre Mamón", "3:30"),
                new Cancion("Los Peces en el Río", "3:50"),
                new Cancion("Cómo Te Voy a Olvidar", "3:10"),
                new Cancion("Yo No Te Pido la Luna", "3:45")
            )),
            new Album("Malice Mizer", new Date(1996, 1, 1), "Visual Kei", Arrays.asList(
                new Cancion("Ma Chérie", "4:20"),
                new Cancion("The Holy Blood", "5:00"),
                new Cancion("After the Rain", "4:30"),
                new Cancion("Gackt", "3:45"),
                new Cancion("Au Revoir", "5:10")
            )),
            new Album("Bara no Seidou", new Date(1997, 1, 1), "Visual Kei", Arrays.asList(
                new Cancion("The Rose of Blood", "5:00"),
                new Cancion("C'est La Vie", "4:30"),
                new Cancion("Le Ciel", "3:40"),
                new Cancion("Nocturne", "4:15"),
                new Cancion("Château de L'Amour", "4:50")
            )),
            new Album("Artaud", new Date(1973, 1, 1), "Rock", Arrays.asList(
                new Cancion("Bajo el Volcán", "3:40"),
                new Cancion("La Vida", "3:20"),
                new Cancion("El Anillo del Capitán Beto", "4:30"),
                new Cancion("El Colmo", "4:10"),
                new Cancion("Por", "5:00")
            )),
            new Album("El Mundo de los Pescado Rabioso", new Date(1973, 1, 1), "Rock", Arrays.asList(
                new Cancion("La Casa de las Flores", "4:00"),
                new Cancion("La Montaña", "3:40"),
                new Cancion("Los Libros de la Buena Memoria", "3:30"),
                new Cancion("Cuidado", "4:20"),
                new Cancion("Bajo el Volcán", "3:50")
            )),
            new Album("Selected Ambient Works 85-92", new Date(1992, 1, 1), "Ambient", Arrays.asList(
                new Cancion("Xtal", "4:00"),
                new Cancion("Pulsewidth", "5:00"),
                new Cancion("Tha", "4:40"),
                new Cancion("Heliosphan", "6:00"),
                new Cancion("I", "3:30")
            )),
            new Album("Richard D. James Album", new Date(1996, 1, 1), "Electronic", Arrays.asList(
                new Cancion("4", "4:30"),
                new Cancion("12", "5:10"),
                new Cancion("Cornish Acid", "3:00"),
                new Cancion("Girl/Boy Song", "4:20"),
                new Cancion("Alberto Balsalm", "5:00")
            )),
            new Album("Violator", new Date(1990, 1, 1), "Synthpop", Arrays.asList(
                new Cancion("Personal Jesus", "4:56"),
                new Cancion("Enjoy the Silence", "6:08"),
                new Cancion("Policy of Truth", "4:56"),
                new Cancion("World in My Eyes", "4:30"),
                new Cancion("Waiting for the Night", "6:06")
            )),
            new Album("Songs of Faith and Devotion", new Date(1993, 1, 1), "Electronic Rock", Arrays.asList(
                new Cancion("I Feel You", "4:05"),
                new Cancion("Walking in My Shoes", "5:30"),
                new Cancion("Condemnation", "3:30"),
                new Cancion("In Your Room", "6:00"),
                new Cancion("Rush", "3:30")
            )),
            new Album("From the End of the World", new Date(2013, 1, 1), "Electronic", Arrays.asList(
                new Cancion("The Longest Road", "4:30"),
                new Cancion("One Last Trip", "4:20"),
                new Cancion("Broken Glass", "3:40"),
                new Cancion("Crossroads", "5:00"),
                new Cancion("Final Journey", "3:50")
            )),
            new Album("An Anxious Object", new Date(2015, 1, 1), "Noise", Arrays.asList(
                new Cancion("Terror", "5:10"),
                new Cancion("Tragedy", "4:30"),
                new Cancion("Obsession", "6:00"),
                new Cancion("Uprising", "4:20"),
                new Cancion("Eternal", "5:00")
            )),
            new Album("Liminality", new Date(2020, 1, 1), "Hardcore", Arrays.asList(
                new Cancion("Liminality", "5:20"),
                new Cancion("Cyber Misery", "4:30"),
                new Cancion("I Am God", "5:00"),
                new Cancion("Endless Suffering", "4:10"),
                new Cancion("Digital Void", "6:00")
            )),
            new Album("Cyber Bullying", new Date(2021, 1, 1), "Electronic", Arrays.asList(
                new Cancion("Cyber Bullying", "4:40"),
                new Cancion("Panic", "3:50"),
                new Cancion("Glitch", "4:00"),
                new Cancion("Toxicity", "5:20"),
                new Cancion("Doomed", "5:10")
            )),
            new Album("SHINRINYOKU", new Date(2024, 2, 14), "Nugaze", Arrays.asList(
                new Cancion("Dystopia", "4:28"),
                new Cancion("Outset", "1:54"),
                new Cancion("Make Them Suffer", "3:11"),
                new Cancion("Rose Garden", "5:34"),
                new Cancion("Breathe", "4:54")
            )),
            new Album("DYSTOPIA+OATH+MAKE THEM SUFFER", new Date(2023, 1, 1), "Nugaze", Arrays.asList(
                new Cancion("Dystopia", "4:28"),
                new Cancion("Make Them Suffer", "3:11"),
                new Cancion("OATH", "1:30")
            )),
            new Album("1983", new Date(2020, 2, 3), "Post-Punk", Arrays.asList(
                new Cancion("Caracas","1:40"),
                new Cancion("Guerra Mental","3:50"),
                new Cancion("Juego de Computadoras","1:56"),
                new Cancion("Hombres","3:36"),
                new Cancion("Hospital","1:09"),
                new Cancion("Luz en la Autopista","4:10"),
                new Cancion("Oigo Voces","3:08"),
                new Cancion("Millonario","2:17"),
                new Cancion("Religiones","1:24")
            )),
            new Album("Biophilia", new Date(2011, 1, 1), "Experimental", Arrays.asList(
                new Cancion("Crystalline", "4:50"),
                new Cancion("Cosmogony", "5:20"),
                new Cancion("Virus", "4:30"),
                new Cancion("Moon", "5:00"),
                new Cancion("Solstice", "6:00")
            )),
            new Album("Vulnicura", new Date(2015, 1, 1), "Electronic", Arrays.asList(
                new Cancion("Stonemilker", "6:00"),
                new Cancion("Lionsong", "4:00"),
                new Cancion("History of Touches", "5:20"),
                new Cancion("Family", "5:10"),
                new Cancion("Notget", "6:10")
            )),
            new Album("Green River", new Date(1969, 1, 1), "Rock", Arrays.asList(
                new Cancion("Green River", "2:30"),
                new Cancion("Commotion", "2:20"),
                new Cancion("Bad Moon Rising", "2:20"),
                new Cancion("Lodi", "3:00"),
                new Cancion("Cross-Tie Walker", "3:20")
            )),
            new Album("Cosmo's Factory", new Date(1970, 1, 1), "Rock", Arrays.asList(
                new Cancion("Ramble Tamble", "7:00"),
                new Cancion("Before You Accuse Me", "3:25"),
                new Cancion("Travelin' Band", "2:10"),
                new Cancion("Ooby Dooby", "2:10"),
                new Cancion("Lookin' Out My Back Door", "2:30")
            )),
            new Album("Palabritas y Palabrotas", new Date(2015, 1, 1), "Pop", Arrays.asList(
                new Cancion("El Chiste", "3:30"),
                new Cancion("Palabras en el Aire", "4:00"),
                new Cancion("La Aventura", "3:50"),
                new Cancion("Para Ti", "4:00"),
                new Cancion("Despedida", "4:30")
            )),
            new Album("El Diario de un Perro", new Date(2018, 1, 1), "Folk", Arrays.asList(
                new Cancion("Mi Mundo", "3:40"),
                new Cancion("El Perro", "4:20"),
                new Cancion("Lágrimas", "3:00"),
                new Cancion("Viento", "4:30"),
                new Cancion("Caminos", "4:00")
            )),
            new Album("Luz y Sombra", new Date(2019, 1, 1), "Rock Alternativo", Arrays.asList(
                new Cancion("Luz", "4:20"),
                new Cancion("Sombra", "3:50"),
                new Cancion("Río", "4:00"),
                new Cancion("Eclipse", "5:00"),
                new Cancion("Oscuridad", "3:40")
            )),
            new Album("El Reino de la Desolación", new Date(2021, 1, 1), "Post-Rock", Arrays.asList(
                new Cancion("Reino", "5:10"),
                new Cancion("Desolación", "4:20"),
                new Cancion("Olvido", "6:00"),
                new Cancion("Alma", "5:30"),
                new Cancion("Viento", "4:50")
            )),
            new Album("Fantasía", new Date(2020, 1, 1), "Indie Pop", Arrays.asList(
                new Cancion("Sueños", "4:00"),
                new Cancion("Imaginación", "3:40"),
                new Cancion("Fantasía", "5:00"),
                new Cancion("Vuelo", "4:20"),
                new Cancion("Eterno", "4:30")
            )),
            new Album("Despierta", new Date(2022, 1, 1), "Pop", Arrays.asList(
                new Cancion("Despierta", "4:10"),
                new Cancion("Despertar", "5:00"),
                new Cancion("Reflejo", "3:50"),
                new Cancion("Amor", "4:30"),
                new Cancion("Renacer", "4:20")
            )),
            new Album("Nectar", new Date(2020, 1, 1), "R&B", Arrays.asList(
                new Cancion("Ew", "3:50"),
                new Cancion("Run", "4:30"),
                new Cancion("Gimme Love", "3:40"),
                new Cancion("Daylight", "4:10"),
                new Cancion("Normal People", "4:00")
            )),
            new Album("In Tongues", new Date(2017, 1, 1), "R&B", Arrays.asList(
                new Cancion("Will He", "3:20"),
                new Cancion("Slow Dancing in the Dark", "4:50"),
                new Cancion("Ew", "3:30"),
                new Cancion("Take Me With You", "4:00"),
                new Cancion("In Tongues", "4:10")
            )),
            new Album("Flower Boy", new Date(2017, 1, 1), "Hip-Hop", Arrays.asList(
                new Cancion("See You Again", "3:30"),
                new Cancion("911/Mr. Lonely", "4:10"),
                new Cancion("Pothole", "3:50"),
                new Cancion("Who Dat Boy", "4:00"),
                new Cancion("Garden Shed", "4:30")
            )),
            new Album("IGOR", new Date(2019, 1, 1), "Hip-Hop", Arrays.asList(
                new Cancion("IGOR'S THEME", "4:00"),
                new Cancion("EARFQUAKE", "3:10"),
                new Cancion("I THINK", "3:30"),
                new Cancion("NEW MAGIC WAND", "3:50"),
                new Cancion("A BOY IS A GUN*", "4:10")
            )),
            new Album("Deathconsciousness", new Date(2008, 1, 1), "Post-Punk", Arrays.asList(
                new Cancion("A Quick One Before the Eternal Worm Devours Connecticut", "5:30"),
                new Cancion("Holy Fucking Shit: 40,000", "6:00"),
                new Cancion("The Big Gloom", "4:10"),
                new Cancion("Deep, Deep", "5:20"),
                new Cancion("Telephony", "4:00")
            )),
            new Album("The Unnatural World", new Date(2014, 1, 1), "Post-Rock", Arrays.asList(
                new Cancion("The Unnatural World", "5:30"),
                new Cancion("Defenestration Song", "4:10"),
                new Cancion("Emptiness in a Bottle", "4:40"),
                new Cancion("How Does It Feel?", "3:50"),
                new Cancion("I Don’t Want to Live Anymore", "6:00")
            )),
            new Album("Isolation", new Date(2018, 1, 1), "Pop", Arrays.asList(
                new Cancion("Miami", "3:10"),
                new Cancion("Body Language", "4:00"),
                new Cancion("Tyrant", "3:40"),
                new Cancion("Your Teeth in My Neck", "3:50"),
                new Cancion("After the Storm", "3:30")
            )),
            new Album("Sin Miedo (del Amor y Otros Demonios)", new Date(2020, 1, 1), "Reggaeton", Arrays.asList(
                new Cancion("La Luz", "3:50"),
                new Cancion("¿Te Vas?", "4:00"),
                new Cancion("Páginas", "3:30"),
                new Cancion("Vámonos de Viaje", "4:10"),
                new Cancion("Fórmula", "3:40")
            )),
            new Album("Natalia Lafourcade", new Date(2003, 1, 1), "Pop", Arrays.asList(
                new Cancion("Cien Años", "3:30"),
                new Cancion("Un Derecho de Nacimiento", "4:10"),
                new Cancion("No Te Vayas", "3:50"),
                new Cancion("Te Vi", "4:00"),
                new Cancion("Cruz de Olvido", "3:40")
            )),
            new Album("Hasta la Raíz", new Date(2015, 1, 1), "Pop", Arrays.asList(
                new Cancion("Hasta la Raíz", "4:30"),
                new Cancion("Lo que Construimos", "3:40"),
                new Cancion("Nunca Es Suficiente", "3:50"),
                new Cancion("Fuiste Tú", "4:00"),
                new Cancion("Vuelve a Mí", "4:10")
            )),
            new Album("Superclean Vol. I", new Date(2017, 1, 1), "Indie Pop", Arrays.asList(
                new Cancion("I Don't Want To Live", "3:30"),
                new Cancion("The Moon", "4:00"),
                new Cancion("Babe", "4:10"),
                new Cancion("Destruction", "3:50"),
                new Cancion("Makes Me Feel", "3:40")
            )),
            new Album("Cinema", new Date(2020, 1, 1), "Indie Pop", Arrays.asList(
                new Cancion("Hush", "4:10"),
                new Cancion("Only in My Dreams", "3:50"),
                new Cancion("Cinemascope", "4:30"),
                new Cancion("Just a Feeling", "3:40"),
                new Cancion("Forget", "4:00")
            )),
            new Album("Naturaleza", new Date(2017, 1, 1), "Indie Rock", Arrays.asList(
                new Cancion("Espejismo", "4:00"),
                new Cancion("Desconocidos", "4:20"),
                new Cancion("Frío", "3:50"),
                new Cancion("Mariposa", "4:10"),
                new Cancion("Naturaleza", "3:40")
            )),
            new Album("Vacío", new Date(2021, 1, 1), "Indie Rock", Arrays.asList(
                new Cancion("Cicatrices", "4:00"),
                new Cancion("Luz", "3:40"),
                new Cancion("Vacío", "4:30"),
                new Cancion("Olvidar", "3:50"),
                new Cancion("Todo Está Bien", "4:00")
            )),
            new Album("El Mal Querer", new Date(2018, 1, 1), "Flamenco Pop", Arrays.asList(
                new Cancion("Malamente", "3:40"),
                new Cancion("Pienso en tu Mirá", "3:30"),
                new Cancion("Bagdad", "4:00"),
                new Cancion("De Aquí No Sales", "4:20"),
                new Cancion("Catalina", "3:50")
            )),
            new Album("Motomami", new Date(2022, 1, 1), "Flamenco Pop", Arrays.asList(
                new Cancion("Saoko", "4:00"),
                new Cancion("Hentai", "3:50"),
                new Cancion("Chicken Teriyaki", "4:10"),
                new Cancion("Bizcochito", "3:40"),
                new Cancion("Motomami", "4:20")
            )),
            new Album("Los Panchos", new Date(1950, 1, 1), "Bolero", Arrays.asList(
                new Cancion("Solamente Una Vez", "3:30"),
                new Cancion("Quizás, Quizás, Quizás", "3:40"),
                new Cancion("Historia de un Amor", "4:00"),
                new Cancion("La Barquita", "3:50"),
                new Cancion("Amor, Amor", "3:30")
            )),
            new Album("La Historia de Los Panchos", new Date(1967, 1, 1), "Bolero", Arrays.asList(
                new Cancion("El Reloj", "3:20"),
                new Cancion("Cuando Vuelva a Tu Lado", "3:50"),
                new Cancion("Perdón", "4:00"),
                new Cancion("Toda una Vida", "4:10"),
                new Cancion("La Culebra", "3:40")
            )),
            new Album("Consuelo en Domingo", new Date(2014, 1, 1), "Rock Alternativo", Arrays.asList(
                new Cancion("Aún", "3:50"),
                new Cancion("Domingo", "4:10"),
                new Cancion("Vivir de noche", "3:40"),
                new Cancion("La Risa", "4:00"),
                new Cancion("Puedo Verlo", "4:10")
            )),
            new Album("Mártires del Rock and Roll", new Date(2017, 1, 1), "Rock Alternativo", Arrays.asList(
                new Cancion("Mártires", "3:50"),
                new Cancion("Sombra de una flor", "4:00"),
                new Cancion("Lo que sé", "4:30"),
                new Cancion("Noche eterna", "4:10"),
                new Cancion("Los fracasos", "3:40")
            )),
            new Album("Lateralus", new Date(2001, 1, 1), "Progressive Metal", Arrays.asList(
                new Cancion("Schism", "6:45"),
                new Cancion("Parabola", "6:00"),
                new Cancion("Lateralus", "9:00"),
                new Cancion("Ticks & Leeches", "6:30"),
                new Cancion("The Grudge", "8:00")
            )),
            new Album("10,000 Days", new Date(2006, 1, 1), "Progressive Metal", Arrays.asList(
                new Cancion("Vicarious", "7:00"),
                new Cancion("Jambi", "6:00"),
                new Cancion("The Pot", "5:30"),
                new Cancion("Rosetta Stoned", "7:30"),
                new Cancion("Wings for Marie (Pt 1)", "6:30")
            )),
            new Album("WLFGRL", new Date(2019, 1, 1), "Electronic", Arrays.asList(
                new Cancion("Misery", "3:30"),
                new Cancion("Specials", "4:00"),
                new Cancion("Ugly", "3:50"),
                new Cancion("Gamer Girl", "3:40"),
                new Cancion("Zipper", "4:10")
            )),
            new Album("Gemini", new Date(2020, 1, 1), "Electronic", Arrays.asList(
                new Cancion("Doomed", "4:00"),
                new Cancion("Centipede", "3:50"),
                new Cancion("Freak", "4:30"),
                new Cancion("Ghost", "4:00"),
                new Cancion("Gemini", "4:20")
            )),
            new Album("Sistema de Entretenimiento", new Date(2022, 1, 1), "Electropop", Arrays.asList(
                new Cancion("Pixelated Dreams", "3:50"),
                new Cancion("En el Limbo", "4:00"),
                new Cancion("Revolución Digital", "4:10"),
                new Cancion("Ciberdesastre", "3:40"),
                new Cancion("Fugaz", "4:00")
            )),
            new Album("Subterfugio", new Date(2023, 1, 1), "Electropop", Arrays.asList(
                new Cancion("Bajo Tierra", "3:50"),
                new Cancion("Sombra Cibernética", "4:00"),
                new Cancion("Subterráneo", "4:20"),
                new Cancion("Final de La Red", "4:10"),
                new Cancion("Enigma", "3:40")
            )),
            new Album("Caramel", new Date(2013, 1, 1), "Psychadelic Pop", Arrays.asList(
                new Cancion("I'm the Man, That Will Find You", "4:10"),
                new Cancion("It's Choade My Dear", "4:30"),
                new Cancion("Melting", "3:50"),
                new Cancion("The Interlude", "2:50"),
                new Cancion("Caramel", "3:40")
            )),
            new Album("Jassbusters", new Date(2018, 1, 1), "Psychadelic Pop", Arrays.asList(
                new Cancion("Loving You", "3:30"),
                new Cancion("Bobby's First Time", "4:00"),
                new Cancion("Con Caution", "4:10"),
                new Cancion("Jassbusters", "3:50"),
                new Cancion("Lonesome", "4:00")
            )),
            new Album("Chet Baker Sings", new Date(1956, 1, 1), "Jazz", Arrays.asList(
                new Cancion("My Funny Valentine", "2:30"),
                new Cancion("But Not for Me", "2:40"),
                new Cancion("I Fall in Love Too Easily", "3:10"),
                new Cancion("I Get Along Without You Very Well", "2:50"),
                new Cancion("Time After Time", "3:00")
            )),
            new Album("My Funny Valentine", new Date(1954, 1, 1), "Jazz", Arrays.asList(
                new Cancion("My Funny Valentine", "2:30"),
                new Cancion("There Will Never Be Another You", "3:00"),
                new Cancion("I Love You", "2:40"),
                new Cancion("Let’s Get Lost", "3:10"),
                new Cancion("The Thrill is Gone", "2:50")
            )),
            new Album("Kid A", new Date(2000, 1, 1), "Alternative Rock", Arrays.asList(
                new Cancion("Everything In Its Right Place", "4:10"),
                new Cancion("The National Anthem", "5:50"),
                new Cancion("How to Disappear Completely", "5:20"),
                new Cancion("Optimistic", "5:10"),
                new Cancion("Idioteque", "4:30")
            )),
            new Album("In Rainbows", new Date(2007, 1, 1), "Alternative Rock", Arrays.asList(
                new Cancion("15 Step", "3:40"),
                new Cancion("Bodysnatchers", "4:00"),
                new Cancion("Nude", "4:10"),
                new Cancion("Weird Fishes/Arpeggi", "5:10"),
                new Cancion("All I Need", "4:30")
            )),
            new Album("Somethin' Else", new Date(1958, 1, 1), "Jazz", Arrays.asList(
                new Cancion("Autumn Leaves", "6:40"),
                new Cancion("Love for Sale", "5:50"),
                new Cancion("Somethin' Else", "7:10"),
                new Cancion("One for Daddy-O", "6:00"),
                new Cancion("Dancing in the Dark", "5:50")
            )),
            new Album("In San Francisco", new Date(1961, 1, 1), "Jazz", Arrays.asList(
                new Cancion("This Here", "5:30"),
                new Cancion("Arietis", "6:10"),
                new Cancion("Jive Samba", "6:00"),
                new Cancion("Waltz for Debbie", "5:50"),
                new Cancion("All of Me", "6:20")
            )),
            new Album("Plastic Tree", new Date(1994, 1, 1), "J-Rock", Arrays.asList(
                new Cancion("Kanashimi", "4:30"),
                new Cancion("Kimi to no Fūkei", "4:00"),
                new Cancion("Watashi no Naka no Watashi", "3:40"),
                new Cancion("Aoi Kaze", "4:10"),
                new Cancion("Kaze to Kumo", "3:50")
            )),
            new Album("Karma", new Date(1997, 1, 1), "J-Rock", Arrays.asList(
                new Cancion("Fuhen", "5:00"),
                new Cancion("Irrational", "4:40"),
                new Cancion("Karma", "5:10"),
                new Cancion("Koi no Sekai", "4:20"),
                new Cancion("Silent", "4:00")
            )),
            new Album("Yoshu Fukushu", new Date(2005, 1, 1), "Nu Metal", Arrays.asList(
                new Cancion("Zetsubou Billy", "4:10"),
                new Cancion("Koi no Megalover", "3:50"),
                new Cancion("What's Up, People!?", "3:30"),
                new Cancion("F", "4:00"),
                new Cancion("Chu Chu Lovely", "4:20")
            )),
            new Album("Buiiki Kaeshi", new Date(2008, 1, 1), "Nu Metal", Arrays.asList(
                new Cancion("Rock Baby", "4:00"),
                new Cancion("Unmei no Kawa", "4:20"),
                new Cancion("Funtouki", "4:10"),
                new Cancion("Maximum the Hormone", "5:00"),
                new Cancion("Koi no Megalover", "4:10")
            )),
            new Album("Yoshu Fukushu", new Date(2005, 1, 1), "Nu Metal", Arrays.asList(
                new Cancion("Zetsubou Billy", "4:10"),
                new Cancion("Koi no Megalover", "3:50"),
                new Cancion("What's Up, People!?", "3:30"),
                new Cancion("F", "4:00"),
                new Cancion("Chu Chu Lovely", "4:20")
            )),
            new Album("Buiiki Kaeshi", new Date(2008, 1, 1), "Nu Metal", Arrays.asList(
                new Cancion("Rock Baby", "4:00"),
                new Cancion("Unmei no Kawa", "4:20"),
                new Cancion("Funtouki", "4:10"),
                new Cancion("Maximum the Hormone", "5:00"),
                new Cancion("Koi no Megalover", "4:10")
            )),
            new Album("Elegiac Blasphemy", new Date(2017, 1, 1), "Industrial Metal", Arrays.asList(
                new Cancion("Ashen Divinity", "4:30"),
                new Cancion("Blasphemous Echoes", "5:00"),
                new Cancion("Fallen Empire", "4:10"),
                new Cancion("Unholy Prayer", "3:50"),
                new Cancion("Wretched Creation", "4:20")
            )),
            new Album("Doomed Echoes", new Date(2020, 1, 1), "Industrial Metal", Arrays.asList(
                new Cancion("Doomed", "4:00"),
                new Cancion("Echoes of the Past", "5:10"),
                new Cancion("Into the Void", "4:30"),
                new Cancion("Revelation", "4:00"),
                new Cancion("Eternal Night", "4:10")
            )),
            new Album("Jet Set Radio OST", new Date(2000, 1, 1), "Electronic / Soundtrack", Arrays.asList(
                new Cancion("Rock It On", "3:40"),
                new Cancion("Humming the Bassline", "4:00"),
                new Cancion("Super Brothers", "3:30"),
                new Cancion("Let Mom Sleep", "3:50"),
                new Cancion("The Concept of Love", "4:00")
            )),
            new Album("Sonic Rush OST", new Date(2005, 1, 1), "Video Game Music", Arrays.asList(
                new Cancion("Right There, Ride On", "3:20"),
                new Cancion("Wave Master", "4:00"),
                new Cancion("Sonic Boom", "3:40"),
                new Cancion("End of the World", "3:50"),
                new Cancion("Sonic Rush", "4:10")
            )),
            new Album("Jet Set Radio OST", new Date(2000, 1, 1), "Electronic / Soundtrack", Arrays.asList(
                new Cancion("Rock It On", "3:40"),
                new Cancion("Humming the Bassline", "4:00"),
                new Cancion("Super Brothers", "3:30"),
                new Cancion("Let Mom Sleep", "3:50"),
                new Cancion("The Concept of Love", "4:00")
            )),
            new Album("Sonic Rush OST", new Date(2005, 1, 1), "Video Game Music", Arrays.asList(
                new Cancion("Right There, Ride On", "3:20"),
                new Cancion("Wave Master", "4:00"),
                new Cancion("Sonic Boom", "3:40"),
                new Cancion("End of the World", "3:50"),
                new Cancion("Sonic Rush", "4:10")
            )),
            new Album("Pokémon Black & White OST", new Date(2010, 1, 1), "Video Game Music", Arrays.asList(
                new Cancion("Battle Theme", "3:40"),
                new Cancion("Route 1", "2:50"),
                new Cancion("Gym Leader Battle", "3:30"),
                new Cancion("Victory Road", "4:10"),
                new Cancion("Champion Battle", "4:00")
            )),
            new Album("Pokémon Ruby & Sapphire OST", new Date(2003, 1, 1), "Video Game Music", Arrays.asList(
                new Cancion("Battle Frontier", "3:50"),
                new Cancion("Slateport City", "3:10"),
                new Cancion("Mauville City", "3:30"),
                new Cancion("Elite Four", "4:00"),
                new Cancion("Battle Tower", "3:50")
            )),
            new Album("Crush 40", new Date(2010, 1, 1), "Rock / Video Game Music", Arrays.asList(
                new Cancion("Live & Learn", "3:50"),
                new Cancion("Open Your Heart", "4:10"),
                new Cancion("I Am... All of Me", "4:00"),
                new Cancion("His World", "3:50"),
                new Cancion("Sonic Boom", "3:30")
            )),
            new Album("The Works", new Date(2011, 1, 1), "Rock / Video Game Music", Arrays.asList(
                new Cancion("Crush 40", "4:10"),
                new Cancion("All of Me", "4:00"),
                new Cancion("Sonic Heroes", "4:30"),
                new Cancion("His World", "3:40"),
                new Cancion("Waking Up", "3:50")
            )),
            new Album("Mi Vida En Un Cigarro", new Date(2021, 1, 1), "Corridos Tumbados", Arrays.asList(
                new Cancion("Mi Vida En Un Cigarro", "3:40"),
                new Cancion("Cholo Soy", "4:00"),
                new Cancion("El Diablo y Yo", "3:50"),
                new Cancion("Ratas", "4:10"),
                new Cancion("Chingando por la Vida", "4:20")
            )),
            new Album("Soy El Diablo 2.0", new Date(2022, 1, 1), "Corridos Tumbados", Arrays.asList(
                new Cancion("Soy El Diablo", "3:30"),
                new Cancion("Borracho y Loco", "3:50"),
                new Cancion("Hasta Los Huesos", "4:10"),
                new Cancion("Sufrimiento", "3:40"),
                new Cancion("No Me Siento Bien", "4:00")
            )),
            new Album("Aquí", new Date(2006, 1, 1), "Pop", Arrays.asList(
                new Cancion("Limón y sal", "3:50"),
                new Cancion("Andar Conmigo", "4:00"),
                new Cancion("Qué Pretendes", "4:10"),
                new Cancion("Ese Camino", "3:40"),
                new Cancion("Nada Fue un Error", "4:00")
            )),
            new Album("Limón y sal", new Date(2006, 1, 1), "Pop", Arrays.asList(
                new Cancion("Limón y sal", "3:50"),
                new Cancion("Me Voy", "3:40"),
                new Cancion("Algo Está Cambiando", "4:00"),
                new Cancion("Si Tú Fueras", "4:10"),
                new Cancion("La Noche", "3:30")
            ))
        );    
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public List<Album> getAlbumes() {
        return albumes;
    }

}
