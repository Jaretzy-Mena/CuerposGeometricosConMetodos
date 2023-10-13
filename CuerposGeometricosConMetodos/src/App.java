import java.util.Scanner;

public class App {
    Scanner lector=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.println("   Bienvenido a figutas geometricas");
        System.out.println("       Seleccione una figura");
        System.out.println("1. Prisma             2.Cilindro");
        System.out.println("3. Pirámide           4.Cono");
        System.out.println("5. Esfera             6. Zona esférica");
        System.out.println("7. Casquete esférico  8. Tronco de cono");
        System.out.println("9. Tronco de pirámide 10. Huso y cuña esférico");
        System.out.println("11. Ortoedro          12. Tetraedro");
        System.out.println("13. Hexaedro          14. Octaedro");
        System.out.println("15. Dodecaedro        16. Icosaedro");
        System.out.println("17. Salir");
        int menu, intentos=3;

        do{
            menu=lector.nextInt();
            
            if(menu<=0 || menu>=18){
                intentos--;
                System.out.println("Ingrese una opción valida");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(menu<=0 || menu>=18);

        Tremendo (menu);
        lector.close();
    }

    public static void Tremendo(int menu){

        switch(menu){
            case 1->{
                System.out.println("Prisma");
                Prisma();
            }

            case 2->{
                System.out.println("Cilindro");
                Cilindro();
            }

            case 3->{
                System.out.println("Pirámide");
                pirámide();
            }

            case 4->{
                System.out.println("Cono");
                Cono();
            }

            case 5->{
                System.out.println("Esfera");
                Esfera();
            }

            case 6->{
                System.out.println("Zona esférica");
                ZonaEsférica();
            }

            case 7->{
                System.out.println("Casquete esféroco");
                CasqueteEsférico();
            }

            case 8->{
                System.out.println("Tronco de cono");
                TroncodeCono();
            }

            case 9->{
                System.out.println("tronco de pirámide");
                TroncoDePirámide();
            }

            case 10->{
                System.out.println("Huso y cuña esférica");
                HusoCuñaEsférico();
            }

            case 11->{
                System.out.println("Ortoedro");
                Ortoedro();
            }

            case 12->{
                System.out.println("Tetraedro");
                Tetraedro();
            }

            case 13->{
                System.out.println("Hexaedro");
                Hexaedro();
            }

            case 14->{
                System.out.println("Octaedro");
                Octaedro();
            }

            case 15->{
                System.out.println("Dodecaedro");
                Dodecaedro();
            }

            case 16->{
                System.out.println("Icosaedro");
                Icosaedro();
            }

            case 17->{
                System.out.println("Esta bien, muchas gracias por utilizar nuestros servicios.");
                System.out.println("Esperamos verlo de nuevo.");
                System.out.println(":D");
            }

        }
    }

    public static void Prisma(){
        Scanner lector= new Scanner(System.in);
        System.out.println(";;;;;;;; Ingresar los siguientes datos ;;;;;;;;");
        int cantidadLados;
        double longitudLados, altura, AreaL,AreaT,Volumen;
        double perimetroBase, areaBase, apotema;

        do{
            System.out.print("Cantidad de lados: ");
            cantidadLados=lector.nextInt();
            int intentos=3;
            
            if(cantidadLados<=2){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a 3");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(cantidadLados<=2);

        do{
            System.out.print("Altura: ");
            altura=lector.nextInt();
            int intentos=3;
            
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(altura<=0);
        
        do{
            System.out.print("Longitud de lados: ");
            longitudLados=lector.nextInt();
            int intentos=3;
            
            if(longitudLados<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(longitudLados<=0);

        perimetroBase = cantidadLados * longitudLados;
        AreaL = perimetroBase * altura;
        double alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa)/2));
        areaBase = (perimetroBase * apotema)/2;
        AreaT = (AreaL + 2) * areaBase;
        Volumen = areaBase * altura;

        Prisma(AreaL, AreaT, Volumen);

        lector.close();
    }
    
    public static void Prisma(double AreaL, double AreaT, double Volumen ){
        System.out.println(";;;;;;;; Resultados ;;;;;;;;");
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
    }
    
    public static void Cilindro(){
        Scanner lector=new Scanner(System.in);
        double radio, altura;
        double BaseP, BaseA;
        double Volumen, AreaT, AreaL;
        do{
            System.out.print("Ingrese radio: ");
            radio=lector.nextInt();
            int intentos=3;
            
            if(radio<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(radio<=0);

        do{
            System.out.print("Ingrese altura: ");
            altura=lector.nextInt();
            int intentos=3;
            
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(altura<=0);
        
        BaseP=(2 * Math.PI * radio);
        BaseA=(Math.PI * radio * radio);
        AreaL=(BaseP * altura);
        AreaT=(AreaL)+(2*BaseA);
        Volumen=(BaseA*altura);

        Cilindro(AreaL, AreaT, Volumen);
        lector.close();
    }

    public static void Cilindro(double AreaL, double AreaT, double Volumen){
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas");
        System.out.println("Area total: " + AreaT + " unidades cuadradas");
        System.out.println("Volumen: " + Volumen + " unidades cuadradas");
    }
//Inicia Pirámide
    public static void pirámide(){
        Scanner lector=new Scanner(System.in);
        int nLados; double altura;

        do{
            System.out.print("Ingrese el número de lados de la base: ");
            nLados = lector.nextInt();
            int intentos=3;
                    
            if(nLados<=2){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 2");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(nLados<=2);

        do{
            System.out.print("Ingrese la altura de la pirámide: ");
            altura = lector.nextDouble();
            int intentos=3;
                    
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(altura<=0);

        System.out.println("Desea ingresar");
        System.out.println("1. Longitud del lado de la base");
        System.out.println("2. Longitud del apotema de la base");
        int seleccion, intentos=3;
        
        do{
            seleccion = lector.nextInt();

            if(seleccion<=0 || seleccion>=3){
                intentos--;
                System.out.println("Ingrese una opción valida");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(seleccion<=0 || seleccion>=3);

        Pirámide(seleccion, nLados, altura);

        lector.close();
    }

    public static void Pirámide(int seleccion, int nLados, double altura){
        switch(seleccion){
            case 1->{
                LongitudLado(nLados, altura);
            }

            case 2->{
                LongitudAp(nLados, altura);
            }
        }
    }

    public static void LongitudLado(int nLados, double altura){
        Scanner lector=new Scanner(System.in);
        double ladosB, ApotemaB, ApotemaCara, PerimetroB, AreaL, BaseA, AreaT, Volumen;
        do{
            System.out.println("Ingrese longitud del lado de la base: ");
            ladosB=lector.nextDouble();
            int intentos=3;
                    
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(altura<=0);

        ApotemaB=((ladosB)/(2*Math.tan((Math.PI)/(nLados))));
        ApotemaCara=(Math.sqrt((altura*altura)+(ApotemaB*ApotemaB)));
        PerimetroB=(nLados*ladosB);
        AreaL=(PerimetroB*ApotemaCara)/(2);
        BaseA=(PerimetroB*ApotemaB)/(2);
        AreaT=(AreaL+BaseA);
        Volumen=(BaseA*altura)/(3);
        //Mostrar los resultados
        LongitudLado(AreaL, AreaT, Volumen);
        lector.close();
    }

    public static void LongitudLado(double AreaL, double AreaT, double Volumen){
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
    }

    public static void LongitudAp(int nLados, double altura){
        Scanner lector=new Scanner(System.in);
        double ApotemaBase, ladoB, ApotemaCara, PerimetroB, AreaL, BaseA, AreaT, Volumen;

        do{
            System.out.println("Ingrese la longitud del apotema de la base: ");
            ApotemaBase= lector.nextDouble(); 
            int intentos=3;
                    
            if(ApotemaBase<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(ApotemaBase<=0);

        ladoB=(2*ApotemaBase*(Math.tan((Math.PI)/(nLados))));
        ApotemaCara=(Math.sqrt((altura*altura)+(ApotemaBase*ApotemaBase)));
        PerimetroB=(nLados*ladoB);
        AreaL=(PerimetroB*ApotemaCara)/(2);
        BaseA=(PerimetroB*ApotemaBase)/(2);
        AreaT=(AreaL+BaseA);
        Volumen=(BaseA*altura)/(3);

        LongitudAp(AreaL, AreaT, Volumen);
        lector.close();
    }

    public static void LongitudAp(double AreaL, double AreaT, double Volumen){
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
    }
//Finaliza Pirámide
    public static void Esfera(){
        Scanner lector=new Scanner(System.in);
        double radio;
        double Area, Volumen;
        
        do{
            System.out.print("ingrese radio: ");
            radio=lector.nextDouble();
            int intentos=3;
                    
            if(radio<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radio<=0);
        //procedimiento
        Area =(4*Math.PI)*(radio*radio);
        Volumen =(((4)*(Math.PI*radio*radio*radio))/(3));
        
        Esfera(Area, Volumen);
        lector.close();
    }
    
    public static void Esfera(double Area, double Volumen){
        System.out.println("El area es de: " + Area);
        System.out.println("El volumen es de: "+Volumen);
    }
    
    public static void ZonaEsférica(){
        Scanner lector= new Scanner(System.in);
        double radioCH, radioGR, altura, radio;
        double volumen, area;
        do{
            System.out.print("Ingrese la altura entre las radios: ");
            altura = lector.nextInt();
            int intentos=3;
            
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(altura<=0);

        do{
            System.out.print("Ingrese radio chiquita: ");
            radioCH =lector.nextInt();
            int intentos=3;
            
            if(radioCH<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radioCH<=0);
        
        do{
            System.out.print("Ingrese radio grande ");
            radioGR=lector.nextInt();
            int intentos=3;
            
            if(radioGR<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radioGR<=0);
        
        do{
            System.out.print("Ingrese radio: ");
            radio =lector.nextInt();
            int intentos=3;
            
            if(radio<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radio<=0);
        
        //separador
        volumen=(((Math.PI*altura)*((altura*altura)+(3*radioCH*radioCH)+(3*radioGR*radioGR)))/(6));
        area=(2*Math.PI*altura*radio);
        //ultimoSeparador
        ZonaEsférica(area, volumen);
        lector.close();
    }

    public static void ZonaEsférica(double area, double volumen){
        System.out.println("El area es de: " + area);
        System.out.println("El volumen es de "+ volumen);
    }
    
    public static void CasqueteEsférico(){
        Scanner lector=new Scanner(System.in);
        double altura, radio;
        double volumen, area;
        do{
            System.out.print("Ingrese la altura del casquete esférico: ");
            altura = lector.nextDouble();
            int intentos=3;
            
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(altura<=0);

        do{
            System.out.print("Ingrese el radio de la esfera: ");
            radio =lector.nextDouble();
            int intentos=3;
            
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
            
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
            
        }while(altura<=0);
        //separador
        volumen=(((Math.PI*altura*altura)*((3*radio)-(altura)))/(3));
        area=(2*Math.PI*altura*radio);
        CasqueteEsférico(area, volumen);                
        lector.close();
    }

    public static void CasqueteEsférico(double area, double volumen){
        System.out.println("El area es de: " + area);
        System.out.println("El volumen es de "+ volumen);
    }
    
    public static void Cono(){
        Scanner lector=new Scanner(System.in);
        double altura;
        double generatriz, generatrizG, radio;
        double Volumen, AreaT, AreaL;
        do{
            System.out.print("Ingrese la altura: ");
            altura = lector.nextDouble();
            int intentos=3;
                    
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(altura<=0);

        do{
            System.out.print("Ingrese radio: ");
            radio = lector.nextDouble();
            int intentos=3;
                    
            if(radio<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radio<=0);
        //procedimiento
        generatriz=(Math.sqrt((radio*radio)+(altura*altura)));
        generatrizG=generatriz;
        AreaL=(Math.PI*radio*generatrizG);
        AreaT=(Math.PI*radio)*(generatrizG+radio);
        Volumen=(Math.PI*radio*radio*altura)/(3);

        Cono(AreaL, AreaT, Volumen);
        lector.close();
    }
    
    public static void Cono(double AreaL, double AreaT, double Volumen){
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
    }

    public static void TroncoDePirámide(){
        Scanner lector=new Scanner(System.in);
        double altura, ladosTMA, largoTme, ApotemaP;
        int ladosTme ,largoTMA;
        double PerimetroBMa, PerimetroBme, AreaBMA, AreaBme;
        double AreaL, AreaT, Volumen;
        //Primero
        do{
            System.out.print("Ingrese altura: ");
            altura=lector.nextInt();
            int intentos=3;
                    
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(altura<=0);
        //Segundo
        do{
            System.out.println("Ingrese lados de la base mayor: ");
            ladosTMA = lector.nextInt();
            int intentos=3;
                    
            if(ladosTMA<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(ladosTMA<=0);
        //Tercero
        do{
            System.out.print("Ingrese lados de la base menor: ");
            ladosTme = lector.nextInt();
            int intentos=3;
                    
            if(ladosTme<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(ladosTme<=0);
        //Cuarto
        do{
            System.out.print("Ingrese el apotema de la piramide: ");
            ApotemaP = lector.nextDouble();
            int intentos=3;
                    
            if(ApotemaP<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(ApotemaP<=0);
        //Quinto
        do{
            System.out.println("Ingrese el largo de la base mayor: ");
            largoTMA = lector.nextInt();
            int intentos=3;
                    
            if(largoTMA<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largoTMA<=0);
        //Sexto
        do{
            System.out.print("Ingrese el largo de la base menor: ");
            largoTme = lector.nextDouble();
            int intentos=3;
                    
            if(largoTme<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largoTme<=0);
        //
        PerimetroBMa=(ladosTMA*largoTMA);
        PerimetroBme=(ladosTme*largoTme);
        AreaL=(((PerimetroBMa+PerimetroBme)/(2))*(ApotemaP));
        AreaBMA=((PerimetroBMa*ApotemaP)/(2));
        AreaBme=((PerimetroBme*ApotemaP)/(2));
        AreaT=(AreaL+AreaBMA+AreaBme);
        Volumen=(((1/3)*altura)*(AreaBMA+AreaBme+Math.sqrt(AreaBMA*AreaBme)));
        
        TroncoDePirámide(AreaL, AreaT, Volumen);
        lector.close();
    }
    
    public static void TroncoDePirámide(double AreaL, double AreaT, double Volumen){
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
    }
    
    public static void TroncodeCono(){
        Scanner lector = new Scanner(System.in);
        double altura, radiome, radioMa;
        double generatriz, AreaBMa, Areabme;
        double AreaL, AreaT, Volumen;
        
        do{
            System.out.print("Ingrese altura: ");
            altura=lector.nextInt();
            int intentos=3;
                    
            if(altura<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(altura<=0);

        do{
            System.out.print("Ingrese radio menor ");
            radiome=lector.nextInt();
            int intentos=3;
                    
            if(radiome<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radiome<=0);

        do{
            System.out.print("Ingrese radio mayor ");
            radioMa=lector.nextInt();
            int intentos=3;
                    
            if(radioMa<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radioMa<=0);

        generatriz=(Math.sqrt((altura*altura)+((radioMa-radiome)*(radioMa-radiome))));
        AreaL=((Math.PI*generatriz)*(radioMa+radiome));
        AreaBMa=(Math.PI*radioMa*radioMa);
        Areabme=(Math.PI*radiome*radiome);
        AreaT=(AreaL+AreaBMa+Areabme);
        Volumen=(((1/3)*(Math.PI*altura))*((radioMa*radioMa)+(radiome*radiome)+(radioMa*radiome)));
        
        TroncodeCono(AreaL, AreaT, Volumen);
        lector.close();
    }

    public static void TroncodeCono(double AreaL, double AreaT, double Volumen){
        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
    }

    public static void HusoCuñaEsférico(){
        Scanner lector= new Scanner(System.in);
        double radio, grados;
        double area, volumen;
        
        do{
            System.out.print("Ingrese radio: ");
            radio =lector.nextDouble();
            int intentos=3;
                    
            if(radio<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(radio<=0);
        
        do{
            System.out.print("Ingrese grados: ");
            grados =lector.nextDouble();
            int intentos=3;
                    
            if(grados<=0 || grados>=360){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
                System.out.println("Ni mayores a 360");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(grados<=0 || grados>=360);
        

        area=((4*Math.PI*radio*radio*grados)/(360));
        volumen=((4)*((Math.PI*radio*radio*radio*grados)/(360*3)));

        HusoCuñaEsférico(area, volumen);
        lector.close();
    }

    public static void HusoCuñaEsférico(double area, double volumen){
        System.out.println("El area es de: "+ area);
        System.out.println("El volumen es de: "+volumen);
        
    }

    public static void Ortoedro(){
        Scanner lector = new Scanner(System.in);
        double largo, baseMA, baseme;
        double diametro, volumen, Area;

        do{
            System.out.print("Ingrese largo: ");
            largo=lector.nextDouble();
            int intentos=3;
                    
            if(largo<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largo<=0);

        do{
            System.out.print("Ingrese ancho: ");
            baseme=lector.nextDouble();
            int intentos=3;
                    
            if(baseme<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }

            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(baseme<=0);

        do{
            System.out.print("Ingrese alto: ");
            baseMA=lector.nextDouble();
            int intentos=3;
                    
            if(baseMA<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }

            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(baseMA<=0);


        Area=((2)*((largo*baseme)+(largo*baseMA)+(baseMA*baseme)));
        diametro=(Math.sqrt((largo*largo)+(baseMA*baseMA)+(baseme*baseme)));
        volumen=(largo*baseMA*baseme);
        
        Ortoedro(Area, volumen, diametro);
                
        lector.close();
    }

    public static void Ortoedro(double Area, double volumen, double diametro){
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        System.out.println("El diametro es de "+diametro);
    }
    
    public static void Tetraedro(){
        Scanner lector = new Scanner(System.in);
        double largo;
        double hipotenusa, volumen, Area;

        do{
            System.out.print("Ingrese largo: ");
            largo=lector.nextDouble();
            int intentos=3;
                    
            if(largo<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largo<=0);
        //
        Area=((largo*largo)*Math.sqrt(3));
        hipotenusa=((largo)*((Math.sqrt(6))/(3)));
        volumen=(((Math.sqrt(2))/(12))*(largo*largo*largo));
        //
        Tetraedro(Area, volumen, hipotenusa);
        lector.close();
    }
    
    public static void Tetraedro(double Area, double volumen, double hipotenusa){
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        System.out.println("La hipotenusa es de "+hipotenusa);
    }

    public static void Hexaedro(){
        Scanner lector= new Scanner(System.in);
        double largo;
        double diametro, volumen, Area;

        do{
            System.out.print("Ingrese la longitud de la arista del hexaedro: ");
            largo=lector.nextDouble();
            int intentos=3;
                    
            if(largo<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largo<=0);
        
        Area=((largo*largo)*(6));
        diametro=(largo)*((Math.sqrt(3)));
        volumen=(largo*largo*largo);

        Hexaedro(Area, volumen, diametro);

        lector.close();
    }

    public static void Hexaedro(double Area, double volumen, double diametro){
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        System.out.println("El diametro es de "+diametro);
    }
    
    public static void Octaedro(){
        Scanner lector=new Scanner(System.in);
        double largo;
        double volumen, Area;

       do{
            System.out.print("Ingrese la longitud de la arista del octedro: ");
            largo=lector.nextDouble();
            int intentos=3;
                    
            if(largo<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largo<=0);

        Area=(((largo*largo)*(2))*Math.sqrt(3));
        volumen=(((Math.sqrt(2))*(largo*largo*largo))/(3));

        Octaedro(Area, volumen);

        lector.close();
    }
    
    public static void Octaedro(double Area, double volumen){
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
    }
    
    public static void Dodecaedro(){
        Scanner lector=new Scanner(System.in);
        double largo;
        double volumen, Area, AreaP;
        
        do{
            System.out.print("Ingrese la longitud de la arista: ");
            largo=lector.nextDouble();
            int intentos=3;
                    
            if(largo<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largo<=0);
        
        Area=((3*largo*largo)*(Math.sqrt((25)+(10*Math.sqrt(5)))));
        volumen=(((15)+(7*Math.sqrt(5)))*(largo*largo*largo)/(4));
        AreaP=((Area)/(12));
        
        Dodecaedro(Area, volumen, AreaP);
        lector.close();
    }

    public static void Dodecaedro(double Area, double volumen,double AreaP){
        System.out.println("El area es de: "+Area);
        System.out.println("El volumen es de: "+volumen);
        System.out.println("Area de la cara del dodecaedro: "+AreaP);
    }
    
    public static void Icosaedro(){
        Scanner lector= new Scanner(System.in);
        double largo;
        double volumen, Area;

        do{
            System.out.println("Ingrese la longitud de la arista del icosaedro: ");
            largo=lector.nextDouble();
            int intentos=3;
                    
            if(largo<=0){
                intentos--;
                System.out.println("Ingrese una cantidad valida valida");
                System.out.println("No son validos cantidades menores a o iguales a 0");
            }
                    
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
                    
        }while(largo<=0);

        Area=(((largo*largo)*(5))*Math.sqrt(3));
        volumen=(((5)*(3+(Math.sqrt(5)))*(largo*largo*largo))/(12));

        Icosaedro(Area, volumen);
        lector.close();
    }

    public static void Icosaedro(double Area, double volumen){
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);

    }

}