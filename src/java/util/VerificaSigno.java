package util;

public class VerificaSigno {

    public VerificaSigno() {
    }
    
    public int RetornaSigno(String data)
    {
        int signo = 1,dia,mes,ano;
        String tipos[] = new String[3];
        tipos = data.split("-");
        mes = Integer.parseInt(tipos[1]);
        dia = Integer.parseInt(tipos[2]);
        if(mes == 4)
        {
            if(dia<=20)
                signo = 1;
            else
                signo = 2;
        }
        else{
            if(mes == 5){
                if(dia<=20)
                    signo = 2;
                else
                    signo = 3;
            }
            else{
                if(mes == 6){
                    if(dia<=20)
                        signo = 3;
                    else
                        signo = 4;
                }
                else{
                    if(mes == 7){
                        if(dia<=22)
                            signo = 4;
                        else
                            signo = 5;
                    }
                    else{
                        if(mes == 8){
                            if(dia<=22)
                                signo = 5;
                            else
                                signo = 6;
                        }
                        else{
                            if(mes == 9){
                                if(dia<=22)
                                    signo = 6;
                                else
                                    signo = 7;
                            }
                            else{
                                if(mes == 10){
                                    if(dia<=22)
                                        signo = 7;
                                    else
                                        signo = 8;
                                }
                                else{
                                    if(mes == 11){
                                        if(dia<=21)
                                            signo = 8;
                                        else
                                            signo = 9;
                                    }
                                    else{
                                        if(mes == 12){
                                            if(dia<=21)
                                                signo = 9;
                                            else
                                                signo = 10;
                                        }
                                        else{
                                            if(mes == 1){
                                                if(dia<=20)
                                                    signo = 10;
                                                else
                                                    signo = 11;
                                            }
                                            else{
                                                if(mes == 2){
                                                    if(dia<=18)
                                                        signo = 11;
                                                    else
                                                        signo = 12;
                                                }
                                                else{
                                                    if(mes == 3){
                                                        if(dia<=20)
                                                            signo = 12;
                                                        else
                                                            signo = 1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return signo;
    }
}
