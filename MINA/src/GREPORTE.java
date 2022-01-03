import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class GREPORTE {
    // Mes, dias
    private static int DIAS(int MES){
        int numeroDias=-1;
        switch(MES){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias=30;
                break;
            case 2:

                Date anioActual=new Date();
                if(esBisiesto(1900 + anioActual.getYear())){
                    numeroDias=29;
                }else{
                    numeroDias=28;
                }
                break;
        }
        return numeroDias;
    }
    private static String Nmes(int mes){
        String MES="";
        switch (mes){
            case 1:MES="ENERO";break;
            case 2:MES="FEBRERO";break;
            case 3:MES="MARZO";break;
            case 4:MES="ABRIL";break;
            case 5:MES="MAYO";break;
            case 6:MES="JUNIO";break;
            case 7:MES="JULIO";break;
            case 8:MES="AGOSTO";break;
            case 9:MES="SEPTIEMBRE";break;
            case 10:MES="OCTUBRE";break;
            case 11:MES="NOVIEMBRE";break;
            case 12:MES="DICIEMBRE";
                break;
        }
        return MES;
    }
    public static boolean esBisiesto(int anio) {

        GregorianCalendar calendar = new GregorianCalendar();
        boolean esBisiesto = false;
        if (calendar.isLeapYear(anio)) {
            esBisiesto = true;
        }
        return esBisiesto;
    }
    //DEVELOPER
    private static String[] NOMBRE(String Cargo,String Nombre,String ApPaterno,String ApMaterno ){
        String[] array1=new String[4];
        array1[0]=Cargo;
        array1[1]=Nombre;
        array1[2]=ApPaterno;
        array1[3]=ApMaterno;
      //  System.out.println(array1[0]+ " "+ array1[1]+ " "+array1[2]+" "+array1[3]);
        return array1;
    }
    private static double[] METRAJE(double MIPQ,double MFPQ,double MIHQ,double MFHQ,double MINQ,double MFNQ){
        double[] array2=new double[6];
        array2[0]=MIPQ;
        array2[1]=MFPQ;
        array2[2]=MIHQ;
        array2[3]=MFHQ;
        array2[4]=MINQ;
        array2[5]=MFNQ;
        return  array2;
    }
    private static String[] Thoras(String C_ADP,String ADP,String C_CDB,String CDB,String C_CDL,String CDL,String C_CRDB,String CRDB,String C_EF, String EF,String C_IDEDC, String IDEDC,String C_IDMYA, String IDMYA,String C_IDDC, String IDDC,String C_IDMPO,String IDMPO,String AKD_MDE,String MDE,String C_MEP,String MEP,String AKD_OYL, String OYL,String C_OHO, String OHO,String AKD_PT, String PT,String AKD_PN, String PN,String AKD_PD, String PD,String C_PGIH, String PGIH,String C_PDRS,String PDRS,String C_PDG, String PDG,String C_RAP,String RAP,String C_RDHYT,String RDHYT,String AKD_RDTPFDP, String RDTPFDP,String C_RECT, String RECT,String C_SDP,String SDP,String C_SBCLI, String SBCLI,String C_SBCLIM,String SBCLIM,String C_SBS, String SBS,String C_SBV, String SBV){
    String[] array3=new String[56];
    array3[0]=C_ADP;
    array3[1]=ADP;
    array3[ 2]= C_CDB;
    array3[ 3]= CDB;
        array3[ 4]= C_CDL;
    array3[ 5]= CDL;
        array3[6 ]= C_CRDB;
        array3[7 ]= CRDB;
        array3[8]= C_EF;
        array3[9]= EF;
        array3[10 ]=C_IDEDC ;
        array3[11 ]=IDEDC ;
        array3[ 12]= C_IDMYA;
        array3[ 13]= IDMYA;
        array3[14]= C_IDDC;
        array3[15 ]= IDDC;
        array3[ 16]=C_IDMPO ;
        array3[ 17]=IDMPO ;
        array3[ 18]=AKD_MDE ;
        array3[ 19]=MDE ;
        array3[ 20]=C_MEP ;
        array3[ 21]=MEP ;
        array3[22 ]= AKD_OYL;
        array3[23 ]= OYL;
        array3[ 24]= C_OHO;
        array3[ 25]= OHO;
        array3[ 26]= AKD_PT;
        array3[ 27]= PT;
        array3[ 28]= AKD_PN;
        array3[ 29]= PN;
        array3[ 30]= AKD_PD;
        array3[ 31]= PD;
        array3[ 32]= C_PGIH;
        array3[ 33]= PGIH;
        array3[ 34]= C_PDRS;
        array3[ 35]= PDRS;
        array3[ 36]= C_PDG;
        array3[ 37]= PDG;
        array3[ 38]= C_RAP;
        array3[ 39]= RAP;
        array3[ 40]= C_RDHYT;
        array3[ 41]= RDHYT;
        array3[ 42]= AKD_RDTPFDP;
        array3[ 43]= RDTPFDP;
        array3[ 44]=C_RECT;
        array3[ 45]=RECT;
        array3[ 46]=C_SDP;
        array3[ 47]=SDP;
        array3[ 48]= C_SBCLI;
        array3[ 49]= SBCLI;
        array3[ 50]= C_SBCLIM;
        array3[ 51]= SBCLIM;
        array3[ 52]= C_SBS;
        array3[ 53]= SBS;
        array3[ 54]= C_SBV;
        array3[ 55]= SBV;
    return array3;
    }
    private static String[] GReporteNombre(String[] Nombre1,String[] Nombre2, String[] Nombre3,String[] Nombre4){
        String[] concate =new String[Nombre1.length+ Nombre2.length+ Nombre3.length+ Nombre4.length];
        int posicion=0;
        for (String object:Nombre1) {
            concate[posicion]=object;
            posicion++;
        }
        for (String object:Nombre2) {
            concate[posicion]=object;
            posicion++;
        }
        for (String object:Nombre3) {
            concate[posicion]=object;
            posicion++;
        }
        for (String object:Nombre4) {
            concate[posicion]=object;
            posicion++;
        }
 //      System.out.println(Arrays.toString(concate));
       return concate;
    }

    private static double CostoHQ(double tamaño){
        double precio=0;
        if(0<tamaño && tamaño<=100){
           precio=79;
        }else if(tamaño<=200){
            precio=82.5;
        }else if(tamaño<=300){
            precio=86.6;
        }else if(tamaño<=400){
            precio=91.7;
        }else if(tamaño<=500){
            precio=98.3;
        }else if(tamaño<=600){
            precio=105.7;
        }else if(tamaño<=700){
            precio=114.1;
        }else {
            precio=0;
        }
        return precio;
    }
    private static double CostoNQ(double tamaño){
        double precio=0;
        if(0<tamaño && tamaño<=100){
            precio=66.2;
        }else if(tamaño<=200){
            precio=70.4;
        }else if(tamaño<=300){
            precio=74.6;
        }else if(tamaño<=400){
            precio=80;
        }else if(tamaño<=500){
            precio=86.2;
        }else if(tamaño<=600){
            precio=93.5;
        }else if(tamaño<=700){
            precio=102.4;
        }else if(tamaño<=800){
            precio=112.4;
        }else if(tamaño<=900){
            precio=124;
        }else if(tamaño<=1000){
            precio=135.6;
        }else {
            precio=0;
        }
        return precio;
    }
    //INGRESO POR METRO - TURNO
    private static double ITURNO(double[] M){
        double iturno=0;
        double DPQ=0;
        DPQ=(100-M[0]%100)*CostoHQ(M[0])+
                ((M[1]-M[1]%100)-(M[0]+100-M[0]%100))*CostoHQ(M[0]+100)+
                (M[1]%100)*CostoHQ(M[1]);
        double DHQ=0;
        DHQ=(100-M[2]%100)*CostoHQ(M[2])+
                ((M[3]-M[3]%100)-(M[2]+100-M[2]%100))*CostoHQ(M[2]+100)+
                (M[3]%100)*CostoHQ(M[3]);
        double DNQ=0;
       DNQ=(100-M[4]%100)*CostoNQ(M[4])+
                ((M[5]-M[5]%100)-(M[4]+100-M[4]%100))*CostoNQ(M[4]+100)+
                (M[5]%100)*CostoNQ(M[5]);
        iturno=DPQ+DHQ+DNQ;
        return iturno;
    }
    private static double MetrosPerforados(double[] M){
        double metros=0;
        metros=M[1]-M[0] + M[3]-M[2] + M[5] -M[4];
        return metros;
    }
    private static double SumaArreglo(String[] array){
        double suma=0;
        for (int i = 0; i < array.length; i++) {
            if(i%2!=0){
                suma=suma+Double.parseDouble(array[i]);
            }
        }
        return suma;
    }
    private static double TotalIngresoxhora(String[] array){
        double suma=0.0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]=="C"){
                suma=suma+Double.parseDouble(array[i+1])*90.0;
            }
        }
        suma=suma-10*(Double.parseDouble(array[49])+Double.parseDouble(array[51])+Double.parseDouble(array[53])+Double.parseDouble(array[55]));
        return suma;
    }
    //imprimir arreglo
    private static String[] imprime(String[] array){
        String[] array2 =new String[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=array[i];
            System.out.print(array2[i] + " ");
        }
        return array2;
    }
    private static String[] IMPRIME(double[] array){
        String[] array2 =new String[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=String.valueOf(array[i]);
            System.out.print(array2[i] + " ");
        }
        return array2;
    }


    public static void main(String[] args) {
    //NOMBRES REPORTE 0
        String[] s0=new String[4];
        s0[0] = JOptionPane.showInputDialog("Ingrese el Cargo");
        s0[1] = JOptionPane.showInputDialog("Ingrese el Nombre");
        s0[2] = JOptionPane.showInputDialog("Ingrese el Apellido Paterno");
        s0[3] = JOptionPane.showInputDialog("Ingrese el Apellido Materno");
  //  System.out.println(s0[0] + " "+s0[1] + " "+s0[2] + " "+s0[3] );
        String[] p0=new String[4];
        p0[0] = JOptionPane.showInputDialog("Ingrese el Cargo");
        p0[1] = JOptionPane.showInputDialog("Ingrese el Nombre");
        p0[2] = JOptionPane.showInputDialog("Ingrese el Apellido Paterno");
        p0[3] = JOptionPane.showInputDialog("Ingrese el Apellido Materno");
   // System.out.println(p0[0] + " "+p0[1] + " "+p0[2] + " "+p0[3] );
        String[] a1_0=new String[4];
        a1_0[0] = JOptionPane.showInputDialog("Ingrese el Cargo");
        a1_0[1] = JOptionPane.showInputDialog("Ingrese el Nombre");
        a1_0[2] = JOptionPane.showInputDialog("Ingrese el Apellido Paterno");
        a1_0[3] = JOptionPane.showInputDialog("Ingrese el Apellido Materno");
  //  System.out.println(a1_0[0] + " "+a1_0[1] + " "+a1_0[2] + " "+a1_0[3] );
        String[] a2_0=new String[4];
        a2_0[0] = JOptionPane.showInputDialog("Ingrese el Cargo");
        a2_0[1] = JOptionPane.showInputDialog("Ingrese el Nombre");
        a2_0[2] = JOptionPane.showInputDialog("Ingrese el Apellido Paterno");
        a2_0[3] = JOptionPane.showInputDialog("Ingrese el Apellido Materno");
 //   System.out.println(a2_0[0] + " "+a2_0[1] + " "+a2_0[2] + " "+a2_0[3] );
    //METRAJE REPORTE 0
        double[] METRAJE0=METRAJE(0,0,300,420,200,250);
 //       System.out.println(METRAJE0[0]+ " " +METRAJE0[1]+ " " +METRAJE0[2]+ " " +METRAJE0[3]+ " " +METRAJE0[4]+ " " +METRAJE0[5]);
        double perforado0=MetrosPerforados(METRAJE0);
        //      System.out.printf("%.2f\n",ITURNO(METRAJE0));
  //      System.out.printf("%.2f\n",perforado0);
    // t horas reporte 0
        String[] hora0=Thoras("C","0.2","C","0.2","C","0.2","C","0.21","C","0.2","C","0.3","C","0.1","C","0.3","C","0.3","AKD","0.5","C","0.6","AKD","0.3","C","0.7","AKD","0.4","AKD","0.5","AKD","0.2","C","0.2","C","0.2","C","0.2","C","0.2","C","0.4","AKD","0.5","C","0.6","C","0.4","C","0.4","C","0.2","C","0.8","C","0.1");
        double shora0=SumaArreglo(hora0)+1.5;
 //       System.out.println("La suma de horas en el turno fue de: "+ shora0);
        double Tt0=TotalIngresoxhora(hora0);
//        System.out.println(Tt0);
        //NOMBRES REPORTE
        String[] s1=NOMBRE("SUPERVISOR","AQUILES","CASTRO","PEREIRA");
        //      System.out.println(s1[0] + " "+s1[1] + " "+s1[2] + " "+s1[3] );
        String[] p1=new String[4];
        p1[0] = "PERFORISTA";
        p1[1] = "ARMANDO";
        p1[2] = "PAREDES";
        p1[3] = "GRANDES";
        //      System.out.println(p1[0] + " "+p1[1] + " "+p1[2] + " "+p1[3] );
        String[] a1_1=new String[4];
        a1_1[0] = "ASISTENTE";
        a1_1[1] = "ZOILA";
        a1_1[2] = "VACA";
        a1_1[3] = "HACEMU";
        //      System.out.println(a1_1[0] + " "+a1_1[1] + " "+a1_1[2] + " "+a1_1[3] );
        String[] a2_1=new String[4];
        a2_1[0] = "ASISTENTE";
        a2_1[1] = "SHI";
        a2_1[2] = "FA";
        a2_1[3] = "PONKTU";
//       System.out.println(a2_1[0] + " "+a2_1[1] + " "+a2_1[2] + " "+a2_1[3] );
    // METRAJE REPORTE 1
      double[] METRAJE1=METRAJE(0,0,45,60,80,109);
//        System.out.printf("%.2f\n",ITURNO(METRAJE1));
        double perforado1=MetrosPerforados(METRAJE1);
//        System.out.printf("%.2f\n",perforado1);
    // t horas reporte 1
        String[] hora1=Thoras("C","0.2","C","0.2","C","0.2","C","0.21","C","0.3","C","0.3","C","0.1","C","0.3","C","0.3","AKD","0.5","C","0.6","AKD","0.3","C","0.7","AKD","0.4","AKD","0.5","AKD","0.2","C","0.2","C","0.2","C","0.2","C","0.2","C","0.4","AKD","0.5","C","0.6","C","0.4","C","0.4","C","0.2","C","0.8","C","0.1");
        double shora1=SumaArreglo(hora1)+1.5;
//        System.out.println("La suma de horas en el turno fue de: "+ shora1);
        double Tt1=TotalIngresoxhora(hora1);
        //       System.out.println(Tt1);
    String[] R0=GReporteNombre(s0,p0,a1_0,a2_0);
    String[] R1=GReporteNombre(s1,p1,a1_1,a2_1);
        //metas
        double MmPerforadosMensual=1510.00;
        double MmPerforadosDiaria=48.71;
        double MiMensual=147951.00;
        double MiDiaria=4473.00;

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("A continuación presentaremos el reporte para un día de trabajo");
        System.out.println("**********************************************************************************************");
        System.out.println("El reporte 1/"+DIAS(7));
        Scanner Turno = new Scanner(System.in);
        String turno = Turno.nextLine();//turno M:mañana, N:noche
        System.out.println("Nombre del archivo es: "+ R0[2].substring(0,2)+R0[1].substring(0,2)+turno+Nmes(7)+ localDate.getDayOfMonth());
        System.out.print("El arreglo con Nombres es: ");
        imprime(R0);
        System.out.println("\nEl arreglo con Metros Perforados es: ");
        IMPRIME(METRAJE0);
        System.out.println("\nEl arreglo de horas: ");
        imprime(hora0);
        System.out.println("\n**********************************************************************************************");
        System.out.println("El reporte 2/"+DIAS(7));
        Scanner _Turno = new Scanner(System.in);
        String _turno = _Turno.nextLine();//turno M:mañana, N:noche
        System.out.println("Nombre del archivo es: "+ R1[2].substring(0,2)+R1[1].substring(0,2)+_turno+Nmes(7)+ localDate.getDayOfMonth());
        System.out.print("El arreglo con Nombres es: ");
        imprime(R1);
        System.out.println("\nEl arreglo con Metros Perforados es: ");
        IMPRIME(METRAJE1);
        System.out.println("\nEl arreglo de horas: ");
        imprime(hora1);
        System.out.println("\n**********************************************************************************************");
        System.out.println("El informe del día "+  localDate.getDayOfMonth() + " de "+ Nmes(7) + "  es: ");
        double metros=MetrosPerforados(METRAJE0)+MetrosPerforados(METRAJE1);
        System.out.println("La cantidad de metros perforados fue de: " + metros);
        if(metros>MmPerforadosDiaria){
            System.out.println("Cumplió la meta diaria");
        }else{
            double x=MmPerforadosDiaria-metros;
            System.out.println("No cumplió la meta por:" +x);
        }
        double precio1=ITURNO(METRAJE0)+ITURNO(METRAJE1);
        System.out.println("El ingreso por metros perforados es: " + precio1);
        double precio2=Tt0+Tt1;
        System.out.println("El ingreso por horas perforados es: " + precio2);
        double ingreso=precio1+precio2;
        System.out.println("El total de ingreso diario es: "+ ingreso);
        if(ingreso>MiDiaria){
            System.out.println("Cumplió la meta diaria");
        }else{
            double x=MiDiaria-ingreso;
            System.out.println("No cumplió la meta por:" +x);
        }
        //supuestos
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        double Pmes=(perforado0+perforado1)*DIAS(7); // por que no tenemos 62 arreglos, supondremos el mismo ingreso diario para todos los dias del mes
        System.out.println("El total de perforado mensual es: "+ Pmes);
        if(Pmes>MmPerforadosMensual){
            System.out.println("Cumplió la meta mensual");
        }else{
            double x=MmPerforadosMensual-Pmes;
            System.out.println("No cumplió la meta mensual por:" +x);
        }


        double Imes=(precio1+precio2)*DIAS(7); // por que no tenemos 62 arreglos, supondremos el mismo ingreso diario para todos los dias del mes
        System.out.println("El total de ingreso mensual es: "+ Imes);
        if(Imes>MiMensual){
            System.out.println("Cumplió la meta mensual");
        }else{
            double x=MiMensual-Imes;
            System.out.println("No cumplió la meta mensual por:" +x);
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}
