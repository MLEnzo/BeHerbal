package emsyrpc.beherbal.DataBase;

import java.sql.Blob;

/**
 * Created by Pablo on 27/07/2017.
 */

public class EstructuraDB {

    //costantes campos tabla usuario
    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_IDUSR="IdUsuario";
    public static final String CAMPO_FOTOU="fotoUsuario";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_PESOACTUAL="pesoActual";
    public static final String CAMPO_IMC="imc";
    public static final String CAMPO_GRASA="grasa";


    public static final String CREAR_TABLA_USUARIO="CREATE TABLE "+TABLA_USUARIO+" ("+CAMPO_IDUSR+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_FOTOU+" BLOB, "+CAMPO_NOMBRE+" VARCHAR, "+CAMPO_APELLIDO+" VARCHAR, "+CAMPO_PESOACTUAL+" DOUBLE, "+CAMPO_IMC+" DOUBLE, "+CAMPO_GRASA+" DOUBLE)";

    //costantes campos tabla estaturaH
    public static final String TABLA_ESTATURAH="estaturaH";
    public static final String CAMPO_IDEST="IdEstaturaH";
    public static final String CAMPO_ESTATURA="estaturaH";

    public static final String CREAR_TABLA_ESTATURAH="CREATE TABLE "+TABLA_ESTATURAH+" ("+CAMPO_IDEST+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_ESTATURA+" DOUBLE)";

    //costantes campos tabla estaturaM
    public static final String TABLA_ESTATURAM="estaturaM";
    public static final String CAMPO_IDESTM="idEstaturaM";
    public static final String CAMPO_ESTATURAM="estaturaM";

    public static final String CREAR_TABLA_ESTATURAM="CREATE TABLE "+TABLA_ESTATURAM+" ("+CAMPO_IDESTM+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_ESTATURAM+" DOUBLE)";

    //costantes campos tabla grasaIdealH
    public static final String TABLA_GRASAIDEALH="grasaIdealH";
    public static final String CAMPO_IDGRH="idGrasaIdealH";
    public static final String CAMPO_GRAMINH="minimo";
    public static final String CAMPO_GRAMEDH="medio";
    public static final String CAMPO_GRAMAXH="maximo";


    public static final String CREAR_TABLA_GRASAIDEALH="CREATE TABLE "+TABLA_GRASAIDEALH+" ("+CAMPO_IDGRH+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_GRAMINH+" DOUBLE, "+CAMPO_GRAMEDH+" DOUBLE, "+CAMPO_GRAMAXH+" DOUBLE)";


    //costantes campos tabla grasaIdealM

    public static final String TABLA_GRASAIDEALM="grasaIdealM";
    public static final String CAMPO_IDGRM="IdGrasaIdealM";
    public static final String CAMPO_GRAMINM="minimo";
    public static final String CAMPO_GRAMEDM="medio";
    public static final String CAMPO_GRAMAXM="maximo";

    public static final String CREAR_TABLA_GRASAIDEALM="CREATE TABLE "+TABLA_GRASAIDEALM+" ("+CAMPO_IDGRM+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_GRAMINM+" DOUBLE, "+CAMPO_GRAMEDM+" DOUBLE, "+CAMPO_GRAMAXM+" DOUBLE)";

    //costantes campos tabla muñeca

    public static final String TABLA_MUÑECA="muñeca";
    public static final String CAMPO_IDMUÑECA="IdMuñeca";
    public static final String CAMPO_TAMAÑO="tamaño";


    public static final String CREAR_TABLA_MUÑECA="CREATE TABLE "+TABLA_MUÑECA+" ("+CAMPO_IDMUÑECA+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_TAMAÑO+" VARCHAR)";


    //costantes campos tabla pesoIdealGrH

    public static final String TABLA_PESOIDEALGRH="pesoIdealGrH";
    public static final String CAMPO_IDPESOIDGRH="IdPesoIdGrH";
    public static final String CAMPO_PESGRMINH="minimo";
    public static final String CAMPO_PESGRMEDH="medio";
    public static final String CAMPO_PESGRMAXH="maximo";

    public static final String CREAR_TABLA_PESOIDEALGRH="CREATE TABLE "+TABLA_PESOIDEALGRH+" ("+CAMPO_IDPESOIDGRH+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_PESGRMINH+" DOUBLE, "+CAMPO_PESGRMEDH+" DOUBLE, "+CAMPO_PESGRMAXH+" DOUBLE)";



    //costantes campos tabla pesoIdealMdH

