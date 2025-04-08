/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3lab;

import java.util.Scanner;

/**
 *
 * @author unifenascimento
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    /*
    public Data(){
        this.dia = 1;
        this.mes = 2;
        this.ano = 200;
          
    }
*/
    public Data(int dia, int mes, int ano){
    
        this.dia = diaValida(dia);
        this.ano = ano;
        this.mes = mes;
        
    }
    public Data(String mes, int dia, int ano){
        this.dia = diaValida(dia);
        this.ano = ano;
        switch (mes) {
            case "Janeiro":
                this.mes = 1;
                break;
            case "Fevereiro":
                this.mes = 2;
                break;
            case "Março":
                this.mes = 3;
                break;
            case "Abril":
                this.mes = 4;
                break;
            case "Maio":
                this.mes = 5;
                break;
            case "Junho":
                this.mes = 6;
                break;
            case "Julho":
                this.mes = 7;
                break;
            case "Agosto":
                this.mes = 8;
                break;
            case "Setembro":
                this.mes = 9;
                break;
            case "Outubro":
                this.mes = 10;
                break;
            case "Novembro":
                this.mes = 11;
                break;
            case "Dezembro":
                this.mes = 12;
                break;
            default:
                this.mes = 1;
                break;
        }
    }
    public  Data(int dias, int ano){
        if(dias <=0){
            this.dia = 1;
            this.mes = 1;
        } else if( dia > 0 && dia <= 31){
          this.dia = dias;
          this.mes= 1;
       } else if (dias <59){
           this.dia = dias - 31;
           this.mes = 2;
       }else if (dias <90){
           this.dia = dias - 59;
           this.mes = 3;
       } else if (dias <120){
           this.dia = dias - 90;
           this.mes = 4;
       } else if (dias <151){
           this.dia = dias - 120;
           this.mes = 5;
       } else if (dias <181){
           this.dia = dias - 151;
           this.mes = 6;
       } else if (dias <212){
           this.dia = dias - 181;
           this.mes = 7;
       } else if (dias <243){
           this.dia = dias - 212;
           this.mes = 8;
       } else if (dias <273){
           this.dia = dias - 243;
           this.mes = 9;
       } else if (dias <304){
           this.dia = dias - 273;
           this.mes = 10;
       }  else if (dias <334){
           this.dia = dias - 304;
           this.mes = 11;
       }else if (dias <365){
           this.dia = dias - 334;
           this.mes = 12;
       } else{ 
           this.dia = 1;
           this.mes = 1;
       }
       this.ano = ano;
       
    }

    Data() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    
    public void setDia(int dia){
        this.dia = diaValida(dia);
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    private int diaValida(int dia){
        if (dia > 0 && dia<31)
            return dia;
        return 1;
    }
    public void gregoriano1(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Infome o dia: ");
        int dia = scanner.nextInt();
         System.out.printf("Infome o mes: ");
        int mes = scanner.nextInt();
        System.out.printf("Infome o ano: ");
        int ano = scanner.nextInt();
        System.out.printf("%d/%d/%d\n", dia, mes, ano);
    }
    public void gregoriano2(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Infome o dia: ");
        int dia = scanner.nextInt();
         System.out.printf("Infome o mes: ");
        String mes = scanner.next();
        System.out.printf("Infome o ano: ");
        int ano = scanner.nextInt();
        System.out.printf("%s,%d,%d\n", mes, dia, ano);
            
    }
    public void juliano(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Infome os dias: ");
        int dias = scanner.nextInt();
        System.out.printf("Infome o ano: ");
        int ano = scanner.nextInt();

           if(dias <=0){
            this.dia = 1;
            this.mes = 1;
        } else if( dia > 0 && dia <= 31){
          this.dia = dias;
          this.mes= 1;
       } else if (dias <59){
           this.dia = dias - 31;
           this.mes = 2;
       }else if (dias <90){
           this.dia = dias - 59;
           this.mes = 3;
       } else if (dias <120){
           this.dia = dias - 90;
           this.mes = 4;
       } else if (dias <151){
           this.dia = dias - 120;
           this.mes = 5;
       } else if (dias <181){
           this.dia = dias - 151;
           this.mes = 6;
       } else if (dias <212){
           this.dia = dias - 181;
           this.mes = 7;
       } else if (dias <243){
           this.dia = dias - 212;
           this.mes = 8;
       } else if (dias <273){
           this.dia = dias - 243;
           this.mes = 9;
       } else if (dias <304){
           this.dia = dias - 273;
           this.mes = 10;
       }  else if (dias <334){
           this.dia = dias - 304;
           this.mes = 11;
       }else if (dias <365){
           this.dia = dias - 334;
           this.mes = 12;
       } else{ 
           this.dia = 1;
           this.mes = 1;
       }
       this.ano = ano;
       System.out.printf("%d %d", dias, ano);
    }
    public void datasFormat(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Como você quer informar a data?\n1.MM/DD/AAAA\n2.Feveireiro 27,2025\n3.DDD/YYYY");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                gregoriano1();
                break;
            case 2:
                gregoriano2();
                break;
            case 3:
                juliano();
            default:
                opcao = 0;   
    }
 }
}