    public static final String TABLA_PESOIDEALMDH="pesoIdealMdH";
    public static final String CAMPO_IDPESOIDMDH="IdPesoIdMdH";
    public static final String CAMPO_PESMDMINH="minimo";
    public static final String CAMPO_PESMDMEDH="medio";
    public static final String CAMPO_PESMDMAXH="maximo";

    public static final String CREAR_TABLA_PESOIDEALMDH="CREATE TABLE "+TABLA_PESOIDEALMDH+" ("+CAMPO_IDPESOIDMDH+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_PESMDMINH+" DOUBLE, "+CAMPO_PESMDMEDH+" DOUBLE, "+CAMPO_PESMDMAXH+" DOUBLE)";



    //costantes campos tabla pesoIdealPqH

    public static final String TABLA_PESOIDEALPQH="pesoIdealPqH";
    public static final String CAMPO_IDPESOIDPQH="IdPesoIdPqH";
    public static final String CAMPO_PESPQMINH="minimo";
    public static final String CAMPO_PESPQMEDH="medio";
    public static final String CAMPO_PESPQMAXH="maximo";

    public static final String CREAR_TABLA_PESOIDEALPQH="CREATE TABLE "+TABLA_PESOIDEALPQH+" ("+CAMPO_IDPESOIDPQH+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_PESPQMINH+" DOUBLE, "+CAMPO_PESPQMEDH+" DOUBLE, "+CAMPO_PESPQMAXH+" DOUBLE)";

    //costantes campos tabla pesoIdealGrM

    public static final String TABLA_PESOIDEALGRM="pesoIdealGrM";
    public static final String CAMPO_IDPESOIDGRM="IdPesoIdGrM";
    public static final String CAMPO_PESGRMINM="minimo";
    public static final String CAMPO_PESGRMEDM="medio";
    public static final String CAMPO_PESGRMAXM="maximo";

    public static final String CREAR_TABLA_PESOIDEALGRM="CREATE TABLE "+TABLA_PESOIDEALGRM+" ("+CAMPO_IDPESOIDGRM+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_PESGRMINM+" DOUBLE, "+CAMPO_PESGRMEDM+" DOUBLE, "+CAMPO_PESGRMAXM+" DOUBLE)";

    //costantes campos tabla pesoIdealMdM

    public static final String TABLA_PESOIDEALMDM="pesoIdealMdM";
    public static final String CAMPO_IDPESOIDMDM="IdPesoIdMdM";
    public static final String CAMPO_PESMDMINM="minimo";
    public static final String CAMPO_PESMDMEDM="medio";
    public static final String CAMPO_PESMDMAXM="maximo";

    public static final String CREAR_TABLA_PESOIDEALMDM="CREATE TABLE "+TABLA_PESOIDEALMDM+" ("+CAMPO_IDPESOIDMDM+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_PESMDMINM+" DOUBLE, "+CAMPO_PESMDMEDM+" DOUBLE, "+CAMPO_PESMDMAXM+" DOUBLE)";

    //costantes campos tabla pesoIdealPqM

    public static final String TABLA_PESOIDEALPQM="pesoIdealPqM";
    public static final String CAMPO_IDPESOIDPQM="IdPesoIdPqM";
    public static final String CAMPO_PESPQMINM="minimo";
    public static final String CAMPO_PESPQMEDM="medio";
    public static final String CAMPO_PESPQMAXM="maximo";

    public static final String CREAR_TABLA_PESOIDEALPQM="CREATE TABLE "+TABLA_PESOIDEALPQM+" ("+CAMPO_IDPESOIDPQM+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_PESPQMINM+" DOUBLE, "+CAMPO_PESPQMEDM+" DOUBLE, "+CAMPO_PESPQMAXM+" DOUBLE)";

    //costantes campos tabla sexo

    public static final String TABLA_SEXO="sexo";
    public static final String CAMPO_IDSEXO="IdSexo";
    public static final String CAMPO_SEXO="sexo";

    public static final String CREAR_TABLA_SEXO="CREATE TABLE "+TABLA_SEXO+" ("+CAMPO_IDSEXO+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_SEXO+" VARCHAR)";



    //costantes campos tabla edad
    public static final String TABLA_EDAD="edad";
    public static final String CAMPO_IDEDAD="idEdad";
    public static final String CAMPO_EDADES="edades";

    public static final String CREAR_TABLA_EDAD="CREATE TABLE "+TABLA_EDAD+" ("+CAMPO_IDEDAD+" INTEGER PRIMARY KEY  NOT NULL , "+CAMPO_EDADES+" INTEGER)";

}
